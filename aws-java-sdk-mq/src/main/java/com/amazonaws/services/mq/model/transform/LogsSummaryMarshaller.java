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
package com.amazonaws.services.mq.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.mq.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * LogsSummaryMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class LogsSummaryMarshaller {

    private static final MarshallingInfo<Boolean> AUDIT_BINDING = MarshallingInfo.builder(MarshallingType.BOOLEAN).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("audit").build();
    private static final MarshallingInfo<String> AUDITLOGGROUP_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("auditLogGroup").build();
    private static final MarshallingInfo<Boolean> GENERAL_BINDING = MarshallingInfo.builder(MarshallingType.BOOLEAN).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("general").build();
    private static final MarshallingInfo<String> GENERALLOGGROUP_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("generalLogGroup").build();
    private static final MarshallingInfo<StructuredPojo> PENDING_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("pending").build();

    private static final LogsSummaryMarshaller instance = new LogsSummaryMarshaller();

    public static LogsSummaryMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(LogsSummary logsSummary, ProtocolMarshaller protocolMarshaller) {

        if (logsSummary == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(logsSummary.getAudit(), AUDIT_BINDING);
            protocolMarshaller.marshall(logsSummary.getAuditLogGroup(), AUDITLOGGROUP_BINDING);
            protocolMarshaller.marshall(logsSummary.getGeneral(), GENERAL_BINDING);
            protocolMarshaller.marshall(logsSummary.getGeneralLogGroup(), GENERALLOGGROUP_BINDING);
            protocolMarshaller.marshall(logsSummary.getPending(), PENDING_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
