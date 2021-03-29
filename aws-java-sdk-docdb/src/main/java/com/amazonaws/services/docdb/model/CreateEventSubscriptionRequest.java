/*
 * Copyright 2016-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"). You may not use this file except in compliance with
 * the License. A copy of the License is located at
 * 
 * http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR
 * CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions
 * and limitations under the License.
 */
package com.amazonaws.services.docdb.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Represents the input to <a>CreateEventSubscription</a>.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/docdb-2014-10-31/CreateEventSubscription" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateEventSubscriptionRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the subscription.
     * </p>
     * <p>
     * Constraints: The name must be fewer than 255 characters.
     * </p>
     */
    private String subscriptionName;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the SNS topic created for event notification. Amazon SNS creates the ARN when
     * you create a topic and subscribe to it.
     * </p>
     */
    private String snsTopicArn;
    /**
     * <p>
     * The type of source that is generating the events. For example, if you want to be notified of events generated by
     * an instance, you would set this parameter to <code>db-instance</code>. If this value is not specified, all events
     * are returned.
     * </p>
     * <p>
     * Valid values: <code>db-instance</code>, <code>db-cluster</code>, <code>db-parameter-group</code>,
     * <code>db-security-group</code>, <code>db-snapshot</code>, <code>db-cluster-snapshot</code>
     * </p>
     */
    private String sourceType;
    /**
     * <p>
     * A list of event categories for a <code>SourceType</code> that you want to subscribe to.
     * </p>
     */
    private java.util.List<String> eventCategories;
    /**
     * <p>
     * The list of identifiers of the event sources for which events are returned. If not specified, then all sources
     * are included in the response. An identifier must begin with a letter and must contain only ASCII letters, digits,
     * and hyphens; it can't end with a hyphen or contain two consecutive hyphens.
     * </p>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * If <code>SourceIds</code> are provided, <code>SourceType</code> must also be provided.
     * </p>
     * </li>
     * <li>
     * <p>
     * If the source type is an instance, a <code>DBInstanceIdentifier</code> must be provided.
     * </p>
     * </li>
     * <li>
     * <p>
     * If the source type is a security group, a <code>DBSecurityGroupName</code> must be provided.
     * </p>
     * </li>
     * <li>
     * <p>
     * If the source type is a parameter group, a <code>DBParameterGroupName</code> must be provided.
     * </p>
     * </li>
     * <li>
     * <p>
     * If the source type is a snapshot, a <code>DBSnapshotIdentifier</code> must be provided.
     * </p>
     * </li>
     * </ul>
     */
    private java.util.List<String> sourceIds;
    /**
     * <p>
     * A Boolean value; set to <code>true</code> to activate the subscription, set to <code>false</code> to create the
     * subscription but not active it.
     * </p>
     */
    private Boolean enabled;
    /**
     * <p>
     * The tags to be assigned to the event subscription.
     * </p>
     */
    private java.util.List<Tag> tags;

    /**
     * <p>
     * The name of the subscription.
     * </p>
     * <p>
     * Constraints: The name must be fewer than 255 characters.
     * </p>
     * 
     * @param subscriptionName
     *        The name of the subscription.</p>
     *        <p>
     *        Constraints: The name must be fewer than 255 characters.
     */

    public void setSubscriptionName(String subscriptionName) {
        this.subscriptionName = subscriptionName;
    }

    /**
     * <p>
     * The name of the subscription.
     * </p>
     * <p>
     * Constraints: The name must be fewer than 255 characters.
     * </p>
     * 
     * @return The name of the subscription.</p>
     *         <p>
     *         Constraints: The name must be fewer than 255 characters.
     */

    public String getSubscriptionName() {
        return this.subscriptionName;
    }

    /**
     * <p>
     * The name of the subscription.
     * </p>
     * <p>
     * Constraints: The name must be fewer than 255 characters.
     * </p>
     * 
     * @param subscriptionName
     *        The name of the subscription.</p>
     *        <p>
     *        Constraints: The name must be fewer than 255 characters.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateEventSubscriptionRequest withSubscriptionName(String subscriptionName) {
        setSubscriptionName(subscriptionName);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the SNS topic created for event notification. Amazon SNS creates the ARN when
     * you create a topic and subscribe to it.
     * </p>
     * 
     * @param snsTopicArn
     *        The Amazon Resource Name (ARN) of the SNS topic created for event notification. Amazon SNS creates the ARN
     *        when you create a topic and subscribe to it.
     */

    public void setSnsTopicArn(String snsTopicArn) {
        this.snsTopicArn = snsTopicArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the SNS topic created for event notification. Amazon SNS creates the ARN when
     * you create a topic and subscribe to it.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the SNS topic created for event notification. Amazon SNS creates the
     *         ARN when you create a topic and subscribe to it.
     */

    public String getSnsTopicArn() {
        return this.snsTopicArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the SNS topic created for event notification. Amazon SNS creates the ARN when
     * you create a topic and subscribe to it.
     * </p>
     * 
     * @param snsTopicArn
     *        The Amazon Resource Name (ARN) of the SNS topic created for event notification. Amazon SNS creates the ARN
     *        when you create a topic and subscribe to it.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateEventSubscriptionRequest withSnsTopicArn(String snsTopicArn) {
        setSnsTopicArn(snsTopicArn);
        return this;
    }

    /**
     * <p>
     * The type of source that is generating the events. For example, if you want to be notified of events generated by
     * an instance, you would set this parameter to <code>db-instance</code>. If this value is not specified, all events
     * are returned.
     * </p>
     * <p>
     * Valid values: <code>db-instance</code>, <code>db-cluster</code>, <code>db-parameter-group</code>,
     * <code>db-security-group</code>, <code>db-snapshot</code>, <code>db-cluster-snapshot</code>
     * </p>
     * 
     * @param sourceType
     *        The type of source that is generating the events. For example, if you want to be notified of events
     *        generated by an instance, you would set this parameter to <code>db-instance</code>. If this value is not
     *        specified, all events are returned.</p>
     *        <p>
     *        Valid values: <code>db-instance</code>, <code>db-cluster</code>, <code>db-parameter-group</code>,
     *        <code>db-security-group</code>, <code>db-snapshot</code>, <code>db-cluster-snapshot</code>
     */

    public void setSourceType(String sourceType) {
        this.sourceType = sourceType;
    }

    /**
     * <p>
     * The type of source that is generating the events. For example, if you want to be notified of events generated by
     * an instance, you would set this parameter to <code>db-instance</code>. If this value is not specified, all events
     * are returned.
     * </p>
     * <p>
     * Valid values: <code>db-instance</code>, <code>db-cluster</code>, <code>db-parameter-group</code>,
     * <code>db-security-group</code>, <code>db-snapshot</code>, <code>db-cluster-snapshot</code>
     * </p>
     * 
     * @return The type of source that is generating the events. For example, if you want to be notified of events
     *         generated by an instance, you would set this parameter to <code>db-instance</code>. If this value is not
     *         specified, all events are returned.</p>
     *         <p>
     *         Valid values: <code>db-instance</code>, <code>db-cluster</code>, <code>db-parameter-group</code>,
     *         <code>db-security-group</code>, <code>db-snapshot</code>, <code>db-cluster-snapshot</code>
     */

    public String getSourceType() {
        return this.sourceType;
    }

    /**
     * <p>
     * The type of source that is generating the events. For example, if you want to be notified of events generated by
     * an instance, you would set this parameter to <code>db-instance</code>. If this value is not specified, all events
     * are returned.
     * </p>
     * <p>
     * Valid values: <code>db-instance</code>, <code>db-cluster</code>, <code>db-parameter-group</code>,
     * <code>db-security-group</code>, <code>db-snapshot</code>, <code>db-cluster-snapshot</code>
     * </p>
     * 
     * @param sourceType
     *        The type of source that is generating the events. For example, if you want to be notified of events
     *        generated by an instance, you would set this parameter to <code>db-instance</code>. If this value is not
     *        specified, all events are returned.</p>
     *        <p>
     *        Valid values: <code>db-instance</code>, <code>db-cluster</code>, <code>db-parameter-group</code>,
     *        <code>db-security-group</code>, <code>db-snapshot</code>, <code>db-cluster-snapshot</code>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateEventSubscriptionRequest withSourceType(String sourceType) {
        setSourceType(sourceType);
        return this;
    }

    /**
     * <p>
     * A list of event categories for a <code>SourceType</code> that you want to subscribe to.
     * </p>
     * 
     * @return A list of event categories for a <code>SourceType</code> that you want to subscribe to.
     */

    public java.util.List<String> getEventCategories() {
        return eventCategories;
    }

    /**
     * <p>
     * A list of event categories for a <code>SourceType</code> that you want to subscribe to.
     * </p>
     * 
     * @param eventCategories
     *        A list of event categories for a <code>SourceType</code> that you want to subscribe to.
     */

    public void setEventCategories(java.util.Collection<String> eventCategories) {
        if (eventCategories == null) {
            this.eventCategories = null;
            return;
        }

        this.eventCategories = new java.util.ArrayList<String>(eventCategories);
    }

    /**
     * <p>
     * A list of event categories for a <code>SourceType</code> that you want to subscribe to.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setEventCategories(java.util.Collection)} or {@link #withEventCategories(java.util.Collection)} if you
     * want to override the existing values.
     * </p>
     * 
     * @param eventCategories
     *        A list of event categories for a <code>SourceType</code> that you want to subscribe to.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateEventSubscriptionRequest withEventCategories(String... eventCategories) {
        if (this.eventCategories == null) {
            setEventCategories(new java.util.ArrayList<String>(eventCategories.length));
        }
        for (String ele : eventCategories) {
            this.eventCategories.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of event categories for a <code>SourceType</code> that you want to subscribe to.
     * </p>
     * 
     * @param eventCategories
     *        A list of event categories for a <code>SourceType</code> that you want to subscribe to.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateEventSubscriptionRequest withEventCategories(java.util.Collection<String> eventCategories) {
        setEventCategories(eventCategories);
        return this;
    }

    /**
     * <p>
     * The list of identifiers of the event sources for which events are returned. If not specified, then all sources
     * are included in the response. An identifier must begin with a letter and must contain only ASCII letters, digits,
     * and hyphens; it can't end with a hyphen or contain two consecutive hyphens.
     * </p>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * If <code>SourceIds</code> are provided, <code>SourceType</code> must also be provided.
     * </p>
     * </li>
     * <li>
     * <p>
     * If the source type is an instance, a <code>DBInstanceIdentifier</code> must be provided.
     * </p>
     * </li>
     * <li>
     * <p>
     * If the source type is a security group, a <code>DBSecurityGroupName</code> must be provided.
     * </p>
     * </li>
     * <li>
     * <p>
     * If the source type is a parameter group, a <code>DBParameterGroupName</code> must be provided.
     * </p>
     * </li>
     * <li>
     * <p>
     * If the source type is a snapshot, a <code>DBSnapshotIdentifier</code> must be provided.
     * </p>
     * </li>
     * </ul>
     * 
     * @return The list of identifiers of the event sources for which events are returned. If not specified, then all
     *         sources are included in the response. An identifier must begin with a letter and must contain only ASCII
     *         letters, digits, and hyphens; it can't end with a hyphen or contain two consecutive hyphens.</p>
     *         <p>
     *         Constraints:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         If <code>SourceIds</code> are provided, <code>SourceType</code> must also be provided.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         If the source type is an instance, a <code>DBInstanceIdentifier</code> must be provided.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         If the source type is a security group, a <code>DBSecurityGroupName</code> must be provided.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         If the source type is a parameter group, a <code>DBParameterGroupName</code> must be provided.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         If the source type is a snapshot, a <code>DBSnapshotIdentifier</code> must be provided.
     *         </p>
     *         </li>
     */

    public java.util.List<String> getSourceIds() {
        return sourceIds;
    }

    /**
     * <p>
     * The list of identifiers of the event sources for which events are returned. If not specified, then all sources
     * are included in the response. An identifier must begin with a letter and must contain only ASCII letters, digits,
     * and hyphens; it can't end with a hyphen or contain two consecutive hyphens.
     * </p>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * If <code>SourceIds</code> are provided, <code>SourceType</code> must also be provided.
     * </p>
     * </li>
     * <li>
     * <p>
     * If the source type is an instance, a <code>DBInstanceIdentifier</code> must be provided.
     * </p>
     * </li>
     * <li>
     * <p>
     * If the source type is a security group, a <code>DBSecurityGroupName</code> must be provided.
     * </p>
     * </li>
     * <li>
     * <p>
     * If the source type is a parameter group, a <code>DBParameterGroupName</code> must be provided.
     * </p>
     * </li>
     * <li>
     * <p>
     * If the source type is a snapshot, a <code>DBSnapshotIdentifier</code> must be provided.
     * </p>
     * </li>
     * </ul>
     * 
     * @param sourceIds
     *        The list of identifiers of the event sources for which events are returned. If not specified, then all
     *        sources are included in the response. An identifier must begin with a letter and must contain only ASCII
     *        letters, digits, and hyphens; it can't end with a hyphen or contain two consecutive hyphens.</p>
     *        <p>
     *        Constraints:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        If <code>SourceIds</code> are provided, <code>SourceType</code> must also be provided.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        If the source type is an instance, a <code>DBInstanceIdentifier</code> must be provided.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        If the source type is a security group, a <code>DBSecurityGroupName</code> must be provided.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        If the source type is a parameter group, a <code>DBParameterGroupName</code> must be provided.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        If the source type is a snapshot, a <code>DBSnapshotIdentifier</code> must be provided.
     *        </p>
     *        </li>
     */

    public void setSourceIds(java.util.Collection<String> sourceIds) {
        if (sourceIds == null) {
            this.sourceIds = null;
            return;
        }

        this.sourceIds = new java.util.ArrayList<String>(sourceIds);
    }

    /**
     * <p>
     * The list of identifiers of the event sources for which events are returned. If not specified, then all sources
     * are included in the response. An identifier must begin with a letter and must contain only ASCII letters, digits,
     * and hyphens; it can't end with a hyphen or contain two consecutive hyphens.
     * </p>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * If <code>SourceIds</code> are provided, <code>SourceType</code> must also be provided.
     * </p>
     * </li>
     * <li>
     * <p>
     * If the source type is an instance, a <code>DBInstanceIdentifier</code> must be provided.
     * </p>
     * </li>
     * <li>
     * <p>
     * If the source type is a security group, a <code>DBSecurityGroupName</code> must be provided.
     * </p>
     * </li>
     * <li>
     * <p>
     * If the source type is a parameter group, a <code>DBParameterGroupName</code> must be provided.
     * </p>
     * </li>
     * <li>
     * <p>
     * If the source type is a snapshot, a <code>DBSnapshotIdentifier</code> must be provided.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setSourceIds(java.util.Collection)} or {@link #withSourceIds(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param sourceIds
     *        The list of identifiers of the event sources for which events are returned. If not specified, then all
     *        sources are included in the response. An identifier must begin with a letter and must contain only ASCII
     *        letters, digits, and hyphens; it can't end with a hyphen or contain two consecutive hyphens.</p>
     *        <p>
     *        Constraints:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        If <code>SourceIds</code> are provided, <code>SourceType</code> must also be provided.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        If the source type is an instance, a <code>DBInstanceIdentifier</code> must be provided.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        If the source type is a security group, a <code>DBSecurityGroupName</code> must be provided.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        If the source type is a parameter group, a <code>DBParameterGroupName</code> must be provided.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        If the source type is a snapshot, a <code>DBSnapshotIdentifier</code> must be provided.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateEventSubscriptionRequest withSourceIds(String... sourceIds) {
        if (this.sourceIds == null) {
            setSourceIds(new java.util.ArrayList<String>(sourceIds.length));
        }
        for (String ele : sourceIds) {
            this.sourceIds.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The list of identifiers of the event sources for which events are returned. If not specified, then all sources
     * are included in the response. An identifier must begin with a letter and must contain only ASCII letters, digits,
     * and hyphens; it can't end with a hyphen or contain two consecutive hyphens.
     * </p>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * If <code>SourceIds</code> are provided, <code>SourceType</code> must also be provided.
     * </p>
     * </li>
     * <li>
     * <p>
     * If the source type is an instance, a <code>DBInstanceIdentifier</code> must be provided.
     * </p>
     * </li>
     * <li>
     * <p>
     * If the source type is a security group, a <code>DBSecurityGroupName</code> must be provided.
     * </p>
     * </li>
     * <li>
     * <p>
     * If the source type is a parameter group, a <code>DBParameterGroupName</code> must be provided.
     * </p>
     * </li>
     * <li>
     * <p>
     * If the source type is a snapshot, a <code>DBSnapshotIdentifier</code> must be provided.
     * </p>
     * </li>
     * </ul>
     * 
     * @param sourceIds
     *        The list of identifiers of the event sources for which events are returned. If not specified, then all
     *        sources are included in the response. An identifier must begin with a letter and must contain only ASCII
     *        letters, digits, and hyphens; it can't end with a hyphen or contain two consecutive hyphens.</p>
     *        <p>
     *        Constraints:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        If <code>SourceIds</code> are provided, <code>SourceType</code> must also be provided.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        If the source type is an instance, a <code>DBInstanceIdentifier</code> must be provided.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        If the source type is a security group, a <code>DBSecurityGroupName</code> must be provided.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        If the source type is a parameter group, a <code>DBParameterGroupName</code> must be provided.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        If the source type is a snapshot, a <code>DBSnapshotIdentifier</code> must be provided.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateEventSubscriptionRequest withSourceIds(java.util.Collection<String> sourceIds) {
        setSourceIds(sourceIds);
        return this;
    }

    /**
     * <p>
     * A Boolean value; set to <code>true</code> to activate the subscription, set to <code>false</code> to create the
     * subscription but not active it.
     * </p>
     * 
     * @param enabled
     *        A Boolean value; set to <code>true</code> to activate the subscription, set to <code>false</code> to
     *        create the subscription but not active it.
     */

    public void setEnabled(Boolean enabled) {
        this.enabled = enabled;
    }

    /**
     * <p>
     * A Boolean value; set to <code>true</code> to activate the subscription, set to <code>false</code> to create the
     * subscription but not active it.
     * </p>
     * 
     * @return A Boolean value; set to <code>true</code> to activate the subscription, set to <code>false</code> to
     *         create the subscription but not active it.
     */

    public Boolean getEnabled() {
        return this.enabled;
    }

    /**
     * <p>
     * A Boolean value; set to <code>true</code> to activate the subscription, set to <code>false</code> to create the
     * subscription but not active it.
     * </p>
     * 
     * @param enabled
     *        A Boolean value; set to <code>true</code> to activate the subscription, set to <code>false</code> to
     *        create the subscription but not active it.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateEventSubscriptionRequest withEnabled(Boolean enabled) {
        setEnabled(enabled);
        return this;
    }

    /**
     * <p>
     * A Boolean value; set to <code>true</code> to activate the subscription, set to <code>false</code> to create the
     * subscription but not active it.
     * </p>
     * 
     * @return A Boolean value; set to <code>true</code> to activate the subscription, set to <code>false</code> to
     *         create the subscription but not active it.
     */

    public Boolean isEnabled() {
        return this.enabled;
    }

    /**
     * <p>
     * The tags to be assigned to the event subscription.
     * </p>
     * 
     * @return The tags to be assigned to the event subscription.
     */

    public java.util.List<Tag> getTags() {
        return tags;
    }

    /**
     * <p>
     * The tags to be assigned to the event subscription.
     * </p>
     * 
     * @param tags
     *        The tags to be assigned to the event subscription.
     */

    public void setTags(java.util.Collection<Tag> tags) {
        if (tags == null) {
            this.tags = null;
            return;
        }

        this.tags = new java.util.ArrayList<Tag>(tags);
    }

    /**
     * <p>
     * The tags to be assigned to the event subscription.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTags(java.util.Collection)} or {@link #withTags(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param tags
     *        The tags to be assigned to the event subscription.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateEventSubscriptionRequest withTags(Tag... tags) {
        if (this.tags == null) {
            setTags(new java.util.ArrayList<Tag>(tags.length));
        }
        for (Tag ele : tags) {
            this.tags.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The tags to be assigned to the event subscription.
     * </p>
     * 
     * @param tags
     *        The tags to be assigned to the event subscription.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateEventSubscriptionRequest withTags(java.util.Collection<Tag> tags) {
        setTags(tags);
        return this;
    }

    /**
     * Returns a string representation of this object. This is useful for testing and debugging. Sensitive data will be
     * redacted from this string using a placeholder value.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getSubscriptionName() != null)
            sb.append("SubscriptionName: ").append(getSubscriptionName()).append(",");
        if (getSnsTopicArn() != null)
            sb.append("SnsTopicArn: ").append(getSnsTopicArn()).append(",");
        if (getSourceType() != null)
            sb.append("SourceType: ").append(getSourceType()).append(",");
        if (getEventCategories() != null)
            sb.append("EventCategories: ").append(getEventCategories()).append(",");
        if (getSourceIds() != null)
            sb.append("SourceIds: ").append(getSourceIds()).append(",");
        if (getEnabled() != null)
            sb.append("Enabled: ").append(getEnabled()).append(",");
        if (getTags() != null)
            sb.append("Tags: ").append(getTags());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateEventSubscriptionRequest == false)
            return false;
        CreateEventSubscriptionRequest other = (CreateEventSubscriptionRequest) obj;
        if (other.getSubscriptionName() == null ^ this.getSubscriptionName() == null)
            return false;
        if (other.getSubscriptionName() != null && other.getSubscriptionName().equals(this.getSubscriptionName()) == false)
            return false;
        if (other.getSnsTopicArn() == null ^ this.getSnsTopicArn() == null)
            return false;
        if (other.getSnsTopicArn() != null && other.getSnsTopicArn().equals(this.getSnsTopicArn()) == false)
            return false;
        if (other.getSourceType() == null ^ this.getSourceType() == null)
            return false;
        if (other.getSourceType() != null && other.getSourceType().equals(this.getSourceType()) == false)
            return false;
        if (other.getEventCategories() == null ^ this.getEventCategories() == null)
            return false;
        if (other.getEventCategories() != null && other.getEventCategories().equals(this.getEventCategories()) == false)
            return false;
        if (other.getSourceIds() == null ^ this.getSourceIds() == null)
            return false;
        if (other.getSourceIds() != null && other.getSourceIds().equals(this.getSourceIds()) == false)
            return false;
        if (other.getEnabled() == null ^ this.getEnabled() == null)
            return false;
        if (other.getEnabled() != null && other.getEnabled().equals(this.getEnabled()) == false)
            return false;
        if (other.getTags() == null ^ this.getTags() == null)
            return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getSubscriptionName() == null) ? 0 : getSubscriptionName().hashCode());
        hashCode = prime * hashCode + ((getSnsTopicArn() == null) ? 0 : getSnsTopicArn().hashCode());
        hashCode = prime * hashCode + ((getSourceType() == null) ? 0 : getSourceType().hashCode());
        hashCode = prime * hashCode + ((getEventCategories() == null) ? 0 : getEventCategories().hashCode());
        hashCode = prime * hashCode + ((getSourceIds() == null) ? 0 : getSourceIds().hashCode());
        hashCode = prime * hashCode + ((getEnabled() == null) ? 0 : getEnabled().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        return hashCode;
    }

    @Override
    public CreateEventSubscriptionRequest clone() {
        return (CreateEventSubscriptionRequest) super.clone();
    }

}
