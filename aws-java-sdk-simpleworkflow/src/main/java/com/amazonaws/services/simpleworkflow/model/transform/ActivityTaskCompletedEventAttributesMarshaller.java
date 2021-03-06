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
package com.amazonaws.services.simpleworkflow.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.simpleworkflow.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * ActivityTaskCompletedEventAttributesMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class ActivityTaskCompletedEventAttributesMarshaller {

    private static final MarshallingInfo<String> RESULT_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("result").build();
    private static final MarshallingInfo<Long> SCHEDULEDEVENTID_BINDING = MarshallingInfo.builder(MarshallingType.LONG)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("scheduledEventId").build();
    private static final MarshallingInfo<Long> STARTEDEVENTID_BINDING = MarshallingInfo.builder(MarshallingType.LONG)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("startedEventId").build();

    private static final ActivityTaskCompletedEventAttributesMarshaller instance = new ActivityTaskCompletedEventAttributesMarshaller();

    public static ActivityTaskCompletedEventAttributesMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(ActivityTaskCompletedEventAttributes activityTaskCompletedEventAttributes, ProtocolMarshaller protocolMarshaller) {

        if (activityTaskCompletedEventAttributes == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(activityTaskCompletedEventAttributes.getResult(), RESULT_BINDING);
            protocolMarshaller.marshall(activityTaskCompletedEventAttributes.getScheduledEventId(), SCHEDULEDEVENTID_BINDING);
            protocolMarshaller.marshall(activityTaskCompletedEventAttributes.getStartedEventId(), STARTEDEVENTID_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
