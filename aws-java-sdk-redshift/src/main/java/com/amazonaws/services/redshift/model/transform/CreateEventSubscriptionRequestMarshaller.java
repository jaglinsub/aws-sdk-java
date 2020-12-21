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
package com.amazonaws.services.redshift.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.Request;
import com.amazonaws.DefaultRequest;
import com.amazonaws.http.HttpMethodName;
import com.amazonaws.services.redshift.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.StringUtils;

/**
 * CreateEventSubscriptionRequest Marshaller
 */

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateEventSubscriptionRequestMarshaller implements Marshaller<Request<CreateEventSubscriptionRequest>, CreateEventSubscriptionRequest> {

    public Request<CreateEventSubscriptionRequest> marshall(CreateEventSubscriptionRequest createEventSubscriptionRequest) {

        if (createEventSubscriptionRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        Request<CreateEventSubscriptionRequest> request = new DefaultRequest<CreateEventSubscriptionRequest>(createEventSubscriptionRequest, "AmazonRedshift");
        request.addParameter("Action", "CreateEventSubscription");
        request.addParameter("Version", "2012-12-01");
        request.setHttpMethod(HttpMethodName.POST);

        if (createEventSubscriptionRequest.getSubscriptionName() != null) {
            request.addParameter("SubscriptionName", StringUtils.fromString(createEventSubscriptionRequest.getSubscriptionName()));
        }

        if (createEventSubscriptionRequest.getSnsTopicArn() != null) {
            request.addParameter("SnsTopicArn", StringUtils.fromString(createEventSubscriptionRequest.getSnsTopicArn()));
        }

        if (createEventSubscriptionRequest.getSourceType() != null) {
            request.addParameter("SourceType", StringUtils.fromString(createEventSubscriptionRequest.getSourceType()));
        }

        if (!createEventSubscriptionRequest.getSourceIds().isEmpty()
                || !((com.amazonaws.internal.SdkInternalList<String>) createEventSubscriptionRequest.getSourceIds()).isAutoConstruct()) {
            com.amazonaws.internal.SdkInternalList<String> sourceIdsList = (com.amazonaws.internal.SdkInternalList<String>) createEventSubscriptionRequest
                    .getSourceIds();
            int sourceIdsListIndex = 1;

            for (String sourceIdsListValue : sourceIdsList) {
                if (sourceIdsListValue != null) {
                    request.addParameter("SourceIds.SourceId." + sourceIdsListIndex, StringUtils.fromString(sourceIdsListValue));
                }
                sourceIdsListIndex++;
            }
        }

        if (!createEventSubscriptionRequest.getEventCategories().isEmpty()
                || !((com.amazonaws.internal.SdkInternalList<String>) createEventSubscriptionRequest.getEventCategories()).isAutoConstruct()) {
            com.amazonaws.internal.SdkInternalList<String> eventCategoriesList = (com.amazonaws.internal.SdkInternalList<String>) createEventSubscriptionRequest
                    .getEventCategories();
            int eventCategoriesListIndex = 1;

            for (String eventCategoriesListValue : eventCategoriesList) {
                if (eventCategoriesListValue != null) {
                    request.addParameter("EventCategories.EventCategory." + eventCategoriesListIndex, StringUtils.fromString(eventCategoriesListValue));
                }
                eventCategoriesListIndex++;
            }
        }

        if (createEventSubscriptionRequest.getSeverity() != null) {
            request.addParameter("Severity", StringUtils.fromString(createEventSubscriptionRequest.getSeverity()));
        }

        if (createEventSubscriptionRequest.getEnabled() != null) {
            request.addParameter("Enabled", StringUtils.fromBoolean(createEventSubscriptionRequest.getEnabled()));
        }

        if (!createEventSubscriptionRequest.getTags().isEmpty()
                || !((com.amazonaws.internal.SdkInternalList<Tag>) createEventSubscriptionRequest.getTags()).isAutoConstruct()) {
            com.amazonaws.internal.SdkInternalList<Tag> tagsList = (com.amazonaws.internal.SdkInternalList<Tag>) createEventSubscriptionRequest.getTags();
            int tagsListIndex = 1;

            for (Tag tagsListValue : tagsList) {
                if (tagsListValue != null) {

                    if (tagsListValue.getKey() != null) {
                        request.addParameter("Tags.Tag." + tagsListIndex + ".Key", StringUtils.fromString(tagsListValue.getKey()));
                    }

                    if (tagsListValue.getValue() != null) {
                        request.addParameter("Tags.Tag." + tagsListIndex + ".Value", StringUtils.fromString(tagsListValue.getValue()));
                    }
                }
                tagsListIndex++;
            }
        }

        return request;
    }

}
