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
package com.amazonaws.services.accessanalyzer.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/accessanalyzer-2019-11-01/ListAccessPreviewFindings"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListAccessPreviewFindingsRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The unique ID for the access preview.
     * </p>
     */
    private String accessPreviewId;
    /**
     * <p>
     * The <a href=
     * "https://docs.aws.amazon.com/IAM/latest/UserGuide/access-analyzer-getting-started.html#permission-resources">ARN
     * of the analyzer</a> used to generate the access.
     * </p>
     */
    private String analyzerArn;
    /**
     * <p>
     * Criteria to filter the returned findings.
     * </p>
     */
    private java.util.Map<String, Criterion> filter;
    /**
     * <p>
     * The maximum number of results to return in the response.
     * </p>
     */
    private Integer maxResults;
    /**
     * <p>
     * A token used for pagination of results returned.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * The unique ID for the access preview.
     * </p>
     * 
     * @param accessPreviewId
     *        The unique ID for the access preview.
     */

    public void setAccessPreviewId(String accessPreviewId) {
        this.accessPreviewId = accessPreviewId;
    }

    /**
     * <p>
     * The unique ID for the access preview.
     * </p>
     * 
     * @return The unique ID for the access preview.
     */

    public String getAccessPreviewId() {
        return this.accessPreviewId;
    }

    /**
     * <p>
     * The unique ID for the access preview.
     * </p>
     * 
     * @param accessPreviewId
     *        The unique ID for the access preview.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListAccessPreviewFindingsRequest withAccessPreviewId(String accessPreviewId) {
        setAccessPreviewId(accessPreviewId);
        return this;
    }

    /**
     * <p>
     * The <a href=
     * "https://docs.aws.amazon.com/IAM/latest/UserGuide/access-analyzer-getting-started.html#permission-resources">ARN
     * of the analyzer</a> used to generate the access.
     * </p>
     * 
     * @param analyzerArn
     *        The <a href=
     *        "https://docs.aws.amazon.com/IAM/latest/UserGuide/access-analyzer-getting-started.html#permission-resources"
     *        >ARN of the analyzer</a> used to generate the access.
     */

    public void setAnalyzerArn(String analyzerArn) {
        this.analyzerArn = analyzerArn;
    }

    /**
     * <p>
     * The <a href=
     * "https://docs.aws.amazon.com/IAM/latest/UserGuide/access-analyzer-getting-started.html#permission-resources">ARN
     * of the analyzer</a> used to generate the access.
     * </p>
     * 
     * @return The <a href=
     *         "https://docs.aws.amazon.com/IAM/latest/UserGuide/access-analyzer-getting-started.html#permission-resources"
     *         >ARN of the analyzer</a> used to generate the access.
     */

    public String getAnalyzerArn() {
        return this.analyzerArn;
    }

    /**
     * <p>
     * The <a href=
     * "https://docs.aws.amazon.com/IAM/latest/UserGuide/access-analyzer-getting-started.html#permission-resources">ARN
     * of the analyzer</a> used to generate the access.
     * </p>
     * 
     * @param analyzerArn
     *        The <a href=
     *        "https://docs.aws.amazon.com/IAM/latest/UserGuide/access-analyzer-getting-started.html#permission-resources"
     *        >ARN of the analyzer</a> used to generate the access.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListAccessPreviewFindingsRequest withAnalyzerArn(String analyzerArn) {
        setAnalyzerArn(analyzerArn);
        return this;
    }

    /**
     * <p>
     * Criteria to filter the returned findings.
     * </p>
     * 
     * @return Criteria to filter the returned findings.
     */

    public java.util.Map<String, Criterion> getFilter() {
        return filter;
    }

    /**
     * <p>
     * Criteria to filter the returned findings.
     * </p>
     * 
     * @param filter
     *        Criteria to filter the returned findings.
     */

    public void setFilter(java.util.Map<String, Criterion> filter) {
        this.filter = filter;
    }

    /**
     * <p>
     * Criteria to filter the returned findings.
     * </p>
     * 
     * @param filter
     *        Criteria to filter the returned findings.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListAccessPreviewFindingsRequest withFilter(java.util.Map<String, Criterion> filter) {
        setFilter(filter);
        return this;
    }

    /**
     * Add a single Filter entry
     *
     * @see ListAccessPreviewFindingsRequest#withFilter
     * @returns a reference to this object so that method calls can be chained together.
     */

    public ListAccessPreviewFindingsRequest addFilterEntry(String key, Criterion value) {
        if (null == this.filter) {
            this.filter = new java.util.HashMap<String, Criterion>();
        }
        if (this.filter.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
        this.filter.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into Filter.
     *
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListAccessPreviewFindingsRequest clearFilterEntries() {
        this.filter = null;
        return this;
    }

    /**
     * <p>
     * The maximum number of results to return in the response.
     * </p>
     * 
     * @param maxResults
     *        The maximum number of results to return in the response.
     */

    public void setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
    }

    /**
     * <p>
     * The maximum number of results to return in the response.
     * </p>
     * 
     * @return The maximum number of results to return in the response.
     */

    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * <p>
     * The maximum number of results to return in the response.
     * </p>
     * 
     * @param maxResults
     *        The maximum number of results to return in the response.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListAccessPreviewFindingsRequest withMaxResults(Integer maxResults) {
        setMaxResults(maxResults);
        return this;
    }

    /**
     * <p>
     * A token used for pagination of results returned.
     * </p>
     * 
     * @param nextToken
     *        A token used for pagination of results returned.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * A token used for pagination of results returned.
     * </p>
     * 
     * @return A token used for pagination of results returned.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * A token used for pagination of results returned.
     * </p>
     * 
     * @param nextToken
     *        A token used for pagination of results returned.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListAccessPreviewFindingsRequest withNextToken(String nextToken) {
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
        if (getAccessPreviewId() != null)
            sb.append("AccessPreviewId: ").append(getAccessPreviewId()).append(",");
        if (getAnalyzerArn() != null)
            sb.append("AnalyzerArn: ").append(getAnalyzerArn()).append(",");
        if (getFilter() != null)
            sb.append("Filter: ").append(getFilter()).append(",");
        if (getMaxResults() != null)
            sb.append("MaxResults: ").append(getMaxResults()).append(",");
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

        if (obj instanceof ListAccessPreviewFindingsRequest == false)
            return false;
        ListAccessPreviewFindingsRequest other = (ListAccessPreviewFindingsRequest) obj;
        if (other.getAccessPreviewId() == null ^ this.getAccessPreviewId() == null)
            return false;
        if (other.getAccessPreviewId() != null && other.getAccessPreviewId().equals(this.getAccessPreviewId()) == false)
            return false;
        if (other.getAnalyzerArn() == null ^ this.getAnalyzerArn() == null)
            return false;
        if (other.getAnalyzerArn() != null && other.getAnalyzerArn().equals(this.getAnalyzerArn()) == false)
            return false;
        if (other.getFilter() == null ^ this.getFilter() == null)
            return false;
        if (other.getFilter() != null && other.getFilter().equals(this.getFilter()) == false)
            return false;
        if (other.getMaxResults() == null ^ this.getMaxResults() == null)
            return false;
        if (other.getMaxResults() != null && other.getMaxResults().equals(this.getMaxResults()) == false)
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

        hashCode = prime * hashCode + ((getAccessPreviewId() == null) ? 0 : getAccessPreviewId().hashCode());
        hashCode = prime * hashCode + ((getAnalyzerArn() == null) ? 0 : getAnalyzerArn().hashCode());
        hashCode = prime * hashCode + ((getFilter() == null) ? 0 : getFilter().hashCode());
        hashCode = prime * hashCode + ((getMaxResults() == null) ? 0 : getMaxResults().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public ListAccessPreviewFindingsRequest clone() {
        return (ListAccessPreviewFindingsRequest) super.clone();
    }

}
