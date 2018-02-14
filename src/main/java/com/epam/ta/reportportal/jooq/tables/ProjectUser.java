/*
 * This file is generated by jOOQ.
*/
package com.epam.ta.reportportal.jooq.tables;

import com.epam.ta.reportportal.jooq.Indexes;
import com.epam.ta.reportportal.jooq.Keys;
import com.epam.ta.reportportal.jooq.Public;
import com.epam.ta.reportportal.jooq.enums.ProjectRoleEnum;
import com.epam.ta.reportportal.jooq.tables.records.ProjectUserRecord;
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
public class ProjectUser extends TableImpl<ProjectUserRecord> {

    private static final long serialVersionUID = 1159801577;

    /**
     * The reference instance of <code>public.project_user</code>
     */
    public static final ProjectUser PROJECT_USER = new ProjectUser();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<ProjectUserRecord> getRecordType() {
        return ProjectUserRecord.class;
    }

    /**
     * The column <code>public.project_user.user_id</code>.
     */
    public final TableField<ProjectUserRecord, Integer> USER_ID = createField("user_id", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>public.project_user.project_id</code>.
     */
    public final TableField<ProjectUserRecord, Integer> PROJECT_ID = createField("project_id", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>public.project_user.project_role</code>.
     */
    public final TableField<ProjectUserRecord, ProjectRoleEnum> PROJECT_ROLE = createField("project_role", org.jooq.util.postgres.PostgresDataType.VARCHAR.asEnumDataType(com.epam.ta.reportportal.jooq.enums.ProjectRoleEnum.class), this, "");

    /**
     * Create a <code>public.project_user</code> table reference
     */
    public ProjectUser() {
        this(DSL.name("project_user"), null);
    }

    /**
     * Create an aliased <code>public.project_user</code> table reference
     */
    public ProjectUser(String alias) {
        this(DSL.name(alias), PROJECT_USER);
    }

    /**
     * Create an aliased <code>public.project_user</code> table reference
     */
    public ProjectUser(Name alias) {
        this(alias, PROJECT_USER);
    }

    private ProjectUser(Name alias, Table<ProjectUserRecord> aliased) {
        this(alias, aliased, null);
    }

    private ProjectUser(Name alias, Table<ProjectUserRecord> aliased, Field<?>[] parameters) {
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
        return Arrays.<Index>asList(Indexes.USERS_PROJECT_PK);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<ProjectUserRecord> getPrimaryKey() {
        return Keys.USERS_PROJECT_PK;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<ProjectUserRecord>> getKeys() {
        return Arrays.<UniqueKey<ProjectUserRecord>>asList(Keys.USERS_PROJECT_PK);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<ForeignKey<ProjectUserRecord, ?>> getReferences() {
        return Arrays.<ForeignKey<ProjectUserRecord, ?>>asList(Keys.PROJECT_USER__PROJECT_USER_USER_ID_FKEY, Keys.PROJECT_USER__PROJECT_USER_PROJECT_ID_FKEY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ProjectUser as(String alias) {
        return new ProjectUser(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ProjectUser as(Name alias) {
        return new ProjectUser(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public ProjectUser rename(String name) {
        return new ProjectUser(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public ProjectUser rename(Name name) {
        return new ProjectUser(name, null);
    }
}
