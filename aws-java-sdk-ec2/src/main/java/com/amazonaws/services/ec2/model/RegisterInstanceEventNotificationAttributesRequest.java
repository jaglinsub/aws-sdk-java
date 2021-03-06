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
package com.amazonaws.services.ec2.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;
import com.amazonaws.Request;
import com.amazonaws.services.ec2.model.transform.RegisterInstanceEventNotificationAttributesRequestMarshaller;

/**
 * 
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class RegisterInstanceEventNotificationAttributesRequest extends AmazonWebServiceRequest implements Serializable, Cloneable,
        DryRunSupportedRequest<RegisterInstanceEventNotificationAttributesRequest> {

    /**
     * <p>
     * Information about the tag keys to register.
     * </p>
     */
    private RegisterInstanceTagAttributeRequest instanceTagAttribute;

    /**
     * <p>
     * Information about the tag keys to register.
     * </p>
     * 
     * @param instanceTagAttribute
     *        Information about the tag keys to register.
     */

    public void setInstanceTagAttribute(RegisterInstanceTagAttributeRequest instanceTagAttribute) {
        this.instanceTagAttribute = instanceTagAttribute;
    }

    /**
     * <p>
     * Information about the tag keys to register.
     * </p>
     * 
     * @return Information about the tag keys to register.
     */

    public RegisterInstanceTagAttributeRequest getInstanceTagAttribute() {
        return this.instanceTagAttribute;
    }

    /**
     * <p>
     * Information about the tag keys to register.
     * </p>
     * 
     * @param instanceTagAttribute
     *        Information about the tag keys to register.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RegisterInstanceEventNotificationAttributesRequest withInstanceTagAttribute(RegisterInstanceTagAttributeRequest instanceTagAttribute) {
        setInstanceTagAttribute(instanceTagAttribute);
        return this;
    }

    /**
     * This method is intended for internal use only. Returns the marshaled request configured with additional
     * parameters to enable operation dry-run.
     */
    @Override
    public Request<RegisterInstanceEventNotificationAttributesRequest> getDryRunRequest() {
        Request<RegisterInstanceEventNotificationAttributesRequest> request = new RegisterInstanceEventNotificationAttributesRequestMarshaller().marshall(this);
        request.addParameter("DryRun", Boolean.toString(true));
        return request;
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
        if (getInstanceTagAttribute() != null)
            sb.append("InstanceTagAttribute: ").append(getInstanceTagAttribute());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof RegisterInstanceEventNotificationAttributesRequest == false)
            return false;
        RegisterInstanceEventNotificationAttributesRequest other = (RegisterInstanceEventNotificationAttributesRequest) obj;
        if (other.getInstanceTagAttribute() == null ^ this.getInstanceTagAttribute() == null)
            return false;
        if (other.getInstanceTagAttribute() != null && other.getInstanceTagAttribute().equals(this.getInstanceTagAttribute()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getInstanceTagAttribute() == null) ? 0 : getInstanceTagAttribute().hashCode());
        return hashCode;
    }

    @Override
    public RegisterInstanceEventNotificationAttributesRequest clone() {
        return (RegisterInstanceEventNotificationAttributesRequest) super.clone();
    }
}
