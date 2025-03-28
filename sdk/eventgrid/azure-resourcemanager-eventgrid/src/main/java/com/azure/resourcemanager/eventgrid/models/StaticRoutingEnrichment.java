// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.eventgrid.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;

/**
 * Static routing enrichment details.
 */
@Fluent
public class StaticRoutingEnrichment implements JsonSerializable<StaticRoutingEnrichment> {
    /*
     * Static routing enrichment value type. For e.g. this property value can be 'String'.
     */
    private StaticRoutingEnrichmentType valueType = StaticRoutingEnrichmentType.fromString("StaticRoutingEnrichment");

    /*
     * Static routing enrichment key.
     */
    private String key;

    /**
     * Creates an instance of StaticRoutingEnrichment class.
     */
    public StaticRoutingEnrichment() {
    }

    /**
     * Get the valueType property: Static routing enrichment value type. For e.g. this property value can be 'String'.
     * 
     * @return the valueType value.
     */
    public StaticRoutingEnrichmentType valueType() {
        return this.valueType;
    }

    /**
     * Get the key property: Static routing enrichment key.
     * 
     * @return the key value.
     */
    public String key() {
        return this.key;
    }

    /**
     * Set the key property: Static routing enrichment key.
     * 
     * @param key the key value to set.
     * @return the StaticRoutingEnrichment object itself.
     */
    public StaticRoutingEnrichment withKey(String key) {
        this.key = key;
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
        jsonWriter.writeStringField("valueType", this.valueType == null ? null : this.valueType.toString());
        jsonWriter.writeStringField("key", this.key);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of StaticRoutingEnrichment from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of StaticRoutingEnrichment if the JsonReader was pointing to an instance of it, or null if it
     * was pointing to JSON null.
     * @throws IOException If an error occurs while reading the StaticRoutingEnrichment.
     */
    public static StaticRoutingEnrichment fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            String discriminatorValue = null;
            try (JsonReader readerToUse = reader.bufferObject()) {
                readerToUse.nextToken(); // Prepare for reading
                while (readerToUse.nextToken() != JsonToken.END_OBJECT) {
                    String fieldName = readerToUse.getFieldName();
                    readerToUse.nextToken();
                    if ("valueType".equals(fieldName)) {
                        discriminatorValue = readerToUse.getString();
                        break;
                    } else {
                        readerToUse.skipChildren();
                    }
                }
                // Use the discriminator value to determine which subtype should be deserialized.
                if ("String".equals(discriminatorValue)) {
                    return StaticStringRoutingEnrichment.fromJson(readerToUse.reset());
                } else {
                    return fromJsonKnownDiscriminator(readerToUse.reset());
                }
            }
        });
    }

    static StaticRoutingEnrichment fromJsonKnownDiscriminator(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            StaticRoutingEnrichment deserializedStaticRoutingEnrichment = new StaticRoutingEnrichment();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("valueType".equals(fieldName)) {
                    deserializedStaticRoutingEnrichment.valueType
                        = StaticRoutingEnrichmentType.fromString(reader.getString());
                } else if ("key".equals(fieldName)) {
                    deserializedStaticRoutingEnrichment.key = reader.getString();
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedStaticRoutingEnrichment;
        });
    }
}
