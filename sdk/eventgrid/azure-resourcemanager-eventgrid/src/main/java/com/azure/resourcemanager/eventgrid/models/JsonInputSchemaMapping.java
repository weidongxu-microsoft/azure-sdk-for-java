// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.eventgrid.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import com.azure.resourcemanager.eventgrid.fluent.models.JsonInputSchemaMappingProperties;
import java.io.IOException;

/**
 * This enables publishing to Event Grid using a custom input schema. This can be used to map properties from a custom
 * input JSON schema to the Event Grid event schema.
 */
@Fluent
public final class JsonInputSchemaMapping extends InputSchemaMapping {
    /*
     * Type of the custom mapping
     */
    private InputSchemaMappingType inputSchemaMappingType = InputSchemaMappingType.JSON;

    /*
     * JSON Properties of the input schema mapping
     */
    private JsonInputSchemaMappingProperties innerProperties;

    /**
     * Creates an instance of JsonInputSchemaMapping class.
     */
    public JsonInputSchemaMapping() {
    }

    /**
     * Get the inputSchemaMappingType property: Type of the custom mapping.
     * 
     * @return the inputSchemaMappingType value.
     */
    @Override
    public InputSchemaMappingType inputSchemaMappingType() {
        return this.inputSchemaMappingType;
    }

    /**
     * Get the innerProperties property: JSON Properties of the input schema mapping.
     * 
     * @return the innerProperties value.
     */
    JsonInputSchemaMappingProperties innerProperties() {
        return this.innerProperties;
    }

    /**
     * Get the id property: The mapping information for the Id property of the Event Grid Event.
     * 
     * @return the id value.
     */
    public JsonField id() {
        return this.innerProperties() == null ? null : this.innerProperties().id();
    }

    /**
     * Set the id property: The mapping information for the Id property of the Event Grid Event.
     * 
     * @param id the id value to set.
     * @return the JsonInputSchemaMapping object itself.
     */
    public JsonInputSchemaMapping withId(JsonField id) {
        if (this.innerProperties() == null) {
            this.innerProperties = new JsonInputSchemaMappingProperties();
        }
        this.innerProperties().withId(id);
        return this;
    }

    /**
     * Get the topic property: The mapping information for the Topic property of the Event Grid Event.
     * 
     * @return the topic value.
     */
    public JsonField topic() {
        return this.innerProperties() == null ? null : this.innerProperties().topic();
    }

    /**
     * Set the topic property: The mapping information for the Topic property of the Event Grid Event.
     * 
     * @param topic the topic value to set.
     * @return the JsonInputSchemaMapping object itself.
     */
    public JsonInputSchemaMapping withTopic(JsonField topic) {
        if (this.innerProperties() == null) {
            this.innerProperties = new JsonInputSchemaMappingProperties();
        }
        this.innerProperties().withTopic(topic);
        return this;
    }

    /**
     * Get the eventTime property: The mapping information for the EventTime property of the Event Grid Event.
     * 
     * @return the eventTime value.
     */
    public JsonField eventTime() {
        return this.innerProperties() == null ? null : this.innerProperties().eventTime();
    }

    /**
     * Set the eventTime property: The mapping information for the EventTime property of the Event Grid Event.
     * 
     * @param eventTime the eventTime value to set.
     * @return the JsonInputSchemaMapping object itself.
     */
    public JsonInputSchemaMapping withEventTime(JsonField eventTime) {
        if (this.innerProperties() == null) {
            this.innerProperties = new JsonInputSchemaMappingProperties();
        }
        this.innerProperties().withEventTime(eventTime);
        return this;
    }

    /**
     * Get the eventType property: The mapping information for the EventType property of the Event Grid Event.
     * 
     * @return the eventType value.
     */
    public JsonFieldWithDefault eventType() {
        return this.innerProperties() == null ? null : this.innerProperties().eventType();
    }

    /**
     * Set the eventType property: The mapping information for the EventType property of the Event Grid Event.
     * 
     * @param eventType the eventType value to set.
     * @return the JsonInputSchemaMapping object itself.
     */
    public JsonInputSchemaMapping withEventType(JsonFieldWithDefault eventType) {
        if (this.innerProperties() == null) {
            this.innerProperties = new JsonInputSchemaMappingProperties();
        }
        this.innerProperties().withEventType(eventType);
        return this;
    }

    /**
     * Get the subject property: The mapping information for the Subject property of the Event Grid Event.
     * 
     * @return the subject value.
     */
    public JsonFieldWithDefault subject() {
        return this.innerProperties() == null ? null : this.innerProperties().subject();
    }

    /**
     * Set the subject property: The mapping information for the Subject property of the Event Grid Event.
     * 
     * @param subject the subject value to set.
     * @return the JsonInputSchemaMapping object itself.
     */
    public JsonInputSchemaMapping withSubject(JsonFieldWithDefault subject) {
        if (this.innerProperties() == null) {
            this.innerProperties = new JsonInputSchemaMappingProperties();
        }
        this.innerProperties().withSubject(subject);
        return this;
    }

    /**
     * Get the dataVersion property: The mapping information for the DataVersion property of the Event Grid Event.
     * 
     * @return the dataVersion value.
     */
    public JsonFieldWithDefault dataVersion() {
        return this.innerProperties() == null ? null : this.innerProperties().dataVersion();
    }

    /**
     * Set the dataVersion property: The mapping information for the DataVersion property of the Event Grid Event.
     * 
     * @param dataVersion the dataVersion value to set.
     * @return the JsonInputSchemaMapping object itself.
     */
    public JsonInputSchemaMapping withDataVersion(JsonFieldWithDefault dataVersion) {
        if (this.innerProperties() == null) {
            this.innerProperties = new JsonInputSchemaMappingProperties();
        }
        this.innerProperties().withDataVersion(dataVersion);
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    @Override
    public void validate() {
        if (innerProperties() != null) {
            innerProperties().validate();
        }
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("inputSchemaMappingType",
            this.inputSchemaMappingType == null ? null : this.inputSchemaMappingType.toString());
        jsonWriter.writeJsonField("properties", this.innerProperties);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of JsonInputSchemaMapping from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of JsonInputSchemaMapping if the JsonReader was pointing to an instance of it, or null if it
     * was pointing to JSON null.
     * @throws IOException If an error occurs while reading the JsonInputSchemaMapping.
     */
    public static JsonInputSchemaMapping fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            JsonInputSchemaMapping deserializedJsonInputSchemaMapping = new JsonInputSchemaMapping();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("inputSchemaMappingType".equals(fieldName)) {
                    deserializedJsonInputSchemaMapping.inputSchemaMappingType
                        = InputSchemaMappingType.fromString(reader.getString());
                } else if ("properties".equals(fieldName)) {
                    deserializedJsonInputSchemaMapping.innerProperties
                        = JsonInputSchemaMappingProperties.fromJson(reader);
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedJsonInputSchemaMapping;
        });
    }
}
