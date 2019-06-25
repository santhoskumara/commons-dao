/*
 * This file is generated by jOOQ.
 */
package com.epam.ta.reportportal.jooq.tables.records;


import com.epam.ta.reportportal.jooq.tables.JOauthRegistrationRestriction;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record4;
import org.jooq.Row4;
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
public class JOauthRegistrationRestrictionRecord extends UpdatableRecordImpl<JOauthRegistrationRestrictionRecord> implements Record4<Integer, String, String, String> {

    private static final long serialVersionUID = 425077593;

    /**
     * Setter for <code>public.oauth_registration_restriction.id</code>.
     */
    public void setId(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>public.oauth_registration_restriction.id</code>.
     */
    public Integer getId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>public.oauth_registration_restriction.oauth_registration_fk</code>.
     */
    public void setOauthRegistrationFk(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>public.oauth_registration_restriction.oauth_registration_fk</code>.
     */
    public String getOauthRegistrationFk() {
        return (String) get(1);
    }

    /**
     * Setter for <code>public.oauth_registration_restriction.type</code>.
     */
    public void setType(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>public.oauth_registration_restriction.type</code>.
     */
    public String getType() {
        return (String) get(2);
    }

    /**
     * Setter for <code>public.oauth_registration_restriction.value</code>.
     */
    public void setValue(String value) {
        set(3, value);
    }

    /**
     * Getter for <code>public.oauth_registration_restriction.value</code>.
     */
    public String getValue() {
        return (String) get(3);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Record1<Integer> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record4 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row4<Integer, String, String, String> fieldsRow() {
        return (Row4) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row4<Integer, String, String, String> valuesRow() {
        return (Row4) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field1() {
        return JOauthRegistrationRestriction.OAUTH_REGISTRATION_RESTRICTION.ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field2() {
        return JOauthRegistrationRestriction.OAUTH_REGISTRATION_RESTRICTION.OAUTH_REGISTRATION_FK;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field3() {
        return JOauthRegistrationRestriction.OAUTH_REGISTRATION_RESTRICTION.TYPE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field4() {
        return JOauthRegistrationRestriction.OAUTH_REGISTRATION_RESTRICTION.VALUE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component1() {
        return getId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component2() {
        return getOauthRegistrationFk();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component3() {
        return getType();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component4() {
        return getValue();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value1() {
        return getId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value2() {
        return getOauthRegistrationFk();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value3() {
        return getType();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value4() {
        return getValue();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JOauthRegistrationRestrictionRecord value1(Integer value) {
        setId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JOauthRegistrationRestrictionRecord value2(String value) {
        setOauthRegistrationFk(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JOauthRegistrationRestrictionRecord value3(String value) {
        setType(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JOauthRegistrationRestrictionRecord value4(String value) {
        setValue(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JOauthRegistrationRestrictionRecord values(Integer value1, String value2, String value3, String value4) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached JOauthRegistrationRestrictionRecord
     */
    public JOauthRegistrationRestrictionRecord() {
        super(JOauthRegistrationRestriction.OAUTH_REGISTRATION_RESTRICTION);
    }

    /**
     * Create a detached, initialised JOauthRegistrationRestrictionRecord
     */
    public JOauthRegistrationRestrictionRecord(Integer id, String oauthRegistrationFk, String type, String value) {
        super(JOauthRegistrationRestriction.OAUTH_REGISTRATION_RESTRICTION);

        set(0, id);
        set(1, oauthRegistrationFk);
        set(2, type);
        set(3, value);
    }
}
