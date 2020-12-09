/*
 * Copyright 2015-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.emrcontainers.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The information about the container used for a job run or a managed endpoint.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/emr-containers-2020-10-01/ContainerInfo" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ContainerInfo implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The information about the EKS cluster.
     * </p>
     */
    private EksInfo eksInfo;

    /**
     * <p>
     * The information about the EKS cluster.
     * </p>
     * 
     * @param eksInfo
     *        The information about the EKS cluster.
     */

    public void setEksInfo(EksInfo eksInfo) {
        this.eksInfo = eksInfo;
    }

    /**
     * <p>
     * The information about the EKS cluster.
     * </p>
     * 
     * @return The information about the EKS cluster.
     */

    public EksInfo getEksInfo() {
        return this.eksInfo;
    }

    /**
     * <p>
     * The information about the EKS cluster.
     * </p>
     * 
     * @param eksInfo
     *        The information about the EKS cluster.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ContainerInfo withEksInfo(EksInfo eksInfo) {
        setEksInfo(eksInfo);
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
        if (getEksInfo() != null)
            sb.append("EksInfo: ").append(getEksInfo());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ContainerInfo == false)
            return false;
        ContainerInfo other = (ContainerInfo) obj;
        if (other.getEksInfo() == null ^ this.getEksInfo() == null)
            return false;
        if (other.getEksInfo() != null && other.getEksInfo().equals(this.getEksInfo()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getEksInfo() == null) ? 0 : getEksInfo().hashCode());
        return hashCode;
    }

    @Override
    public ContainerInfo clone() {
        try {
            return (ContainerInfo) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.emrcontainers.model.transform.ContainerInfoMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
