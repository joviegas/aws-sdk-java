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
package com.amazonaws.services.ivs.model.transform;

import java.util.Map;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.ivs.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * RecordingConfigurationMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class RecordingConfigurationMarshaller {

    private static final MarshallingInfo<String> ARN_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("arn").build();
    private static final MarshallingInfo<String> NAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("name").build();
    private static final MarshallingInfo<StructuredPojo> DESTINATIONCONFIGURATION_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("destinationConfiguration").build();
    private static final MarshallingInfo<String> STATE_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("state").build();
    private static final MarshallingInfo<Map> TAGS_BINDING = MarshallingInfo.builder(MarshallingType.MAP).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("tags").build();

    private static final RecordingConfigurationMarshaller instance = new RecordingConfigurationMarshaller();

    public static RecordingConfigurationMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(RecordingConfiguration recordingConfiguration, ProtocolMarshaller protocolMarshaller) {

        if (recordingConfiguration == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(recordingConfiguration.getArn(), ARN_BINDING);
            protocolMarshaller.marshall(recordingConfiguration.getName(), NAME_BINDING);
            protocolMarshaller.marshall(recordingConfiguration.getDestinationConfiguration(), DESTINATIONCONFIGURATION_BINDING);
            protocolMarshaller.marshall(recordingConfiguration.getState(), STATE_BINDING);
            protocolMarshaller.marshall(recordingConfiguration.getTags(), TAGS_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
