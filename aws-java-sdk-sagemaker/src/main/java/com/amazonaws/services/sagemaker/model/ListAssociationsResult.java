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
package com.amazonaws.services.sagemaker.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/ListAssociations" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListAssociationsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * A list of associations and their properties.
     * </p>
     */
    private java.util.List<AssociationSummary> associationSummaries;
    /**
     * <p>
     * A token for getting the next set of associations, if there are any.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * A list of associations and their properties.
     * </p>
     * 
     * @return A list of associations and their properties.
     */

    public java.util.List<AssociationSummary> getAssociationSummaries() {
        return associationSummaries;
    }

    /**
     * <p>
     * A list of associations and their properties.
     * </p>
     * 
     * @param associationSummaries
     *        A list of associations and their properties.
     */

    public void setAssociationSummaries(java.util.Collection<AssociationSummary> associationSummaries) {
        if (associationSummaries == null) {
            this.associationSummaries = null;
            return;
        }

        this.associationSummaries = new java.util.ArrayList<AssociationSummary>(associationSummaries);
    }

    /**
     * <p>
     * A list of associations and their properties.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setAssociationSummaries(java.util.Collection)} or {@link #withAssociationSummaries(java.util.Collection)}
     * if you want to override the existing values.
     * </p>
     * 
     * @param associationSummaries
     *        A list of associations and their properties.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListAssociationsResult withAssociationSummaries(AssociationSummary... associationSummaries) {
        if (this.associationSummaries == null) {
            setAssociationSummaries(new java.util.ArrayList<AssociationSummary>(associationSummaries.length));
        }
        for (AssociationSummary ele : associationSummaries) {
            this.associationSummaries.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of associations and their properties.
     * </p>
     * 
     * @param associationSummaries
     *        A list of associations and their properties.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListAssociationsResult withAssociationSummaries(java.util.Collection<AssociationSummary> associationSummaries) {
        setAssociationSummaries(associationSummaries);
        return this;
    }

    /**
     * <p>
     * A token for getting the next set of associations, if there are any.
     * </p>
     * 
     * @param nextToken
     *        A token for getting the next set of associations, if there are any.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * A token for getting the next set of associations, if there are any.
     * </p>
     * 
     * @return A token for getting the next set of associations, if there are any.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * A token for getting the next set of associations, if there are any.
     * </p>
     * 
     * @param nextToken
     *        A token for getting the next set of associations, if there are any.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListAssociationsResult withNextToken(String nextToken) {
        setNextToken(nextToken);
        return this;
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
        if (getAssociationSummaries() != null)
            sb.append("AssociationSummaries: ").append(getAssociationSummaries()).append(",");
        if (getNextToken() != null)
            sb.append("NextToken: ").append(getNextToken());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListAssociationsResult == false)
            return false;
        ListAssociationsResult other = (ListAssociationsResult) obj;
        if (other.getAssociationSummaries() == null ^ this.getAssociationSummaries() == null)
            return false;
        if (other.getAssociationSummaries() != null && other.getAssociationSummaries().equals(this.getAssociationSummaries()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAssociationSummaries() == null) ? 0 : getAssociationSummaries().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public ListAssociationsResult clone() {
        try {
            return (ListAssociationsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
