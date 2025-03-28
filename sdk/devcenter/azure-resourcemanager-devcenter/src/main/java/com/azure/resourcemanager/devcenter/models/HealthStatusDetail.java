// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.devcenter.models;

import com.azure.core.annotation.Immutable;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;

/**
 * Pool health status detail.
 */
@Immutable
public final class HealthStatusDetail implements JsonSerializable<HealthStatusDetail> {
    /*
     * An identifier for the issue.
     */
    private String code;

    /*
     * A message describing the issue, intended to be suitable for display in a user interface
     */
    private String message;

    /**
     * Creates an instance of HealthStatusDetail class.
     */
    public HealthStatusDetail() {
    }

    /**
     * Get the code property: An identifier for the issue.
     * 
     * @return the code value.
     */
    public String code() {
        return this.code;
    }

    /**
     * Get the message property: A message describing the issue, intended to be suitable for display in a user
     * interface.
     * 
     * @return the message value.
     */
    public String message() {
        return this.message;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of HealthStatusDetail from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of HealthStatusDetail if the JsonReader was pointing to an instance of it, or null if it was
     * pointing to JSON null.
     * @throws IOException If an error occurs while reading the HealthStatusDetail.
     */
    public static HealthStatusDetail fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            HealthStatusDetail deserializedHealthStatusDetail = new HealthStatusDetail();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("code".equals(fieldName)) {
                    deserializedHealthStatusDetail.code = reader.getString();
                } else if ("message".equals(fieldName)) {
                    deserializedHealthStatusDetail.message = reader.getString();
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedHealthStatusDetail;
        });
    }
}
