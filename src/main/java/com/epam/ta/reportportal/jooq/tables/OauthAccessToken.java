/*
 * This file is generated by jOOQ.
*/
package com.epam.ta.reportportal.jooq.tables;

import com.epam.ta.reportportal.jooq.Indexes;
import com.epam.ta.reportportal.jooq.Keys;
import com.epam.ta.reportportal.jooq.Public;
import com.epam.ta.reportportal.jooq.enums.AccessTokenTypeEnum;
import com.epam.ta.reportportal.jooq.tables.records.OauthAccessTokenRecord;
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
public class OauthAccessToken extends TableImpl<OauthAccessTokenRecord> {

    private static final long serialVersionUID = 1496073722;

    /**
     * The reference instance of <code>public.oauth_access_token</code>
     */
    public static final OauthAccessToken OAUTH_ACCESS_TOKEN = new OauthAccessToken();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<OauthAccessTokenRecord> getRecordType() {
        return OauthAccessTokenRecord.class;
    }

    /**
     * The column <code>public.oauth_access_token.user_id</code>.
     */
    public final TableField<OauthAccessTokenRecord, Long> USER_ID = createField("user_id", org.jooq.impl.SQLDataType.BIGINT.nullable(false), this, "");

    /**
     * The column <code>public.oauth_access_token.token</code>.
     */
    public final TableField<OauthAccessTokenRecord, String> TOKEN = createField("token", org.jooq.impl.SQLDataType.VARCHAR.nullable(false), this, "");

    /**
     * The column <code>public.oauth_access_token.token_type</code>.
     */
    public final TableField<OauthAccessTokenRecord, AccessTokenTypeEnum> TOKEN_TYPE = createField("token_type", org.jooq.util.postgres.PostgresDataType.VARCHAR.asEnumDataType(com.epam.ta.reportportal.jooq.enums.AccessTokenTypeEnum.class), this, "");

    /**
     * Create a <code>public.oauth_access_token</code> table reference
     */
    public OauthAccessToken() {
        this(DSL.name("oauth_access_token"), null);
    }

    /**
     * Create an aliased <code>public.oauth_access_token</code> table reference
     */
    public OauthAccessToken(String alias) {
        this(DSL.name(alias), OAUTH_ACCESS_TOKEN);
    }

    /**
     * Create an aliased <code>public.oauth_access_token</code> table reference
     */
    public OauthAccessToken(Name alias) {
        this(alias, OAUTH_ACCESS_TOKEN);
    }

    private OauthAccessToken(Name alias, Table<OauthAccessTokenRecord> aliased) {
        this(alias, aliased, null);
    }

    private OauthAccessToken(Name alias, Table<OauthAccessTokenRecord> aliased, Field<?>[] parameters) {
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
        return Arrays.<Index>asList(Indexes.ACCESS_TOKENS_PK);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<OauthAccessTokenRecord> getPrimaryKey() {
        return Keys.ACCESS_TOKENS_PK;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<OauthAccessTokenRecord>> getKeys() {
        return Arrays.<UniqueKey<OauthAccessTokenRecord>>asList(Keys.ACCESS_TOKENS_PK);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<ForeignKey<OauthAccessTokenRecord, ?>> getReferences() {
        return Arrays.<ForeignKey<OauthAccessTokenRecord, ?>>asList(Keys.OAUTH_ACCESS_TOKEN__OAUTH_ACCESS_TOKEN_USER_ID_FKEY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public OauthAccessToken as(String alias) {
        return new OauthAccessToken(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public OauthAccessToken as(Name alias) {
        return new OauthAccessToken(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public OauthAccessToken rename(String name) {
        return new OauthAccessToken(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public OauthAccessToken rename(Name name) {
        return new OauthAccessToken(name, null);
    }
}
