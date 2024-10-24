// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) TypeSpec Code Generator.
package com.azure.ai.inference.models;

import com.azure.core.annotation.Generated;
import com.azure.core.annotation.Immutable;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;

/**
 * An update to the function tool call information requested by the AI model.
 */
@Immutable
public final class StreamingChatResponseToolCallUpdate
    implements JsonSerializable<StreamingChatResponseToolCallUpdate> {

    /*
     * The ID of the tool call.
     */
    @Generated
    private final String id;

    /*
     * Updates to the function call requested by the AI model.
     */
    @Generated
    private final FunctionCall function;

    /**
     * Creates an instance of StreamingChatResponseToolCallUpdate class.
     *
     * @param id the id value to set.
     * @param function the function value to set.
     */
    @Generated
    private StreamingChatResponseToolCallUpdate(String id, FunctionCall function) {
        this.id = id;
        this.function = function;
    }

    /**
     * Get the id property: The ID of the tool call.
     *
     * @return the id value.
     */
    @Generated
    public String getId() {
        return this.id;
    }

    /**
     * Get the function property: Updates to the function call requested by the AI model.
     *
     * @return the function value.
     */
    @Generated
    public FunctionCall getFunction() {
        return this.function;
    }

    /**
     * {@inheritDoc}
     */
    @Generated
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("id", this.id);
        jsonWriter.writeJsonField("function", this.function);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of StreamingChatResponseToolCallUpdate from the JsonReader.
     *
     * @param jsonReader The JsonReader being read.
     * @return An instance of StreamingChatResponseToolCallUpdate if the JsonReader was pointing to an instance of it,
     * or null if it was pointing to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties.
     * @throws IOException If an error occurs while reading the StreamingChatResponseToolCallUpdate.
     */
    @Generated
    public static StreamingChatResponseToolCallUpdate fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            String id = null;
            FunctionCall function = null;
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();
                if ("id".equals(fieldName)) {
                    id = reader.getString();
                } else if ("function".equals(fieldName)) {
                    function = FunctionCall.fromJson(reader);
                } else {
                    reader.skipChildren();
                }
            }
            return new StreamingChatResponseToolCallUpdate(id, function);
        });
    }
}
