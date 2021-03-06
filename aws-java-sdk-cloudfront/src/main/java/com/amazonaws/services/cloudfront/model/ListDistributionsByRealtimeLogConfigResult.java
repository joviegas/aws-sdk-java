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
package com.amazonaws.services.cloudfront.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudfront-2020-05-31/ListDistributionsByRealtimeLogConfig"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListDistributionsByRealtimeLogConfigResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable,
        Cloneable {

    private DistributionList distributionList;

    /**
     * @param distributionList
     */

    public void setDistributionList(DistributionList distributionList) {
        this.distributionList = distributionList;
    }

    /**
     * @return
     */

    public DistributionList getDistributionList() {
        return this.distributionList;
    }

    /**
     * @param distributionList
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListDistributionsByRealtimeLogConfigResult withDistributionList(DistributionList distributionList) {
        setDistributionList(distributionList);
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
        if (getDistributionList() != null)
            sb.append("DistributionList: ").append(getDistributionList());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListDistributionsByRealtimeLogConfigResult == false)
            return false;
        ListDistributionsByRealtimeLogConfigResult other = (ListDistributionsByRealtimeLogConfigResult) obj;
        if (other.getDistributionList() == null ^ this.getDistributionList() == null)
            return false;
        if (other.getDistributionList() != null && other.getDistributionList().equals(this.getDistributionList()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDistributionList() == null) ? 0 : getDistributionList().hashCode());
        return hashCode;
    }

    @Override
    public ListDistributionsByRealtimeLogConfigResult clone() {
        try {
            return (ListDistributionsByRealtimeLogConfigResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
