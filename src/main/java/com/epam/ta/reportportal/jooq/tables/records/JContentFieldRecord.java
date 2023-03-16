/*
 * This file is generated by jOOQ.
 */
package com.epam.ta.reportportal.jooq.tables.records;


import com.epam.ta.reportportal.jooq.tables.JContentField;
import javax.annotation.processing.Generated;
import org.jooq.Field;
import org.jooq.Record2;
import org.jooq.Row2;
import org.jooq.impl.TableRecordImpl;


/**
 * This class is generated by jOOQ.
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.12.4"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({"all", "unchecked", "rawtypes"})
public class JContentFieldRecord extends TableRecordImpl<JContentFieldRecord> implements
    Record2<Long, String> {

  private static final long serialVersionUID = -1854921726;

  /**
   * Create a detached JContentFieldRecord
   */
  public JContentFieldRecord() {
    super(JContentField.CONTENT_FIELD);
  }

  /**
   * Create a detached, initialised JContentFieldRecord
   */
  public JContentFieldRecord(Long id, String field) {
    super(JContentField.CONTENT_FIELD);

    set(0, id);
    set(1, field);
  }

  /**
   * Getter for <code>public.content_field.id</code>.
   */
  public Long getId() {
    return (Long) get(0);
  }

  /**
   * Setter for <code>public.content_field.id</code>.
   */
  public void setId(Long value) {
    set(0, value);
  }

  // -------------------------------------------------------------------------
  // Record2 type implementation
  // -------------------------------------------------------------------------

  /**
   * Getter for <code>public.content_field.field</code>.
   */
  public String getField() {
    return (String) get(1);
  }

  /**
   * Setter for <code>public.content_field.field</code>.
   */
  public void setField(String value) {
    set(1, value);
  }

  @Override
  public Row2<Long, String> fieldsRow() {
    return (Row2) super.fieldsRow();
  }

  @Override
  public Row2<Long, String> valuesRow() {
    return (Row2) super.valuesRow();
  }

  @Override
  public Field<Long> field1() {
    return JContentField.CONTENT_FIELD.ID;
  }

  @Override
  public Field<String> field2() {
    return JContentField.CONTENT_FIELD.FIELD;
  }

  @Override
  public Long component1() {
    return getId();
  }

  @Override
  public String component2() {
    return getField();
  }

  @Override
  public Long value1() {
    return getId();
  }

  @Override
  public String value2() {
    return getField();
  }

  @Override
  public JContentFieldRecord value1(Long value) {
    setId(value);
    return this;
  }

  // -------------------------------------------------------------------------
  // Constructors
  // -------------------------------------------------------------------------

  @Override
  public JContentFieldRecord value2(String value) {
    setField(value);
    return this;
  }

  @Override
  public JContentFieldRecord values(Long value1, String value2) {
    value1(value1);
    value2(value2);
    return this;
  }
}
