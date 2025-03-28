// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package io.clientcore.core.serialization.json.models;

import io.clientcore.core.annotations.Metadata;
import io.clientcore.core.annotations.MetadataProperties;
import io.clientcore.core.serialization.json.JsonReader;
import io.clientcore.core.serialization.json.JsonToken;
import io.clientcore.core.serialization.json.JsonWriter;
import io.clientcore.core.serialization.json.implementation.jackson.core.io.JsonStringEncoder;

import java.io.IOException;

/**
 * Class representing the JSON string type
 */
@Metadata(properties = MetadataProperties.IMMUTABLE)
public final class JsonString extends JsonElement {
    private final String value;

    // Used to capture the JSON string value when toJsonString is called to prevent creating a new string each time the
    // method is called.
    private String jsonString;

    /**
     * Constructor used to explicitly set the string value of the JsonString object.
     * Adds the starting and ending double quotation marks.
     *
     * @param value specifies the text string this JsonString object represents
     */
    public JsonString(String value) {
        this.value = value;
    }

    /**
     * Gets the string value of this JsonString object.
     *
     * @return the string value of this JsonString object
     */
    public String getValue() {
        return value;
    }

    /**
     * @return boolean of whether this JsonElement object is of type JsonString.
     */
    @Override
    public boolean isString() {
        return true;
    }

    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        return jsonWriter.writeString(value);
    }

    /**
     * Deserializes a JSON string from a JsonReader.
     * <p>
     * If the JsonReader's current token is null, it is assumed the JsonReader hasn't begun reading and
     * {@link JsonReader#nextToken()} will be called to begin reading.
     * <p>
     * After ensuring the JsonReader has begun reading, if the current token is not {@link JsonToken#STRING}, an
     * {@link IllegalStateException} will be thrown. Otherwise, a JSON string representing the string value will be
     * created and returned.
     *
     * @param jsonReader The JsonReader to deserialize from.
     * @return The deserialized JSON string.
     * @throws IOException If an error occurs while deserializing the JSON string.
     * @throws IllegalStateException If the current token is not {@link JsonToken#STRING}.
     */
    public static JsonString fromJson(JsonReader jsonReader) throws IOException {
        JsonToken token = jsonReader.currentToken();
        if (token == null) {
            token = jsonReader.nextToken();
        }

        if (token != JsonToken.STRING) {
            throw new IllegalStateException(
                "JsonReader is pointing to an invalid token for deserialization. Token was: " + token + ".");
        }

        return new JsonString(jsonReader.getString());
    }

    @Override
    public String toJsonString() throws IOException {
        if (jsonString != null) {
            return jsonString;
        }

        StringBuilder sb = new StringBuilder(value.length() + 32);
        sb.append('"');
        JsonStringEncoder.quoteAsString(value, sb);
        sb.append('"');

        jsonString = sb.toString();
        return jsonString;
    }
}
