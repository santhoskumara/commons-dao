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
package com.epam.ta.reportportal.jooq.tables;

import com.epam.ta.reportportal.jooq.Indexes;
import com.epam.ta.reportportal.jooq.JPublic;
import com.epam.ta.reportportal.jooq.Keys;
import com.epam.ta.reportportal.jooq.tables.records.JOauthRegistrationScopeRecord;
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
        "jOOQ version:3.11.7"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class JOauthRegistrationScope extends TableImpl<JOauthRegistrationScopeRecord> {

    private static final long serialVersionUID = -1369680770;

    /**
     * The reference instance of <code>public.oauth_registration_scope</code>
     */
    public static final JOauthRegistrationScope OAUTH_REGISTRATION_SCOPE = new JOauthRegistrationScope();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<JOauthRegistrationScopeRecord> getRecordType() {
        return JOauthRegistrationScopeRecord.class;
    }

    /**
     * The column <code>public.oauth_registration_scope.id</code>.
     */
    public final TableField<JOauthRegistrationScopeRecord, Integer> ID = createField("id", org.jooq.impl.SQLDataType.INTEGER.nullable(false).defaultValue(org.jooq.impl.DSL.field("nextval('oauth_registration_scope_id_seq'::regclass)", org.jooq.impl.SQLDataType.INTEGER)), this, "");

    /**
     * The column <code>public.oauth_registration_scope.oauth_registration_fk</code>.
     */
    public final TableField<JOauthRegistrationScopeRecord, String> OAUTH_REGISTRATION_FK = createField("oauth_registration_fk", org.jooq.impl.SQLDataType.VARCHAR(128), this, "");

    /**
     * The column <code>public.oauth_registration_scope.scope</code>.
     */
    public final TableField<JOauthRegistrationScopeRecord, String> SCOPE = createField("scope", org.jooq.impl.SQLDataType.VARCHAR(256), this, "");

    /**
     * Create a <code>public.oauth_registration_scope</code> table reference
     */
    public JOauthRegistrationScope() {
        this(DSL.name("oauth_registration_scope"), null);
    }

    /**
     * Create an aliased <code>public.oauth_registration_scope</code> table reference
     */
    public JOauthRegistrationScope(String alias) {
        this(DSL.name(alias), OAUTH_REGISTRATION_SCOPE);
    }

    /**
     * Create an aliased <code>public.oauth_registration_scope</code> table reference
     */
    public JOauthRegistrationScope(Name alias) {
        this(alias, OAUTH_REGISTRATION_SCOPE);
    }

    private JOauthRegistrationScope(Name alias, Table<JOauthRegistrationScopeRecord> aliased) {
        this(alias, aliased, null);
    }

    private JOauthRegistrationScope(Name alias, Table<JOauthRegistrationScopeRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""));
    }

    public <O extends Record> JOauthRegistrationScope(Table<O> child, ForeignKey<O, JOauthRegistrationScopeRecord> key) {
        super(child, key, OAUTH_REGISTRATION_SCOPE);
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
        return Arrays.<Index>asList(Indexes.OAUTH_REGISTRATION_SCOPE_PK, Indexes.OAUTH_REGISTRATION_SCOPE_UNIQUE);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Identity<JOauthRegistrationScopeRecord, Integer> getIdentity() {
        return Keys.IDENTITY_OAUTH_REGISTRATION_SCOPE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<JOauthRegistrationScopeRecord> getPrimaryKey() {
        return Keys.OAUTH_REGISTRATION_SCOPE_PK;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<JOauthRegistrationScopeRecord>> getKeys() {
        return Arrays.<UniqueKey<JOauthRegistrationScopeRecord>>asList(Keys.OAUTH_REGISTRATION_SCOPE_PK, Keys.OAUTH_REGISTRATION_SCOPE_UNIQUE);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<ForeignKey<JOauthRegistrationScopeRecord, ?>> getReferences() {
        return Arrays.<ForeignKey<JOauthRegistrationScopeRecord, ?>>asList(Keys.OAUTH_REGISTRATION_SCOPE__OAUTH_REGISTRATION_SCOPE_OAUTH_REGISTRATION_FK_FKEY);
    }

    public JOauthRegistration oauthRegistration() {
        return new JOauthRegistration(this, Keys.OAUTH_REGISTRATION_SCOPE__OAUTH_REGISTRATION_SCOPE_OAUTH_REGISTRATION_FK_FKEY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JOauthRegistrationScope as(String alias) {
        return new JOauthRegistrationScope(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JOauthRegistrationScope as(Name alias) {
        return new JOauthRegistrationScope(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public JOauthRegistrationScope rename(String name) {
        return new JOauthRegistrationScope(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public JOauthRegistrationScope rename(Name name) {
        return new JOauthRegistrationScope(name, null);
    }
}