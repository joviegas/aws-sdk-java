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
package com.amazonaws.services.athena.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.athena.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * PreparedStatementSummaryMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class PreparedStatementSummaryMarshaller {

    private static final MarshallingInfo<String> STATEMENTNAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("StatementName").build();
    private static final MarshallingInfo<java.util.Date> LASTMODIFIEDTIME_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("LastModifiedTime").timestampFormat("unixTimestamp").build();

    private static final PreparedStatementSummaryMarshaller instance = new PreparedStatementSummaryMarshaller();

    public static PreparedStatementSummaryMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(PreparedStatementSummary preparedStatementSummary, ProtocolMarshaller protocolMarshaller) {

        if (preparedStatementSummary == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(preparedStatementSummary.getStatementName(), STATEMENTNAME_BINDING);
            protocolMarshaller.marshall(preparedStatementSummary.getLastModifiedTime(), LASTMODIFIEDTIME_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
