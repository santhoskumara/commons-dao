/*
 *  Copyright (C) 2018 EPAM Systems
 *
 *  Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *
 *  http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 */

package com.epam.ta.reportportal.dao;

import com.epam.ta.reportportal.commons.querygen.Filter;
import com.epam.ta.reportportal.commons.querygen.QueryBuilder;
import com.epam.ta.reportportal.entity.item.TestItem;
import com.epam.ta.reportportal.entity.log.Log;
import com.epam.ta.reportportal.exception.ReportPortalException;
import com.epam.ta.reportportal.jooq.tables.JLog;
import com.epam.ta.reportportal.ws.model.ErrorType;
import org.jooq.*;
import org.jooq.impl.DSL;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.repository.support.PageableExecutionUtils;
import org.springframework.stereotype.Repository;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.sql.Date;
import java.sql.Timestamp;
import java.time.Duration;
import java.time.Instant;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import static com.epam.ta.reportportal.commons.EntityUtils.TO_LOCAL_DATE_TIME;
import static com.epam.ta.reportportal.dao.util.JooqFieldNameTransformer.fieldName;
import static com.epam.ta.reportportal.jooq.Tables.LOG;
import static java.util.Optional.ofNullable;

/**
 * @author Pavel Bortnik
 */
@Repository
public class LogRepositoryCustomImpl implements LogRepositoryCustom {

	private static final RecordMapper<? super Record, Log> LOG_MAPPER = r -> new Log(
			r.get(JLog.LOG.ID, Long.class),
			r.get(JLog.LOG.LOG_TIME, LocalDateTime.class),
			r.get(JLog.LOG.LOG_MESSAGE, String.class),
			r.get(JLog.LOG.LAST_MODIFIED, LocalDateTime.class),
			r.get(JLog.LOG.LOG_LEVEL, Integer.class),
			r.into(TestItem.class),
			r.get(JLog.LOG.ATTACHMENT, String.class),
			r.get(JLog.LOG.ATTACHMENT_THUMBNAIL, String.class),
			r.get(JLog.LOG.CONTENT_TYPE, String.class)
	);

	private DSLContext dsl;

	@Autowired
	public void setDsl(DSLContext dsl) {
		this.dsl = dsl;
	}

	@Override
	public boolean hasLogs(Long itemId) {
		return dsl.fetchExists(dsl.selectOne().from(LOG).where(LOG.ITEM_ID.eq(itemId)));
	}

	@Override
	public List<Log> findByTestItemId(Long itemId, int limit) {
		if (itemId == null || limit <= 0) {
			return new ArrayList<>();
		}

		return dsl.select().from(LOG).where(LOG.ITEM_ID.eq(itemId)).orderBy(LOG.LOG_TIME.asc()).limit(limit).fetch().map(LOG_MAPPER);
	}

	@Override
	public List<Log> findByTestItemId(Long itemId) {
		if (itemId == null) {
			return new ArrayList<>();
		}

		return dsl.select().from(LOG).where(LOG.ITEM_ID.eq(itemId)).orderBy(LOG.LOG_TIME.asc()).fetch().map(LOG_MAPPER);
	}

	@Override
	public List<Log> findByFilter(Filter filter) {

		return dsl.fetch(QueryBuilder.newBuilder(filter).build()).map(LOG_MAPPER);
	}

	@Override
	public Page<Log> findByFilter(Filter filter, Pageable pageable) {
		return PageableExecutionUtils.getPage(
				dsl.fetch(QueryBuilder.newBuilder(filter).with(pageable).build()).map(LOG_MAPPER),
				pageable,
				() -> dsl.fetchCount(QueryBuilder.newBuilder(filter).build())
		);
	}

	@Override
	public Integer getPageNumber(Long id, Filter filter, Pageable pageable) {
		Table<? extends Record> logSubquery = QueryBuilder.newBuilder(filter).with(pageable.getSort()).build().asTable("log_subquery");

		Sort.Order order = ofNullable(pageable.getSort().getOrderFor(LOG.LOG_TIME.getName())).orElseThrow(() -> new ReportPortalException(
				ErrorType.INCORRECT_SORTING_PARAMETERS));

		OrderField<?> sortField;

		if (order.getDirection().isAscending()) {
			sortField = fieldName(LOG.getName(), order.getProperty()).asc();
		} else {
			sortField = fieldName(LOG.getName(), order.getProperty()).desc();
		}

		Long rowNumber = dsl.select(fieldName("row_number"))
				.from(dsl.select(LOG.ID, DSL.rowNumber().over(DSL.orderBy(sortField)).as("row_number"))
						.from(LOG)
						.join(logSubquery)
						.on(LOG.ID.eq(fieldName("log_subquery", "id").cast(Long.class))))
				.where(fieldName("id").cast(Long.class).eq(id))
				.fetchOne()
				.into(Long.class);

		return BigDecimal.valueOf(rowNumber).divide(BigDecimal.valueOf(pageable.getPageSize()), RoundingMode.CEILING).intValue();
	}

	@Override
	public int deleteByPeriodAndTestItemIds(Duration period, Collection<Long> testItemIds) {

		return dsl.deleteFrom(LOG)
				.where(LOG.ITEM_ID.in(testItemIds)
						.and(LOG.LAST_MODIFIED.lt(Timestamp.valueOf(TO_LOCAL_DATE_TIME.apply(Date.from(Instant.now()
								.minusSeconds(period.getSeconds())))))))
				.execute();
	}
}
