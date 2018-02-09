/*
 * This file is generated by jOOQ.
*/
package com.epam.ta.reportportal.jooq.tables;

import com.epam.ta.reportportal.jooq.Indexes;
import com.epam.ta.reportportal.jooq.Keys;
import com.epam.ta.reportportal.jooq.Public;
import com.epam.ta.reportportal.jooq.enums.StatusEnum;
import com.epam.ta.reportportal.jooq.tables.records.TestItemResultsRecord;
import org.jooq.*;
import org.jooq.impl.DSL;
import org.jooq.impl.TableImpl;

import javax.annotation.Generated;
import java.util.Arrays;
import java.util.List;


/**
 * This class is generated by jOOQ.
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.10.4"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class TestItemResults extends TableImpl<TestItemResultsRecord> {

    private static final long serialVersionUID = -1216552571;

    /**
     * The reference instance of <code>public.test_item_results</code>
     */
    public static final TestItemResults TEST_ITEM_RESULTS = new TestItemResults();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<TestItemResultsRecord> getRecordType() {
        return TestItemResultsRecord.class;
    }

    /**
     * The column <code>public.test_item_results.id</code>.
     */
    public final TableField<TestItemResultsRecord, Long> ID = createField("id", org.jooq.impl.SQLDataType.BIGINT.nullable(false).defaultValue(org.jooq.impl.DSL.field("nextval('test_item_results_id_seq'::regclass)", org.jooq.impl.SQLDataType.BIGINT)), this, "");

    /**
     * The column <code>public.test_item_results.item_id</code>.
     */
    public final TableField<TestItemResultsRecord, Long> ITEM_ID = createField("item_id", org.jooq.impl.SQLDataType.BIGINT.nullable(false), this, "");

    /**
     * The column <code>public.test_item_results.status</code>.
     */
    public final TableField<TestItemResultsRecord, StatusEnum> STATUS = createField("status", org.jooq.util.postgres.PostgresDataType.VARCHAR.asEnumDataType(com.epam.ta.reportportal.jooq.enums.StatusEnum.class), this, "");

    /**
     * The column <code>public.test_item_results.duration</code>.
     */
    public final TableField<TestItemResultsRecord, Float> DURATION = createField("duration", org.jooq.impl.SQLDataType.REAL, this, "");

    /**
     * Create a <code>public.test_item_results</code> table reference
     */
    public TestItemResults() {
        this(DSL.name("test_item_results"), null);
    }

    /**
     * Create an aliased <code>public.test_item_results</code> table reference
     */
    public TestItemResults(String alias) {
        this(DSL.name(alias), TEST_ITEM_RESULTS);
    }

    /**
     * Create an aliased <code>public.test_item_results</code> table reference
     */
    public TestItemResults(Name alias) {
        this(alias, TEST_ITEM_RESULTS);
    }

    private TestItemResults(Name alias, Table<TestItemResultsRecord> aliased) {
        this(alias, aliased, null);
    }

    private TestItemResults(Name alias, Table<TestItemResultsRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, "");
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Schema getSchema() {
        return Public.PUBLIC;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<Index> getIndexes() {
        return Arrays.<Index>asList(Indexes.TEST_ITEM_RESULTS_ITEM_ID_KEY, Indexes.TEST_ITEM_RESULTS_PK);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Identity<TestItemResultsRecord, Long> getIdentity() {
        return Keys.IDENTITY_TEST_ITEM_RESULTS;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<TestItemResultsRecord> getPrimaryKey() {
        return Keys.TEST_ITEM_RESULTS_PK;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<TestItemResultsRecord>> getKeys() {
        return Arrays.<UniqueKey<TestItemResultsRecord>>asList(Keys.TEST_ITEM_RESULTS_PK, Keys.TEST_ITEM_RESULTS_ITEM_ID_KEY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<ForeignKey<TestItemResultsRecord, ?>> getReferences() {
        return Arrays.<ForeignKey<TestItemResultsRecord, ?>>asList(Keys.TEST_ITEM_RESULTS__TEST_ITEM_RESULTS_ITEM_ID_FKEY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TestItemResults as(String alias) {
        return new TestItemResults(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TestItemResults as(Name alias) {
        return new TestItemResults(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public TestItemResults rename(String name) {
        return new TestItemResults(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public TestItemResults rename(Name name) {
        return new TestItemResults(name, null);
    }
}
