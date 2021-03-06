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
package com.amazonaws.services.quicksight.model;

import javax.annotation.Generated;

/**
 * 
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public enum DataSourceType {

    ADOBE_ANALYTICS("ADOBE_ANALYTICS"),
    AMAZON_ELASTICSEARCH("AMAZON_ELASTICSEARCH"),
    ATHENA("ATHENA"),
    AURORA("AURORA"),
    AURORA_POSTGRESQL("AURORA_POSTGRESQL"),
    AWS_IOT_ANALYTICS("AWS_IOT_ANALYTICS"),
    GITHUB("GITHUB"),
    JIRA("JIRA"),
    MARIADB("MARIADB"),
    MYSQL("MYSQL"),
    ORACLE("ORACLE"),
    POSTGRESQL("POSTGRESQL"),
    PRESTO("PRESTO"),
    REDSHIFT("REDSHIFT"),
    S3("S3"),
    SALESFORCE("SALESFORCE"),
    SERVICENOW("SERVICENOW"),
    SNOWFLAKE("SNOWFLAKE"),
    SPARK("SPARK"),
    SQLSERVER("SQLSERVER"),
    TERADATA("TERADATA"),
    TWITTER("TWITTER"),
    TIMESTREAM("TIMESTREAM");

    private String value;

    private DataSourceType(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return this.value;
    }

    /**
     * Use this in place of valueOf.
     *
     * @param value
     *        real value
     * @return DataSourceType corresponding to the value
     *
     * @throws IllegalArgumentException
     *         If the specified value does not map to one of the known values in this enum.
     */
    public static DataSourceType fromValue(String value) {
        if (value == null || "".equals(value)) {
            throw new IllegalArgumentException("Value cannot be null or empty!");
        }

        for (DataSourceType enumEntry : DataSourceType.values()) {
            if (enumEntry.toString().equals(value)) {
                return enumEntry;
            }
        }

        throw new IllegalArgumentException("Cannot create enum from " + value + " value!");
    }
}
