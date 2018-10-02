/*
 * This file is generated by jOOQ.
 */
package com.epam.ta.reportportal.jooq.tables.records;


import com.epam.ta.reportportal.jooq.enums.JTestItemTypeEnum;
import com.epam.ta.reportportal.jooq.tables.JTestItem;

import java.sql.Timestamp;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record11;
import org.jooq.Row11;
import org.jooq.impl.UpdatableRecordImpl;


/**
 * This class is generated by jOOQ.
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.11.4"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class JTestItemRecord extends UpdatableRecordImpl<JTestItemRecord> implements Record11<Long, String, JTestItemTypeEnum, Timestamp, String, Timestamp, Object, String, Long, Long, Long> {

    private static final long serialVersionUID = 1973396281;

    /**
     * Setter for <code>public.test_item.item_id</code>.
     */
    public void setItemId(Long value) {
        set(0, value);
    }

    /**
     * Getter for <code>public.test_item.item_id</code>.
     */
    public Long getItemId() {
        return (Long) get(0);
    }

    /**
     * Setter for <code>public.test_item.name</code>.
     */
    public void setName(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>public.test_item.name</code>.
     */
    public String getName() {
        return (String) get(1);
    }

    /**
     * Setter for <code>public.test_item.type</code>.
     */
    public void setType(JTestItemTypeEnum value) {
        set(2, value);
    }

    /**
     * Getter for <code>public.test_item.type</code>.
     */
    public JTestItemTypeEnum getType() {
        return (JTestItemTypeEnum) get(2);
    }

    /**
     * Setter for <code>public.test_item.start_time</code>.
     */
    public void setStartTime(Timestamp value) {
        set(3, value);
    }

    /**
     * Getter for <code>public.test_item.start_time</code>.
     */
    public Timestamp getStartTime() {
        return (Timestamp) get(3);
    }

    /**
     * Setter for <code>public.test_item.description</code>.
     */
    public void setDescription(String value) {
        set(4, value);
    }

    /**
     * Getter for <code>public.test_item.description</code>.
     */
    public String getDescription() {
        return (String) get(4);
    }

    /**
     * Setter for <code>public.test_item.last_modified</code>.
     */
    public void setLastModified(Timestamp value) {
        set(5, value);
    }

    /**
     * Getter for <code>public.test_item.last_modified</code>.
     */
    public Timestamp getLastModified() {
        return (Timestamp) get(5);
    }

    /**
     * @deprecated Unknown data type. Please define an explicit {@link org.jooq.Binding} to specify how this type should be handled. Deprecation can be turned off using <deprecationOnUnknownTypes/> in your code generator configuration.
     */
    @java.lang.Deprecated
    public void setPath(Object value) {
        set(6, value);
    }

    /**
     * @deprecated Unknown data type. Please define an explicit {@link org.jooq.Binding} to specify how this type should be handled. Deprecation can be turned off using <deprecationOnUnknownTypes/> in your code generator configuration.
     */
    @java.lang.Deprecated
    public Object getPath() {
        return get(6);
    }

    /**
     * Setter for <code>public.test_item.unique_id</code>.
     */
    public void setUniqueId(String value) {
        set(7, value);
    }

    /**
     * Getter for <code>public.test_item.unique_id</code>.
     */
    public String getUniqueId() {
        return (String) get(7);
    }

    /**
     * Setter for <code>public.test_item.parent_id</code>.
     */
    public void setParentId(Long value) {
        set(8, value);
    }

    /**
     * Getter for <code>public.test_item.parent_id</code>.
     */
    public Long getParentId() {
        return (Long) get(8);
    }

    /**
     * Setter for <code>public.test_item.retry_of</code>.
     */
    public void setRetryOf(Long value) {
        set(9, value);
    }

    /**
     * Getter for <code>public.test_item.retry_of</code>.
     */
    public Long getRetryOf() {
        return (Long) get(9);
    }

    /**
     * Setter for <code>public.test_item.launch_id</code>.
     */
    public void setLaunchId(Long value) {
        set(10, value);
    }

    /**
     * Getter for <code>public.test_item.launch_id</code>.
     */
    public Long getLaunchId() {
        return (Long) get(10);
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
    // Record11 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row11<Long, String, JTestItemTypeEnum, Timestamp, String, Timestamp, Object, String, Long, Long, Long> fieldsRow() {
        return (Row11) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row11<Long, String, JTestItemTypeEnum, Timestamp, String, Timestamp, Object, String, Long, Long, Long> valuesRow() {
        return (Row11) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field1() {
        return JTestItem.TEST_ITEM.ITEM_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field2() {
        return JTestItem.TEST_ITEM.NAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<JTestItemTypeEnum> field3() {
        return JTestItem.TEST_ITEM.TYPE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field4() {
        return JTestItem.TEST_ITEM.START_TIME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field5() {
        return JTestItem.TEST_ITEM.DESCRIPTION;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field6() {
        return JTestItem.TEST_ITEM.LAST_MODIFIED;
    }

    /**
     * @deprecated Unknown data type. Please define an explicit {@link org.jooq.Binding} to specify how this type should be handled. Deprecation can be turned off using <deprecationOnUnknownTypes/> in your code generator configuration.
     */
    @java.lang.Deprecated
    @Override
    public Field<Object> field7() {
        return JTestItem.TEST_ITEM.PATH;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field8() {
        return JTestItem.TEST_ITEM.UNIQUE_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field9() {
        return JTestItem.TEST_ITEM.PARENT_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field10() {
        return JTestItem.TEST_ITEM.RETRY_OF;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field11() {
        return JTestItem.TEST_ITEM.LAUNCH_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long component1() {
        return getItemId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component2() {
        return getName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JTestItemTypeEnum component3() {
        return getType();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp component4() {
        return getStartTime();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component5() {
        return getDescription();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp component6() {
        return getLastModified();
    }

    /**
     * @deprecated Unknown data type. Please define an explicit {@link org.jooq.Binding} to specify how this type should be handled. Deprecation can be turned off using <deprecationOnUnknownTypes/> in your code generator configuration.
     */
    @java.lang.Deprecated
    @Override
    public Object component7() {
        return getPath();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component8() {
        return getUniqueId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long component9() {
        return getParentId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long component10() {
        return getRetryOf();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long component11() {
        return getLaunchId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long value1() {
        return getItemId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value2() {
        return getName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JTestItemTypeEnum value3() {
        return getType();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp value4() {
        return getStartTime();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value5() {
        return getDescription();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp value6() {
        return getLastModified();
    }

    /**
     * @deprecated Unknown data type. Please define an explicit {@link org.jooq.Binding} to specify how this type should be handled. Deprecation can be turned off using <deprecationOnUnknownTypes/> in your code generator configuration.
     */
    @java.lang.Deprecated
    @Override
    public Object value7() {
        return getPath();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value8() {
        return getUniqueId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long value9() {
        return getParentId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long value10() {
        return getRetryOf();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long value11() {
        return getLaunchId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JTestItemRecord value1(Long value) {
        setItemId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JTestItemRecord value2(String value) {
        setName(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JTestItemRecord value3(JTestItemTypeEnum value) {
        setType(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JTestItemRecord value4(Timestamp value) {
        setStartTime(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JTestItemRecord value5(String value) {
        setDescription(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JTestItemRecord value6(Timestamp value) {
        setLastModified(value);
        return this;
    }

    /**
     * @deprecated Unknown data type. Please define an explicit {@link org.jooq.Binding} to specify how this type should be handled. Deprecation can be turned off using <deprecationOnUnknownTypes/> in your code generator configuration.
     */
    @java.lang.Deprecated
    @Override
    public JTestItemRecord value7(Object value) {
        setPath(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JTestItemRecord value8(String value) {
        setUniqueId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JTestItemRecord value9(Long value) {
        setParentId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JTestItemRecord value10(Long value) {
        setRetryOf(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JTestItemRecord value11(Long value) {
        setLaunchId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JTestItemRecord values(Long value1, String value2, JTestItemTypeEnum value3, Timestamp value4, String value5, Timestamp value6, Object value7, String value8, Long value9, Long value10, Long value11) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        value6(value6);
        value7(value7);
        value8(value8);
        value9(value9);
        value10(value10);
        value11(value11);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached JTestItemRecord
     */
    public JTestItemRecord() {
        super(JTestItem.TEST_ITEM);
    }

    /**
     * Create a detached, initialised JTestItemRecord
     */
    public JTestItemRecord(Long itemId, String name, JTestItemTypeEnum type, Timestamp startTime, String description, Timestamp lastModified, Object path, String uniqueId, Long parentId, Long retryOf, Long launchId) {
        super(JTestItem.TEST_ITEM);

        set(0, itemId);
        set(1, name);
        set(2, type);
        set(3, startTime);
        set(4, description);
        set(5, lastModified);
        set(6, path);
        set(7, uniqueId);
        set(8, parentId);
        set(9, retryOf);
        set(10, launchId);
    }
}
