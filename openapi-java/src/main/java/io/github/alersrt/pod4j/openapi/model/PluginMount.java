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
import jakarta.validation.constraints.NotNull;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

/**
 * PluginMount plugin mount
 */
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-11-29T01:29:49.168634544+07:00[Asia/Barnaul]", comments = "Generator version: 7.7.0")
public class PluginMount {
    public static final String SERIALIZED_NAME_DESCRIPTION = "Description";
    public static final String SERIALIZED_NAME_DESTINATION = "Destination";
    public static final String SERIALIZED_NAME_NAME = "Name";
    public static final String SERIALIZED_NAME_OPTIONS = "Options";
    public static final String SERIALIZED_NAME_SETTABLE = "Settable";
    public static final String SERIALIZED_NAME_SOURCE = "Source";
    public static final String SERIALIZED_NAME_TYPE = "Type";
    public static HashSet<String> openapiFields;
    public static HashSet<String> openapiRequiredFields;

    static {
        // a set of all properties/fields (JSON key names)
        openapiFields = new HashSet<String>();
        openapiFields.add("Description");
        openapiFields.add("Destination");
        openapiFields.add("Name");
        openapiFields.add("Options");
        openapiFields.add("Settable");
        openapiFields.add("Source");
        openapiFields.add("Type");

        // a set of required properties/fields (JSON key names)
        openapiRequiredFields = new HashSet<String>();
        openapiRequiredFields.add("Description");
        openapiRequiredFields.add("Destination");
        openapiRequiredFields.add("Name");
        openapiRequiredFields.add("Options");
        openapiRequiredFields.add("Settable");
        openapiRequiredFields.add("Source");
        openapiRequiredFields.add("Type");
    }

    @SerializedName(SERIALIZED_NAME_DESCRIPTION)
    private String description;
    @SerializedName(SERIALIZED_NAME_DESTINATION)
    private String destination;
    @SerializedName(SERIALIZED_NAME_NAME)
    private String name;
    @SerializedName(SERIALIZED_NAME_OPTIONS)
    private List<String> options = new ArrayList<>();
    @SerializedName(SERIALIZED_NAME_SETTABLE)
    private List<String> settable = new ArrayList<>();
    @SerializedName(SERIALIZED_NAME_SOURCE)
    private String source;
    @SerializedName(SERIALIZED_NAME_TYPE)
    private String type;

    public PluginMount() {
    }

    /**
     * Validates the JSON Element and throws an exception if issues found
     *
     * @param jsonElement JSON Element
     * @throws IOException if the JSON Element is invalid with respect to PluginMount
     */
    public static void validateJsonElement(JsonElement jsonElement) throws IOException {
        if (jsonElement == null) {
            if (!PluginMount.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
                throw new IllegalArgumentException(String.format("The required field(s) %s in PluginMount is not found in the empty JSON string", PluginMount.openapiRequiredFields));
            }
        }

        Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
        // check to see if the JSON string contains additional fields
        for (Map.Entry<String, JsonElement> entry : entries) {
            if (!PluginMount.openapiFields.contains(entry.getKey())) {
                throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `PluginMount` properties. JSON: %s", entry.getKey(), jsonElement));
            }
        }

        // check to make sure all required properties/fields are present in the JSON string
        for (String requiredField : PluginMount.openapiRequiredFields) {
            if (jsonElement.getAsJsonObject().get(requiredField) == null) {
                throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement));
            }
        }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
        if (!jsonObj.get("Description").isJsonPrimitive()) {
            throw new IllegalArgumentException(String.format("Expected the field `Description` to be a primitive type in the JSON string but got `%s`", jsonObj.get("Description").toString()));
        }
        if (!jsonObj.get("Destination").isJsonPrimitive()) {
            throw new IllegalArgumentException(String.format("Expected the field `Destination` to be a primitive type in the JSON string but got `%s`", jsonObj.get("Destination").toString()));
        }
        if (!jsonObj.get("Name").isJsonPrimitive()) {
            throw new IllegalArgumentException(String.format("Expected the field `Name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("Name").toString()));
        }
        // ensure the required json array is present
        if (jsonObj.get("Options") == null) {
            throw new IllegalArgumentException("Expected the field `linkedContent` to be an array in the JSON string but got `null`");
        } else if (!jsonObj.get("Options").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `Options` to be an array in the JSON string but got `%s`", jsonObj.get("Options").toString()));
        }
        // ensure the required json array is present
        if (jsonObj.get("Settable") == null) {
            throw new IllegalArgumentException("Expected the field `linkedContent` to be an array in the JSON string but got `null`");
        } else if (!jsonObj.get("Settable").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `Settable` to be an array in the JSON string but got `%s`", jsonObj.get("Settable").toString()));
        }
        if (!jsonObj.get("Source").isJsonPrimitive()) {
            throw new IllegalArgumentException(String.format("Expected the field `Source` to be a primitive type in the JSON string but got `%s`", jsonObj.get("Source").toString()));
        }
        if (!jsonObj.get("Type").isJsonPrimitive()) {
            throw new IllegalArgumentException(String.format("Expected the field `Type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("Type").toString()));
        }
    }

    /**
     * Create an instance of PluginMount given an JSON string
     *
     * @param jsonString JSON string
     * @return An instance of PluginMount
     * @throws IOException if the JSON string is invalid with respect to PluginMount
     */
    public static PluginMount fromJson(String jsonString) throws IOException {
        return JSON.getGson().fromJson(jsonString, PluginMount.class);
    }

    public PluginMount description(String description) {
        this.description = description;
        return this;
    }

    /**
     * description
     *
     * @return description
     */
    @jakarta.annotation.Nonnull
    @NotNull

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public PluginMount destination(String destination) {
        this.destination = destination;
        return this;
    }

    /**
     * destination
     *
     * @return destination
     */
    @jakarta.annotation.Nonnull
    @NotNull

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public PluginMount name(String name) {
        this.name = name;
        return this;
    }

    /**
     * name
     *
     * @return name
     */
    @jakarta.annotation.Nonnull
    @NotNull

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public PluginMount options(List<String> options) {
        this.options = options;
        return this;
    }

    public PluginMount addOptionsItem(String optionsItem) {
        if (this.options == null) {
            this.options = new ArrayList<>();
        }
        this.options.add(optionsItem);
        return this;
    }

    /**
     * options
     *
     * @return options
     */
    @jakarta.annotation.Nonnull
    @NotNull

    public List<String> getOptions() {
        return options;
    }

    public void setOptions(List<String> options) {
        this.options = options;
    }

    public PluginMount settable(List<String> settable) {
        this.settable = settable;
        return this;
    }

    public PluginMount addSettableItem(String settableItem) {
        if (this.settable == null) {
            this.settable = new ArrayList<>();
        }
        this.settable.add(settableItem);
        return this;
    }

    /**
     * settable
     *
     * @return settable
     */
    @jakarta.annotation.Nonnull
    @NotNull

    public List<String> getSettable() {
        return settable;
    }

    public void setSettable(List<String> settable) {
        this.settable = settable;
    }

    public PluginMount source(String source) {
        this.source = source;
        return this;
    }

    /**
     * source
     *
     * @return source
     */
    @jakarta.annotation.Nonnull
    @NotNull

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public PluginMount type(String type) {
        this.type = type;
        return this;
    }

    /**
     * type
     *
     * @return type
     */
    @jakarta.annotation.Nonnull
    @NotNull

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        PluginMount pluginMount = (PluginMount) o;
        return Objects.equals(this.description, pluginMount.description) &&
                Objects.equals(this.destination, pluginMount.destination) &&
                Objects.equals(this.name, pluginMount.name) &&
                Objects.equals(this.options, pluginMount.options) &&
                Objects.equals(this.settable, pluginMount.settable) &&
                Objects.equals(this.source, pluginMount.source) &&
                Objects.equals(this.type, pluginMount.type);
    }

    @Override
    public int hashCode() {
        return Objects.hash(description, destination, name, options, settable, source, type);
    }

    @Override
    public String toString() {
        String sb = "class PluginMount {\n" +
                "    description: " + toIndentedString(description) + "\n" +
                "    destination: " + toIndentedString(destination) + "\n" +
                "    name: " + toIndentedString(name) + "\n" +
                "    options: " + toIndentedString(options) + "\n" +
                "    settable: " + toIndentedString(settable) + "\n" +
                "    source: " + toIndentedString(source) + "\n" +
                "    type: " + toIndentedString(type) + "\n" +
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
     * Convert an instance of PluginMount to an JSON string
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
            if (!PluginMount.class.isAssignableFrom(type.getRawType())) {
                return null; // this class only serializes 'PluginMount' and its subtypes
            }
            final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
            final TypeAdapter<PluginMount> thisAdapter
                    = gson.getDelegateAdapter(this, TypeToken.get(PluginMount.class));

            return (TypeAdapter<T>) new TypeAdapter<PluginMount>() {
                @Override
                public void write(JsonWriter out, PluginMount value) throws IOException {
                    JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
                    elementAdapter.write(out, obj);
                }

                @Override
                public PluginMount read(JsonReader in) throws IOException {
                    JsonElement jsonElement = elementAdapter.read(in);
                    validateJsonElement(jsonElement);
                    return thisAdapter.fromJsonTree(jsonElement);
                }

            }.nullSafe();
        }
    }
}

