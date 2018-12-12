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

import com.epam.ta.reportportal.BaseTest;
import com.epam.ta.reportportal.commons.querygen.Condition;
import com.epam.ta.reportportal.commons.querygen.Filter;
import com.epam.ta.reportportal.entity.Activity;
import org.apache.commons.compress.utils.Lists;
import org.flywaydb.test.annotation.FlywayTest;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.test.context.jdbc.Sql;

import java.time.Duration;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import static com.epam.ta.reportportal.commons.querygen.constant.ActivityCriteriaConstant.CRITERIA_CREATION_DATE;
import static com.epam.ta.reportportal.commons.querygen.constant.GeneralCriteriaConstant.CRITERIA_ID;
import static org.junit.Assert.*;

@FlywayTest
@Sql("/test-activities-fill.sql")
public class ActivityRepositoryCustomImplTest extends BaseTest {

	@Autowired
	private ActivityRepository repository;

	@Test
	public void deleteModifiedLaterAgo() {
		Duration period = Duration.ofDays(10);
		LocalDateTime bound = LocalDateTime.now().minus(period);

		repository.deleteModifiedLaterAgo(1L, period);
		List<Activity> all = repository.findAll();
		all.stream().filter(a -> a.getProjectId() == 1L).forEach(a -> assertTrue(a.getCreatedAt().isAfter(bound)));
	}

	@Test
	public void findByFilterWithSortingAndLimit() {
		List<Activity> activities = repository.findByFilterWithSortingAndLimit(defaultFilter(),
				new Sort(Sort.Direction.DESC,
						defaultFilter().getTarget().getCriteriaByFilter(CRITERIA_CREATION_DATE).get().getQueryCriteria()
				),
				2
		);

		assertEquals(2, activities.size());
		assertTrue(activities.get(0).getCreatedAt().isBefore(activities.get(1).getCreatedAt()));
	}

	@Test
	public void findByFilter() {
		List<Activity> activities = repository.findByFilter(filterGetById(1));

		assertEquals(1, activities.size());
		assertNotNull(activities.get(0));
	}

	@Test
	public void findByFilterPageable() {
		Page<Activity> page = repository.findByFilter(filterGetById(1), PageRequest.of(0, 10));
		ArrayList<Object> activities = Lists.newArrayList();
		page.forEach(activities::add);

		assertEquals(1, activities.size());
		assertNotNull(activities.get(0));
	}

	private Filter filterGetById(long id) {
		return new Filter(Activity.class, Condition.EQUALS, false, String.valueOf(id), "id");
	}

	private Filter defaultFilter() {
		return new Filter(Activity.class, Condition.LOWER_THAN, false, "100", CRITERIA_ID);
	}
}