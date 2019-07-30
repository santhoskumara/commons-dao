/*
 * Copyright 2019 EPAM Systems
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

/*
 * This file is generated by jOOQ.
 */
package com.epam.ta.reportportal.jooq.tables.records;

import com.epam.ta.reportportal.jooq.enums.JIssueGroupEnum;
import com.epam.ta.reportportal.jooq.tables.JIssueGroup;
import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record2;
import org.jooq.Row2;
import org.jooq.impl.UpdatableRecordImpl;

import javax.annotation.Generated;


/**
 * This class is generated by jOOQ.
 */
@Generated(value = { "http://www.jooq.org", "jOOQ version:3.11.11" }, comments = "This class is generated by jOOQ")
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class JIssueGroupRecord extends UpdatableRecordImpl<JIssueGroupRecord> implements Record2<Short, JIssueGroupEnum> {

	private static final long serialVersionUID = 756256641;

	/**
	 * Setter for <code>public.issue_group.issue_group_id</code>.
	 */
	public void setIssueGroupId(Short value) {
		set(0, value);
	}

	/**
	 * Getter for <code>public.issue_group.issue_group_id</code>.
	 */
	public Short getIssueGroupId() {
		return (Short) get(0);
	}

	/**
	 * Setter for <code>public.issue_group.issue_group</code>.
	 */
	public void setIssueGroup(JIssueGroupEnum value) {
		set(1, value);
	}

	/**
	 * Getter for <code>public.issue_group.issue_group</code>.
	 */
	public JIssueGroupEnum getIssueGroup() {
		return (JIssueGroupEnum) get(1);
	}

	// -------------------------------------------------------------------------
	// Primary key information
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Record1<Short> key() {
		return (Record1) super.key();
	}

	// -------------------------------------------------------------------------
	// Record2 type implementation
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Row2<Short, JIssueGroupEnum> fieldsRow() {
		return (Row2) super.fieldsRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Row2<Short, JIssueGroupEnum> valuesRow() {
		return (Row2) super.valuesRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<Short> field1() {
		return JIssueGroup.ISSUE_GROUP.ISSUE_GROUP_ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<JIssueGroupEnum> field2() {
		return JIssueGroup.ISSUE_GROUP.ISSUE_GROUP_;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Short component1() {
		return getIssueGroupId();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public JIssueGroupEnum component2() {
		return getIssueGroup();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Short value1() {
		return getIssueGroupId();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public JIssueGroupEnum value2() {
		return getIssueGroup();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public JIssueGroupRecord value1(Short value) {
		setIssueGroupId(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public JIssueGroupRecord value2(JIssueGroupEnum value) {
		setIssueGroup(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public JIssueGroupRecord values(Short value1, JIssueGroupEnum value2) {
		value1(value1);
		value2(value2);
		return this;
	}

	// -------------------------------------------------------------------------
	// Constructors
	// -------------------------------------------------------------------------

	/**
	 * Create a detached JIssueGroupRecord
	 */
	public JIssueGroupRecord() {
		super(JIssueGroup.ISSUE_GROUP);
	}

	/**
	 * Create a detached, initialised JIssueGroupRecord
	 */
	public JIssueGroupRecord(Short issueGroupId, JIssueGroupEnum issueGroup) {
		super(JIssueGroup.ISSUE_GROUP);

		set(0, issueGroupId);
		set(1, issueGroup);
	}
}
