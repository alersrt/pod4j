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
import java.io.IOException;
import java.util.HashSet;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

/** SecretDeleteLibpod404Response */
@javax.annotation.Generated(
        value = "org.openapitools.codegen.languages.JavaClientCodegen",
        date = "2024-11-26T18:05:51.842033247+07:00[Asia/Barnaul]",
        comments = "Generator version: 7.7.0")
public class SecretDeleteLibpod404Response {
    public static final String SERIALIZED_NAME_CAUSE = "cause";

    @SerializedName(SERIALIZED_NAME_CAUSE)
    private String cause;

    public static final String SERIALIZED_NAME_MESSAGE = "message";

    @SerializedName(SERIALIZED_NAME_MESSAGE)
    private String message;

    public static final String SERIALIZED_NAME_RESPONSE = "response";

    @SerializedName(SERIALIZED_NAME_RESPONSE)
    private Long response;

    public SecretDeleteLibpod404Response() {}

    public SecretDeleteLibpod404Response cause(String cause) {
        this.cause = cause;
        return this;
    }

    /**
     * API root cause formatted for automated parsing
     *
     * @return cause
     */
    @javax.annotation.Nullable
    public String getCause() {
        return cause;
    }

    public void setCause(String cause) {
        this.cause = cause;
    }

    public SecretDeleteLibpod404Response message(String message) {
        this.message = message;
        return this;
    }

    /**
     * human error message, formatted for a human to read
     *
     * @return message
     */
    @javax.annotation.Nullable
    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public SecretDeleteLibpod404Response response(Long response) {
        this.response = response;
        return this;
    }

    /**
     * HTTP response code minimum: 400
     *
     * @return response
     */
    @javax.annotation.Nullable
    public Long getResponse() {
        return response;
    }

    public void setResponse(Long response) {
        this.response = response;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        SecretDeleteLibpod404Response secretDeleteLibpod404Response =
                (SecretDeleteLibpod404Response) o;
        return Objects.equals(this.cause, secretDeleteLibpod404Response.cause)
                && Objects.equals(this.message, secretDeleteLibpod404Response.message)
                && Objects.equals(this.response, secretDeleteLibpod404Response.response);
    }

    @Override
    public int hashCode() {
        return Objects.hash(cause, message, response);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SecretDeleteLibpod404Response {\n");
        sb.append("    cause: ").append(toIndentedString(cause)).append("\n");
        sb.append("    message: ").append(toIndentedString(message)).append("\n");
        sb.append("    response: ").append(toIndentedString(response)).append("\n");
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
        openapiFields.add("cause");
        openapiFields.add("message");
        openapiFields.add("response");

        // a set of required properties/fields (JSON key names)
        openapiRequiredFields = new HashSet<String>();
    }

    /**
     * Validates the JSON Element and throws an exception if issues found
     *
     * @param jsonElement JSON Element
     * @throws IOException if the JSON Element is invalid with respect to
     *     SecretDeleteLibpod404Response
     */
    public static void validateJsonElement(JsonElement jsonElement) throws IOException {
        if (jsonElement == null) {
            if (!SecretDeleteLibpod404Response.openapiRequiredFields
                    .isEmpty()) { // has required fields but JSON element is null
                throw new IllegalArgumentException(
                        String.format(
                                "The required field(s) %s in SecretDeleteLibpod404Response is not"
                                        + " found in the empty JSON string",
                                SecretDeleteLibpod404Response.openapiRequiredFields.toString()));
            }
        }

        Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
        // check to see if the JSON string contains additional fields
        for (Map.Entry<String, JsonElement> entry : entries) {
            if (!SecretDeleteLibpod404Response.openapiFields.contains(entry.getKey())) {
                throw new IllegalArgumentException(
                        String.format(
                                "The field `%s` in the JSON string is not defined in the"
                                        + " `SecretDeleteLibpod404Response` properties. JSON: %s",
                                entry.getKey(), jsonElement.toString()));
            }
        }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
        if ((jsonObj.get("cause") != null && !jsonObj.get("cause").isJsonNull())
                && !jsonObj.get("cause").isJsonPrimitive()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `cause` to be a primitive type in the JSON string"
                                    + " but got `%s`",
                            jsonObj.get("cause").toString()));
        }
        if ((jsonObj.get("message") != null && !jsonObj.get("message").isJsonNull())
                && !jsonObj.get("message").isJsonPrimitive()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `message` to be a primitive type in the JSON string"
                                    + " but got `%s`",
                            jsonObj.get("message").toString()));
        }
    }

    public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
        @SuppressWarnings("unchecked")
        @Override
        public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
            if (!SecretDeleteLibpod404Response.class.isAssignableFrom(type.getRawType())) {
                return null; // this class only serializes 'SecretDeleteLibpod404Response' and its
                // subtypes
            }
            final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
            final TypeAdapter<SecretDeleteLibpod404Response> thisAdapter =
                    gson.getDelegateAdapter(
                            this, TypeToken.get(SecretDeleteLibpod404Response.class));

            return (TypeAdapter<T>)
                    new TypeAdapter<SecretDeleteLibpod404Response>() {
                        @Override
                        public void write(JsonWriter out, SecretDeleteLibpod404Response value)
                                throws IOException {
                            JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
                            elementAdapter.write(out, obj);
                        }

                        @Override
                        public SecretDeleteLibpod404Response read(JsonReader in)
                                throws IOException {
                            JsonElement jsonElement = elementAdapter.read(in);
                            validateJsonElement(jsonElement);
                            return thisAdapter.fromJsonTree(jsonElement);
                        }
                    }.nullSafe();
        }
    }

    /**
     * Create an instance of SecretDeleteLibpod404Response given an JSON string
     *
     * @param jsonString JSON string
     * @return An instance of SecretDeleteLibpod404Response
     * @throws IOException if the JSON string is invalid with respect to
     *     SecretDeleteLibpod404Response
     */
    public static SecretDeleteLibpod404Response fromJson(String jsonString) throws IOException {
        return JSON.getGson().fromJson(jsonString, SecretDeleteLibpod404Response.class);
    }

    /**
     * Convert an instance of SecretDeleteLibpod404Response to an JSON string
     *
     * @return JSON string
     */
    public String toJson() {
        return JSON.getGson().toJson(this);
    }
}
