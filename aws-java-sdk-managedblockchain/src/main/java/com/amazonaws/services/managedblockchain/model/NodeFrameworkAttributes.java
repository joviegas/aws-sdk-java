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
package com.amazonaws.services.managedblockchain.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Attributes relevant to a node on a Managed Blockchain network for the blockchain framework that the network uses.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/managedblockchain-2018-09-24/NodeFrameworkAttributes"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class NodeFrameworkAttributes implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Attributes of Hyperledger Fabric for a peer node on a Managed Blockchain network that uses Hyperledger Fabric.
     * </p>
     */
    private NodeFabricAttributes fabric;
    /**
     * <p>
     * Attributes of Ethereum for a node on a Managed Blockchain network that uses Ethereum.
     * </p>
     */
    private NodeEthereumAttributes ethereum;

    /**
     * <p>
     * Attributes of Hyperledger Fabric for a peer node on a Managed Blockchain network that uses Hyperledger Fabric.
     * </p>
     * 
     * @param fabric
     *        Attributes of Hyperledger Fabric for a peer node on a Managed Blockchain network that uses Hyperledger
     *        Fabric.
     */

    public void setFabric(NodeFabricAttributes fabric) {
        this.fabric = fabric;
    }

    /**
     * <p>
     * Attributes of Hyperledger Fabric for a peer node on a Managed Blockchain network that uses Hyperledger Fabric.
     * </p>
     * 
     * @return Attributes of Hyperledger Fabric for a peer node on a Managed Blockchain network that uses Hyperledger
     *         Fabric.
     */

    public NodeFabricAttributes getFabric() {
        return this.fabric;
    }

    /**
     * <p>
     * Attributes of Hyperledger Fabric for a peer node on a Managed Blockchain network that uses Hyperledger Fabric.
     * </p>
     * 
     * @param fabric
     *        Attributes of Hyperledger Fabric for a peer node on a Managed Blockchain network that uses Hyperledger
     *        Fabric.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public NodeFrameworkAttributes withFabric(NodeFabricAttributes fabric) {
        setFabric(fabric);
        return this;
    }

    /**
     * <p>
     * Attributes of Ethereum for a node on a Managed Blockchain network that uses Ethereum.
     * </p>
     * 
     * @param ethereum
     *        Attributes of Ethereum for a node on a Managed Blockchain network that uses Ethereum.
     */

    public void setEthereum(NodeEthereumAttributes ethereum) {
        this.ethereum = ethereum;
    }

    /**
     * <p>
     * Attributes of Ethereum for a node on a Managed Blockchain network that uses Ethereum.
     * </p>
     * 
     * @return Attributes of Ethereum for a node on a Managed Blockchain network that uses Ethereum.
     */

    public NodeEthereumAttributes getEthereum() {
        return this.ethereum;
    }

    /**
     * <p>
     * Attributes of Ethereum for a node on a Managed Blockchain network that uses Ethereum.
     * </p>
     * 
     * @param ethereum
     *        Attributes of Ethereum for a node on a Managed Blockchain network that uses Ethereum.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public NodeFrameworkAttributes withEthereum(NodeEthereumAttributes ethereum) {
        setEthereum(ethereum);
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
        if (getFabric() != null)
            sb.append("Fabric: ").append(getFabric()).append(",");
        if (getEthereum() != null)
            sb.append("Ethereum: ").append(getEthereum());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof NodeFrameworkAttributes == false)
            return false;
        NodeFrameworkAttributes other = (NodeFrameworkAttributes) obj;
        if (other.getFabric() == null ^ this.getFabric() == null)
            return false;
        if (other.getFabric() != null && other.getFabric().equals(this.getFabric()) == false)
            return false;
        if (other.getEthereum() == null ^ this.getEthereum() == null)
            return false;
        if (other.getEthereum() != null && other.getEthereum().equals(this.getEthereum()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getFabric() == null) ? 0 : getFabric().hashCode());
        hashCode = prime * hashCode + ((getEthereum() == null) ? 0 : getEthereum().hashCode());
        return hashCode;
    }

    @Override
    public NodeFrameworkAttributes clone() {
        try {
            return (NodeFrameworkAttributes) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.managedblockchain.model.transform.NodeFrameworkAttributesMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
