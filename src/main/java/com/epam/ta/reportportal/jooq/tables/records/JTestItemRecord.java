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
import org.jooq.Record16;
import org.jooq.Row16;
import org.jooq.impl.UpdatableRecordImpl;


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
public class JTestItemRecord extends UpdatableRecordImpl<JTestItemRecord> implements Record16<Long, String, String, String, JTestItemTypeEnum, Timestamp, String, Timestamp, Object, String, Boolean, Boolean, Boolean, Long, Long, Long> {

    private static final long serialVersionUID = 1064647575;

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
     * Setter for <code>public.test_item.uuid</code>.
     */
    public void setUuid(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>public.test_item.uuid</code>.
     */
    public String getUuid() {
        return (String) get(1);
    }

    /**
     * Setter for <code>public.test_item.name</code>.
     */
    public void setName(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>public.test_item.name</code>.
     */
    public String getName() {
        return (String) get(2);
    }

    /**
     * Setter for <code>public.test_item.code_ref</code>.
     */
    public void setCodeRef(String value) {
        set(3, value);
    }

    /**
     * Getter for <code>public.test_item.code_ref</code>.
     */
    public String getCodeRef() {
        return (String) get(3);
    }

    /**
     * Setter for <code>public.test_item.type</code>.
     */
    public void setType(JTestItemTypeEnum value) {
        set(4, value);
    }

    /**
     * Getter for <code>public.test_item.type</code>.
     */
    public JTestItemTypeEnum getType() {
        return (JTestItemTypeEnum) get(4);
    }

    /**
     * Setter for <code>public.test_item.start_time</code>.
     */
    public void setStartTime(Timestamp value) {
        set(5, value);
    }

    /**
     * Getter for <code>public.test_item.start_time</code>.
     */
    public Timestamp getStartTime() {
        return (Timestamp) get(5);
    }

    /**
     * Setter for <code>public.test_item.description</code>.
     */
    public void setDescription(String value) {
        set(6, value);
    }

    /**
     * Getter for <code>public.test_item.description</code>.
     */
    public String getDescription() {
        return (String) get(6);
    }

    /**
     * Setter for <code>public.test_item.last_modified</code>.
     */
    public void setLastModified(Timestamp value) {
        set(7, value);
    }

    /**
     * Getter for <code>public.test_item.last_modified</code>.
     */
    public Timestamp getLastModified() {
        return (Timestamp) get(7);
    }

    /**
     * Setter for <code>public.test_item.path</code>.
     */
    public void setPath(Object value) {
        set(8, value);
    }

    /**
     * Getter for <code>public.test_item.path</code>.
     */
    public Object getPath() {
        return get(8);
    }

    /**
     * Setter for <code>public.test_item.unique_id</code>.
     */
    public void setUniqueId(String value) {
        set(9, value);
    }

    /**
     * Getter for <code>public.test_item.unique_id</code>.
     */
    public String getUniqueId() {
        return (String) get(9);
    }

    /**
     * Setter for <code>public.test_item.has_children</code>.
     */
    public void setHasChildren(Boolean value) {
        set(10, value);
    }

    /**
     * Getter for <code>public.test_item.has_children</code>.
     */
    public Boolean getHasChildren() {
        return (Boolean) get(10);
    }

    /**
     * Setter for <code>public.test_item.has_retries</code>.
     */
    public void setHasRetries(Boolean value) {
        set(11, value);
    }

    /**
     * Getter for <code>public.test_item.has_retries</code>.
     */
    public Boolean getHasRetries() {
        return (Boolean) get(11);
    }

    /**
     * Setter for <code>public.test_item.has_stats</code>.
     */
    public void setHasStats(Boolean value) {
        set(12, value);
    }

    /**
     * Getter for <code>public.test_item.has_stats</code>.
     */
    public Boolean getHasStats() {
        return (Boolean) get(12);
    }

    /**
     * Setter for <code>public.test_item.parent_id</code>.
     */
    public void setParentId(Long value) {
        set(13, value);
    }

    /**
     * Getter for <code>public.test_item.parent_id</code>.
     */
    public Long getParentId() {
        return (Long) get(13);
    }

    /**
     * Setter for <code>public.test_item.retry_of</code>.
     */
    public void setRetryOf(Long value) {
        set(14, value);
    }

    /**
     * Getter for <code>public.test_item.retry_of</code>.
     */
    public Long getRetryOf() {
        return (Long) get(14);
    }

    /**
     * Setter for <code>public.test_item.launch_id</code>.
     */
    public void setLaunchId(Long value) {
        set(15, value);
    }

    /**
     * Getter for <code>public.test_item.launch_id</code>.
     */
    public Long getLaunchId() {
        return (Long) get(15);
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
    // Record16 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row16<Long, String, String, String, JTestItemTypeEnum, Timestamp, String, Timestamp, Object, String, Boolean, Boolean, Boolean, Long, Long, Long> fieldsRow() {
        return (Row16) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row16<Long, String, String, String, JTestItemTypeEnum, Timestamp, String, Timestamp, Object, String, Boolean, Boolean, Boolean, Long, Long, Long> valuesRow() {
        return (Row16) super.valuesRow();
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
        return JTestItem.TEST_ITEM.UUID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field3() {
        return JTestItem.TEST_ITEM.NAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field4() {
        return JTestItem.TEST_ITEM.CODE_REF;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<JTestItemTypeEnum> field5() {
        return JTestItem.TEST_ITEM.TYPE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field6() {
        return JTestItem.TEST_ITEM.START_TIME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field7() {
        return JTestItem.TEST_ITEM.DESCRIPTION;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field8() {
        return JTestItem.TEST_ITEM.LAST_MODIFIED;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Object> field9() {
        return JTestItem.TEST_ITEM.PATH;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field10() {
        return JTestItem.TEST_ITEM.UNIQUE_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Boolean> field11() {
        return JTestItem.TEST_ITEM.HAS_CHILDREN;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Boolean> field12() {
        return JTestItem.TEST_ITEM.HAS_RETRIES;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Boolean> field13() {
        return JTestItem.TEST_ITEM.HAS_STATS;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field14() {
        return JTestItem.TEST_ITEM.PARENT_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field15() {
        return JTestItem.TEST_ITEM.RETRY_OF;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field16() {
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
        return getUuid();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component3() {
        return getName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component4() {
        return getCodeRef();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JTestItemTypeEnum component5() {
        return getType();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp component6() {
        return getStartTime();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component7() {
        return getDescription();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp component8() {
        return getLastModified();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Object component9() {
        return getPath();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component10() {
        return getUniqueId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Boolean component11() {
        return getHasChildren();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Boolean component12() {
        return getHasRetries();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Boolean component13() {
        return getHasStats();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long component14() {
        return getParentId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long component15() {
        return getRetryOf();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long component16() {
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
        return getUuid();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value3() {
        return getName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value4() {
        return getCodeRef();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JTestItemTypeEnum value5() {
        return getType();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp value6() {
        return getStartTime();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value7() {
        return getDescription();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp value8() {
        return getLastModified();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Object value9() {
        return getPath();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value10() {
        return getUniqueId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Boolean value11() {
        return getHasChildren();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Boolean value12() {
        return getHasRetries();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Boolean value13() {
        return getHasStats();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long value14() {
        return getParentId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long value15() {
        return getRetryOf();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long value16() {
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
        setUuid(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JTestItemRecord value3(String value) {
        setName(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JTestItemRecord value4(String value) {
        setCodeRef(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JTestItemRecord value5(JTestItemTypeEnum value) {
        setType(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JTestItemRecord value6(Timestamp value) {
        setStartTime(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JTestItemRecord value7(String value) {
        setDescription(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JTestItemRecord value8(Timestamp value) {
        setLastModified(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JTestItemRecord value9(Object value) {
        setPath(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JTestItemRecord value10(String value) {
        setUniqueId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JTestItemRecord value11(Boolean value) {
        setHasChildren(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JTestItemRecord value12(Boolean value) {
        setHasRetries(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JTestItemRecord value13(Boolean value) {
        setHasStats(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JTestItemRecord value14(Long value) {
        setParentId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JTestItemRecord value15(Long value) {
        setRetryOf(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JTestItemRecord value16(Long value) {
        setLaunchId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JTestItemRecord values(Long value1, String value2, String value3, String value4, JTestItemTypeEnum value5, Timestamp value6, String value7, Timestamp value8, Object value9, String value10, Boolean value11, Boolean value12, Boolean value13, Long value14, Long value15, Long value16) {
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
        value12(value12);
        value13(value13);
        value14(value14);
        value15(value15);
        value16(value16);
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
    public JTestItemRecord(Long itemId, String uuid, String name, String codeRef, JTestItemTypeEnum type, Timestamp startTime, String description, Timestamp lastModified, Object path, String uniqueId, Boolean hasChildren, Boolean hasRetries, Boolean hasStats, Long parentId, Long retryOf, Long launchId) {
        super(JTestItem.TEST_ITEM);

        set(0, itemId);
        set(1, uuid);
        set(2, name);
        set(3, codeRef);
        set(4, type);
        set(5, startTime);
        set(6, description);
        set(7, lastModified);
        set(8, path);
        set(9, uniqueId);
        set(10, hasChildren);
        set(11, hasRetries);
        set(12, hasStats);
        set(13, parentId);
        set(14, retryOf);
        set(15, launchId);
    }
}
