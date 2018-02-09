/*
 * This file is generated by jOOQ.
*/
package com.epam.ta.reportportal.jooq.tables;

import com.epam.ta.reportportal.jooq.Indexes;
import com.epam.ta.reportportal.jooq.Keys;
import com.epam.ta.reportportal.jooq.Public;
import com.epam.ta.reportportal.jooq.enums.LaunchModeEnum;
import com.epam.ta.reportportal.jooq.tables.records.LaunchRecord;
import org.jooq.*;
import org.jooq.impl.DSL;
import org.jooq.impl.TableImpl;

import javax.annotation.Generated;
import java.sql.Timestamp;
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
public class Launch extends TableImpl<LaunchRecord> {

    private static final long serialVersionUID = 335675759;

    /**
     * The reference instance of <code>public.launch</code>
     */
    public static final Launch LAUNCH = new Launch();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<LaunchRecord> getRecordType() {
        return LaunchRecord.class;
    }

    /**
     * The column <code>public.launch.id</code>.
     */
    public final TableField<LaunchRecord, Long> ID = createField("id", org.jooq.impl.SQLDataType.BIGINT.nullable(false).defaultValue(org.jooq.impl.DSL.field("nextval('launch_id_seq'::regclass)", org.jooq.impl.SQLDataType.BIGINT)), this, "");

    /**
     * The column <code>public.launch.project_id</code>.
     */
    public final TableField<LaunchRecord, Integer> PROJECT_ID = createField("project_id", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>public.launch.user_id</code>.
     */
    public final TableField<LaunchRecord, Integer> USER_ID = createField("user_id", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>public.launch.name</code>.
     */
    public final TableField<LaunchRecord, String> NAME = createField("name", org.jooq.impl.SQLDataType.VARCHAR(256).nullable(false), this, "");

    /**
     * The column <code>public.launch.description</code>.
     */
    public final TableField<LaunchRecord, String> DESCRIPTION = createField("description", org.jooq.impl.SQLDataType.CLOB, this, "");

    /**
     * The column <code>public.launch.start_time</code>.
     */
    public final TableField<LaunchRecord, Timestamp> START_TIME = createField("start_time", org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false), this, "");

    /**
     * The column <code>public.launch.number</code>.
     */
    public final TableField<LaunchRecord, Integer> NUMBER = createField("number", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>public.launch.last_modified</code>.
     */
    public final TableField<LaunchRecord, Timestamp> LAST_MODIFIED = createField("last_modified", org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false).defaultValue(org.jooq.impl.DSL.field("now()", org.jooq.impl.SQLDataType.TIMESTAMP)), this, "");

    /**
     * The column <code>public.launch.mode</code>.
     */
    public final TableField<LaunchRecord, LaunchModeEnum> MODE = createField("mode", org.jooq.util.postgres.PostgresDataType.VARCHAR.asEnumDataType(com.epam.ta.reportportal.jooq.enums.LaunchModeEnum.class), this, "");

    /**
     * Create a <code>public.launch</code> table reference
     */
    public Launch() {
        this(DSL.name("launch"), null);
    }

    /**
     * Create an aliased <code>public.launch</code> table reference
     */
    public Launch(String alias) {
        this(DSL.name(alias), LAUNCH);
    }

    /**
     * Create an aliased <code>public.launch</code> table reference
     */
    public Launch(Name alias) {
        this(alias, LAUNCH);
    }

    private Launch(Name alias, Table<LaunchRecord> aliased) {
        this(alias, aliased, null);
    }

    private Launch(Name alias, Table<LaunchRecord> aliased, Field<?>[] parameters) {
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
        return Arrays.<Index>asList(Indexes.LAUNCH_PK, Indexes.UNQ_NAME_NUMBER);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Identity<LaunchRecord, Long> getIdentity() {
        return Keys.IDENTITY_LAUNCH;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<LaunchRecord> getPrimaryKey() {
        return Keys.LAUNCH_PK;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<LaunchRecord>> getKeys() {
        return Arrays.<UniqueKey<LaunchRecord>>asList(Keys.LAUNCH_PK, Keys.UNQ_NAME_NUMBER);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<ForeignKey<LaunchRecord, ?>> getReferences() {
        return Arrays.<ForeignKey<LaunchRecord, ?>>asList(Keys.LAUNCH__LAUNCH_PROJECT_ID_FKEY, Keys.LAUNCH__LAUNCH_USER_ID_FKEY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Launch as(String alias) {
        return new Launch(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Launch as(Name alias) {
        return new Launch(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public Launch rename(String name) {
        return new Launch(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public Launch rename(Name name) {
        return new Launch(name, null);
    }
}
