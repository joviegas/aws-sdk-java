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
package com.amazonaws.services.iotthingsgraph.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotthingsgraph-2018-09-06/GetFlowTemplateRevisions"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetFlowTemplateRevisionsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * An array of objects that provide summary data about each revision.
     * </p>
     */
    private java.util.List<FlowTemplateSummary> summaries;
    /**
     * <p>
     * The string to specify as <code>nextToken</code> when you request the next page of results.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * An array of objects that provide summary data about each revision.
     * </p>
     * 
     * @return An array of objects that provide summary data about each revision.
     */

    public java.util.List<FlowTemplateSummary> getSummaries() {
        return summaries;
    }

    /**
     * <p>
     * An array of objects that provide summary data about each revision.
     * </p>
     * 
     * @param summaries
     *        An array of objects that provide summary data about each revision.
     */

    public void setSummaries(java.util.Collection<FlowTemplateSummary> summaries) {
        if (summaries == null) {
            this.summaries = null;
            return;
        }

        this.summaries = new java.util.ArrayList<FlowTemplateSummary>(summaries);
    }

    /**
     * <p>
     * An array of objects that provide summary data about each revision.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setSummaries(java.util.Collection)} or {@link #withSummaries(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param summaries
     *        An array of objects that provide summary data about each revision.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetFlowTemplateRevisionsResult withSummaries(FlowTemplateSummary... summaries) {
        if (this.summaries == null) {
            setSummaries(new java.util.ArrayList<FlowTemplateSummary>(summaries.length));
        }
        for (FlowTemplateSummary ele : summaries) {
            this.summaries.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * An array of objects that provide summary data about each revision.
     * </p>
     * 
     * @param summaries
     *        An array of objects that provide summary data about each revision.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetFlowTemplateRevisionsResult withSummaries(java.util.Collection<FlowTemplateSummary> summaries) {
        setSummaries(summaries);
        return this;
    }

    /**
     * <p>
     * The string to specify as <code>nextToken</code> when you request the next page of results.
     * </p>
     * 
     * @param nextToken
     *        The string to specify as <code>nextToken</code> when you request the next page of results.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * The string to specify as <code>nextToken</code> when you request the next page of results.
     * </p>
     * 
     * @return The string to specify as <code>nextToken</code> when you request the next page of results.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * The string to specify as <code>nextToken</code> when you request the next page of results.
     * </p>
     * 
     * @param nextToken
     *        The string to specify as <code>nextToken</code> when you request the next page of results.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetFlowTemplateRevisionsResult withNextToken(String nextToken) {
        setNextToken(nextToken);
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
        if (getSummaries() != null)
            sb.append("Summaries: ").append(getSummaries()).append(",");
        if (getNextToken() != null)
            sb.append("NextToken: ").append(getNextToken());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetFlowTemplateRevisionsResult == false)
            return false;
        GetFlowTemplateRevisionsResult other = (GetFlowTemplateRevisionsResult) obj;
        if (other.getSummaries() == null ^ this.getSummaries() == null)
            return false;
        if (other.getSummaries() != null && other.getSummaries().equals(this.getSummaries()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getSummaries() == null) ? 0 : getSummaries().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public GetFlowTemplateRevisionsResult clone() {
        try {
            return (GetFlowTemplateRevisionsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
