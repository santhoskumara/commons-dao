/*
 * This file is generated by jOOQ.
 */
package com.epam.ta.reportportal.jooq.tables;


import com.epam.ta.reportportal.jooq.Indexes;
import com.epam.ta.reportportal.jooq.JPublic;
import com.epam.ta.reportportal.jooq.Keys;
import com.epam.ta.reportportal.jooq.tables.records.JLaunchAttributeRulesRecord;
import java.util.Arrays;
import java.util.List;
import javax.annotation.processing.Generated;
import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Identity;
import org.jooq.Index;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Row4;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.UniqueKey;
import org.jooq.impl.DSL;
import org.jooq.impl.TableImpl;


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
public class JLaunchAttributeRules extends TableImpl<JLaunchAttributeRulesRecord> {

  /**
   * The reference instance of <code>public.launch_attribute_rules</code>
   */
  public static final JLaunchAttributeRules LAUNCH_ATTRIBUTE_RULES = new JLaunchAttributeRules();
  private static final long serialVersionUID = 1128795973;
  /**
   * The column <code>public.launch_attribute_rules.id</code>.
   */
  public final TableField<JLaunchAttributeRulesRecord, Long> ID = createField(DSL.name("id"),
      org.jooq.impl.SQLDataType.BIGINT.nullable(false).defaultValue(
          org.jooq.impl.DSL.field("nextval('launch_attribute_rules_id_seq'::regclass)",
              org.jooq.impl.SQLDataType.BIGINT)), this, "");
  /**
   * The column <code>public.launch_attribute_rules.sender_case_id</code>.
   */
  public final TableField<JLaunchAttributeRulesRecord, Long> SENDER_CASE_ID = createField(
      DSL.name("sender_case_id"), org.jooq.impl.SQLDataType.BIGINT.nullable(false), this, "");
  /**
   * The column <code>public.launch_attribute_rules.key</code>.
   */
  public final TableField<JLaunchAttributeRulesRecord, String> KEY = createField(DSL.name("key"),
      org.jooq.impl.SQLDataType.VARCHAR(256), this, "");
  /**
   * The column <code>public.launch_attribute_rules.value</code>.
   */
  public final TableField<JLaunchAttributeRulesRecord, String> VALUE = createField(
      DSL.name("value"), org.jooq.impl.SQLDataType.VARCHAR(256).nullable(false), this, "");

  /**
   * Create a <code>public.launch_attribute_rules</code> table reference
   */
  public JLaunchAttributeRules() {
    this(DSL.name("launch_attribute_rules"), null);
  }

  /**
   * Create an aliased <code>public.launch_attribute_rules</code> table reference
   */
  public JLaunchAttributeRules(String alias) {
    this(DSL.name(alias), LAUNCH_ATTRIBUTE_RULES);
  }

  /**
   * Create an aliased <code>public.launch_attribute_rules</code> table reference
   */
  public JLaunchAttributeRules(Name alias) {
    this(alias, LAUNCH_ATTRIBUTE_RULES);
  }

  private JLaunchAttributeRules(Name alias, Table<JLaunchAttributeRulesRecord> aliased) {
    this(alias, aliased, null);
  }

  private JLaunchAttributeRules(Name alias, Table<JLaunchAttributeRulesRecord> aliased,
      Field<?>[] parameters) {
    super(alias, null, aliased, parameters, DSL.comment(""));
  }

  public <O extends Record> JLaunchAttributeRules(Table<O> child,
      ForeignKey<O, JLaunchAttributeRulesRecord> key) {
    super(child, key, LAUNCH_ATTRIBUTE_RULES);
  }

  /**
   * The class holding records for this type
   */
  @Override
  public Class<JLaunchAttributeRulesRecord> getRecordType() {
    return JLaunchAttributeRulesRecord.class;
  }

  @Override
  public Schema getSchema() {
    return JPublic.PUBLIC;
  }

  @Override
  public List<Index> getIndexes() {
    return Arrays.<Index>asList(Indexes.L_ATTR_RL_SEND_CASE_IDX, Indexes.LAUNCH_ATTRIBUTE_RULES_PK);
  }

  @Override
  public Identity<JLaunchAttributeRulesRecord, Long> getIdentity() {
    return Keys.IDENTITY_LAUNCH_ATTRIBUTE_RULES;
  }

  @Override
  public UniqueKey<JLaunchAttributeRulesRecord> getPrimaryKey() {
    return Keys.LAUNCH_ATTRIBUTE_RULES_PK;
  }

  @Override
  public List<UniqueKey<JLaunchAttributeRulesRecord>> getKeys() {
    return Arrays.<UniqueKey<JLaunchAttributeRulesRecord>>asList(Keys.LAUNCH_ATTRIBUTE_RULES_PK);
  }

  @Override
  public List<ForeignKey<JLaunchAttributeRulesRecord, ?>> getReferences() {
    return Arrays.<ForeignKey<JLaunchAttributeRulesRecord, ?>>asList(
        Keys.LAUNCH_ATTRIBUTE_RULES__LAUNCH_ATTRIBUTE_RULES_SENDER_CASE_ID_FKEY);
  }

  public JSenderCase senderCase() {
    return new JSenderCase(this,
        Keys.LAUNCH_ATTRIBUTE_RULES__LAUNCH_ATTRIBUTE_RULES_SENDER_CASE_ID_FKEY);
  }

  @Override
  public JLaunchAttributeRules as(String alias) {
    return new JLaunchAttributeRules(DSL.name(alias), this);
  }

  @Override
  public JLaunchAttributeRules as(Name alias) {
    return new JLaunchAttributeRules(alias, this);
  }

  /**
   * Rename this table
   */
  @Override
  public JLaunchAttributeRules rename(String name) {
    return new JLaunchAttributeRules(DSL.name(name), null);
  }

  /**
   * Rename this table
   */
  @Override
  public JLaunchAttributeRules rename(Name name) {
    return new JLaunchAttributeRules(name, null);
  }

  // -------------------------------------------------------------------------
  // Row4 type methods
  // -------------------------------------------------------------------------

  @Override
  public Row4<Long, Long, String, String> fieldsRow() {
    return (Row4) super.fieldsRow();
  }
}
