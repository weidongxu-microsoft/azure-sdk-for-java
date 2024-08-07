// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.hybridcompute.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;

/**
 * Settings Gateway properties.
 */
@Fluent
public final class SettingsGatewayProperties implements JsonSerializable<SettingsGatewayProperties> {
    /*
     * Associated Gateway Resource Id
     */
    private String gatewayResourceId;

    /**
     * Creates an instance of SettingsGatewayProperties class.
     */
    public SettingsGatewayProperties() {
    }

    /**
     * Get the gatewayResourceId property: Associated Gateway Resource Id.
     * 
     * @return the gatewayResourceId value.
     */
    public String gatewayResourceId() {
        return this.gatewayResourceId;
    }

    /**
     * Set the gatewayResourceId property: Associated Gateway Resource Id.
     * 
     * @param gatewayResourceId the gatewayResourceId value to set.
     * @return the SettingsGatewayProperties object itself.
     */
    public SettingsGatewayProperties withGatewayResourceId(String gatewayResourceId) {
        this.gatewayResourceId = gatewayResourceId;
        return this;
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
        jsonWriter.writeStringField("gatewayResourceId", this.gatewayResourceId);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of SettingsGatewayProperties from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of SettingsGatewayProperties if the JsonReader was pointing to an instance of it, or null if
     * it was pointing to JSON null.
     * @throws IOException If an error occurs while reading the SettingsGatewayProperties.
     */
    public static SettingsGatewayProperties fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            SettingsGatewayProperties deserializedSettingsGatewayProperties = new SettingsGatewayProperties();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("gatewayResourceId".equals(fieldName)) {
                    deserializedSettingsGatewayProperties.gatewayResourceId = reader.getString();
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedSettingsGatewayProperties;
        });
    }
}
