/*
 * This file is generated by jOOQ.
*/
package com.epam.ta.reportportal.jooq.udt;

import com.epam.ta.reportportal.jooq.Public;
import com.epam.ta.reportportal.jooq.udt.records.ParameterRecord;
import org.jooq.Schema;
import org.jooq.UDTField;
import org.jooq.impl.UDTImpl;

import javax.annotation.Generated;


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
public class Parameter extends UDTImpl<ParameterRecord> {

    private static final long serialVersionUID = -1115376496;

    /**
     * The reference instance of <code>public.parameter</code>
     */
    public static final Parameter PARAMETER = new Parameter();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<ParameterRecord> getRecordType() {
        return ParameterRecord.class;
    }

    /**
     * The attribute <code>public.parameter.key</code>.
     */
    public static final UDTField<ParameterRecord, String> KEY = createField("key", org.jooq.impl.SQLDataType.VARCHAR(256), PARAMETER, "");

    /**
     * The attribute <code>public.parameter.value</code>.
     */
    public static final UDTField<ParameterRecord, String> VALUE = createField("value", org.jooq.impl.SQLDataType.CLOB, PARAMETER, "");

    /**
     * No further instances allowed
     */
    private Parameter() {
        super("parameter", null, null, false);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Schema getSchema() {
        return Public.PUBLIC;
    }
}
