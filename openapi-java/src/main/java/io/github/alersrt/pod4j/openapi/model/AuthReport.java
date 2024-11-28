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

/**
 * AuthReport describes the response for authentication check
 */
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-11-29T01:29:49.168634544+07:00[Asia/Barnaul]", comments = "Generator version: 7.7.0")
public class AuthReport {
    public static final String SERIALIZED_NAME_IDENTITY_TOKEN = "IdentityToken";
    public static final String SERIALIZED_NAME_STATUS = "Status";
    public static HashSet<String> openapiFields;
    public static HashSet<String> openapiRequiredFields;

    static {
        // a set of all properties/fields (JSON key names)
        openapiFields = new HashSet<String>();
        openapiFields.add("IdentityToken");
        openapiFields.add("Status");

        // a set of required properties/fields (JSON key names)
        openapiRequiredFields = new HashSet<String>();
    }

    @SerializedName(SERIALIZED_NAME_IDENTITY_TOKEN)
    private String identityToken;
    @SerializedName(SERIALIZED_NAME_STATUS)
    private String status;

    public AuthReport() {
    }

    /**
     * Validates the JSON Element and throws an exception if issues found
     *
     * @param jsonElement JSON Element
     * @throws IOException if the JSON Element is invalid with respect to AuthReport
     */
    public static void validateJsonElement(JsonElement jsonElement) throws IOException {
        if (jsonElement == null) {
            if (!AuthReport.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
                throw new IllegalArgumentException(String.format("The required field(s) %s in AuthReport is not found in the empty JSON string", AuthReport.openapiRequiredFields));
            }
        }

        Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
        // check to see if the JSON string contains additional fields
        for (Map.Entry<String, JsonElement> entry : entries) {
            if (!AuthReport.openapiFields.contains(entry.getKey())) {
                throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `AuthReport` properties. JSON: %s", entry.getKey(), jsonElement));
            }
        }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
        if ((jsonObj.get("IdentityToken") != null && !jsonObj.get("IdentityToken").isJsonNull()) && !jsonObj.get("IdentityToken").isJsonPrimitive()) {
            throw new IllegalArgumentException(String.format("Expected the field `IdentityToken` to be a primitive type in the JSON string but got `%s`", jsonObj.get("IdentityToken").toString()));
        }
        if ((jsonObj.get("Status") != null && !jsonObj.get("Status").isJsonNull()) && !jsonObj.get("Status").isJsonPrimitive()) {
            throw new IllegalArgumentException(String.format("Expected the field `Status` to be a primitive type in the JSON string but got `%s`", jsonObj.get("Status").toString()));
        }
    }

    /**
     * Create an instance of AuthReport given an JSON string
     *
     * @param jsonString JSON string
     * @return An instance of AuthReport
     * @throws IOException if the JSON string is invalid with respect to AuthReport
     */
    public static AuthReport fromJson(String jsonString) throws IOException {
        return JSON.getGson().fromJson(jsonString, AuthReport.class);
    }

    public AuthReport identityToken(String identityToken) {
        this.identityToken = identityToken;
        return this;
    }

    /**
     * Get identityToken
     *
     * @return identityToken
     */
    @jakarta.annotation.Nullable

    public String getIdentityToken() {
        return identityToken;
    }

    public void setIdentityToken(String identityToken) {
        this.identityToken = identityToken;
    }

    public AuthReport status(String status) {
        this.status = status;
        return this;
    }

    /**
     * Get status
     *
     * @return status
     */
    @jakarta.annotation.Nullable

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        AuthReport authReport = (AuthReport) o;
        return Objects.equals(this.identityToken, authReport.identityToken) &&
                Objects.equals(this.status, authReport.status);
    }

    @Override
    public int hashCode() {
        return Objects.hash(identityToken, status);
    }

    @Override
    public String toString() {
        String sb = "class AuthReport {\n" +
                "    identityToken: " + toIndentedString(identityToken) + "\n" +
                "    status: " + toIndentedString(status) + "\n" +
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
     * Convert an instance of AuthReport to an JSON string
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
            if (!AuthReport.class.isAssignableFrom(type.getRawType())) {
                return null; // this class only serializes 'AuthReport' and its subtypes
            }
            final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
            final TypeAdapter<AuthReport> thisAdapter
                    = gson.getDelegateAdapter(this, TypeToken.get(AuthReport.class));

            return (TypeAdapter<T>) new TypeAdapter<AuthReport>() {
                @Override
                public void write(JsonWriter out, AuthReport value) throws IOException {
                    JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
                    elementAdapter.write(out, obj);
                }

                @Override
                public AuthReport read(JsonReader in) throws IOException {
                    JsonElement jsonElement = elementAdapter.read(in);
                    validateJsonElement(jsonElement);
                    return thisAdapter.fromJsonTree(jsonElement);
                }

            }.nullSafe();
        }
    }
}

