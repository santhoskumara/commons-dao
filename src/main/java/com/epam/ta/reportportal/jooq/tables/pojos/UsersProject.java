/*
 * This file is generated by jOOQ.
*/
package com.epam.ta.reportportal.jooq.tables.pojos;

import com.epam.ta.reportportal.jooq.enums.ProjectRoleEnum;

import javax.annotation.Generated;
import javax.persistence.*;
import java.io.Serializable;


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
@Entity
@Table(name = "users_project", schema = "public", uniqueConstraints = {
    @UniqueConstraint(columnNames = {"user_id", "project_id"})
}, indexes = {
    @Index(name = "users_project_pk", unique = true, columnList = "user_id ASC, project_id ASC")
})
public class UsersProject implements Serializable {

    private static final long serialVersionUID = -1760674662;

    private Integer         userId;
    private Integer         projectId;
    private ProjectRoleEnum projectRole;

    public UsersProject() {}

    public UsersProject(UsersProject value) {
        this.userId = value.userId;
        this.projectId = value.projectId;
        this.projectRole = value.projectRole;
    }

    public UsersProject(
        Integer         userId,
        Integer         projectId,
        ProjectRoleEnum projectRole
    ) {
        this.userId = userId;
        this.projectId = projectId;
        this.projectRole = projectRole;
    }

    @Column(name = "user_id", nullable = false, precision = 32)
    public Integer getUserId() {
        return this.userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    @Column(name = "project_id", nullable = false, precision = 32)
    public Integer getProjectId() {
        return this.projectId;
    }

    public void setProjectId(Integer projectId) {
        this.projectId = projectId;
    }

    @Column(name = "project_role", nullable = false)
    public ProjectRoleEnum getProjectRole() {
        return this.projectRole;
    }

    public void setProjectRole(ProjectRoleEnum projectRole) {
        this.projectRole = projectRole;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("UsersProject (");

        sb.append(userId);
        sb.append(", ").append(projectId);
        sb.append(", ").append(projectRole);

        sb.append(")");
        return sb.toString();
    }
}
