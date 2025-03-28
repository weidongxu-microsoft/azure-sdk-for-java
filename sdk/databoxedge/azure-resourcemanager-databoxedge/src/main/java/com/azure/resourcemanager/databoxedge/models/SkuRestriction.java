// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.databoxedge.models;

import com.azure.core.annotation.Immutable;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;
import java.util.List;

/**
 * The restrictions because of which SKU cannot be used.
 */
@Immutable
public final class SkuRestriction implements JsonSerializable<SkuRestriction> {
    /*
     * The type of the restriction.
     */
    private String type;

    /*
     * The locations where sku is restricted.
     */
    private List<String> values;

    /*
     * The SKU restriction reason.
     */
    private SkuRestrictionReasonCode reasonCode;

    /*
     * Restriction of the SKU for the location/zone
     */
    private SkuRestrictionInfo restrictionInfo;

    /**
     * Creates an instance of SkuRestriction class.
     */
    public SkuRestriction() {
    }

    /**
     * Get the type property: The type of the restriction.
     * 
     * @return the type value.
     */
    public String type() {
        return this.type;
    }

    /**
     * Get the values property: The locations where sku is restricted.
     * 
     * @return the values value.
     */
    public List<String> values() {
        return this.values;
    }

    /**
     * Get the reasonCode property: The SKU restriction reason.
     * 
     * @return the reasonCode value.
     */
    public SkuRestrictionReasonCode reasonCode() {
        return this.reasonCode;
    }

    /**
     * Get the restrictionInfo property: Restriction of the SKU for the location/zone.
     * 
     * @return the restrictionInfo value.
     */
    public SkuRestrictionInfo restrictionInfo() {
        return this.restrictionInfo;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (restrictionInfo() != null) {
            restrictionInfo().validate();
        }
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
     * Reads an instance of SkuRestriction from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of SkuRestriction if the JsonReader was pointing to an instance of it, or null if it was
     * pointing to JSON null.
     * @throws IOException If an error occurs while reading the SkuRestriction.
     */
    public static SkuRestriction fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            SkuRestriction deserializedSkuRestriction = new SkuRestriction();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("type".equals(fieldName)) {
                    deserializedSkuRestriction.type = reader.getString();
                } else if ("values".equals(fieldName)) {
                    List<String> values = reader.readArray(reader1 -> reader1.getString());
                    deserializedSkuRestriction.values = values;
                } else if ("reasonCode".equals(fieldName)) {
                    deserializedSkuRestriction.reasonCode = SkuRestrictionReasonCode.fromString(reader.getString());
                } else if ("restrictionInfo".equals(fieldName)) {
                    deserializedSkuRestriction.restrictionInfo = SkuRestrictionInfo.fromJson(reader);
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedSkuRestriction;
        });
    }
}
