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
 * LinuxIntelRdt has container runtime resource constraints for Intel RDT CAT and MBA features and
 * flags enabling Intel RDT CMT and MBM features. Intel RDT features are available in Linux 4.14 and
 * newer kernel versions.
 */
@javax.annotation.Generated(
        value = "org.openapitools.codegen.languages.JavaClientCodegen",
        date = "2024-11-26T18:24:48.119248545+07:00[Asia/Barnaul]",
        comments = "Generator version: 7.7.0")
public class LinuxIntelRdt {
    public static final String SERIALIZED_NAME_CLOS_I_D = "closID";

    @SerializedName(SERIALIZED_NAME_CLOS_I_D)
    private String closID;

    public static final String SERIALIZED_NAME_ENABLE_C_M_T = "enableCMT";

    @SerializedName(SERIALIZED_NAME_ENABLE_C_M_T)
    private Boolean enableCMT;

    public static final String SERIALIZED_NAME_ENABLE_M_B_M = "enableMBM";

    @SerializedName(SERIALIZED_NAME_ENABLE_M_B_M)
    private Boolean enableMBM;

    public static final String SERIALIZED_NAME_L3_CACHE_SCHEMA = "l3CacheSchema";

    @SerializedName(SERIALIZED_NAME_L3_CACHE_SCHEMA)
    private String l3CacheSchema;

    public static final String SERIALIZED_NAME_MEM_BW_SCHEMA = "memBwSchema";

    @SerializedName(SERIALIZED_NAME_MEM_BW_SCHEMA)
    private String memBwSchema;

    public LinuxIntelRdt() {}

    public LinuxIntelRdt closID(String closID) {
        this.closID = closID;
        return this;
    }

    /**
     * The identity for RDT Class of Service
     *
     * @return closID
     */
    @javax.annotation.Nullable
    public String getClosID() {
        return closID;
    }

    public void setClosID(String closID) {
        this.closID = closID;
    }

    public LinuxIntelRdt enableCMT(Boolean enableCMT) {
        this.enableCMT = enableCMT;
        return this;
    }

    /**
     * EnableCMT is the flag to indicate if the Intel RDT CMT is enabled. CMT (Cache Monitoring
     * Technology) supports monitoring of the last-level cache (LLC) occupancy for the container.
     *
     * @return enableCMT
     */
    @javax.annotation.Nullable
    public Boolean getEnableCMT() {
        return enableCMT;
    }

    public void setEnableCMT(Boolean enableCMT) {
        this.enableCMT = enableCMT;
    }

    public LinuxIntelRdt enableMBM(Boolean enableMBM) {
        this.enableMBM = enableMBM;
        return this;
    }

    /**
     * EnableMBM is the flag to indicate if the Intel RDT MBM is enabled. MBM (Memory Bandwidth
     * Monitoring) supports monitoring of total and local memory bandwidth for the container.
     *
     * @return enableMBM
     */
    @javax.annotation.Nullable
    public Boolean getEnableMBM() {
        return enableMBM;
    }

    public void setEnableMBM(Boolean enableMBM) {
        this.enableMBM = enableMBM;
    }

    public LinuxIntelRdt l3CacheSchema(String l3CacheSchema) {
        this.l3CacheSchema = l3CacheSchema;
        return this;
    }

    /**
     * The schema for L3 cache id and capacity bitmask (CBM) Format:
     * \&quot;L3:&lt;cache_id0&gt;&#x3D;&lt;cbm0&gt;;&lt;cache_id1&gt;&#x3D;&lt;cbm1&gt;;...\&quot;
     *
     * @return l3CacheSchema
     */
    @javax.annotation.Nullable
    public String getL3CacheSchema() {
        return l3CacheSchema;
    }

    public void setL3CacheSchema(String l3CacheSchema) {
        this.l3CacheSchema = l3CacheSchema;
    }

    public LinuxIntelRdt memBwSchema(String memBwSchema) {
        this.memBwSchema = memBwSchema;
        return this;
    }

    /**
     * The schema of memory bandwidth per L3 cache id Format:
     * \&quot;MB:&lt;cache_id0&gt;&#x3D;bandwidth0;&lt;cache_id1&gt;&#x3D;bandwidth1;...\&quot; The
     * unit of memory bandwidth is specified in \&quot;percentages\&quot; by default, and in
     * \&quot;MBps\&quot; if MBA Software Controller is enabled.
     *
     * @return memBwSchema
     */
    @javax.annotation.Nullable
    public String getMemBwSchema() {
        return memBwSchema;
    }

    public void setMemBwSchema(String memBwSchema) {
        this.memBwSchema = memBwSchema;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        LinuxIntelRdt linuxIntelRdt = (LinuxIntelRdt) o;
        return Objects.equals(this.closID, linuxIntelRdt.closID)
                && Objects.equals(this.enableCMT, linuxIntelRdt.enableCMT)
                && Objects.equals(this.enableMBM, linuxIntelRdt.enableMBM)
                && Objects.equals(this.l3CacheSchema, linuxIntelRdt.l3CacheSchema)
                && Objects.equals(this.memBwSchema, linuxIntelRdt.memBwSchema);
    }

    @Override
    public int hashCode() {
        return Objects.hash(closID, enableCMT, enableMBM, l3CacheSchema, memBwSchema);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class LinuxIntelRdt {\n");
        sb.append("    closID: ").append(toIndentedString(closID)).append("\n");
        sb.append("    enableCMT: ").append(toIndentedString(enableCMT)).append("\n");
        sb.append("    enableMBM: ").append(toIndentedString(enableMBM)).append("\n");
        sb.append("    l3CacheSchema: ").append(toIndentedString(l3CacheSchema)).append("\n");
        sb.append("    memBwSchema: ").append(toIndentedString(memBwSchema)).append("\n");
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
        openapiFields.add("closID");
        openapiFields.add("enableCMT");
        openapiFields.add("enableMBM");
        openapiFields.add("l3CacheSchema");
        openapiFields.add("memBwSchema");

        // a set of required properties/fields (JSON key names)
        openapiRequiredFields = new HashSet<String>();
    }

    /**
     * Validates the JSON Element and throws an exception if issues found
     *
     * @param jsonElement JSON Element
     * @throws IOException if the JSON Element is invalid with respect to LinuxIntelRdt
     */
    public static void validateJsonElement(JsonElement jsonElement) throws IOException {
        if (jsonElement == null) {
            if (!LinuxIntelRdt.openapiRequiredFields
                    .isEmpty()) { // has required fields but JSON element is null
                throw new IllegalArgumentException(
                        String.format(
                                "The required field(s) %s in LinuxIntelRdt is not found in the"
                                        + " empty JSON string",
                                LinuxIntelRdt.openapiRequiredFields.toString()));
            }
        }

        Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
        // check to see if the JSON string contains additional fields
        for (Map.Entry<String, JsonElement> entry : entries) {
            if (!LinuxIntelRdt.openapiFields.contains(entry.getKey())) {
                throw new IllegalArgumentException(
                        String.format(
                                "The field `%s` in the JSON string is not defined in the"
                                        + " `LinuxIntelRdt` properties. JSON: %s",
                                entry.getKey(), jsonElement.toString()));
            }
        }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
        if ((jsonObj.get("closID") != null && !jsonObj.get("closID").isJsonNull())
                && !jsonObj.get("closID").isJsonPrimitive()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `closID` to be a primitive type in the JSON string"
                                    + " but got `%s`",
                            jsonObj.get("closID").toString()));
        }
        if ((jsonObj.get("l3CacheSchema") != null && !jsonObj.get("l3CacheSchema").isJsonNull())
                && !jsonObj.get("l3CacheSchema").isJsonPrimitive()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `l3CacheSchema` to be a primitive type in the JSON"
                                    + " string but got `%s`",
                            jsonObj.get("l3CacheSchema").toString()));
        }
        if ((jsonObj.get("memBwSchema") != null && !jsonObj.get("memBwSchema").isJsonNull())
                && !jsonObj.get("memBwSchema").isJsonPrimitive()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `memBwSchema` to be a primitive type in the JSON"
                                    + " string but got `%s`",
                            jsonObj.get("memBwSchema").toString()));
        }
    }

    public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
        @SuppressWarnings("unchecked")
        @Override
        public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
            if (!LinuxIntelRdt.class.isAssignableFrom(type.getRawType())) {
                return null; // this class only serializes 'LinuxIntelRdt' and its subtypes
            }
            final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
            final TypeAdapter<LinuxIntelRdt> thisAdapter =
                    gson.getDelegateAdapter(this, TypeToken.get(LinuxIntelRdt.class));

            return (TypeAdapter<T>)
                    new TypeAdapter<LinuxIntelRdt>() {
                        @Override
                        public void write(JsonWriter out, LinuxIntelRdt value) throws IOException {
                            JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
                            elementAdapter.write(out, obj);
                        }

                        @Override
                        public LinuxIntelRdt read(JsonReader in) throws IOException {
                            JsonElement jsonElement = elementAdapter.read(in);
                            validateJsonElement(jsonElement);
                            return thisAdapter.fromJsonTree(jsonElement);
                        }
                    }.nullSafe();
        }
    }

    /**
     * Create an instance of LinuxIntelRdt given an JSON string
     *
     * @param jsonString JSON string
     * @return An instance of LinuxIntelRdt
     * @throws IOException if the JSON string is invalid with respect to LinuxIntelRdt
     */
    public static LinuxIntelRdt fromJson(String jsonString) throws IOException {
        return JSON.getGson().fromJson(jsonString, LinuxIntelRdt.class);
    }

    /**
     * Convert an instance of LinuxIntelRdt to an JSON string
     *
     * @return JSON string
     */
    public String toJson() {
        return JSON.getGson().toJson(this);
    }
}
