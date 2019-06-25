/*
 * This file is generated by jOOQ.
 */
package com.epam.ta.reportportal.jooq.enums;


import com.epam.ta.reportportal.jooq.JPublic;

import javax.annotation.Generated;

import org.jooq.Catalog;
import org.jooq.EnumType;
import org.jooq.Schema;


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
public enum JTestItemTypeEnum implements EnumType {

    SUITE("SUITE"),

    STORY("STORY"),

    TEST("TEST"),

    SCENARIO("SCENARIO"),

    STEP("STEP"),

    BEFORE_CLASS("BEFORE_CLASS"),

    BEFORE_GROUPS("BEFORE_GROUPS"),

    BEFORE_METHOD("BEFORE_METHOD"),

    BEFORE_SUITE("BEFORE_SUITE"),

    BEFORE_TEST("BEFORE_TEST"),

    AFTER_CLASS("AFTER_CLASS"),

    AFTER_GROUPS("AFTER_GROUPS"),

    AFTER_METHOD("AFTER_METHOD"),

    AFTER_SUITE("AFTER_SUITE"),

    AFTER_TEST("AFTER_TEST");

    private final String literal;

    private JTestItemTypeEnum(String literal) {
        this.literal = literal;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Catalog getCatalog() {
        return getSchema() == null ? null : getSchema().getCatalog();
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
    public String getName() {
        return "test_item_type_enum";
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String getLiteral() {
        return literal;
    }
}
