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
package com.amazonaws.services.snowball.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.snowball.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * UpdateLongTermPricingRequestMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class UpdateLongTermPricingRequestMarshaller {

    private static final MarshallingInfo<String> LONGTERMPRICINGID_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("LongTermPricingId").build();
    private static final MarshallingInfo<String> REPLACEMENTJOB_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ReplacementJob").build();
    private static final MarshallingInfo<Boolean> ISLONGTERMPRICINGAUTORENEW_BINDING = MarshallingInfo.builder(MarshallingType.BOOLEAN)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("IsLongTermPricingAutoRenew").build();

    private static final UpdateLongTermPricingRequestMarshaller instance = new UpdateLongTermPricingRequestMarshaller();

    public static UpdateLongTermPricingRequestMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(UpdateLongTermPricingRequest updateLongTermPricingRequest, ProtocolMarshaller protocolMarshaller) {

        if (updateLongTermPricingRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(updateLongTermPricingRequest.getLongTermPricingId(), LONGTERMPRICINGID_BINDING);
            protocolMarshaller.marshall(updateLongTermPricingRequest.getReplacementJob(), REPLACEMENTJOB_BINDING);
            protocolMarshaller.marshall(updateLongTermPricingRequest.getIsLongTermPricingAutoRenew(), ISLONGTERMPRICINGAUTORENEW_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
