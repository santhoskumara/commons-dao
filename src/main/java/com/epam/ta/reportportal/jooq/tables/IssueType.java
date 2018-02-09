/*
 * This file is generated by jOOQ.
*/
package com.epam.ta.reportportal.jooq.tables;

import com.epam.ta.reportportal.jooq.Indexes;
import com.epam.ta.reportportal.jooq.Keys;
import com.epam.ta.reportportal.jooq.Public;
import com.epam.ta.reportportal.jooq.enums.IssueGroupEnum;
import com.epam.ta.reportportal.jooq.tables.records.IssueTypeRecord;
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
public class IssueType extends TableImpl<IssueTypeRecord> {

    private static final long serialVersionUID = -838934634;

    /**
     * The reference instance of <code>public.issue_type</code>
     */
    public static final IssueType ISSUE_TYPE = new IssueType();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<IssueTypeRecord> getRecordType() {
        return IssueTypeRecord.class;
    }

    /**
     * The column <code>public.issue_type.id</code>.
     */
    public final TableField<IssueTypeRecord, Integer> ID = createField("id", org.jooq.impl.SQLDataType.INTEGER.nullable(false).defaultValue(org.jooq.impl.DSL.field("nextval('issue_type_id_seq'::regclass)", org.jooq.impl.SQLDataType.INTEGER)), this, "");

    /**
     * The column <code>public.issue_type.issue_group</code>.
     */
    public final TableField<IssueTypeRecord, IssueGroupEnum> ISSUE_GROUP = createField("issue_group", org.jooq.util.postgres.PostgresDataType.VARCHAR.asEnumDataType(com.epam.ta.reportportal.jooq.enums.IssueGroupEnum.class), this, "");

    /**
     * The column <code>public.issue_type.locator</code>.
     */
    public final TableField<IssueTypeRecord, String> LOCATOR = createField("locator", org.jooq.impl.SQLDataType.VARCHAR(64), this, "");

    /**
     * The column <code>public.issue_type.long_name</code>.
     */
    public final TableField<IssueTypeRecord, String> LONG_NAME = createField("long_name", org.jooq.impl.SQLDataType.VARCHAR(256), this, "");

    /**
     * The column <code>public.issue_type.short_name</code>.
     */
    public final TableField<IssueTypeRecord, String> SHORT_NAME = createField("short_name", org.jooq.impl.SQLDataType.VARCHAR(64), this, "");

    /**
     * The column <code>public.issue_type.hex_color</code>.
     */
    public final TableField<IssueTypeRecord, String> HEX_COLOR = createField("hex_color", org.jooq.impl.SQLDataType.VARCHAR(7), this, "");

    /**
     * Create a <code>public.issue_type</code> table reference
     */
    public IssueType() {
        this(DSL.name("issue_type"), null);
    }

    /**
     * Create an aliased <code>public.issue_type</code> table reference
     */
    public IssueType(String alias) {
        this(DSL.name(alias), ISSUE_TYPE);
    }

    /**
     * Create an aliased <code>public.issue_type</code> table reference
     */
    public IssueType(Name alias) {
        this(alias, ISSUE_TYPE);
    }

    private IssueType(Name alias, Table<IssueTypeRecord> aliased) {
        this(alias, aliased, null);
    }

    private IssueType(Name alias, Table<IssueTypeRecord> aliased, Field<?>[] parameters) {
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
        return Arrays.<Index>asList(Indexes.ISSUE_TYPE_PK);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Identity<IssueTypeRecord, Integer> getIdentity() {
        return Keys.IDENTITY_ISSUE_TYPE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<IssueTypeRecord> getPrimaryKey() {
        return Keys.ISSUE_TYPE_PK;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<IssueTypeRecord>> getKeys() {
        return Arrays.<UniqueKey<IssueTypeRecord>>asList(Keys.ISSUE_TYPE_PK);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public IssueType as(String alias) {
        return new IssueType(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public IssueType as(Name alias) {
        return new IssueType(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public IssueType rename(String name) {
        return new IssueType(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public IssueType rename(Name name) {
        return new IssueType(name, null);
    }
}
