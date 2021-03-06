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
package com.amazonaws.services.fis.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/fis-2020-12-01/StartExperiment" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class StartExperimentResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * Information about the experiment.
     * </p>
     */
    private Experiment experiment;

    /**
     * <p>
     * Information about the experiment.
     * </p>
     * 
     * @param experiment
     *        Information about the experiment.
     */

    public void setExperiment(Experiment experiment) {
        this.experiment = experiment;
    }

    /**
     * <p>
     * Information about the experiment.
     * </p>
     * 
     * @return Information about the experiment.
     */

    public Experiment getExperiment() {
        return this.experiment;
    }

    /**
     * <p>
     * Information about the experiment.
     * </p>
     * 
     * @param experiment
     *        Information about the experiment.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StartExperimentResult withExperiment(Experiment experiment) {
        setExperiment(experiment);
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
        if (getExperiment() != null)
            sb.append("Experiment: ").append(getExperiment());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof StartExperimentResult == false)
            return false;
        StartExperimentResult other = (StartExperimentResult) obj;
        if (other.getExperiment() == null ^ this.getExperiment() == null)
            return false;
        if (other.getExperiment() != null && other.getExperiment().equals(this.getExperiment()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getExperiment() == null) ? 0 : getExperiment().hashCode());
        return hashCode;
    }

    @Override
    public StartExperimentResult clone() {
        try {
            return (StartExperimentResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
