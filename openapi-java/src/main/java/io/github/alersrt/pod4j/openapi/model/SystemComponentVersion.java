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

/** SystemComponentVersion is the type used by pkg/domain/entities */
@javax.annotation.Generated(
        value = "org.openapitools.codegen.languages.JavaClientCodegen",
        date = "2024-11-26T18:24:48.119248545+07:00[Asia/Barnaul]",
        comments = "Generator version: 7.7.0")
public class SystemComponentVersion {
    public static final String SERIALIZED_NAME_API_VERSION = "ApiVersion";

    @SerializedName(SERIALIZED_NAME_API_VERSION)
    private String apiVersion;

    public static final String SERIALIZED_NAME_ARCH = "Arch";

    @SerializedName(SERIALIZED_NAME_ARCH)
    private String arch;

    public static final String SERIALIZED_NAME_BUILD_TIME = "BuildTime";

    @SerializedName(SERIALIZED_NAME_BUILD_TIME)
    private String buildTime;

    public static final String SERIALIZED_NAME_COMPONENTS = "Components";

    @SerializedName(SERIALIZED_NAME_COMPONENTS)
    private List<ComponentVersion> components = new ArrayList<>();

    public static final String SERIALIZED_NAME_EXPERIMENTAL = "Experimental";

    @SerializedName(SERIALIZED_NAME_EXPERIMENTAL)
    private Boolean experimental;

    public static final String SERIALIZED_NAME_GIT_COMMIT = "GitCommit";

    @SerializedName(SERIALIZED_NAME_GIT_COMMIT)
    private String gitCommit;

    public static final String SERIALIZED_NAME_GO_VERSION = "GoVersion";

    @SerializedName(SERIALIZED_NAME_GO_VERSION)
    private String goVersion;

    public static final String SERIALIZED_NAME_KERNEL_VERSION = "KernelVersion";

    @SerializedName(SERIALIZED_NAME_KERNEL_VERSION)
    private String kernelVersion;

    public static final String SERIALIZED_NAME_MIN_A_P_I_VERSION = "MinAPIVersion";

    @SerializedName(SERIALIZED_NAME_MIN_A_P_I_VERSION)
    private String minAPIVersion;

    public static final String SERIALIZED_NAME_OS = "Os";

    @SerializedName(SERIALIZED_NAME_OS)
    private String os;

    public static final String SERIALIZED_NAME_PLATFORM = "Platform";

    @SerializedName(SERIALIZED_NAME_PLATFORM)
    private SystemComponentVersionPlatform platform;

    public static final String SERIALIZED_NAME_VERSION = "Version";

    @SerializedName(SERIALIZED_NAME_VERSION)
    private String version;

    public SystemComponentVersion() {}

    public SystemComponentVersion apiVersion(String apiVersion) {
        this.apiVersion = apiVersion;
        return this;
    }

    /**
     * Get apiVersion
     *
     * @return apiVersion
     */
    @javax.annotation.Nullable
    public String getApiVersion() {
        return apiVersion;
    }

    public void setApiVersion(String apiVersion) {
        this.apiVersion = apiVersion;
    }

    public SystemComponentVersion arch(String arch) {
        this.arch = arch;
        return this;
    }

    /**
     * Get arch
     *
     * @return arch
     */
    @javax.annotation.Nullable
    public String getArch() {
        return arch;
    }

    public void setArch(String arch) {
        this.arch = arch;
    }

    public SystemComponentVersion buildTime(String buildTime) {
        this.buildTime = buildTime;
        return this;
    }

    /**
     * Get buildTime
     *
     * @return buildTime
     */
    @javax.annotation.Nullable
    public String getBuildTime() {
        return buildTime;
    }

    public void setBuildTime(String buildTime) {
        this.buildTime = buildTime;
    }

    public SystemComponentVersion components(List<ComponentVersion> components) {
        this.components = components;
        return this;
    }

    public SystemComponentVersion addComponentsItem(ComponentVersion componentsItem) {
        if (this.components == null) {
            this.components = new ArrayList<>();
        }
        this.components.add(componentsItem);
        return this;
    }

    /**
     * Get components
     *
     * @return components
     */
    @javax.annotation.Nullable
    public List<ComponentVersion> getComponents() {
        return components;
    }

    public void setComponents(List<ComponentVersion> components) {
        this.components = components;
    }

    public SystemComponentVersion experimental(Boolean experimental) {
        this.experimental = experimental;
        return this;
    }

    /**
     * Get experimental
     *
     * @return experimental
     */
    @javax.annotation.Nullable
    public Boolean getExperimental() {
        return experimental;
    }

    public void setExperimental(Boolean experimental) {
        this.experimental = experimental;
    }

    public SystemComponentVersion gitCommit(String gitCommit) {
        this.gitCommit = gitCommit;
        return this;
    }

    /**
     * Get gitCommit
     *
     * @return gitCommit
     */
    @javax.annotation.Nullable
    public String getGitCommit() {
        return gitCommit;
    }

    public void setGitCommit(String gitCommit) {
        this.gitCommit = gitCommit;
    }

    public SystemComponentVersion goVersion(String goVersion) {
        this.goVersion = goVersion;
        return this;
    }

    /**
     * Get goVersion
     *
     * @return goVersion
     */
    @javax.annotation.Nullable
    public String getGoVersion() {
        return goVersion;
    }

    public void setGoVersion(String goVersion) {
        this.goVersion = goVersion;
    }

    public SystemComponentVersion kernelVersion(String kernelVersion) {
        this.kernelVersion = kernelVersion;
        return this;
    }

    /**
     * Get kernelVersion
     *
     * @return kernelVersion
     */
    @javax.annotation.Nullable
    public String getKernelVersion() {
        return kernelVersion;
    }

    public void setKernelVersion(String kernelVersion) {
        this.kernelVersion = kernelVersion;
    }

    public SystemComponentVersion minAPIVersion(String minAPIVersion) {
        this.minAPIVersion = minAPIVersion;
        return this;
    }

    /**
     * Get minAPIVersion
     *
     * @return minAPIVersion
     */
    @javax.annotation.Nullable
    public String getMinAPIVersion() {
        return minAPIVersion;
    }

    public void setMinAPIVersion(String minAPIVersion) {
        this.minAPIVersion = minAPIVersion;
    }

    public SystemComponentVersion os(String os) {
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

    public SystemComponentVersion platform(SystemComponentVersionPlatform platform) {
        this.platform = platform;
        return this;
    }

    /**
     * Get platform
     *
     * @return platform
     */
    @javax.annotation.Nullable
    public SystemComponentVersionPlatform getPlatform() {
        return platform;
    }

    public void setPlatform(SystemComponentVersionPlatform platform) {
        this.platform = platform;
    }

    public SystemComponentVersion version(String version) {
        this.version = version;
        return this;
    }

    /**
     * Get version
     *
     * @return version
     */
    @javax.annotation.Nullable
    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        SystemComponentVersion systemComponentVersion = (SystemComponentVersion) o;
        return Objects.equals(this.apiVersion, systemComponentVersion.apiVersion)
                && Objects.equals(this.arch, systemComponentVersion.arch)
                && Objects.equals(this.buildTime, systemComponentVersion.buildTime)
                && Objects.equals(this.components, systemComponentVersion.components)
                && Objects.equals(this.experimental, systemComponentVersion.experimental)
                && Objects.equals(this.gitCommit, systemComponentVersion.gitCommit)
                && Objects.equals(this.goVersion, systemComponentVersion.goVersion)
                && Objects.equals(this.kernelVersion, systemComponentVersion.kernelVersion)
                && Objects.equals(this.minAPIVersion, systemComponentVersion.minAPIVersion)
                && Objects.equals(this.os, systemComponentVersion.os)
                && Objects.equals(this.platform, systemComponentVersion.platform)
                && Objects.equals(this.version, systemComponentVersion.version);
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                apiVersion,
                arch,
                buildTime,
                components,
                experimental,
                gitCommit,
                goVersion,
                kernelVersion,
                minAPIVersion,
                os,
                platform,
                version);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SystemComponentVersion {\n");
        sb.append("    apiVersion: ").append(toIndentedString(apiVersion)).append("\n");
        sb.append("    arch: ").append(toIndentedString(arch)).append("\n");
        sb.append("    buildTime: ").append(toIndentedString(buildTime)).append("\n");
        sb.append("    components: ").append(toIndentedString(components)).append("\n");
        sb.append("    experimental: ").append(toIndentedString(experimental)).append("\n");
        sb.append("    gitCommit: ").append(toIndentedString(gitCommit)).append("\n");
        sb.append("    goVersion: ").append(toIndentedString(goVersion)).append("\n");
        sb.append("    kernelVersion: ").append(toIndentedString(kernelVersion)).append("\n");
        sb.append("    minAPIVersion: ").append(toIndentedString(minAPIVersion)).append("\n");
        sb.append("    os: ").append(toIndentedString(os)).append("\n");
        sb.append("    platform: ").append(toIndentedString(platform)).append("\n");
        sb.append("    version: ").append(toIndentedString(version)).append("\n");
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
        openapiFields.add("ApiVersion");
        openapiFields.add("Arch");
        openapiFields.add("BuildTime");
        openapiFields.add("Components");
        openapiFields.add("Experimental");
        openapiFields.add("GitCommit");
        openapiFields.add("GoVersion");
        openapiFields.add("KernelVersion");
        openapiFields.add("MinAPIVersion");
        openapiFields.add("Os");
        openapiFields.add("Platform");
        openapiFields.add("Version");

        // a set of required properties/fields (JSON key names)
        openapiRequiredFields = new HashSet<String>();
    }

    /**
     * Validates the JSON Element and throws an exception if issues found
     *
     * @param jsonElement JSON Element
     * @throws IOException if the JSON Element is invalid with respect to SystemComponentVersion
     */
    public static void validateJsonElement(JsonElement jsonElement) throws IOException {
        if (jsonElement == null) {
            if (!SystemComponentVersion.openapiRequiredFields
                    .isEmpty()) { // has required fields but JSON element is null
                throw new IllegalArgumentException(
                        String.format(
                                "The required field(s) %s in SystemComponentVersion is not found in"
                                        + " the empty JSON string",
                                SystemComponentVersion.openapiRequiredFields.toString()));
            }
        }

        Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
        // check to see if the JSON string contains additional fields
        for (Map.Entry<String, JsonElement> entry : entries) {
            if (!SystemComponentVersion.openapiFields.contains(entry.getKey())) {
                throw new IllegalArgumentException(
                        String.format(
                                "The field `%s` in the JSON string is not defined in the"
                                        + " `SystemComponentVersion` properties. JSON: %s",
                                entry.getKey(), jsonElement.toString()));
            }
        }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
        if ((jsonObj.get("ApiVersion") != null && !jsonObj.get("ApiVersion").isJsonNull())
                && !jsonObj.get("ApiVersion").isJsonPrimitive()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `ApiVersion` to be a primitive type in the JSON"
                                    + " string but got `%s`",
                            jsonObj.get("ApiVersion").toString()));
        }
        if ((jsonObj.get("Arch") != null && !jsonObj.get("Arch").isJsonNull())
                && !jsonObj.get("Arch").isJsonPrimitive()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `Arch` to be a primitive type in the JSON string"
                                    + " but got `%s`",
                            jsonObj.get("Arch").toString()));
        }
        if ((jsonObj.get("BuildTime") != null && !jsonObj.get("BuildTime").isJsonNull())
                && !jsonObj.get("BuildTime").isJsonPrimitive()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `BuildTime` to be a primitive type in the JSON"
                                    + " string but got `%s`",
                            jsonObj.get("BuildTime").toString()));
        }
        if (jsonObj.get("Components") != null && !jsonObj.get("Components").isJsonNull()) {
            JsonArray jsonArraycomponents = jsonObj.getAsJsonArray("Components");
            if (jsonArraycomponents != null) {
                // ensure the json data is an array
                if (!jsonObj.get("Components").isJsonArray()) {
                    throw new IllegalArgumentException(
                            String.format(
                                    "Expected the field `Components` to be an array in the JSON"
                                            + " string but got `%s`",
                                    jsonObj.get("Components").toString()));
                }

                // validate the optional field `Components` (array)
                for (int i = 0; i < jsonArraycomponents.size(); i++) {
                    ComponentVersion.validateJsonElement(jsonArraycomponents.get(i));
                }
                ;
            }
        }
        if ((jsonObj.get("GitCommit") != null && !jsonObj.get("GitCommit").isJsonNull())
                && !jsonObj.get("GitCommit").isJsonPrimitive()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `GitCommit` to be a primitive type in the JSON"
                                    + " string but got `%s`",
                            jsonObj.get("GitCommit").toString()));
        }
        if ((jsonObj.get("GoVersion") != null && !jsonObj.get("GoVersion").isJsonNull())
                && !jsonObj.get("GoVersion").isJsonPrimitive()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `GoVersion` to be a primitive type in the JSON"
                                    + " string but got `%s`",
                            jsonObj.get("GoVersion").toString()));
        }
        if ((jsonObj.get("KernelVersion") != null && !jsonObj.get("KernelVersion").isJsonNull())
                && !jsonObj.get("KernelVersion").isJsonPrimitive()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `KernelVersion` to be a primitive type in the JSON"
                                    + " string but got `%s`",
                            jsonObj.get("KernelVersion").toString()));
        }
        if ((jsonObj.get("MinAPIVersion") != null && !jsonObj.get("MinAPIVersion").isJsonNull())
                && !jsonObj.get("MinAPIVersion").isJsonPrimitive()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `MinAPIVersion` to be a primitive type in the JSON"
                                    + " string but got `%s`",
                            jsonObj.get("MinAPIVersion").toString()));
        }
        if ((jsonObj.get("Os") != null && !jsonObj.get("Os").isJsonNull())
                && !jsonObj.get("Os").isJsonPrimitive()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `Os` to be a primitive type in the JSON string but"
                                    + " got `%s`",
                            jsonObj.get("Os").toString()));
        }
        // validate the optional field `Platform`
        if (jsonObj.get("Platform") != null && !jsonObj.get("Platform").isJsonNull()) {
            SystemComponentVersionPlatform.validateJsonElement(jsonObj.get("Platform"));
        }
        if ((jsonObj.get("Version") != null && !jsonObj.get("Version").isJsonNull())
                && !jsonObj.get("Version").isJsonPrimitive()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `Version` to be a primitive type in the JSON string"
                                    + " but got `%s`",
                            jsonObj.get("Version").toString()));
        }
    }

    public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
        @SuppressWarnings("unchecked")
        @Override
        public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
            if (!SystemComponentVersion.class.isAssignableFrom(type.getRawType())) {
                return null; // this class only serializes 'SystemComponentVersion' and its subtypes
            }
            final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
            final TypeAdapter<SystemComponentVersion> thisAdapter =
                    gson.getDelegateAdapter(this, TypeToken.get(SystemComponentVersion.class));

            return (TypeAdapter<T>)
                    new TypeAdapter<SystemComponentVersion>() {
                        @Override
                        public void write(JsonWriter out, SystemComponentVersion value)
                                throws IOException {
                            JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
                            elementAdapter.write(out, obj);
                        }

                        @Override
                        public SystemComponentVersion read(JsonReader in) throws IOException {
                            JsonElement jsonElement = elementAdapter.read(in);
                            validateJsonElement(jsonElement);
                            return thisAdapter.fromJsonTree(jsonElement);
                        }
                    }.nullSafe();
        }
    }

    /**
     * Create an instance of SystemComponentVersion given an JSON string
     *
     * @param jsonString JSON string
     * @return An instance of SystemComponentVersion
     * @throws IOException if the JSON string is invalid with respect to SystemComponentVersion
     */
    public static SystemComponentVersion fromJson(String jsonString) throws IOException {
        return JSON.getGson().fromJson(jsonString, SystemComponentVersion.class);
    }

    /**
     * Convert an instance of SystemComponentVersion to an JSON string
     *
     * @return JSON string
     */
    public String toJson() {
        return JSON.getGson().toJson(this);
    }
}
