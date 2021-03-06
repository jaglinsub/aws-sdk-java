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
package com.amazonaws.services.glue.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Encapsulates a <code>ColumnStatistics</code> object that failed and the reason for failure.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/glue-2017-03-31/ColumnStatisticsError" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ColumnStatisticsError implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The <code>ColumnStatistics</code> of the column.
     * </p>
     */
    private ColumnStatistics columnStatistics;
    /**
     * <p>
     * An error message with the reason for the failure of an operation.
     * </p>
     */
    private ErrorDetail error;

    /**
     * <p>
     * The <code>ColumnStatistics</code> of the column.
     * </p>
     * 
     * @param columnStatistics
     *        The <code>ColumnStatistics</code> of the column.
     */

    public void setColumnStatistics(ColumnStatistics columnStatistics) {
        this.columnStatistics = columnStatistics;
    }

    /**
     * <p>
     * The <code>ColumnStatistics</code> of the column.
     * </p>
     * 
     * @return The <code>ColumnStatistics</code> of the column.
     */

    public ColumnStatistics getColumnStatistics() {
        return this.columnStatistics;
    }

    /**
     * <p>
     * The <code>ColumnStatistics</code> of the column.
     * </p>
     * 
     * @param columnStatistics
     *        The <code>ColumnStatistics</code> of the column.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ColumnStatisticsError withColumnStatistics(ColumnStatistics columnStatistics) {
        setColumnStatistics(columnStatistics);
        return this;
    }

    /**
     * <p>
     * An error message with the reason for the failure of an operation.
     * </p>
     * 
     * @param error
     *        An error message with the reason for the failure of an operation.
     */

    public void setError(ErrorDetail error) {
        this.error = error;
    }

    /**
     * <p>
     * An error message with the reason for the failure of an operation.
     * </p>
     * 
     * @return An error message with the reason for the failure of an operation.
     */

    public ErrorDetail getError() {
        return this.error;
    }

    /**
     * <p>
     * An error message with the reason for the failure of an operation.
     * </p>
     * 
     * @param error
     *        An error message with the reason for the failure of an operation.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ColumnStatisticsError withError(ErrorDetail error) {
        setError(error);
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
        if (getColumnStatistics() != null)
            sb.append("ColumnStatistics: ").append(getColumnStatistics()).append(",");
        if (getError() != null)
            sb.append("Error: ").append(getError());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ColumnStatisticsError == false)
            return false;
        ColumnStatisticsError other = (ColumnStatisticsError) obj;
        if (other.getColumnStatistics() == null ^ this.getColumnStatistics() == null)
            return false;
        if (other.getColumnStatistics() != null && other.getColumnStatistics().equals(this.getColumnStatistics()) == false)
            return false;
        if (other.getError() == null ^ this.getError() == null)
            return false;
        if (other.getError() != null && other.getError().equals(this.getError()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getColumnStatistics() == null) ? 0 : getColumnStatistics().hashCode());
        hashCode = prime * hashCode + ((getError() == null) ? 0 : getError().hashCode());
        return hashCode;
    }

    @Override
    public ColumnStatisticsError clone() {
        try {
            return (ColumnStatisticsError) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.glue.model.transform.ColumnStatisticsErrorMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
