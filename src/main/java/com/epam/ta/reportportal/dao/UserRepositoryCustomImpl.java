/*
 * Copyright (C) 2018 EPAM Systems
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.epam.ta.reportportal.dao;

import com.epam.ta.reportportal.BinaryData;
import com.epam.ta.reportportal.commons.querygen.QueryBuilder;
import com.epam.ta.reportportal.commons.querygen.Queryable;
import com.epam.ta.reportportal.entity.user.User;
import com.epam.ta.reportportal.filesystem.DataStore;
import com.epam.ta.reportportal.jooq.tables.JProject;
import org.jooq.DSLContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.repository.support.PageableExecutionUtils;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.stream.Collectors;

import static com.epam.ta.reportportal.commons.querygen.constant.UserCriteriaConstant.CRITERIA_USER_PROJECT;
import static com.epam.ta.reportportal.dao.util.ResultFetchers.USER_FETCHER;

/**
 * @author Pavel Bortnik
 */
@Repository
public class UserRepositoryCustomImpl implements UserRepositoryCustom {

	private final DataStore dataStore;

	private final DSLContext dsl;

	@Autowired
	public UserRepositoryCustomImpl(DataStore dataStore, DSLContext dsl) {
		this.dataStore = dataStore;
		this.dsl = dsl;
	}

	@Override
	public String uploadUserPhoto(String username, BinaryData binaryData) {
		return dataStore.save(username, binaryData.getInputStream());
	}

	@Override
	public String replaceUserPhoto(String username, BinaryData binaryData) {
		return dataStore.save(username, binaryData.getInputStream());
	}

	@Override
	public String replaceUserPhoto(User user, BinaryData binaryData) {
		return dataStore.save(user.getLogin(), binaryData.getInputStream());
	}

	@Override
	public void deleteUserPhoto(String path) {
		dataStore.delete(path);
	}

	@Override
	public List<User> findByFilter(Queryable filter) {
		return USER_FETCHER.apply(dsl.fetch(QueryBuilder.newBuilder(filter).withWrapper(filter.getTarget()).build()));
	}

	@Override
	public Page<User> findByFilter(Queryable filter, Pageable pageable) {
		return PageableExecutionUtils.getPage(USER_FETCHER.apply(dsl.fetch(QueryBuilder.newBuilder(filter)
				.with(pageable)
				.withWrapper(filter.getTarget())
				.with(normalizeProperties(pageable.getSort()))
				.build())), pageable, () -> dsl.fetchCount(QueryBuilder.newBuilder(filter).build()));
	}

	@Override
	public Page<User> findByFilterExcluding(Queryable filter, Pageable pageable, String... exclude) {
		return PageableExecutionUtils.getPage(USER_FETCHER.apply(dsl.fetch(QueryBuilder.newBuilder(filter)
				.with(pageable)
				.withWrapper(filter.getTarget(), exclude)
				.with(normalizeProperties(pageable.getSort()))
				.build())), pageable, () -> dsl.fetchCount(QueryBuilder.newBuilder(filter).build()));
	}

	private Sort normalizeProperties(Sort sort) {
		if (null != sort) {
			List<Sort.Order> orders = sort.get()
					.filter(it -> it.getProperty().equalsIgnoreCase(CRITERIA_USER_PROJECT))
					.map(it -> it.withProperty(JProject.PROJECT.NAME.getQualifiedName().toString()))
					.collect(Collectors.toList());
			return Sort.by(orders);
		}
		return Sort.unsorted();
	}

}
