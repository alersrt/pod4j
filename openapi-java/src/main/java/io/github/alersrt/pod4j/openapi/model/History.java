/*
 * supports a RESTful API for the Libpod library
 * This documentation describes the Podman v2.x+ RESTful API. It consists of a Docker-compatible API and a Libpod API providing support for Podman’s unique features such as pods.  To start the service and keep it running for 5,000 seconds (-t 0 runs forever):  podman system service -t 5000 &  You can then use cURL on the socket using requests documented below.  NOTE: if you install the package podman-docker, it will create a symbolic link for /run/docker.sock to /run/podman/podman.sock  NOTE: Some fields in the API response JSON are encoded as omitempty, which means that if said field has a zero value, they will not be encoded in the API response. This is a feature to help reduce the size of the JSON responses returned via the API.  NOTE: Due to the limitations of [go-swagger](https://github.com/go-swagger/go-swagger), some field values that have a complex type show up as null in the docs as well as in the API responses. This is because the zero value for the field type is null. The field description in the docs will state what type the field is expected to be for such cases.  See podman-system-service(1) for more information.  Quick Examples:  'podman info'  curl --unix-socket /run/podman/podman.sock http://d/v5.0.0/libpod/info  'podman pull quay.io/containers/podman'  curl -XPOST --unix-socket /run/podman/podman.sock -v 'http://d/v5.0.0/images/create?fromImage=quay.io%2Fcontainers%2Fpodman'  'podman list images'  curl --unix-socket /run/podman/podman.sock -v 'http://d/v5.0.0/libpod/images/json' | jq
 *
 * The version of the OpenAPI document: 5.0.0
 * Contact: podman@lists.podman.io
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package io.github.alersrt.pod4j.openapi.model;

import com.google.gson.Gson;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.TypeAdapter;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.annotations.SerializedName;
import com.google.gson.reflect.TypeToken;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.github.alersrt.pod4j.openapi.JSON;
import jakarta.validation.Valid;

import java.io.IOException;
import java.time.OffsetDateTime;
import java.util.HashSet;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

/**
 * History
 */
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-11-29T01:29:49.168634544+07:00[Asia/Barnaul]", comments = "Generator version: 7.7.0")
public class History {
    public static final String SERIALIZED_NAME_AUTHOR = "author";
    public static final String SERIALIZED_NAME_COMMENT = "comment";
    public static final String SERIALIZED_NAME_CREATED = "created";
    public static final String SERIALIZED_NAME_CREATED_BY = "created_by";
    public static final String SERIALIZED_NAME_EMPTY_LAYER = "empty_layer";
    public static HashSet<String> openapiFields;
    public static HashSet<String> openapiRequiredFields;

    static {
        // a set of all properties/fields (JSON key names)
        openapiFields = new HashSet<String>();
        openapiFields.add("author");
        openapiFields.add("comment");
        openapiFields.add("created");
        openapiFields.add("created_by");
        openapiFields.add("empty_layer");

        // a set of required properties/fields (JSON key names)
        openapiRequiredFields = new HashSet<String>();
    }

    @SerializedName(SERIALIZED_NAME_AUTHOR)
    private String author;
    @SerializedName(SERIALIZED_NAME_COMMENT)
    private String comment;
    @SerializedName(SERIALIZED_NAME_CREATED)
    private OffsetDateTime created;
    @SerializedName(SERIALIZED_NAME_CREATED_BY)
    private String createdBy;
    @SerializedName(SERIALIZED_NAME_EMPTY_LAYER)
    private Boolean emptyLayer;

    public History() {
    }

    /**
     * Validates the JSON Element and throws an exception if issues found
     *
     * @param jsonElement JSON Element
     * @throws IOException if the JSON Element is invalid with respect to History
     */
    public static void validateJsonElement(JsonElement jsonElement) throws IOException {
        if (jsonElement == null) {
            if (!History.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
                throw new IllegalArgumentException(String.format("The required field(s) %s in History is not found in the empty JSON string", History.openapiRequiredFields));
            }
        }

        Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
        // check to see if the JSON string contains additional fields
        for (Map.Entry<String, JsonElement> entry : entries) {
            if (!History.openapiFields.contains(entry.getKey())) {
                throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `History` properties. JSON: %s", entry.getKey(), jsonElement));
            }
        }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
        if ((jsonObj.get("author") != null && !jsonObj.get("author").isJsonNull()) && !jsonObj.get("author").isJsonPrimitive()) {
            throw new IllegalArgumentException(String.format("Expected the field `author` to be a primitive type in the JSON string but got `%s`", jsonObj.get("author").toString()));
        }
        if ((jsonObj.get("comment") != null && !jsonObj.get("comment").isJsonNull()) && !jsonObj.get("comment").isJsonPrimitive()) {
            throw new IllegalArgumentException(String.format("Expected the field `comment` to be a primitive type in the JSON string but got `%s`", jsonObj.get("comment").toString()));
        }
        if ((jsonObj.get("created_by") != null && !jsonObj.get("created_by").isJsonNull()) && !jsonObj.get("created_by").isJsonPrimitive()) {
            throw new IllegalArgumentException(String.format("Expected the field `created_by` to be a primitive type in the JSON string but got `%s`", jsonObj.get("created_by").toString()));
        }
    }

    /**
     * Create an instance of History given an JSON string
     *
     * @param jsonString JSON string
     * @return An instance of History
     * @throws IOException if the JSON string is invalid with respect to History
     */
    public static History fromJson(String jsonString) throws IOException {
        return JSON.getGson().fromJson(jsonString, History.class);
    }

    public History author(String author) {
        this.author = author;
        return this;
    }

    /**
     * Author is the author of the build point.
     *
     * @return author
     */
    @jakarta.annotation.Nullable

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public History comment(String comment) {
        this.comment = comment;
        return this;
    }

    /**
     * Comment is a custom message set when creating the layer.
     *
     * @return comment
     */
    @jakarta.annotation.Nullable

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public History created(OffsetDateTime created) {
        this.created = created;
        return this;
    }

    /**
     * Created is the combined date and time at which the layer was created, formatted as defined by RFC 3339, section 5.6.
     *
     * @return created
     */
    @jakarta.annotation.Nullable
    @Valid

    public OffsetDateTime getCreated() {
        return created;
    }

    public void setCreated(OffsetDateTime created) {
        this.created = created;
    }

    public History createdBy(String createdBy) {
        this.createdBy = createdBy;
        return this;
    }

    /**
     * CreatedBy is the command which created the layer.
     *
     * @return createdBy
     */
    @jakarta.annotation.Nullable

    public String getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
    }

    public History emptyLayer(Boolean emptyLayer) {
        this.emptyLayer = emptyLayer;
        return this;
    }

    /**
     * EmptyLayer is used to mark if the history item created a filesystem diff.
     *
     * @return emptyLayer
     */
    @jakarta.annotation.Nullable

    public Boolean getEmptyLayer() {
        return emptyLayer;
    }

    public void setEmptyLayer(Boolean emptyLayer) {
        this.emptyLayer = emptyLayer;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        History history = (History) o;
        return Objects.equals(this.author, history.author) &&
                Objects.equals(this.comment, history.comment) &&
                Objects.equals(this.created, history.created) &&
                Objects.equals(this.createdBy, history.createdBy) &&
                Objects.equals(this.emptyLayer, history.emptyLayer);
    }

    @Override
    public int hashCode() {
        return Objects.hash(author, comment, created, createdBy, emptyLayer);
    }

    @Override
    public String toString() {
        String sb = "class History {\n" +
                "    author: " + toIndentedString(author) + "\n" +
                "    comment: " + toIndentedString(comment) + "\n" +
                "    created: " + toIndentedString(created) + "\n" +
                "    createdBy: " + toIndentedString(createdBy) + "\n" +
                "    emptyLayer: " + toIndentedString(emptyLayer) + "\n" +
                "}";
        return sb;
    }

    /**
     * Convert the given object to string with each line indented by 4 spaces
     * (except the first line).
     */
    private String toIndentedString(Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }

    /**
     * Convert an instance of History to an JSON string
     *
     * @return JSON string
     */
    public String toJson() {
        return JSON.getGson().toJson(this);
    }

    public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
        @SuppressWarnings("unchecked")
        @Override
        public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
            if (!History.class.isAssignableFrom(type.getRawType())) {
                return null; // this class only serializes 'History' and its subtypes
            }
            final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
            final TypeAdapter<History> thisAdapter
                    = gson.getDelegateAdapter(this, TypeToken.get(History.class));

            return (TypeAdapter<T>) new TypeAdapter<History>() {
                @Override
                public void write(JsonWriter out, History value) throws IOException {
                    JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
                    elementAdapter.write(out, obj);
                }

                @Override
                public History read(JsonReader in) throws IOException {
                    JsonElement jsonElement = elementAdapter.read(in);
                    validateJsonElement(jsonElement);
                    return thisAdapter.fromJsonTree(jsonElement);
                }

            }.nullSafe();
        }
    }
}

