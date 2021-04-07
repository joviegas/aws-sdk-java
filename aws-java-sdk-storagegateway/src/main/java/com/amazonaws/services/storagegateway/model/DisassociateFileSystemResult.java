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
package com.amazonaws.services.storagegateway.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/storagegateway-2013-06-30/DisassociateFileSystem"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DisassociateFileSystemResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the deleted file system association.
     * </p>
     */
    private String fileSystemAssociationARN;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the deleted file system association.
     * </p>
     * 
     * @param fileSystemAssociationARN
     *        The Amazon Resource Name (ARN) of the deleted file system association.
     */

    public void setFileSystemAssociationARN(String fileSystemAssociationARN) {
        this.fileSystemAssociationARN = fileSystemAssociationARN;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the deleted file system association.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the deleted file system association.
     */

    public String getFileSystemAssociationARN() {
        return this.fileSystemAssociationARN;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the deleted file system association.
     * </p>
     * 
     * @param fileSystemAssociationARN
     *        The Amazon Resource Name (ARN) of the deleted file system association.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DisassociateFileSystemResult withFileSystemAssociationARN(String fileSystemAssociationARN) {
        setFileSystemAssociationARN(fileSystemAssociationARN);
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
        if (getFileSystemAssociationARN() != null)
            sb.append("FileSystemAssociationARN: ").append(getFileSystemAssociationARN());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DisassociateFileSystemResult == false)
            return false;
        DisassociateFileSystemResult other = (DisassociateFileSystemResult) obj;
        if (other.getFileSystemAssociationARN() == null ^ this.getFileSystemAssociationARN() == null)
            return false;
        if (other.getFileSystemAssociationARN() != null && other.getFileSystemAssociationARN().equals(this.getFileSystemAssociationARN()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getFileSystemAssociationARN() == null) ? 0 : getFileSystemAssociationARN().hashCode());
        return hashCode;
    }

    @Override
    public DisassociateFileSystemResult clone() {
        try {
            return (DisassociateFileSystemResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
