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

import com.epam.ta.reportportal.jooq.tables.JAclClass;
import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record3;
import org.jooq.Row3;
import org.jooq.impl.UpdatableRecordImpl;

import javax.annotation.Generated;


/**
 * This class is generated by jOOQ.
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.11.7"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class JAclClassRecord extends UpdatableRecordImpl<JAclClassRecord> implements Record3<Long, String, String> {

    private static final long serialVersionUID = 368095724;

    /**
     * Setter for <code>public.acl_class.id</code>.
     */
    public void setId(Long value) {
        set(0, value);
    }

    /**
     * Getter for <code>public.acl_class.id</code>.
     */
    public Long getId() {
        return (Long) get(0);
    }

    /**
     * Setter for <code>public.acl_class.class</code>.
     */
    public void setClass_(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>public.acl_class.class</code>.
     */
    public String getClass_() {
        return (String) get(1);
    }

    /**
     * Setter for <code>public.acl_class.class_id_type</code>.
     */
    public void setClassIdType(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>public.acl_class.class_id_type</code>.
     */
    public String getClassIdType() {
        return (String) get(2);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Record1<Long> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record3 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row3<Long, String, String> fieldsRow() {
        return (Row3) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row3<Long, String, String> valuesRow() {
        return (Row3) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field1() {
        return JAclClass.ACL_CLASS.ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field2() {
        return JAclClass.ACL_CLASS.CLASS;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field3() {
        return JAclClass.ACL_CLASS.CLASS_ID_TYPE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long component1() {
        return getId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component2() {
        return getClass_();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component3() {
        return getClassIdType();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long value1() {
        return getId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value2() {
        return getClass_();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value3() {
        return getClassIdType();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JAclClassRecord value1(Long value) {
        setId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JAclClassRecord value2(String value) {
        setClass_(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JAclClassRecord value3(String value) {
        setClassIdType(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JAclClassRecord values(Long value1, String value2, String value3) {
        value1(value1);
        value2(value2);
        value3(value3);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached JAclClassRecord
     */
    public JAclClassRecord() {
        super(JAclClass.ACL_CLASS);
    }

    /**
     * Create a detached, initialised JAclClassRecord
     */
    public JAclClassRecord(Long id, String class_, String classIdType) {
        super(JAclClass.ACL_CLASS);

        set(0, id);
        set(1, class_);
        set(2, classIdType);
    }
}