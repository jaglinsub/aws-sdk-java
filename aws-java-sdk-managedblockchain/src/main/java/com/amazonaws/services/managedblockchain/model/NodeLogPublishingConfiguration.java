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
package com.amazonaws.services.managedblockchain.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Configuration properties for logging events associated with a peer node on a Hyperledger Fabric network on Managed
 * Blockchain.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/managedblockchain-2018-09-24/NodeLogPublishingConfiguration"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class NodeLogPublishingConfiguration implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Configuration properties for logging events associated with a node that is owned by a member of a Managed
     * Blockchain network using the Hyperledger Fabric framework.
     * </p>
     */
    private NodeFabricLogPublishingConfiguration fabric;

    /**
     * <p>
     * Configuration properties for logging events associated with a node that is owned by a member of a Managed
     * Blockchain network using the Hyperledger Fabric framework.
     * </p>
     * 
     * @param fabric
     *        Configuration properties for logging events associated with a node that is owned by a member of a Managed
     *        Blockchain network using the Hyperledger Fabric framework.
     */

    public void setFabric(NodeFabricLogPublishingConfiguration fabric) {
        this.fabric = fabric;
    }

    /**
     * <p>
     * Configuration properties for logging events associated with a node that is owned by a member of a Managed
     * Blockchain network using the Hyperledger Fabric framework.
     * </p>
     * 
     * @return Configuration properties for logging events associated with a node that is owned by a member of a Managed
     *         Blockchain network using the Hyperledger Fabric framework.
     */

    public NodeFabricLogPublishingConfiguration getFabric() {
        return this.fabric;
    }

    /**
     * <p>
     * Configuration properties for logging events associated with a node that is owned by a member of a Managed
     * Blockchain network using the Hyperledger Fabric framework.
     * </p>
     * 
     * @param fabric
     *        Configuration properties for logging events associated with a node that is owned by a member of a Managed
     *        Blockchain network using the Hyperledger Fabric framework.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public NodeLogPublishingConfiguration withFabric(NodeFabricLogPublishingConfiguration fabric) {
        setFabric(fabric);
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
            sb.append("Fabric: ").append(getFabric());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof NodeLogPublishingConfiguration == false)
            return false;
        NodeLogPublishingConfiguration other = (NodeLogPublishingConfiguration) obj;
        if (other.getFabric() == null ^ this.getFabric() == null)
            return false;
        if (other.getFabric() != null && other.getFabric().equals(this.getFabric()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getFabric() == null) ? 0 : getFabric().hashCode());
        return hashCode;
    }

    @Override
    public NodeLogPublishingConfiguration clone() {
        try {
            return (NodeLogPublishingConfiguration) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.managedblockchain.model.transform.NodeLogPublishingConfigurationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
