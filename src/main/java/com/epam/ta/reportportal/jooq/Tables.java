/*
 *  Copyright (C) 2018 EPAM Systems
 *
 *  Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *
 *  http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 */

/*
 * This file is generated by jOOQ.
 */
package com.epam.ta.reportportal.jooq;

import com.epam.ta.reportportal.jooq.tables.*;
import com.epam.ta.reportportal.jooq.tables.records.*;
import org.jooq.Configuration;
import org.jooq.Field;
import org.jooq.Result;

import javax.annotation.Generated;


/**
 * Convenience access to all tables in public
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.11.4"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Tables {

    /**
     * The table <code>public.acl_class</code>.
     */
    public static final JAclClass ACL_CLASS = com.epam.ta.reportportal.jooq.tables.JAclClass.ACL_CLASS;

    /**
     * The table <code>public.acl_entry</code>.
     */
    public static final JAclEntry ACL_ENTRY = com.epam.ta.reportportal.jooq.tables.JAclEntry.ACL_ENTRY;

    /**
     * The table <code>public.acl_object_identity</code>.
     */
    public static final JAclObjectIdentity ACL_OBJECT_IDENTITY = com.epam.ta.reportportal.jooq.tables.JAclObjectIdentity.ACL_OBJECT_IDENTITY;

    /**
     * The table <code>public.acl_sid</code>.
     */
    public static final JAclSid ACL_SID = com.epam.ta.reportportal.jooq.tables.JAclSid.ACL_SID;

    /**
     * The table <code>public.active_directory_config</code>.
     */
    public static final JActiveDirectoryConfig ACTIVE_DIRECTORY_CONFIG = com.epam.ta.reportportal.jooq.tables.JActiveDirectoryConfig.ACTIVE_DIRECTORY_CONFIG;

    /**
     * The table <code>public.activity</code>.
     */
    public static final JActivity ACTIVITY = com.epam.ta.reportportal.jooq.tables.JActivity.ACTIVITY;

    /**
     * The table <code>public.attribute</code>.
     */
    public static final JAttribute ATTRIBUTE = com.epam.ta.reportportal.jooq.tables.JAttribute.ATTRIBUTE;

    /**
     * The table <code>public.auth_config</code>.
     */
    public static final JAuthConfig AUTH_CONFIG = com.epam.ta.reportportal.jooq.tables.JAuthConfig.AUTH_CONFIG;

    /**
     * The table <code>public.bug_tracking_system</code>.
     */
    public static final JBugTrackingSystem BUG_TRACKING_SYSTEM = com.epam.ta.reportportal.jooq.tables.JBugTrackingSystem.BUG_TRACKING_SYSTEM;

    /**
     * The table <code>public.connectby</code>.
     */
    public static final JConnectby CONNECTBY = com.epam.ta.reportportal.jooq.tables.JConnectby.CONNECTBY;

    /**
     * Call <code>public.connectby</code>.
     */
    public static Result<JConnectbyRecord> CONNECTBY(Configuration configuration, String __1, String __2, String __3, String __4, Integer __5, String __6) {
        return configuration.dsl().selectFrom(com.epam.ta.reportportal.jooq.tables.JConnectby.CONNECTBY.call(__1, __2, __3, __4, __5, __6)).fetch();
    }

    /**
     * Get <code>public.connectby</code> as a table.
     */
    public static JConnectby CONNECTBY(String __1, String __2, String __3, String __4, Integer __5, String __6) {
        return com.epam.ta.reportportal.jooq.tables.JConnectby.CONNECTBY.call(__1, __2, __3, __4, __5, __6);
    }

    /**
     * Get <code>public.connectby</code> as a table.
     */
    public static JConnectby CONNECTBY(Field<String> __1, Field<String> __2, Field<String> __3, Field<String> __4, Field<Integer> __5, Field<String> __6) {
        return com.epam.ta.reportportal.jooq.tables.JConnectby.CONNECTBY.call(__1, __2, __3, __4, __5, __6);
    }

    /**
     * The table <code>public.content_field</code>.
     */
    public static final JContentField CONTENT_FIELD = com.epam.ta.reportportal.jooq.tables.JContentField.CONTENT_FIELD;

    /**
     * The table <code>public.crosstab</code>.
     */
    public static final JCrosstab CROSSTAB = com.epam.ta.reportportal.jooq.tables.JCrosstab.CROSSTAB;

    /**
     * Call <code>public.crosstab</code>.
     */
    public static Result<JCrosstabRecord> CROSSTAB(Configuration configuration, String __1) {
        return configuration.dsl().selectFrom(com.epam.ta.reportportal.jooq.tables.JCrosstab.CROSSTAB.call(__1)).fetch();
    }

    /**
     * Get <code>public.crosstab</code> as a table.
     */
    public static JCrosstab CROSSTAB(String __1) {
        return com.epam.ta.reportportal.jooq.tables.JCrosstab.CROSSTAB.call(__1);
    }

    /**
     * Get <code>public.crosstab</code> as a table.
     */
    public static JCrosstab CROSSTAB(Field<String> __1) {
        return com.epam.ta.reportportal.jooq.tables.JCrosstab.CROSSTAB.call(__1);
    }

    /**
     * The table <code>public.crosstab2</code>.
     */
    public static final JCrosstab2 CROSSTAB2 = com.epam.ta.reportportal.jooq.tables.JCrosstab2.CROSSTAB2;

    /**
     * Call <code>public.crosstab2</code>.
     */
    public static Result<JCrosstab2Record> CROSSTAB2(Configuration configuration, String __1) {
        return configuration.dsl().selectFrom(com.epam.ta.reportportal.jooq.tables.JCrosstab2.CROSSTAB2.call(__1)).fetch();
    }

    /**
     * Get <code>public.crosstab2</code> as a table.
     */
    public static JCrosstab2 CROSSTAB2(String __1) {
        return com.epam.ta.reportportal.jooq.tables.JCrosstab2.CROSSTAB2.call(__1);
    }

    /**
     * Get <code>public.crosstab2</code> as a table.
     */
    public static JCrosstab2 CROSSTAB2(Field<String> __1) {
        return com.epam.ta.reportportal.jooq.tables.JCrosstab2.CROSSTAB2.call(__1);
    }

    /**
     * The table <code>public.crosstab3</code>.
     */
    public static final JCrosstab3 CROSSTAB3 = com.epam.ta.reportportal.jooq.tables.JCrosstab3.CROSSTAB3;

    /**
     * Call <code>public.crosstab3</code>.
     */
    public static Result<JCrosstab3Record> CROSSTAB3(Configuration configuration, String __1) {
        return configuration.dsl().selectFrom(com.epam.ta.reportportal.jooq.tables.JCrosstab3.CROSSTAB3.call(__1)).fetch();
    }

    /**
     * Get <code>public.crosstab3</code> as a table.
     */
    public static JCrosstab3 CROSSTAB3(String __1) {
        return com.epam.ta.reportportal.jooq.tables.JCrosstab3.CROSSTAB3.call(__1);
    }

    /**
     * Get <code>public.crosstab3</code> as a table.
     */
    public static JCrosstab3 CROSSTAB3(Field<String> __1) {
        return com.epam.ta.reportportal.jooq.tables.JCrosstab3.CROSSTAB3.call(__1);
    }

    /**
     * The table <code>public.crosstab4</code>.
     */
    public static final JCrosstab4 CROSSTAB4 = com.epam.ta.reportportal.jooq.tables.JCrosstab4.CROSSTAB4;

    /**
     * Call <code>public.crosstab4</code>.
     */
    public static Result<JCrosstab4Record> CROSSTAB4(Configuration configuration, String __1) {
        return configuration.dsl().selectFrom(com.epam.ta.reportportal.jooq.tables.JCrosstab4.CROSSTAB4.call(__1)).fetch();
    }

    /**
     * Get <code>public.crosstab4</code> as a table.
     */
    public static JCrosstab4 CROSSTAB4(String __1) {
        return com.epam.ta.reportportal.jooq.tables.JCrosstab4.CROSSTAB4.call(__1);
    }

    /**
     * Get <code>public.crosstab4</code> as a table.
     */
    public static JCrosstab4 CROSSTAB4(Field<String> __1) {
        return com.epam.ta.reportportal.jooq.tables.JCrosstab4.CROSSTAB4.call(__1);
    }

    /**
     * The table <code>public.dashboard</code>.
     */
    public static final JDashboard DASHBOARD = com.epam.ta.reportportal.jooq.tables.JDashboard.DASHBOARD;

    /**
     * The table <code>public.dashboard_widget</code>.
     */
    public static final JDashboardWidget DASHBOARD_WIDGET = com.epam.ta.reportportal.jooq.tables.JDashboardWidget.DASHBOARD_WIDGET;

    /**
     * The table <code>public.defect_field_allowed_value</code>.
     */
    public static final JDefectFieldAllowedValue DEFECT_FIELD_ALLOWED_VALUE = com.epam.ta.reportportal.jooq.tables.JDefectFieldAllowedValue.DEFECT_FIELD_ALLOWED_VALUE;

    /**
     * The table <code>public.defect_form_field</code>.
     */
    public static final JDefectFormField DEFECT_FORM_FIELD = com.epam.ta.reportportal.jooq.tables.JDefectFormField.DEFECT_FORM_FIELD;

    /**
     * The table <code>public.defect_form_field_value</code>.
     */
    public static final JDefectFormFieldValue DEFECT_FORM_FIELD_VALUE = com.epam.ta.reportportal.jooq.tables.JDefectFormFieldValue.DEFECT_FORM_FIELD_VALUE;

    /**
     * The table <code>public.demo_data_postfix</code>.
     */
    public static final JDemoDataPostfix DEMO_DATA_POSTFIX = com.epam.ta.reportportal.jooq.tables.JDemoDataPostfix.DEMO_DATA_POSTFIX;

    /**
     * The table <code>public.email_sender_case</code>.
     */
    public static final JEmailSenderCase EMAIL_SENDER_CASE = com.epam.ta.reportportal.jooq.tables.JEmailSenderCase.EMAIL_SENDER_CASE;

    /**
     * The table <code>public.filter</code>.
     */
    public static final JFilter FILTER = com.epam.ta.reportportal.jooq.tables.JFilter.FILTER;

    /**
     * The table <code>public.filter_condition</code>.
     */
    public static final JFilterCondition FILTER_CONDITION = com.epam.ta.reportportal.jooq.tables.JFilterCondition.FILTER_CONDITION;

    /**
     * The table <code>public.filter_sort</code>.
     */
    public static final JFilterSort FILTER_SORT = com.epam.ta.reportportal.jooq.tables.JFilterSort.FILTER_SORT;

    /**
     * The table <code>public.integration</code>.
     */
    public static final JIntegration INTEGRATION = com.epam.ta.reportportal.jooq.tables.JIntegration.INTEGRATION;

    /**
     * The table <code>public.integration_type</code>.
     */
    public static final JIntegrationType INTEGRATION_TYPE = com.epam.ta.reportportal.jooq.tables.JIntegrationType.INTEGRATION_TYPE;

    /**
     * The table <code>public.issue</code>.
     */
    public static final JIssue ISSUE = com.epam.ta.reportportal.jooq.tables.JIssue.ISSUE;

    /**
     * The table <code>public.issue_group</code>.
     */
    public static final JIssueGroup ISSUE_GROUP = com.epam.ta.reportportal.jooq.tables.JIssueGroup.ISSUE_GROUP;

    /**
     * The table <code>public.issue_ticket</code>.
     */
    public static final JIssueTicket ISSUE_TICKET = com.epam.ta.reportportal.jooq.tables.JIssueTicket.ISSUE_TICKET;

    /**
     * The table <code>public.issue_type</code>.
     */
    public static final JIssueType ISSUE_TYPE = com.epam.ta.reportportal.jooq.tables.JIssueType.ISSUE_TYPE;

    /**
     * The table <code>public.issue_type_project</code>.
     */
    public static final JIssueTypeProject ISSUE_TYPE_PROJECT = com.epam.ta.reportportal.jooq.tables.JIssueTypeProject.ISSUE_TYPE_PROJECT;

    /**
     * The table <code>public.item_tag</code>.
     */
    public static final JItemTag ITEM_TAG = com.epam.ta.reportportal.jooq.tables.JItemTag.ITEM_TAG;

    /**
     * The table <code>public.launch</code>.
     */
    public static final JLaunch LAUNCH = com.epam.ta.reportportal.jooq.tables.JLaunch.LAUNCH;

    /**
     * The table <code>public.launch_tag</code>.
     */
    public static final JLaunchTag LAUNCH_TAG = com.epam.ta.reportportal.jooq.tables.JLaunchTag.LAUNCH_TAG;

    /**
     * The table <code>public.ldap_config</code>.
     */
    public static final JLdapConfig LDAP_CONFIG = com.epam.ta.reportportal.jooq.tables.JLdapConfig.LDAP_CONFIG;

    /**
     * The table <code>public.ldap_synchronization_attributes</code>.
     */
    public static final JLdapSynchronizationAttributes LDAP_SYNCHRONIZATION_ATTRIBUTES = com.epam.ta.reportportal.jooq.tables.JLdapSynchronizationAttributes.LDAP_SYNCHRONIZATION_ATTRIBUTES;

    /**
     * The table <code>public.log</code>.
     */
    public static final JLog LOG = com.epam.ta.reportportal.jooq.tables.JLog.LOG;

    /**
     * The table <code>public.normal_rand</code>.
     */
    public static final JNormalRand NORMAL_RAND = com.epam.ta.reportportal.jooq.tables.JNormalRand.NORMAL_RAND;

    /**
     * Call <code>public.normal_rand</code>.
     */
    public static Result<JNormalRandRecord> NORMAL_RAND(Configuration configuration, Integer __1, Double __2, Double __3) {
        return configuration.dsl().selectFrom(com.epam.ta.reportportal.jooq.tables.JNormalRand.NORMAL_RAND.call(__1, __2, __3)).fetch();
    }

    /**
     * Get <code>public.normal_rand</code> as a table.
     */
    public static JNormalRand NORMAL_RAND(Integer __1, Double __2, Double __3) {
        return com.epam.ta.reportportal.jooq.tables.JNormalRand.NORMAL_RAND.call(__1, __2, __3);
    }

    /**
     * Get <code>public.normal_rand</code> as a table.
     */
    public static JNormalRand NORMAL_RAND(Field<Integer> __1, Field<Double> __2, Field<Double> __3) {
        return com.epam.ta.reportportal.jooq.tables.JNormalRand.NORMAL_RAND.call(__1, __2, __3);
    }

    /**
     * The table <code>public.oauth_access_token</code>.
     */
    public static final JOauthAccessToken OAUTH_ACCESS_TOKEN = com.epam.ta.reportportal.jooq.tables.JOauthAccessToken.OAUTH_ACCESS_TOKEN;

    /**
     * The table <code>public.oauth_registration</code>.
     */
    public static final JOauthRegistration OAUTH_REGISTRATION = com.epam.ta.reportportal.jooq.tables.JOauthRegistration.OAUTH_REGISTRATION;

    /**
     * The table <code>public.oauth_registration_restriction</code>.
     */
    public static final JOauthRegistrationRestriction OAUTH_REGISTRATION_RESTRICTION = com.epam.ta.reportportal.jooq.tables.JOauthRegistrationRestriction.OAUTH_REGISTRATION_RESTRICTION;

    /**
     * The table <code>public.oauth_registration_scope</code>.
     */
    public static final JOauthRegistrationScope OAUTH_REGISTRATION_SCOPE = com.epam.ta.reportportal.jooq.tables.JOauthRegistrationScope.OAUTH_REGISTRATION_SCOPE;

    /**
     * The table <code>public.parameter</code>.
     */
    public static final JParameter PARAMETER = com.epam.ta.reportportal.jooq.tables.JParameter.PARAMETER;

    /**
     * The table <code>public.project</code>.
     */
    public static final JProject PROJECT = com.epam.ta.reportportal.jooq.tables.JProject.PROJECT;

    /**
     * The table <code>public.project_attribute</code>.
     */
    public static final JProjectAttribute PROJECT_ATTRIBUTE = com.epam.ta.reportportal.jooq.tables.JProjectAttribute.PROJECT_ATTRIBUTE;

    /**
     * The table <code>public.project_user</code>.
     */
    public static final JProjectUser PROJECT_USER = com.epam.ta.reportportal.jooq.tables.JProjectUser.PROJECT_USER;

    /**
     * The table <code>public.recipients</code>.
     */
    public static final JRecipients RECIPIENTS = com.epam.ta.reportportal.jooq.tables.JRecipients.RECIPIENTS;

    /**
     * The table <code>public.restore_password_bid</code>.
     */
    public static final JRestorePasswordBid RESTORE_PASSWORD_BID = com.epam.ta.reportportal.jooq.tables.JRestorePasswordBid.RESTORE_PASSWORD_BID;

    /**
     * The table <code>public.server_settings</code>.
     */
    public static final JServerSettings SERVER_SETTINGS = com.epam.ta.reportportal.jooq.tables.JServerSettings.SERVER_SETTINGS;

    /**
     * The table <code>public.statistics</code>.
     */
    public static final JStatistics STATISTICS = com.epam.ta.reportportal.jooq.tables.JStatistics.STATISTICS;

    /**
     * The table <code>public.statistics_field</code>.
     */
    public static final JStatisticsField STATISTICS_FIELD = com.epam.ta.reportportal.jooq.tables.JStatisticsField.STATISTICS_FIELD;

    /**
     * The table <code>public.test_item</code>.
     */
    public static final JTestItem TEST_ITEM = com.epam.ta.reportportal.jooq.tables.JTestItem.TEST_ITEM;

    /**
     * The table <code>public.test_item_results</code>.
     */
    public static final JTestItemResults TEST_ITEM_RESULTS = com.epam.ta.reportportal.jooq.tables.JTestItemResults.TEST_ITEM_RESULTS;

    /**
     * The table <code>public.ticket</code>.
     */
    public static final JTicket TICKET = com.epam.ta.reportportal.jooq.tables.JTicket.TICKET;

    /**
     * The table <code>public.user_creation_bid</code>.
     */
    public static final JUserCreationBid USER_CREATION_BID = com.epam.ta.reportportal.jooq.tables.JUserCreationBid.USER_CREATION_BID;

    /**
     * The table <code>public.user_filter</code>.
     */
    public static final JUserFilter USER_FILTER = com.epam.ta.reportportal.jooq.tables.JUserFilter.USER_FILTER;

    /**
     * The table <code>public.users</code>.
     */
    public static final JUsers USERS = com.epam.ta.reportportal.jooq.tables.JUsers.USERS;

    /**
     * The table <code>public.widget</code>.
     */
    public static final JWidget WIDGET = com.epam.ta.reportportal.jooq.tables.JWidget.WIDGET;

    /**
     * The table <code>public.widget_filter</code>.
     */
    public static final JWidgetFilter WIDGET_FILTER = com.epam.ta.reportportal.jooq.tables.JWidgetFilter.WIDGET_FILTER;

    /**
     * The table <code>public.widget_option</code>.
     */
    public static final JWidgetOption WIDGET_OPTION = com.epam.ta.reportportal.jooq.tables.JWidgetOption.WIDGET_OPTION;
}
