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
package com.amazonaws.services.honeycode.model.transform;

import java.util.List;
import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.honeycode.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * BatchCreateTableRowsRequestMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class BatchCreateTableRowsRequestMarshaller {

    private static final MarshallingInfo<String> WORKBOOKID_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PATH)
            .marshallLocationName("workbookId").build();
    private static final MarshallingInfo<String> TABLEID_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PATH)
            .marshallLocationName("tableId").build();
    private static final MarshallingInfo<List> ROWSTOCREATE_BINDING = MarshallingInfo.builder(MarshallingType.LIST).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("rowsToCreate").build();
    private static final MarshallingInfo<String> CLIENTREQUESTTOKEN_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("clientRequestToken").build();

    private static final BatchCreateTableRowsRequestMarshaller instance = new BatchCreateTableRowsRequestMarshaller();

    public static BatchCreateTableRowsRequestMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(BatchCreateTableRowsRequest batchCreateTableRowsRequest, ProtocolMarshaller protocolMarshaller) {

        if (batchCreateTableRowsRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(batchCreateTableRowsRequest.getWorkbookId(), WORKBOOKID_BINDING);
            protocolMarshaller.marshall(batchCreateTableRowsRequest.getTableId(), TABLEID_BINDING);
            protocolMarshaller.marshall(batchCreateTableRowsRequest.getRowsToCreate(), ROWSTOCREATE_BINDING);
            protocolMarshaller.marshall(batchCreateTableRowsRequest.getClientRequestToken(), CLIENTREQUESTTOKEN_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
