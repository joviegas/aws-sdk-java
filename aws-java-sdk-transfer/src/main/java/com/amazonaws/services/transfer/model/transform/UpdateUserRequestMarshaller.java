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
package com.amazonaws.services.transfer.model.transform;

import java.util.List;
import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.transfer.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * UpdateUserRequestMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class UpdateUserRequestMarshaller {

    private static final MarshallingInfo<String> HOMEDIRECTORY_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("HomeDirectory").build();
    private static final MarshallingInfo<String> HOMEDIRECTORYTYPE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("HomeDirectoryType").build();
    private static final MarshallingInfo<List> HOMEDIRECTORYMAPPINGS_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("HomeDirectoryMappings").build();
    private static final MarshallingInfo<String> POLICY_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Policy").build();
    private static final MarshallingInfo<StructuredPojo> POSIXPROFILE_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("PosixProfile").build();
    private static final MarshallingInfo<String> ROLE_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Role").build();
    private static final MarshallingInfo<String> SERVERID_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("ServerId").build();
    private static final MarshallingInfo<String> USERNAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("UserName").build();

    private static final UpdateUserRequestMarshaller instance = new UpdateUserRequestMarshaller();

    public static UpdateUserRequestMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(UpdateUserRequest updateUserRequest, ProtocolMarshaller protocolMarshaller) {

        if (updateUserRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(updateUserRequest.getHomeDirectory(), HOMEDIRECTORY_BINDING);
            protocolMarshaller.marshall(updateUserRequest.getHomeDirectoryType(), HOMEDIRECTORYTYPE_BINDING);
            protocolMarshaller.marshall(updateUserRequest.getHomeDirectoryMappings(), HOMEDIRECTORYMAPPINGS_BINDING);
            protocolMarshaller.marshall(updateUserRequest.getPolicy(), POLICY_BINDING);
            protocolMarshaller.marshall(updateUserRequest.getPosixProfile(), POSIXPROFILE_BINDING);
            protocolMarshaller.marshall(updateUserRequest.getRole(), ROLE_BINDING);
            protocolMarshaller.marshall(updateUserRequest.getServerId(), SERVERID_BINDING);
            protocolMarshaller.marshall(updateUserRequest.getUserName(), USERNAME_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
