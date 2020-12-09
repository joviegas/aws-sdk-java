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
package com.amazonaws.services.sagemaker.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.sagemaker.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * DataQualityBaselineConfigMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class DataQualityBaselineConfigMarshaller {

    private static final MarshallingInfo<String> BASELININGJOBNAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("BaseliningJobName").build();
    private static final MarshallingInfo<StructuredPojo> CONSTRAINTSRESOURCE_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ConstraintsResource").build();
    private static final MarshallingInfo<StructuredPojo> STATISTICSRESOURCE_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("StatisticsResource").build();

    private static final DataQualityBaselineConfigMarshaller instance = new DataQualityBaselineConfigMarshaller();

    public static DataQualityBaselineConfigMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(DataQualityBaselineConfig dataQualityBaselineConfig, ProtocolMarshaller protocolMarshaller) {

        if (dataQualityBaselineConfig == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(dataQualityBaselineConfig.getBaseliningJobName(), BASELININGJOBNAME_BINDING);
            protocolMarshaller.marshall(dataQualityBaselineConfig.getConstraintsResource(), CONSTRAINTSRESOURCE_BINDING);
            protocolMarshaller.marshall(dataQualityBaselineConfig.getStatisticsResource(), STATISTICSRESOURCE_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
