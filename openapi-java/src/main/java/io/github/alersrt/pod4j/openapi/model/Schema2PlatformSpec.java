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
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

/**
 * Schema2PlatformSpec describes the platform which a particular manifest is specialized for. This
 * is publicly visible as c/image/manifest.Schema2PlatformSpec.
 */
@javax.annotation.Generated(
        value = "org.openapitools.codegen.languages.JavaClientCodegen",
        date = "2024-11-19T11:19:05.435500352+07:00[Asia/Barnaul]",
        comments = "Generator version: 7.7.0")
public class Schema2PlatformSpec {
    public static final String SERIALIZED_NAME_ARCHITECTURE = "architecture";

    @SerializedName(SERIALIZED_NAME_ARCHITECTURE)
    private String architecture;

    public static final String SERIALIZED_NAME_FEATURES = "features";

    @SerializedName(SERIALIZED_NAME_FEATURES)
    private List<String> features = new ArrayList<>();

    public static final String SERIALIZED_NAME_OS = "os";

    @SerializedName(SERIALIZED_NAME_OS)
    private String os;

    public static final String SERIALIZED_NAME_OS_FEATURES = "os.features";

    @SerializedName(SERIALIZED_NAME_OS_FEATURES)
    private List<String> osFeatures = new ArrayList<>();

    public static final String SERIALIZED_NAME_OS_VERSION = "os.version";

    @SerializedName(SERIALIZED_NAME_OS_VERSION)
    private String osVersion;

    public static final String SERIALIZED_NAME_VARIANT = "variant";

    @SerializedName(SERIALIZED_NAME_VARIANT)
    private String variant;

    public Schema2PlatformSpec() {}

    public Schema2PlatformSpec architecture(String architecture) {
        this.architecture = architecture;
        return this;
    }

    /**
     * Get architecture
     *
     * @return architecture
     */
    @javax.annotation.Nullable
    public String getArchitecture() {
        return architecture;
    }

    public void setArchitecture(String architecture) {
        this.architecture = architecture;
    }

    public Schema2PlatformSpec features(List<String> features) {
        this.features = features;
        return this;
    }

    public Schema2PlatformSpec addFeaturesItem(String featuresItem) {
        if (this.features == null) {
            this.features = new ArrayList<>();
        }
        this.features.add(featuresItem);
        return this;
    }

    /**
     * Get features
     *
     * @return features
     */
    @javax.annotation.Nullable
    public List<String> getFeatures() {
        return features;
    }

    public void setFeatures(List<String> features) {
        this.features = features;
    }

    public Schema2PlatformSpec os(String os) {
        this.os = os;
        return this;
    }

    /**
     * Get os
     *
     * @return os
     */
    @javax.annotation.Nullable
    public String getOs() {
        return os;
    }

    public void setOs(String os) {
        this.os = os;
    }

    public Schema2PlatformSpec osFeatures(List<String> osFeatures) {
        this.osFeatures = osFeatures;
        return this;
    }

    public Schema2PlatformSpec addOsFeaturesItem(String osFeaturesItem) {
        if (this.osFeatures == null) {
            this.osFeatures = new ArrayList<>();
        }
        this.osFeatures.add(osFeaturesItem);
        return this;
    }

    /**
     * Get osFeatures
     *
     * @return osFeatures
     */
    @javax.annotation.Nullable
    public List<String> getOsFeatures() {
        return osFeatures;
    }

    public void setOsFeatures(List<String> osFeatures) {
        this.osFeatures = osFeatures;
    }

    public Schema2PlatformSpec osVersion(String osVersion) {
        this.osVersion = osVersion;
        return this;
    }

    /**
     * Get osVersion
     *
     * @return osVersion
     */
    @javax.annotation.Nullable
    public String getOsVersion() {
        return osVersion;
    }

    public void setOsVersion(String osVersion) {
        this.osVersion = osVersion;
    }

    public Schema2PlatformSpec variant(String variant) {
        this.variant = variant;
        return this;
    }

    /**
     * Get variant
     *
     * @return variant
     */
    @javax.annotation.Nullable
    public String getVariant() {
        return variant;
    }

    public void setVariant(String variant) {
        this.variant = variant;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Schema2PlatformSpec schema2PlatformSpec = (Schema2PlatformSpec) o;
        return Objects.equals(this.architecture, schema2PlatformSpec.architecture)
                && Objects.equals(this.features, schema2PlatformSpec.features)
                && Objects.equals(this.os, schema2PlatformSpec.os)
                && Objects.equals(this.osFeatures, schema2PlatformSpec.osFeatures)
                && Objects.equals(this.osVersion, schema2PlatformSpec.osVersion)
                && Objects.equals(this.variant, schema2PlatformSpec.variant);
    }

    @Override
    public int hashCode() {
        return Objects.hash(architecture, features, os, osFeatures, osVersion, variant);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Schema2PlatformSpec {\n");
        sb.append("    architecture: ").append(toIndentedString(architecture)).append("\n");
        sb.append("    features: ").append(toIndentedString(features)).append("\n");
        sb.append("    os: ").append(toIndentedString(os)).append("\n");
        sb.append("    osFeatures: ").append(toIndentedString(osFeatures)).append("\n");
        sb.append("    osVersion: ").append(toIndentedString(osVersion)).append("\n");
        sb.append("    variant: ").append(toIndentedString(variant)).append("\n");
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
        openapiFields.add("architecture");
        openapiFields.add("features");
        openapiFields.add("os");
        openapiFields.add("os.features");
        openapiFields.add("os.version");
        openapiFields.add("variant");

        // a set of required properties/fields (JSON key names)
        openapiRequiredFields = new HashSet<String>();
    }

    /**
     * Validates the JSON Element and throws an exception if issues found
     *
     * @param jsonElement JSON Element
     * @throws IOException if the JSON Element is invalid with respect to Schema2PlatformSpec
     */
    public static void validateJsonElement(JsonElement jsonElement) throws IOException {
        if (jsonElement == null) {
            if (!Schema2PlatformSpec.openapiRequiredFields
                    .isEmpty()) { // has required fields but JSON element is null
                throw new IllegalArgumentException(
                        String.format(
                                "The required field(s) %s in Schema2PlatformSpec is not found in"
                                        + " the empty JSON string",
                                Schema2PlatformSpec.openapiRequiredFields.toString()));
            }
        }

        Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
        // check to see if the JSON string contains additional fields
        for (Map.Entry<String, JsonElement> entry : entries) {
            if (!Schema2PlatformSpec.openapiFields.contains(entry.getKey())) {
                throw new IllegalArgumentException(
                        String.format(
                                "The field `%s` in the JSON string is not defined in the"
                                        + " `Schema2PlatformSpec` properties. JSON: %s",
                                entry.getKey(), jsonElement.toString()));
            }
        }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
        if ((jsonObj.get("architecture") != null && !jsonObj.get("architecture").isJsonNull())
                && !jsonObj.get("architecture").isJsonPrimitive()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `architecture` to be a primitive type in the JSON"
                                    + " string but got `%s`",
                            jsonObj.get("architecture").toString()));
        }
        // ensure the optional json data is an array if present
        if (jsonObj.get("features") != null
                && !jsonObj.get("features").isJsonNull()
                && !jsonObj.get("features").isJsonArray()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `features` to be an array in the JSON string but"
                                    + " got `%s`",
                            jsonObj.get("features").toString()));
        }
        if ((jsonObj.get("os") != null && !jsonObj.get("os").isJsonNull())
                && !jsonObj.get("os").isJsonPrimitive()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `os` to be a primitive type in the JSON string but"
                                    + " got `%s`",
                            jsonObj.get("os").toString()));
        }
        // ensure the optional json data is an array if present
        if (jsonObj.get("os.features") != null
                && !jsonObj.get("os.features").isJsonNull()
                && !jsonObj.get("os.features").isJsonArray()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `os.features` to be an array in the JSON string but"
                                    + " got `%s`",
                            jsonObj.get("os.features").toString()));
        }
        if ((jsonObj.get("os.version") != null && !jsonObj.get("os.version").isJsonNull())
                && !jsonObj.get("os.version").isJsonPrimitive()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `os.version` to be a primitive type in the JSON"
                                    + " string but got `%s`",
                            jsonObj.get("os.version").toString()));
        }
        if ((jsonObj.get("variant") != null && !jsonObj.get("variant").isJsonNull())
                && !jsonObj.get("variant").isJsonPrimitive()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `variant` to be a primitive type in the JSON string"
                                    + " but got `%s`",
                            jsonObj.get("variant").toString()));
        }
    }

    public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
        @SuppressWarnings("unchecked")
        @Override
        public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
            if (!Schema2PlatformSpec.class.isAssignableFrom(type.getRawType())) {
                return null; // this class only serializes 'Schema2PlatformSpec' and its subtypes
            }
            final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
            final TypeAdapter<Schema2PlatformSpec> thisAdapter =
                    gson.getDelegateAdapter(this, TypeToken.get(Schema2PlatformSpec.class));

            return (TypeAdapter<T>)
                    new TypeAdapter<Schema2PlatformSpec>() {
                        @Override
                        public void write(JsonWriter out, Schema2PlatformSpec value)
                                throws IOException {
                            JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
                            elementAdapter.write(out, obj);
                        }

                        @Override
                        public Schema2PlatformSpec read(JsonReader in) throws IOException {
                            JsonElement jsonElement = elementAdapter.read(in);
                            validateJsonElement(jsonElement);
                            return thisAdapter.fromJsonTree(jsonElement);
                        }
                    }.nullSafe();
        }
    }

    /**
     * Create an instance of Schema2PlatformSpec given an JSON string
     *
     * @param jsonString JSON string
     * @return An instance of Schema2PlatformSpec
     * @throws IOException if the JSON string is invalid with respect to Schema2PlatformSpec
     */
    public static Schema2PlatformSpec fromJson(String jsonString) throws IOException {
        return JSON.getGson().fromJson(jsonString, Schema2PlatformSpec.class);
    }

    /**
     * Convert an instance of Schema2PlatformSpec to an JSON string
     *
     * @return JSON string
     */
    public String toJson() {
        return JSON.getGson().toJson(this);
    }
}
