// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.apimanagement.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;
import java.util.List;

/**
 * Paged Quota Counter list representation.
 */
@Fluent
public final class QuotaCounterCollectionInner implements JsonSerializable<QuotaCounterCollectionInner> {
    /*
     * Quota counter values.
     */
    private List<QuotaCounterContractInner> value;

    /*
     * Total record count number across all pages.
     */
    private Long count;

    /*
     * Next page link if any.
     */
    private String nextLink;

    /**
     * Creates an instance of QuotaCounterCollectionInner class.
     */
    public QuotaCounterCollectionInner() {
    }

    /**
     * Get the value property: Quota counter values.
     * 
     * @return the value value.
     */
    public List<QuotaCounterContractInner> value() {
        return this.value;
    }

    /**
     * Set the value property: Quota counter values.
     * 
     * @param value the value value to set.
     * @return the QuotaCounterCollectionInner object itself.
     */
    public QuotaCounterCollectionInner withValue(List<QuotaCounterContractInner> value) {
        this.value = value;
        return this;
    }

    /**
     * Get the count property: Total record count number across all pages.
     * 
     * @return the count value.
     */
    public Long count() {
        return this.count;
    }

    /**
     * Set the count property: Total record count number across all pages.
     * 
     * @param count the count value to set.
     * @return the QuotaCounterCollectionInner object itself.
     */
    public QuotaCounterCollectionInner withCount(Long count) {
        this.count = count;
        return this;
    }

    /**
     * Get the nextLink property: Next page link if any.
     * 
     * @return the nextLink value.
     */
    public String nextLink() {
        return this.nextLink;
    }

    /**
     * Set the nextLink property: Next page link if any.
     * 
     * @param nextLink the nextLink value to set.
     * @return the QuotaCounterCollectionInner object itself.
     */
    public QuotaCounterCollectionInner withNextLink(String nextLink) {
        this.nextLink = nextLink;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (value() != null) {
            value().forEach(e -> e.validate());
        }
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeArrayField("value", this.value, (writer, element) -> writer.writeJson(element));
        jsonWriter.writeNumberField("count", this.count);
        jsonWriter.writeStringField("nextLink", this.nextLink);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of QuotaCounterCollectionInner from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of QuotaCounterCollectionInner if the JsonReader was pointing to an instance of it, or null
     * if it was pointing to JSON null.
     * @throws IOException If an error occurs while reading the QuotaCounterCollectionInner.
     */
    public static QuotaCounterCollectionInner fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            QuotaCounterCollectionInner deserializedQuotaCounterCollectionInner = new QuotaCounterCollectionInner();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("value".equals(fieldName)) {
                    List<QuotaCounterContractInner> value
                        = reader.readArray(reader1 -> QuotaCounterContractInner.fromJson(reader1));
                    deserializedQuotaCounterCollectionInner.value = value;
                } else if ("count".equals(fieldName)) {
                    deserializedQuotaCounterCollectionInner.count = reader.getNullable(JsonReader::getLong);
                } else if ("nextLink".equals(fieldName)) {
                    deserializedQuotaCounterCollectionInner.nextLink = reader.getString();
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedQuotaCounterCollectionInner;
        });
    }
}
