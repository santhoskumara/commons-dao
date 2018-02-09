/*
 * This file is generated by jOOQ.
*/
package com.epam.ta.reportportal.jooq.tables.pojos;

import javax.annotation.Generated;
import javax.persistence.*;
import java.io.Serializable;
import java.util.Arrays;


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
@Table(name = "project_email_configuration", schema = "public", indexes = {
    @Index(name = "project_email_configuration_pk", unique = true, columnList = "id ASC")
})
public class ProjectEmailConfiguration implements Serializable {

    private static final long serialVersionUID = 545047309;

    private Integer  id;
    private Boolean  enabled;
    private String[] recipients;

    public ProjectEmailConfiguration() {}

    public ProjectEmailConfiguration(ProjectEmailConfiguration value) {
        this.id = value.id;
        this.enabled = value.enabled;
        this.recipients = value.recipients;
    }

    public ProjectEmailConfiguration(
        Integer  id,
        Boolean  enabled,
        String[] recipients
    ) {
        this.id = id;
        this.enabled = enabled;
        this.recipients = recipients;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", unique = true, nullable = false, precision = 32)
    public Integer getId() {
        return this.id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @Column(name = "enabled", nullable = false)
    public Boolean getEnabled() {
        return this.enabled;
    }

    public void setEnabled(Boolean enabled) {
        this.enabled = enabled;
    }

    @Column(name = "recipients", nullable = false)
    public String[] getRecipients() {
        return this.recipients;
    }

    public void setRecipients(String... recipients) {
        this.recipients = recipients;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("ProjectEmailConfiguration (");

        sb.append(id);
        sb.append(", ").append(enabled);
        sb.append(", ").append(Arrays.toString(recipients));

        sb.append(")");
        return sb.toString();
    }
}
