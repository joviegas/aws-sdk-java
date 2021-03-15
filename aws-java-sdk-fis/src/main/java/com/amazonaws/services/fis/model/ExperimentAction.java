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
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Describes the action for an experiment.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/fis-2020-12-01/ExperimentAction" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ExperimentAction implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The ID of the action.
     * </p>
     */
    private String actionId;
    /**
     * <p>
     * The description for the action.
     * </p>
     */
    private String description;
    /**
     * <p>
     * The parameters for the action.
     * </p>
     */
    private java.util.Map<String, String> parameters;
    /**
     * <p>
     * The targets for the action.
     * </p>
     */
    private java.util.Map<String, String> targets;
    /**
     * <p>
     * The name of the action that must be completed before this action starts.
     * </p>
     */
    private java.util.List<String> startAfter;
    /**
     * <p>
     * The state of the action.
     * </p>
     */
    private ExperimentActionState state;

    /**
     * <p>
     * The ID of the action.
     * </p>
     * 
     * @param actionId
     *        The ID of the action.
     */

    public void setActionId(String actionId) {
        this.actionId = actionId;
    }

    /**
     * <p>
     * The ID of the action.
     * </p>
     * 
     * @return The ID of the action.
     */

    public String getActionId() {
        return this.actionId;
    }

    /**
     * <p>
     * The ID of the action.
     * </p>
     * 
     * @param actionId
     *        The ID of the action.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ExperimentAction withActionId(String actionId) {
        setActionId(actionId);
        return this;
    }

    /**
     * <p>
     * The description for the action.
     * </p>
     * 
     * @param description
     *        The description for the action.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * The description for the action.
     * </p>
     * 
     * @return The description for the action.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * The description for the action.
     * </p>
     * 
     * @param description
     *        The description for the action.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ExperimentAction withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * The parameters for the action.
     * </p>
     * 
     * @return The parameters for the action.
     */

    public java.util.Map<String, String> getParameters() {
        return parameters;
    }

    /**
     * <p>
     * The parameters for the action.
     * </p>
     * 
     * @param parameters
     *        The parameters for the action.
     */

    public void setParameters(java.util.Map<String, String> parameters) {
        this.parameters = parameters;
    }

    /**
     * <p>
     * The parameters for the action.
     * </p>
     * 
     * @param parameters
     *        The parameters for the action.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ExperimentAction withParameters(java.util.Map<String, String> parameters) {
        setParameters(parameters);
        return this;
    }

    /**
     * Add a single Parameters entry
     *
     * @see ExperimentAction#withParameters
     * @returns a reference to this object so that method calls can be chained together.
     */

    public ExperimentAction addParametersEntry(String key, String value) {
        if (null == this.parameters) {
            this.parameters = new java.util.HashMap<String, String>();
        }
        if (this.parameters.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
        this.parameters.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into Parameters.
     *
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ExperimentAction clearParametersEntries() {
        this.parameters = null;
        return this;
    }

    /**
     * <p>
     * The targets for the action.
     * </p>
     * 
     * @return The targets for the action.
     */

    public java.util.Map<String, String> getTargets() {
        return targets;
    }

    /**
     * <p>
     * The targets for the action.
     * </p>
     * 
     * @param targets
     *        The targets for the action.
     */

    public void setTargets(java.util.Map<String, String> targets) {
        this.targets = targets;
    }

    /**
     * <p>
     * The targets for the action.
     * </p>
     * 
     * @param targets
     *        The targets for the action.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ExperimentAction withTargets(java.util.Map<String, String> targets) {
        setTargets(targets);
        return this;
    }

    /**
     * Add a single Targets entry
     *
     * @see ExperimentAction#withTargets
     * @returns a reference to this object so that method calls can be chained together.
     */

    public ExperimentAction addTargetsEntry(String key, String value) {
        if (null == this.targets) {
            this.targets = new java.util.HashMap<String, String>();
        }
        if (this.targets.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
        this.targets.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into Targets.
     *
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ExperimentAction clearTargetsEntries() {
        this.targets = null;
        return this;
    }

    /**
     * <p>
     * The name of the action that must be completed before this action starts.
     * </p>
     * 
     * @return The name of the action that must be completed before this action starts.
     */

    public java.util.List<String> getStartAfter() {
        return startAfter;
    }

    /**
     * <p>
     * The name of the action that must be completed before this action starts.
     * </p>
     * 
     * @param startAfter
     *        The name of the action that must be completed before this action starts.
     */

    public void setStartAfter(java.util.Collection<String> startAfter) {
        if (startAfter == null) {
            this.startAfter = null;
            return;
        }

        this.startAfter = new java.util.ArrayList<String>(startAfter);
    }

    /**
     * <p>
     * The name of the action that must be completed before this action starts.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setStartAfter(java.util.Collection)} or {@link #withStartAfter(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param startAfter
     *        The name of the action that must be completed before this action starts.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ExperimentAction withStartAfter(String... startAfter) {
        if (this.startAfter == null) {
            setStartAfter(new java.util.ArrayList<String>(startAfter.length));
        }
        for (String ele : startAfter) {
            this.startAfter.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The name of the action that must be completed before this action starts.
     * </p>
     * 
     * @param startAfter
     *        The name of the action that must be completed before this action starts.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ExperimentAction withStartAfter(java.util.Collection<String> startAfter) {
        setStartAfter(startAfter);
        return this;
    }

    /**
     * <p>
     * The state of the action.
     * </p>
     * 
     * @param state
     *        The state of the action.
     */

    public void setState(ExperimentActionState state) {
        this.state = state;
    }

    /**
     * <p>
     * The state of the action.
     * </p>
     * 
     * @return The state of the action.
     */

    public ExperimentActionState getState() {
        return this.state;
    }

    /**
     * <p>
     * The state of the action.
     * </p>
     * 
     * @param state
     *        The state of the action.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ExperimentAction withState(ExperimentActionState state) {
        setState(state);
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
        if (getActionId() != null)
            sb.append("ActionId: ").append(getActionId()).append(",");
        if (getDescription() != null)
            sb.append("Description: ").append(getDescription()).append(",");
        if (getParameters() != null)
            sb.append("Parameters: ").append(getParameters()).append(",");
        if (getTargets() != null)
            sb.append("Targets: ").append(getTargets()).append(",");
        if (getStartAfter() != null)
            sb.append("StartAfter: ").append(getStartAfter()).append(",");
        if (getState() != null)
            sb.append("State: ").append(getState());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ExperimentAction == false)
            return false;
        ExperimentAction other = (ExperimentAction) obj;
        if (other.getActionId() == null ^ this.getActionId() == null)
            return false;
        if (other.getActionId() != null && other.getActionId().equals(this.getActionId()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getParameters() == null ^ this.getParameters() == null)
            return false;
        if (other.getParameters() != null && other.getParameters().equals(this.getParameters()) == false)
            return false;
        if (other.getTargets() == null ^ this.getTargets() == null)
            return false;
        if (other.getTargets() != null && other.getTargets().equals(this.getTargets()) == false)
            return false;
        if (other.getStartAfter() == null ^ this.getStartAfter() == null)
            return false;
        if (other.getStartAfter() != null && other.getStartAfter().equals(this.getStartAfter()) == false)
            return false;
        if (other.getState() == null ^ this.getState() == null)
            return false;
        if (other.getState() != null && other.getState().equals(this.getState()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getActionId() == null) ? 0 : getActionId().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getParameters() == null) ? 0 : getParameters().hashCode());
        hashCode = prime * hashCode + ((getTargets() == null) ? 0 : getTargets().hashCode());
        hashCode = prime * hashCode + ((getStartAfter() == null) ? 0 : getStartAfter().hashCode());
        hashCode = prime * hashCode + ((getState() == null) ? 0 : getState().hashCode());
        return hashCode;
    }

    @Override
    public ExperimentAction clone() {
        try {
            return (ExperimentAction) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.fis.model.transform.ExperimentActionMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
