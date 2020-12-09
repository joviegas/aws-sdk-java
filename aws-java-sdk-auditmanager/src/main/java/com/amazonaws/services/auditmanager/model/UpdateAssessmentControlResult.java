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
package com.amazonaws.services.auditmanager.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/auditmanager-2017-07-25/UpdateAssessmentControl"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateAssessmentControlResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the updated control set returned by the <code>UpdateAssessmentControl</code> API.
     * </p>
     */
    private AssessmentControl control;

    /**
     * <p>
     * The name of the updated control set returned by the <code>UpdateAssessmentControl</code> API.
     * </p>
     * 
     * @param control
     *        The name of the updated control set returned by the <code>UpdateAssessmentControl</code> API.
     */

    public void setControl(AssessmentControl control) {
        this.control = control;
    }

    /**
     * <p>
     * The name of the updated control set returned by the <code>UpdateAssessmentControl</code> API.
     * </p>
     * 
     * @return The name of the updated control set returned by the <code>UpdateAssessmentControl</code> API.
     */

    public AssessmentControl getControl() {
        return this.control;
    }

    /**
     * <p>
     * The name of the updated control set returned by the <code>UpdateAssessmentControl</code> API.
     * </p>
     * 
     * @param control
     *        The name of the updated control set returned by the <code>UpdateAssessmentControl</code> API.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateAssessmentControlResult withControl(AssessmentControl control) {
        setControl(control);
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
        if (getControl() != null)
            sb.append("Control: ").append(getControl());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateAssessmentControlResult == false)
            return false;
        UpdateAssessmentControlResult other = (UpdateAssessmentControlResult) obj;
        if (other.getControl() == null ^ this.getControl() == null)
            return false;
        if (other.getControl() != null && other.getControl().equals(this.getControl()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getControl() == null) ? 0 : getControl().hashCode());
        return hashCode;
    }

    @Override
    public UpdateAssessmentControlResult clone() {
        try {
            return (UpdateAssessmentControlResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
