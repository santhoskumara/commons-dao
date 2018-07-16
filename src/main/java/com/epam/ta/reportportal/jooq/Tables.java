/*
 * This file is generated by jOOQ.
*/
package com.epam.ta.reportportal.jooq;

import com.epam.ta.reportportal.jooq.tables.*;

import javax.annotation.Generated;

/**
 * Convenience access to all tables in public
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.10.5"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Tables {

    /**
     * The table <code>public.activity</code>.
     */
    public static final JActivity ACTIVITY = com.epam.ta.reportportal.jooq.tables.JActivity.ACTIVITY;

    /**
     * The table <code>public.bug_tracking_system</code>.
     */
    public static final JBugTrackingSystem BUG_TRACKING_SYSTEM = com.epam.ta.reportportal.jooq.tables.JBugTrackingSystem.BUG_TRACKING_SYSTEM;

	/**
	 * The table <code>public.content_field</code>.
	 */
	public static final JContentField CONTENT_FIELD = com.epam.ta.reportportal.jooq.tables.JContentField.CONTENT_FIELD;

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
	 * The table <code>public.execution_statistics</code>.
	 */
	public static final JExecutionStatistics EXECUTION_STATISTICS = com.epam.ta.reportportal.jooq.tables.JExecutionStatistics.EXECUTION_STATISTICS;

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
	 * The table <code>public.issue_statistics</code>.
	 */
	public static final JIssueStatistics ISSUE_STATISTICS = com.epam.ta.reportportal.jooq.tables.JIssueStatistics.ISSUE_STATISTICS;

    /**
     * The table <code>public.issue_ticket</code>.
     */
    public static final JIssueTicket ISSUE_TICKET = com.epam.ta.reportportal.jooq.tables.JIssueTicket.ISSUE_TICKET;

    /**
     * The table <code>public.issue_type</code>.
     */
    public static final JIssueType ISSUE_TYPE = com.epam.ta.reportportal.jooq.tables.JIssueType.ISSUE_TYPE;

    /**
     * The table <code>public.issue_type_project_configuration</code>.
     */
    public static final JIssueTypeProjectConfiguration ISSUE_TYPE_PROJECT_CONFIGURATION = com.epam.ta.reportportal.jooq.tables.JIssueTypeProjectConfiguration.ISSUE_TYPE_PROJECT_CONFIGURATION;

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
     * The table <code>public.log</code>.
     */
    public static final JLog LOG = com.epam.ta.reportportal.jooq.tables.JLog.LOG;

    /**
     * The table <code>public.oauth_access_token</code>.
     */
    public static final JOauthAccessToken OAUTH_ACCESS_TOKEN = com.epam.ta.reportportal.jooq.tables.JOauthAccessToken.OAUTH_ACCESS_TOKEN;

    /**
     * The table <code>public.oauth_registration</code>.
     */
    public static final JOauthRegistration OAUTH_REGISTRATION = com.epam.ta.reportportal.jooq.tables.JOauthRegistration.OAUTH_REGISTRATION;

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
     * The table <code>public.project_configuration</code>.
     */
    public static final JProjectConfiguration PROJECT_CONFIGURATION = com.epam.ta.reportportal.jooq.tables.JProjectConfiguration.PROJECT_CONFIGURATION;

    /**
     * The table <code>public.project_email_configuration</code>.
     */
    public static final JProjectEmailConfiguration PROJECT_EMAIL_CONFIGURATION = com.epam.ta.reportportal.jooq.tables.JProjectEmailConfiguration.PROJECT_EMAIL_CONFIGURATION;

    /**
     * The table <code>public.project_user</code>.
     */
    public static final JProjectUser PROJECT_USER = com.epam.ta.reportportal.jooq.tables.JProjectUser.PROJECT_USER;

    /**
     * The table <code>public.server_settings</code>.
     */
    public static final JServerSettings SERVER_SETTINGS = com.epam.ta.reportportal.jooq.tables.JServerSettings.SERVER_SETTINGS;

    /**
     * The table <code>public.test_item</code>.
     */
    public static final JTestItem TEST_ITEM = com.epam.ta.reportportal.jooq.tables.JTestItem.TEST_ITEM;

    /**
     * The table <code>public.test_item_results</code>.
     */
    public static final JTestItemResults TEST_ITEM_RESULTS = com.epam.ta.reportportal.jooq.tables.JTestItemResults.TEST_ITEM_RESULTS;

    /**
     * The table <code>public.test_item_structure</code>.
     */
    public static final JTestItemStructure TEST_ITEM_STRUCTURE = com.epam.ta.reportportal.jooq.tables.JTestItemStructure.TEST_ITEM_STRUCTURE;

    /**
     * The table <code>public.ticket</code>.
     */
    public static final JTicket TICKET = com.epam.ta.reportportal.jooq.tables.JTicket.TICKET;

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

	/**
	 * The table <code>public.widget_option_value</code>.
	 */
	public static final JWidgetOptionValue WIDGET_OPTION_VALUE = com.epam.ta.reportportal.jooq.tables.JWidgetOptionValue.WIDGET_OPTION_VALUE;
}
