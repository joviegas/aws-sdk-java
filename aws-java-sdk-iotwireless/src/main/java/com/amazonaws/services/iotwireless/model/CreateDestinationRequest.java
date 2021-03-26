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
package com.amazonaws.services.iotwireless.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotwireless-2020-11-22/CreateDestination" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateDestinationRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the new resource.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The type of value in <code>Expression</code>.
     * </p>
     */
    private String expressionType;
    /**
     * <p>
     * The rule name or topic rule to send messages to.
     * </p>
     */
    private String expression;
    /**
     * <p>
     * The description of the new resource.
     * </p>
     */
    private String description;
    /**
     * <p>
     * The ARN of the IAM Role that authorizes the destination.
     * </p>
     */
    private String roleArn;
    /**
     * <p>
     * The tags to attach to the new destination. Tags are metadata that you can use to manage a resource.
     * </p>
     */
    private java.util.List<Tag> tags;
    /**
     * <p>
     * Each resource must have a unique client request token. If you try to create a new resource with the same token as
     * a resource that already exists, an exception occurs. If you omit this value, AWS SDKs will automatically generate
     * a unique client request.
     * </p>
     */
    private String clientRequestToken;

    /**
     * <p>
     * The name of the new resource.
     * </p>
     * 
     * @param name
     *        The name of the new resource.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the new resource.
     * </p>
     * 
     * @return The name of the new resource.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name of the new resource.
     * </p>
     * 
     * @param name
     *        The name of the new resource.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateDestinationRequest withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The type of value in <code>Expression</code>.
     * </p>
     * 
     * @param expressionType
     *        The type of value in <code>Expression</code>.
     * @see ExpressionType
     */

    public void setExpressionType(String expressionType) {
        this.expressionType = expressionType;
    }

    /**
     * <p>
     * The type of value in <code>Expression</code>.
     * </p>
     * 
     * @return The type of value in <code>Expression</code>.
     * @see ExpressionType
     */

    public String getExpressionType() {
        return this.expressionType;
    }

    /**
     * <p>
     * The type of value in <code>Expression</code>.
     * </p>
     * 
     * @param expressionType
     *        The type of value in <code>Expression</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ExpressionType
     */

    public CreateDestinationRequest withExpressionType(String expressionType) {
        setExpressionType(expressionType);
        return this;
    }

    /**
     * <p>
     * The type of value in <code>Expression</code>.
     * </p>
     * 
     * @param expressionType
     *        The type of value in <code>Expression</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ExpressionType
     */

    public CreateDestinationRequest withExpressionType(ExpressionType expressionType) {
        this.expressionType = expressionType.toString();
        return this;
    }

    /**
     * <p>
     * The rule name or topic rule to send messages to.
     * </p>
     * 
     * @param expression
     *        The rule name or topic rule to send messages to.
     */

    public void setExpression(String expression) {
        this.expression = expression;
    }

    /**
     * <p>
     * The rule name or topic rule to send messages to.
     * </p>
     * 
     * @return The rule name or topic rule to send messages to.
     */

    public String getExpression() {
        return this.expression;
    }

    /**
     * <p>
     * The rule name or topic rule to send messages to.
     * </p>
     * 
     * @param expression
     *        The rule name or topic rule to send messages to.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateDestinationRequest withExpression(String expression) {
        setExpression(expression);
        return this;
    }

    /**
     * <p>
     * The description of the new resource.
     * </p>
     * 
     * @param description
     *        The description of the new resource.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * The description of the new resource.
     * </p>
     * 
     * @return The description of the new resource.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * The description of the new resource.
     * </p>
     * 
     * @param description
     *        The description of the new resource.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateDestinationRequest withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * The ARN of the IAM Role that authorizes the destination.
     * </p>
     * 
     * @param roleArn
     *        The ARN of the IAM Role that authorizes the destination.
     */

    public void setRoleArn(String roleArn) {
        this.roleArn = roleArn;
    }

    /**
     * <p>
     * The ARN of the IAM Role that authorizes the destination.
     * </p>
     * 
     * @return The ARN of the IAM Role that authorizes the destination.
     */

    public String getRoleArn() {
        return this.roleArn;
    }

    /**
     * <p>
     * The ARN of the IAM Role that authorizes the destination.
     * </p>
     * 
     * @param roleArn
     *        The ARN of the IAM Role that authorizes the destination.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateDestinationRequest withRoleArn(String roleArn) {
        setRoleArn(roleArn);
        return this;
    }

    /**
     * <p>
     * The tags to attach to the new destination. Tags are metadata that you can use to manage a resource.
     * </p>
     * 
     * @return The tags to attach to the new destination. Tags are metadata that you can use to manage a resource.
     */

    public java.util.List<Tag> getTags() {
        return tags;
    }

    /**
     * <p>
     * The tags to attach to the new destination. Tags are metadata that you can use to manage a resource.
     * </p>
     * 
     * @param tags
     *        The tags to attach to the new destination. Tags are metadata that you can use to manage a resource.
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
     * The tags to attach to the new destination. Tags are metadata that you can use to manage a resource.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTags(java.util.Collection)} or {@link #withTags(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param tags
     *        The tags to attach to the new destination. Tags are metadata that you can use to manage a resource.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateDestinationRequest withTags(Tag... tags) {
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
     * The tags to attach to the new destination. Tags are metadata that you can use to manage a resource.
     * </p>
     * 
     * @param tags
     *        The tags to attach to the new destination. Tags are metadata that you can use to manage a resource.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateDestinationRequest withTags(java.util.Collection<Tag> tags) {
        setTags(tags);
        return this;
    }

    /**
     * <p>
     * Each resource must have a unique client request token. If you try to create a new resource with the same token as
     * a resource that already exists, an exception occurs. If you omit this value, AWS SDKs will automatically generate
     * a unique client request.
     * </p>
     * 
     * @param clientRequestToken
     *        Each resource must have a unique client request token. If you try to create a new resource with the same
     *        token as a resource that already exists, an exception occurs. If you omit this value, AWS SDKs will
     *        automatically generate a unique client request.
     */

    public void setClientRequestToken(String clientRequestToken) {
        this.clientRequestToken = clientRequestToken;
    }

    /**
     * <p>
     * Each resource must have a unique client request token. If you try to create a new resource with the same token as
     * a resource that already exists, an exception occurs. If you omit this value, AWS SDKs will automatically generate
     * a unique client request.
     * </p>
     * 
     * @return Each resource must have a unique client request token. If you try to create a new resource with the same
     *         token as a resource that already exists, an exception occurs. If you omit this value, AWS SDKs will
     *         automatically generate a unique client request.
     */

    public String getClientRequestToken() {
        return this.clientRequestToken;
    }

    /**
     * <p>
     * Each resource must have a unique client request token. If you try to create a new resource with the same token as
     * a resource that already exists, an exception occurs. If you omit this value, AWS SDKs will automatically generate
     * a unique client request.
     * </p>
     * 
     * @param clientRequestToken
     *        Each resource must have a unique client request token. If you try to create a new resource with the same
     *        token as a resource that already exists, an exception occurs. If you omit this value, AWS SDKs will
     *        automatically generate a unique client request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateDestinationRequest withClientRequestToken(String clientRequestToken) {
        setClientRequestToken(clientRequestToken);
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
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getExpressionType() != null)
            sb.append("ExpressionType: ").append(getExpressionType()).append(",");
        if (getExpression() != null)
            sb.append("Expression: ").append(getExpression()).append(",");
        if (getDescription() != null)
            sb.append("Description: ").append(getDescription()).append(",");
        if (getRoleArn() != null)
            sb.append("RoleArn: ").append(getRoleArn()).append(",");
        if (getTags() != null)
            sb.append("Tags: ").append(getTags()).append(",");
        if (getClientRequestToken() != null)
            sb.append("ClientRequestToken: ").append(getClientRequestToken());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateDestinationRequest == false)
            return false;
        CreateDestinationRequest other = (CreateDestinationRequest) obj;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getExpressionType() == null ^ this.getExpressionType() == null)
            return false;
        if (other.getExpressionType() != null && other.getExpressionType().equals(this.getExpressionType()) == false)
            return false;
        if (other.getExpression() == null ^ this.getExpression() == null)
            return false;
        if (other.getExpression() != null && other.getExpression().equals(this.getExpression()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getRoleArn() == null ^ this.getRoleArn() == null)
            return false;
        if (other.getRoleArn() != null && other.getRoleArn().equals(this.getRoleArn()) == false)
            return false;
        if (other.getTags() == null ^ this.getTags() == null)
            return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false)
            return false;
        if (other.getClientRequestToken() == null ^ this.getClientRequestToken() == null)
            return false;
        if (other.getClientRequestToken() != null && other.getClientRequestToken().equals(this.getClientRequestToken()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getExpressionType() == null) ? 0 : getExpressionType().hashCode());
        hashCode = prime * hashCode + ((getExpression() == null) ? 0 : getExpression().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getRoleArn() == null) ? 0 : getRoleArn().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        hashCode = prime * hashCode + ((getClientRequestToken() == null) ? 0 : getClientRequestToken().hashCode());
        return hashCode;
    }

    @Override
    public CreateDestinationRequest clone() {
        return (CreateDestinationRequest) super.clone();
    }

}
