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
package com.amazonaws.services.mediatailor.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mediatailor-2018-04-23/ListVodSources" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListVodSourcesRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * Upper bound on number of records to return. The maximum number of results is 100.
     * </p>
     */
    private Integer maxResults;
    /**
     * <p>
     * Pagination token from the GET list request. Use the token to fetch the next page of results.
     * </p>
     */
    private String nextToken;
    /**
     * <p>
     * The identifier for the source location you are working on.
     * </p>
     */
    private String sourceLocationName;

    /**
     * <p>
     * Upper bound on number of records to return. The maximum number of results is 100.
     * </p>
     * 
     * @param maxResults
     *        Upper bound on number of records to return. The maximum number of results is 100.
     */

    public void setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
    }

    /**
     * <p>
     * Upper bound on number of records to return. The maximum number of results is 100.
     * </p>
     * 
     * @return Upper bound on number of records to return. The maximum number of results is 100.
     */

    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * <p>
     * Upper bound on number of records to return. The maximum number of results is 100.
     * </p>
     * 
     * @param maxResults
     *        Upper bound on number of records to return. The maximum number of results is 100.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListVodSourcesRequest withMaxResults(Integer maxResults) {
        setMaxResults(maxResults);
        return this;
    }

    /**
     * <p>
     * Pagination token from the GET list request. Use the token to fetch the next page of results.
     * </p>
     * 
     * @param nextToken
     *        Pagination token from the GET list request. Use the token to fetch the next page of results.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * Pagination token from the GET list request. Use the token to fetch the next page of results.
     * </p>
     * 
     * @return Pagination token from the GET list request. Use the token to fetch the next page of results.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * Pagination token from the GET list request. Use the token to fetch the next page of results.
     * </p>
     * 
     * @param nextToken
     *        Pagination token from the GET list request. Use the token to fetch the next page of results.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListVodSourcesRequest withNextToken(String nextToken) {
        setNextToken(nextToken);
        return this;
    }

    /**
     * <p>
     * The identifier for the source location you are working on.
     * </p>
     * 
     * @param sourceLocationName
     *        The identifier for the source location you are working on.
     */

    public void setSourceLocationName(String sourceLocationName) {
        this.sourceLocationName = sourceLocationName;
    }

    /**
     * <p>
     * The identifier for the source location you are working on.
     * </p>
     * 
     * @return The identifier for the source location you are working on.
     */

    public String getSourceLocationName() {
        return this.sourceLocationName;
    }

    /**
     * <p>
     * The identifier for the source location you are working on.
     * </p>
     * 
     * @param sourceLocationName
     *        The identifier for the source location you are working on.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListVodSourcesRequest withSourceLocationName(String sourceLocationName) {
        setSourceLocationName(sourceLocationName);
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
        if (getMaxResults() != null)
            sb.append("MaxResults: ").append(getMaxResults()).append(",");
        if (getNextToken() != null)
            sb.append("NextToken: ").append(getNextToken()).append(",");
        if (getSourceLocationName() != null)
            sb.append("SourceLocationName: ").append(getSourceLocationName());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListVodSourcesRequest == false)
            return false;
        ListVodSourcesRequest other = (ListVodSourcesRequest) obj;
        if (other.getMaxResults() == null ^ this.getMaxResults() == null)
            return false;
        if (other.getMaxResults() != null && other.getMaxResults().equals(this.getMaxResults()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        if (other.getSourceLocationName() == null ^ this.getSourceLocationName() == null)
            return false;
        if (other.getSourceLocationName() != null && other.getSourceLocationName().equals(this.getSourceLocationName()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getMaxResults() == null) ? 0 : getMaxResults().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        hashCode = prime * hashCode + ((getSourceLocationName() == null) ? 0 : getSourceLocationName().hashCode());
        return hashCode;
    }

    @Override
    public ListVodSourcesRequest clone() {
        return (ListVodSourcesRequest) super.clone();
    }

}
