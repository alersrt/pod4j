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
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.TypeAdapter;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.annotations.SerializedName;
import com.google.gson.reflect.TypeToken;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.github.alersrt.pod4j.openapi.JSON;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

/** PluginConfigInterface The interface between Docker and the plugin */
@javax.annotation.Generated(
        value = "org.openapitools.codegen.languages.JavaClientCodegen",
        date = "2024-11-19T11:19:05.435500352+07:00[Asia/Barnaul]",
        comments = "Generator version: 7.7.0")
public class PluginConfigInterface {
    public static final String SERIALIZED_NAME_PROTOCOL_SCHEME = "ProtocolScheme";

    @SerializedName(SERIALIZED_NAME_PROTOCOL_SCHEME)
    private String protocolScheme;

    public static final String SERIALIZED_NAME_SOCKET = "Socket";

    @SerializedName(SERIALIZED_NAME_SOCKET)
    private String socket;

    public static final String SERIALIZED_NAME_TYPES = "Types";

    @SerializedName(SERIALIZED_NAME_TYPES)
    private List<PluginInterfaceType> types = new ArrayList<>();

    public PluginConfigInterface() {}

    public PluginConfigInterface protocolScheme(String protocolScheme) {
        this.protocolScheme = protocolScheme;
        return this;
    }

    /**
     * Protocol to use for clients connecting to the plugin.
     *
     * @return protocolScheme
     */
    @javax.annotation.Nullable
    public String getProtocolScheme() {
        return protocolScheme;
    }

    public void setProtocolScheme(String protocolScheme) {
        this.protocolScheme = protocolScheme;
    }

    public PluginConfigInterface socket(String socket) {
        this.socket = socket;
        return this;
    }

    /**
     * socket
     *
     * @return socket
     */
    @javax.annotation.Nonnull
    public String getSocket() {
        return socket;
    }

    public void setSocket(String socket) {
        this.socket = socket;
    }

    public PluginConfigInterface types(List<PluginInterfaceType> types) {
        this.types = types;
        return this;
    }

    public PluginConfigInterface addTypesItem(PluginInterfaceType typesItem) {
        if (this.types == null) {
            this.types = new ArrayList<>();
        }
        this.types.add(typesItem);
        return this;
    }

    /**
     * types
     *
     * @return types
     */
    @javax.annotation.Nonnull
    public List<PluginInterfaceType> getTypes() {
        return types;
    }

    public void setTypes(List<PluginInterfaceType> types) {
        this.types = types;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        PluginConfigInterface pluginConfigInterface = (PluginConfigInterface) o;
        return Objects.equals(this.protocolScheme, pluginConfigInterface.protocolScheme)
                && Objects.equals(this.socket, pluginConfigInterface.socket)
                && Objects.equals(this.types, pluginConfigInterface.types);
    }

    @Override
    public int hashCode() {
        return Objects.hash(protocolScheme, socket, types);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PluginConfigInterface {\n");
        sb.append("    protocolScheme: ").append(toIndentedString(protocolScheme)).append("\n");
        sb.append("    socket: ").append(toIndentedString(socket)).append("\n");
        sb.append("    types: ").append(toIndentedString(types)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    /**
     * Convert the given object to string with each line indented by 4 spaces (except the first
     * line).
     */
    private String toIndentedString(Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }

    public static HashSet<String> openapiFields;
    public static HashSet<String> openapiRequiredFields;

    static {
        // a set of all properties/fields (JSON key names)
        openapiFields = new HashSet<String>();
        openapiFields.add("ProtocolScheme");
        openapiFields.add("Socket");
        openapiFields.add("Types");

        // a set of required properties/fields (JSON key names)
        openapiRequiredFields = new HashSet<String>();
        openapiRequiredFields.add("Socket");
        openapiRequiredFields.add("Types");
    }

    /**
     * Validates the JSON Element and throws an exception if issues found
     *
     * @param jsonElement JSON Element
     * @throws IOException if the JSON Element is invalid with respect to PluginConfigInterface
     */
    public static void validateJsonElement(JsonElement jsonElement) throws IOException {
        if (jsonElement == null) {
            if (!PluginConfigInterface.openapiRequiredFields
                    .isEmpty()) { // has required fields but JSON element is null
                throw new IllegalArgumentException(
                        String.format(
                                "The required field(s) %s in PluginConfigInterface is not found in"
                                        + " the empty JSON string",
                                PluginConfigInterface.openapiRequiredFields.toString()));
            }
        }

        Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
        // check to see if the JSON string contains additional fields
        for (Map.Entry<String, JsonElement> entry : entries) {
            if (!PluginConfigInterface.openapiFields.contains(entry.getKey())) {
                throw new IllegalArgumentException(
                        String.format(
                                "The field `%s` in the JSON string is not defined in the"
                                        + " `PluginConfigInterface` properties. JSON: %s",
                                entry.getKey(), jsonElement.toString()));
            }
        }

        // check to make sure all required properties/fields are present in the JSON string
        for (String requiredField : PluginConfigInterface.openapiRequiredFields) {
            if (jsonElement.getAsJsonObject().get(requiredField) == null) {
                throw new IllegalArgumentException(
                        String.format(
                                "The required field `%s` is not found in the JSON string: %s",
                                requiredField, jsonElement.toString()));
            }
        }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
        if ((jsonObj.get("ProtocolScheme") != null && !jsonObj.get("ProtocolScheme").isJsonNull())
                && !jsonObj.get("ProtocolScheme").isJsonPrimitive()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `ProtocolScheme` to be a primitive type in the JSON"
                                    + " string but got `%s`",
                            jsonObj.get("ProtocolScheme").toString()));
        }
        if (!jsonObj.get("Socket").isJsonPrimitive()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `Socket` to be a primitive type in the JSON string"
                                    + " but got `%s`",
                            jsonObj.get("Socket").toString()));
        }
        // ensure the json data is an array
        if (!jsonObj.get("Types").isJsonArray()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `Types` to be an array in the JSON string but got"
                                    + " `%s`",
                            jsonObj.get("Types").toString()));
        }

        JsonArray jsonArraytypes = jsonObj.getAsJsonArray("Types");
        // validate the required field `Types` (array)
        for (int i = 0; i < jsonArraytypes.size(); i++) {
            PluginInterfaceType.validateJsonElement(jsonArraytypes.get(i));
        }
        ;
    }

    public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
        @SuppressWarnings("unchecked")
        @Override
        public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
            if (!PluginConfigInterface.class.isAssignableFrom(type.getRawType())) {
                return null; // this class only serializes 'PluginConfigInterface' and its subtypes
            }
            final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
            final TypeAdapter<PluginConfigInterface> thisAdapter =
                    gson.getDelegateAdapter(this, TypeToken.get(PluginConfigInterface.class));

            return (TypeAdapter<T>)
                    new TypeAdapter<PluginConfigInterface>() {
                        @Override
                        public void write(JsonWriter out, PluginConfigInterface value)
                                throws IOException {
                            JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
                            elementAdapter.write(out, obj);
                        }

                        @Override
                        public PluginConfigInterface read(JsonReader in) throws IOException {
                            JsonElement jsonElement = elementAdapter.read(in);
                            validateJsonElement(jsonElement);
                            return thisAdapter.fromJsonTree(jsonElement);
                        }
                    }.nullSafe();
        }
    }

    /**
     * Create an instance of PluginConfigInterface given an JSON string
     *
     * @param jsonString JSON string
     * @return An instance of PluginConfigInterface
     * @throws IOException if the JSON string is invalid with respect to PluginConfigInterface
     */
    public static PluginConfigInterface fromJson(String jsonString) throws IOException {
        return JSON.getGson().fromJson(jsonString, PluginConfigInterface.class);
    }

    /**
     * Convert an instance of PluginConfigInterface to an JSON string
     *
     * @return JSON string
     */
    public String toJson() {
        return JSON.getGson().toJson(this);
    }
}
