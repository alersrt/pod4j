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

/** SecurityInfo describes the libpod host */
@javax.annotation.Generated(
        value = "org.openapitools.codegen.languages.JavaClientCodegen",
        date = "2024-11-26T18:05:51.842033247+07:00[Asia/Barnaul]",
        comments = "Generator version: 7.7.0")
public class SecurityInfo {
    public static final String SERIALIZED_NAME_APPARMOR_ENABLED = "apparmorEnabled";

    @SerializedName(SERIALIZED_NAME_APPARMOR_ENABLED)
    private Boolean apparmorEnabled;

    public static final String SERIALIZED_NAME_CAPABILITIES = "capabilities";

    @SerializedName(SERIALIZED_NAME_CAPABILITIES)
    private String capabilities;

    public static final String SERIALIZED_NAME_ROOTLESS = "rootless";

    @SerializedName(SERIALIZED_NAME_ROOTLESS)
    private Boolean rootless;

    public static final String SERIALIZED_NAME_SECCOMP_ENABLED = "seccompEnabled";

    @SerializedName(SERIALIZED_NAME_SECCOMP_ENABLED)
    private Boolean seccompEnabled;

    public static final String SERIALIZED_NAME_SECCOMP_PROFILE_PATH = "seccompProfilePath";

    @SerializedName(SERIALIZED_NAME_SECCOMP_PROFILE_PATH)
    private String seccompProfilePath;

    public static final String SERIALIZED_NAME_SELINUX_ENABLED = "selinuxEnabled";

    @SerializedName(SERIALIZED_NAME_SELINUX_ENABLED)
    private Boolean selinuxEnabled;

    public SecurityInfo() {}

    public SecurityInfo apparmorEnabled(Boolean apparmorEnabled) {
        this.apparmorEnabled = apparmorEnabled;
        return this;
    }

    /**
     * Get apparmorEnabled
     *
     * @return apparmorEnabled
     */
    @javax.annotation.Nullable
    public Boolean getApparmorEnabled() {
        return apparmorEnabled;
    }

    public void setApparmorEnabled(Boolean apparmorEnabled) {
        this.apparmorEnabled = apparmorEnabled;
    }

    public SecurityInfo capabilities(String capabilities) {
        this.capabilities = capabilities;
        return this;
    }

    /**
     * Get capabilities
     *
     * @return capabilities
     */
    @javax.annotation.Nullable
    public String getCapabilities() {
        return capabilities;
    }

    public void setCapabilities(String capabilities) {
        this.capabilities = capabilities;
    }

    public SecurityInfo rootless(Boolean rootless) {
        this.rootless = rootless;
        return this;
    }

    /**
     * Get rootless
     *
     * @return rootless
     */
    @javax.annotation.Nullable
    public Boolean getRootless() {
        return rootless;
    }

    public void setRootless(Boolean rootless) {
        this.rootless = rootless;
    }

    public SecurityInfo seccompEnabled(Boolean seccompEnabled) {
        this.seccompEnabled = seccompEnabled;
        return this;
    }

    /**
     * Get seccompEnabled
     *
     * @return seccompEnabled
     */
    @javax.annotation.Nullable
    public Boolean getSeccompEnabled() {
        return seccompEnabled;
    }

    public void setSeccompEnabled(Boolean seccompEnabled) {
        this.seccompEnabled = seccompEnabled;
    }

    public SecurityInfo seccompProfilePath(String seccompProfilePath) {
        this.seccompProfilePath = seccompProfilePath;
        return this;
    }

    /**
     * Get seccompProfilePath
     *
     * @return seccompProfilePath
     */
    @javax.annotation.Nullable
    public String getSeccompProfilePath() {
        return seccompProfilePath;
    }

    public void setSeccompProfilePath(String seccompProfilePath) {
        this.seccompProfilePath = seccompProfilePath;
    }

    public SecurityInfo selinuxEnabled(Boolean selinuxEnabled) {
        this.selinuxEnabled = selinuxEnabled;
        return this;
    }

    /**
     * Get selinuxEnabled
     *
     * @return selinuxEnabled
     */
    @javax.annotation.Nullable
    public Boolean getSelinuxEnabled() {
        return selinuxEnabled;
    }

    public void setSelinuxEnabled(Boolean selinuxEnabled) {
        this.selinuxEnabled = selinuxEnabled;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        SecurityInfo securityInfo = (SecurityInfo) o;
        return Objects.equals(this.apparmorEnabled, securityInfo.apparmorEnabled)
                && Objects.equals(this.capabilities, securityInfo.capabilities)
                && Objects.equals(this.rootless, securityInfo.rootless)
                && Objects.equals(this.seccompEnabled, securityInfo.seccompEnabled)
                && Objects.equals(this.seccompProfilePath, securityInfo.seccompProfilePath)
                && Objects.equals(this.selinuxEnabled, securityInfo.selinuxEnabled);
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                apparmorEnabled,
                capabilities,
                rootless,
                seccompEnabled,
                seccompProfilePath,
                selinuxEnabled);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SecurityInfo {\n");
        sb.append("    apparmorEnabled: ").append(toIndentedString(apparmorEnabled)).append("\n");
        sb.append("    capabilities: ").append(toIndentedString(capabilities)).append("\n");
        sb.append("    rootless: ").append(toIndentedString(rootless)).append("\n");
        sb.append("    seccompEnabled: ").append(toIndentedString(seccompEnabled)).append("\n");
        sb.append("    seccompProfilePath: ")
                .append(toIndentedString(seccompProfilePath))
                .append("\n");
        sb.append("    selinuxEnabled: ").append(toIndentedString(selinuxEnabled)).append("\n");
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
        openapiFields.add("apparmorEnabled");
        openapiFields.add("capabilities");
        openapiFields.add("rootless");
        openapiFields.add("seccompEnabled");
        openapiFields.add("seccompProfilePath");
        openapiFields.add("selinuxEnabled");

        // a set of required properties/fields (JSON key names)
        openapiRequiredFields = new HashSet<String>();
    }

    /**
     * Validates the JSON Element and throws an exception if issues found
     *
     * @param jsonElement JSON Element
     * @throws IOException if the JSON Element is invalid with respect to SecurityInfo
     */
    public static void validateJsonElement(JsonElement jsonElement) throws IOException {
        if (jsonElement == null) {
            if (!SecurityInfo.openapiRequiredFields
                    .isEmpty()) { // has required fields but JSON element is null
                throw new IllegalArgumentException(
                        String.format(
                                "The required field(s) %s in SecurityInfo is not found in the empty"
                                        + " JSON string",
                                SecurityInfo.openapiRequiredFields.toString()));
            }
        }

        Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
        // check to see if the JSON string contains additional fields
        for (Map.Entry<String, JsonElement> entry : entries) {
            if (!SecurityInfo.openapiFields.contains(entry.getKey())) {
                throw new IllegalArgumentException(
                        String.format(
                                "The field `%s` in the JSON string is not defined in the"
                                        + " `SecurityInfo` properties. JSON: %s",
                                entry.getKey(), jsonElement.toString()));
            }
        }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
        if ((jsonObj.get("capabilities") != null && !jsonObj.get("capabilities").isJsonNull())
                && !jsonObj.get("capabilities").isJsonPrimitive()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `capabilities` to be a primitive type in the JSON"
                                    + " string but got `%s`",
                            jsonObj.get("capabilities").toString()));
        }
        if ((jsonObj.get("seccompProfilePath") != null
                        && !jsonObj.get("seccompProfilePath").isJsonNull())
                && !jsonObj.get("seccompProfilePath").isJsonPrimitive()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `seccompProfilePath` to be a primitive type in the"
                                    + " JSON string but got `%s`",
                            jsonObj.get("seccompProfilePath").toString()));
        }
    }

    public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
        @SuppressWarnings("unchecked")
        @Override
        public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
            if (!SecurityInfo.class.isAssignableFrom(type.getRawType())) {
                return null; // this class only serializes 'SecurityInfo' and its subtypes
            }
            final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
            final TypeAdapter<SecurityInfo> thisAdapter =
                    gson.getDelegateAdapter(this, TypeToken.get(SecurityInfo.class));

            return (TypeAdapter<T>)
                    new TypeAdapter<SecurityInfo>() {
                        @Override
                        public void write(JsonWriter out, SecurityInfo value) throws IOException {
                            JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
                            elementAdapter.write(out, obj);
                        }

                        @Override
                        public SecurityInfo read(JsonReader in) throws IOException {
                            JsonElement jsonElement = elementAdapter.read(in);
                            validateJsonElement(jsonElement);
                            return thisAdapter.fromJsonTree(jsonElement);
                        }
                    }.nullSafe();
        }
    }

    /**
     * Create an instance of SecurityInfo given an JSON string
     *
     * @param jsonString JSON string
     * @return An instance of SecurityInfo
     * @throws IOException if the JSON string is invalid with respect to SecurityInfo
     */
    public static SecurityInfo fromJson(String jsonString) throws IOException {
        return JSON.getGson().fromJson(jsonString, SecurityInfo.class);
    }

    /**
     * Convert an instance of SecurityInfo to an JSON string
     *
     * @return JSON string
     */
    public String toJson() {
        return JSON.getGson().toJson(this);
    }
}
