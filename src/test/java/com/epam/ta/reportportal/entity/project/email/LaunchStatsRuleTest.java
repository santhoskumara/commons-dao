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

package com.epam.ta.reportportal.entity.project.email;

import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

import static com.epam.ta.reportportal.entity.enums.EnumTestHelper.permute;
import static org.junit.Assert.*;

/**
 * @author <a href="mailto:ihar_kahadouski@epam.com">Ihar Kahadouski</a>
 */
public class LaunchStatsRuleTest {

	private Map<LaunchStatsRule, List<String>> allowed;
	private List<String> disallowed;

	@Before
	public void setUp() throws Exception {
		allowed = Arrays.stream(LaunchStatsRule.values()).collect(Collectors.toMap(it -> it, it -> permute(it.getRuleString())));
		disallowed = Arrays.asList("noSuchRule", "", " ", null);
	}

	@Test
	public void findByName() {
		allowed.forEach((key, value) -> value.forEach(val -> {
			final Optional<LaunchStatsRule> optional = LaunchStatsRule.findByName(val);
			assertTrue(optional.isPresent());
			assertEquals(key, optional.get());
		}));
		disallowed.forEach(it -> assertFalse(LaunchStatsRule.findByName(it).isPresent()));
	}

	@Test
	public void isPresent() {
		allowed.entrySet().stream().flatMap(it -> it.getValue().stream()).forEach(it -> assertTrue(LaunchStatsRule.isPresent(it)));
		disallowed.forEach(it -> assertFalse(LaunchStatsRule.isPresent(it)));
	}
}