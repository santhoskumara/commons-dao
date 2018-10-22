/*
 *  Copyright (C) 2018 EPAM Systems
 *
 *  Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *
 *  http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 */

/*
 * This file is generated by jOOQ.
 */
package com.epam.ta.reportportal.jooq.tables;

import com.epam.ta.reportportal.jooq.Indexes;
import com.epam.ta.reportportal.jooq.JPublic;
import com.epam.ta.reportportal.jooq.Keys;
import com.epam.ta.reportportal.jooq.tables.records.JStatisticsFieldRecord;
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
        "jOOQ version:3.11.4"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class JStatisticsField extends TableImpl<JStatisticsFieldRecord> {

    private static final long serialVersionUID = 724039170;

    /**
     * The reference instance of <code>public.statistics_field</code>
     */
    public static final JStatisticsField STATISTICS_FIELD = new JStatisticsField();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<JStatisticsFieldRecord> getRecordType() {
        return JStatisticsFieldRecord.class;
    }

    /**
     * The column <code>public.statistics_field.sf_id</code>.
     */
    public final TableField<JStatisticsFieldRecord, Long> SF_ID = createField("sf_id", org.jooq.impl.SQLDataType.BIGINT.nullable(false).defaultValue(org.jooq.impl.DSL.field("nextval('statistics_field_sf_id_seq'::regclass)", org.jooq.impl.SQLDataType.BIGINT)), this, "");

    /**
     * The column <code>public.statistics_field.name</code>.
     */
    public final TableField<JStatisticsFieldRecord, String> NAME = createField("name", org.jooq.impl.SQLDataType.VARCHAR(256).nullable(false), this, "");

    /**
     * Create a <code>public.statistics_field</code> table reference
     */
    public JStatisticsField() {
        this(DSL.name("statistics_field"), null);
    }

    /**
     * Create an aliased <code>public.statistics_field</code> table reference
     */
    public JStatisticsField(String alias) {
        this(DSL.name(alias), STATISTICS_FIELD);
    }

    /**
     * Create an aliased <code>public.statistics_field</code> table reference
     */
    public JStatisticsField(Name alias) {
        this(alias, STATISTICS_FIELD);
    }

    private JStatisticsField(Name alias, Table<JStatisticsFieldRecord> aliased) {
        this(alias, aliased, null);
    }

    private JStatisticsField(Name alias, Table<JStatisticsFieldRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""));
    }

    public <O extends Record> JStatisticsField(Table<O> child, ForeignKey<O, JStatisticsFieldRecord> key) {
        super(child, key, STATISTICS_FIELD);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Schema getSchema() {
        return JPublic.PUBLIC;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<Index> getIndexes() {
        return Arrays.<Index>asList(Indexes.STATISTICS_FIELD_NAME_KEY, Indexes.STATISTICS_FIELD_PK);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Identity<JStatisticsFieldRecord, Long> getIdentity() {
        return Keys.IDENTITY_STATISTICS_FIELD;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<JStatisticsFieldRecord> getPrimaryKey() {
        return Keys.STATISTICS_FIELD_PK;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<JStatisticsFieldRecord>> getKeys() {
        return Arrays.<UniqueKey<JStatisticsFieldRecord>>asList(Keys.STATISTICS_FIELD_PK, Keys.STATISTICS_FIELD_NAME_KEY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JStatisticsField as(String alias) {
        return new JStatisticsField(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JStatisticsField as(Name alias) {
        return new JStatisticsField(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public JStatisticsField rename(String name) {
        return new JStatisticsField(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public JStatisticsField rename(Name name) {
        return new JStatisticsField(name, null);
    }
}
