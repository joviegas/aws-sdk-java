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
package com.amazonaws.services.lakeformation.model;

import javax.annotation.Generated;

/**
 * 
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public enum Permission {

    ALL("ALL"),
    SELECT("SELECT"),
    ALTER("ALTER"),
    DROP("DROP"),
    DELETE("DELETE"),
    INSERT("INSERT"),
    DESCRIBE("DESCRIBE"),
    CREATE_DATABASE("CREATE_DATABASE"),
    CREATE_TABLE("CREATE_TABLE"),
    DATA_LOCATION_ACCESS("DATA_LOCATION_ACCESS"),
    CREATE_TAG("CREATE_TAG"),
    ALTER_TAG("ALTER_TAG"),
    DELETE_TAG("DELETE_TAG"),
    DESCRIBE_TAG("DESCRIBE_TAG"),
    ASSOCIATE_TAG("ASSOCIATE_TAG");

    private String value;

    private Permission(String value) {
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
     * @return Permission corresponding to the value
     *
     * @throws IllegalArgumentException
     *         If the specified value does not map to one of the known values in this enum.
     */
    public static Permission fromValue(String value) {
        if (value == null || "".equals(value)) {
            throw new IllegalArgumentException("Value cannot be null or empty!");
        }

        for (Permission enumEntry : Permission.values()) {
            if (enumEntry.toString().equals(value)) {
                return enumEntry;
            }
        }

        throw new IllegalArgumentException("Cannot create enum from " + value + " value!");
    }
}
