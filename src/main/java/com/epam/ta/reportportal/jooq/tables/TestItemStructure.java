/*
 * This file is generated by jOOQ.
*/
package com.epam.ta.reportportal.jooq.tables;

import com.epam.ta.reportportal.jooq.Indexes;
import com.epam.ta.reportportal.jooq.Keys;
import com.epam.ta.reportportal.jooq.Public;
import com.epam.ta.reportportal.jooq.tables.records.TestItemStructureRecord;
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
public class TestItemStructure extends TableImpl<TestItemStructureRecord> {

    private static final long serialVersionUID = -1108324707;

    /**
     * The reference instance of <code>public.test_item_structure</code>
     */
    public static final TestItemStructure TEST_ITEM_STRUCTURE = new TestItemStructure();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<TestItemStructureRecord> getRecordType() {
        return TestItemStructureRecord.class;
    }

    /**
     * The column <code>public.test_item_structure.id</code>.
     */
    public final TableField<TestItemStructureRecord, Long> ID = createField("id", org.jooq.impl.SQLDataType.BIGINT.nullable(false).defaultValue(org.jooq.impl.DSL.field("nextval('test_item_structure_id_seq'::regclass)", org.jooq.impl.SQLDataType.BIGINT)), this, "");

    /**
     * The column <code>public.test_item_structure.item_id</code>.
     */
    public final TableField<TestItemStructureRecord, Long> ITEM_ID = createField("item_id", org.jooq.impl.SQLDataType.BIGINT.nullable(false), this, "");

    /**
     * The column <code>public.test_item_structure.launch_id</code>.
     */
    public final TableField<TestItemStructureRecord, Long> LAUNCH_ID = createField("launch_id", org.jooq.impl.SQLDataType.BIGINT.nullable(false), this, "");

    /**
     * The column <code>public.test_item_structure.parent_id</code>.
     */
    public final TableField<TestItemStructureRecord, Long> PARENT_ID = createField("parent_id", org.jooq.impl.SQLDataType.BIGINT, this, "");

    /**
     * The column <code>public.test_item_structure.retry_of</code>.
     */
    public final TableField<TestItemStructureRecord, Long> RETRY_OF = createField("retry_of", org.jooq.impl.SQLDataType.BIGINT, this, "");

    /**
     * The column <code>public.test_item_structure.has_children</code>.
     */
    public final TableField<TestItemStructureRecord, Boolean> HAS_CHILDREN = createField("has_children", org.jooq.impl.SQLDataType.BOOLEAN.defaultValue(org.jooq.impl.DSL.field("false", org.jooq.impl.SQLDataType.BOOLEAN)), this, "");

    /**
     * Create a <code>public.test_item_structure</code> table reference
     */
    public TestItemStructure() {
        this(DSL.name("test_item_structure"), null);
    }

    /**
     * Create an aliased <code>public.test_item_structure</code> table reference
     */
    public TestItemStructure(String alias) {
        this(DSL.name(alias), TEST_ITEM_STRUCTURE);
    }

    /**
     * Create an aliased <code>public.test_item_structure</code> table reference
     */
    public TestItemStructure(Name alias) {
        this(alias, TEST_ITEM_STRUCTURE);
    }

    private TestItemStructure(Name alias, Table<TestItemStructureRecord> aliased) {
        this(alias, aliased, null);
    }

    private TestItemStructure(Name alias, Table<TestItemStructureRecord> aliased, Field<?>[] parameters) {
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
        return Arrays.<Index>asList(Indexes.TEST_ITEM_STRUCTURE_ITEM_ID_KEY, Indexes.TEST_ITEM_STRUCTURE_PK);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Identity<TestItemStructureRecord, Long> getIdentity() {
        return Keys.IDENTITY_TEST_ITEM_STRUCTURE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<TestItemStructureRecord> getPrimaryKey() {
        return Keys.TEST_ITEM_STRUCTURE_PK;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<TestItemStructureRecord>> getKeys() {
        return Arrays.<UniqueKey<TestItemStructureRecord>>asList(Keys.TEST_ITEM_STRUCTURE_PK, Keys.TEST_ITEM_STRUCTURE_ITEM_ID_KEY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<ForeignKey<TestItemStructureRecord, ?>> getReferences() {
        return Arrays.<ForeignKey<TestItemStructureRecord, ?>>asList(Keys.TEST_ITEM_STRUCTURE__TEST_ITEM_STRUCTURE_ITEM_ID_FKEY, Keys.TEST_ITEM_STRUCTURE__TEST_ITEM_STRUCTURE_LAUNCH_ID_FKEY, Keys.TEST_ITEM_STRUCTURE__TEST_ITEM_STRUCTURE_PARENT_ID_FKEY, Keys.TEST_ITEM_STRUCTURE__TEST_ITEM_STRUCTURE_RETRY_OF_FKEY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TestItemStructure as(String alias) {
        return new TestItemStructure(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TestItemStructure as(Name alias) {
        return new TestItemStructure(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public TestItemStructure rename(String name) {
        return new TestItemStructure(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public TestItemStructure rename(Name name) {
        return new TestItemStructure(name, null);
    }
}
