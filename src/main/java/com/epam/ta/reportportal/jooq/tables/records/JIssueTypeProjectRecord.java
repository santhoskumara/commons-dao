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

import com.epam.ta.reportportal.jooq.tables.JIssueTypeProject;
import org.jooq.Field;
import org.jooq.Record2;
import org.jooq.Row2;
import org.jooq.impl.UpdatableRecordImpl;

import javax.annotation.Generated;


/**
 * This class is generated by jOOQ.
 */
@Generated(value = { "http://www.jooq.org", "jOOQ version:3.11.11" }, comments = "This class is generated by jOOQ")
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class JIssueTypeProjectRecord extends UpdatableRecordImpl<JIssueTypeProjectRecord> implements Record2<Long, Long> {

	private static final long serialVersionUID = -425320146;

	/**
	 * Setter for <code>public.issue_type_project.project_id</code>.
	 */
	public void setProjectId(Long value) {
		set(0, value);
	}

	/**
	 * Getter for <code>public.issue_type_project.project_id</code>.
	 */
	public Long getProjectId() {
		return (Long) get(0);
	}

	/**
	 * Setter for <code>public.issue_type_project.issue_type_id</code>.
	 */
	public void setIssueTypeId(Long value) {
		set(1, value);
	}

	/**
	 * Getter for <code>public.issue_type_project.issue_type_id</code>.
	 */
	public Long getIssueTypeId() {
		return (Long) get(1);
	}

	// -------------------------------------------------------------------------
	// Primary key information
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Record2<Long, Long> key() {
		return (Record2) super.key();
	}

	// -------------------------------------------------------------------------
	// Record2 type implementation
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Row2<Long, Long> fieldsRow() {
		return (Row2) super.fieldsRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Row2<Long, Long> valuesRow() {
		return (Row2) super.valuesRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<Long> field1() {
		return JIssueTypeProject.ISSUE_TYPE_PROJECT.PROJECT_ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<Long> field2() {
		return JIssueTypeProject.ISSUE_TYPE_PROJECT.ISSUE_TYPE_ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Long component1() {
		return getProjectId();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Long component2() {
		return getIssueTypeId();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Long value1() {
		return getProjectId();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Long value2() {
		return getIssueTypeId();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public JIssueTypeProjectRecord value1(Long value) {
		setProjectId(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public JIssueTypeProjectRecord value2(Long value) {
		setIssueTypeId(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public JIssueTypeProjectRecord values(Long value1, Long value2) {
		value1(value1);
		value2(value2);
		return this;
	}

	// -------------------------------------------------------------------------
	// Constructors
	// -------------------------------------------------------------------------

	/**
	 * Create a detached JIssueTypeProjectRecord
	 */
	public JIssueTypeProjectRecord() {
		super(JIssueTypeProject.ISSUE_TYPE_PROJECT);
	}

	/**
	 * Create a detached, initialised JIssueTypeProjectRecord
	 */
	public JIssueTypeProjectRecord(Long projectId, Long issueTypeId) {
		super(JIssueTypeProject.ISSUE_TYPE_PROJECT);

		set(0, projectId);
		set(1, issueTypeId);
	}
}
