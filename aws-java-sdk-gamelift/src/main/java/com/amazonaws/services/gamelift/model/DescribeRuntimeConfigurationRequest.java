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
package com.amazonaws.services.gamelift.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Represents the input for a request operation.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/gamelift-2015-10-01/DescribeRuntimeConfiguration"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeRuntimeConfigurationRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * A unique identifier for the fleet to get the runtime configuration for. You can use either the fleet ID or ARN
     * value.
     * </p>
     */
    private String fleetId;

    /**
     * <p>
     * A unique identifier for the fleet to get the runtime configuration for. You can use either the fleet ID or ARN
     * value.
     * </p>
     * 
     * @param fleetId
     *        A unique identifier for the fleet to get the runtime configuration for. You can use either the fleet ID or
     *        ARN value.
     */

    public void setFleetId(String fleetId) {
        this.fleetId = fleetId;
    }

    /**
     * <p>
     * A unique identifier for the fleet to get the runtime configuration for. You can use either the fleet ID or ARN
     * value.
     * </p>
     * 
     * @return A unique identifier for the fleet to get the runtime configuration for. You can use either the fleet ID
     *         or ARN value.
     */

    public String getFleetId() {
        return this.fleetId;
    }

    /**
     * <p>
     * A unique identifier for the fleet to get the runtime configuration for. You can use either the fleet ID or ARN
     * value.
     * </p>
     * 
     * @param fleetId
     *        A unique identifier for the fleet to get the runtime configuration for. You can use either the fleet ID or
     *        ARN value.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeRuntimeConfigurationRequest withFleetId(String fleetId) {
        setFleetId(fleetId);
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
        if (getFleetId() != null)
            sb.append("FleetId: ").append(getFleetId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeRuntimeConfigurationRequest == false)
            return false;
        DescribeRuntimeConfigurationRequest other = (DescribeRuntimeConfigurationRequest) obj;
        if (other.getFleetId() == null ^ this.getFleetId() == null)
            return false;
        if (other.getFleetId() != null && other.getFleetId().equals(this.getFleetId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getFleetId() == null) ? 0 : getFleetId().hashCode());
        return hashCode;
    }

    @Override
    public DescribeRuntimeConfigurationRequest clone() {
        return (DescribeRuntimeConfigurationRequest) super.clone();
    }

}
