/*
 * This file is generated by jOOQ.
 */
package com.epam.ta.reportportal.jooq.tables.records;


import com.epam.ta.reportportal.jooq.tables.JStatistics;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record5;
import org.jooq.Row5;
import org.jooq.impl.UpdatableRecordImpl;


/**
 * This class is generated by jOOQ.
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.11.11"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class JStatisticsRecord extends UpdatableRecordImpl<JStatisticsRecord> implements Record5<Long, Integer, Long, Long, Long> {

    private static final long serialVersionUID = 981730108;

    /**
     * Setter for <code>public.statistics.s_id</code>.
     */
    public void setSId(Long value) {
        set(0, value);
    }

    /**
     * Getter for <code>public.statistics.s_id</code>.
     */
    public Long getSId() {
        return (Long) get(0);
    }

    /**
     * Setter for <code>public.statistics.s_counter</code>.
     */
    public void setSCounter(Integer value) {
        set(1, value);
    }

    /**
     * Getter for <code>public.statistics.s_counter</code>.
     */
    public Integer getSCounter() {
        return (Integer) get(1);
    }

    /**
     * Setter for <code>public.statistics.launch_id</code>.
     */
    public void setLaunchId(Long value) {
        set(2, value);
    }

    /**
     * Getter for <code>public.statistics.launch_id</code>.
     */
    public Long getLaunchId() {
        return (Long) get(2);
    }

    /**
     * Setter for <code>public.statistics.item_id</code>.
     */
    public void setItemId(Long value) {
        set(3, value);
    }

    /**
     * Getter for <code>public.statistics.item_id</code>.
     */
    public Long getItemId() {
        return (Long) get(3);
    }

    /**
     * Setter for <code>public.statistics.statistics_field_id</code>.
     */
    public void setStatisticsFieldId(Long value) {
        set(4, value);
    }

    /**
     * Getter for <code>public.statistics.statistics_field_id</code>.
     */
    public Long getStatisticsFieldId() {
        return (Long) get(4);
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
    // Record5 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row5<Long, Integer, Long, Long, Long> fieldsRow() {
        return (Row5) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row5<Long, Integer, Long, Long, Long> valuesRow() {
        return (Row5) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field1() {
        return JStatistics.STATISTICS.S_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field2() {
        return JStatistics.STATISTICS.S_COUNTER;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field3() {
        return JStatistics.STATISTICS.LAUNCH_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field4() {
        return JStatistics.STATISTICS.ITEM_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field5() {
        return JStatistics.STATISTICS.STATISTICS_FIELD_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long component1() {
        return getSId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component2() {
        return getSCounter();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long component3() {
        return getLaunchId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long component4() {
        return getItemId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long component5() {
        return getStatisticsFieldId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long value1() {
        return getSId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value2() {
        return getSCounter();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long value3() {
        return getLaunchId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long value4() {
        return getItemId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long value5() {
        return getStatisticsFieldId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JStatisticsRecord value1(Long value) {
        setSId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JStatisticsRecord value2(Integer value) {
        setSCounter(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JStatisticsRecord value3(Long value) {
        setLaunchId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JStatisticsRecord value4(Long value) {
        setItemId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JStatisticsRecord value5(Long value) {
        setStatisticsFieldId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JStatisticsRecord values(Long value1, Integer value2, Long value3, Long value4, Long value5) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached JStatisticsRecord
     */
    public JStatisticsRecord() {
        super(JStatistics.STATISTICS);
    }

    /**
     * Create a detached, initialised JStatisticsRecord
     */
    public JStatisticsRecord(Long sId, Integer sCounter, Long launchId, Long itemId, Long statisticsFieldId) {
        super(JStatistics.STATISTICS);

        set(0, sId);
        set(1, sCounter);
        set(2, launchId);
        set(3, itemId);
        set(4, statisticsFieldId);
    }
}
