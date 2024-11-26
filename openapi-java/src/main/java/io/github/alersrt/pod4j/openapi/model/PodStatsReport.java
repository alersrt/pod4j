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

/** PodStatsReport */
@javax.annotation.Generated(
        value = "org.openapitools.codegen.languages.JavaClientCodegen",
        date = "2024-11-26T18:05:51.842033247+07:00[Asia/Barnaul]",
        comments = "Generator version: 7.7.0")
public class PodStatsReport {
    public static final String SERIALIZED_NAME_BLOCK_I_O = "BlockIO";

    @SerializedName(SERIALIZED_NAME_BLOCK_I_O)
    private String blockIO;

    public static final String SERIALIZED_NAME_C_I_D = "CID";

    @SerializedName(SERIALIZED_NAME_C_I_D)
    private String CID;

    public static final String SERIALIZED_NAME_C_P_U = "CPU";

    @SerializedName(SERIALIZED_NAME_C_P_U)
    private String CPU;

    public static final String SERIALIZED_NAME_MEM = "Mem";

    @SerializedName(SERIALIZED_NAME_MEM)
    private String mem;

    public static final String SERIALIZED_NAME_MEM_USAGE = "MemUsage";

    @SerializedName(SERIALIZED_NAME_MEM_USAGE)
    private String memUsage;

    public static final String SERIALIZED_NAME_MEM_USAGE_BYTES = "MemUsageBytes";

    @SerializedName(SERIALIZED_NAME_MEM_USAGE_BYTES)
    private String memUsageBytes;

    public static final String SERIALIZED_NAME_NAME = "Name";

    @SerializedName(SERIALIZED_NAME_NAME)
    private String name;

    public static final String SERIALIZED_NAME_NET_I_O = "NetIO";

    @SerializedName(SERIALIZED_NAME_NET_I_O)
    private String netIO;

    public static final String SERIALIZED_NAME_P_I_D_S = "PIDS";

    @SerializedName(SERIALIZED_NAME_P_I_D_S)
    private String PIDS;

    public static final String SERIALIZED_NAME_POD = "Pod";

    @SerializedName(SERIALIZED_NAME_POD)
    private String pod;

    public PodStatsReport() {}

    public PodStatsReport blockIO(String blockIO) {
        this.blockIO = blockIO;
        return this;
    }

    /**
     * Humanized disk usage read + write
     *
     * @return blockIO
     */
    @javax.annotation.Nullable
    public String getBlockIO() {
        return blockIO;
    }

    public void setBlockIO(String blockIO) {
        this.blockIO = blockIO;
    }

    public PodStatsReport CID(String CID) {
        this.CID = CID;
        return this;
    }

    /**
     * Container ID
     *
     * @return CID
     */
    @javax.annotation.Nullable
    public String getCID() {
        return CID;
    }

    public void setCID(String CID) {
        this.CID = CID;
    }

    public PodStatsReport CPU(String CPU) {
        this.CPU = CPU;
        return this;
    }

    /**
     * Percentage of CPU utilized by pod
     *
     * @return CPU
     */
    @javax.annotation.Nullable
    public String getCPU() {
        return CPU;
    }

    public void setCPU(String CPU) {
        this.CPU = CPU;
    }

    public PodStatsReport mem(String mem) {
        this.mem = mem;
        return this;
    }

    /**
     * Percentage of Memory utilized by pod
     *
     * @return mem
     */
    @javax.annotation.Nullable
    public String getMem() {
        return mem;
    }

    public void setMem(String mem) {
        this.mem = mem;
    }

    public PodStatsReport memUsage(String memUsage) {
        this.memUsage = memUsage;
        return this;
    }

    /**
     * Humanized Memory usage and maximum
     *
     * @return memUsage
     */
    @javax.annotation.Nullable
    public String getMemUsage() {
        return memUsage;
    }

    public void setMemUsage(String memUsage) {
        this.memUsage = memUsage;
    }

    public PodStatsReport memUsageBytes(String memUsageBytes) {
        this.memUsageBytes = memUsageBytes;
        return this;
    }

    /**
     * Memory usage and maximum in bytes
     *
     * @return memUsageBytes
     */
    @javax.annotation.Nullable
    public String getMemUsageBytes() {
        return memUsageBytes;
    }

    public void setMemUsageBytes(String memUsageBytes) {
        this.memUsageBytes = memUsageBytes;
    }

    public PodStatsReport name(String name) {
        this.name = name;
        return this;
    }

    /**
     * Pod Name
     *
     * @return name
     */
    @javax.annotation.Nullable
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public PodStatsReport netIO(String netIO) {
        this.netIO = netIO;
        return this;
    }

    /**
     * Network usage inbound + outbound
     *
     * @return netIO
     */
    @javax.annotation.Nullable
    public String getNetIO() {
        return netIO;
    }

    public void setNetIO(String netIO) {
        this.netIO = netIO;
    }

    public PodStatsReport PIDS(String PIDS) {
        this.PIDS = PIDS;
        return this;
    }

    /**
     * Container PID
     *
     * @return PIDS
     */
    @javax.annotation.Nullable
    public String getPIDS() {
        return PIDS;
    }

    public void setPIDS(String PIDS) {
        this.PIDS = PIDS;
    }

    public PodStatsReport pod(String pod) {
        this.pod = pod;
        return this;
    }

    /**
     * Pod ID
     *
     * @return pod
     */
    @javax.annotation.Nullable
    public String getPod() {
        return pod;
    }

    public void setPod(String pod) {
        this.pod = pod;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        PodStatsReport podStatsReport = (PodStatsReport) o;
        return Objects.equals(this.blockIO, podStatsReport.blockIO)
                && Objects.equals(this.CID, podStatsReport.CID)
                && Objects.equals(this.CPU, podStatsReport.CPU)
                && Objects.equals(this.mem, podStatsReport.mem)
                && Objects.equals(this.memUsage, podStatsReport.memUsage)
                && Objects.equals(this.memUsageBytes, podStatsReport.memUsageBytes)
                && Objects.equals(this.name, podStatsReport.name)
                && Objects.equals(this.netIO, podStatsReport.netIO)
                && Objects.equals(this.PIDS, podStatsReport.PIDS)
                && Objects.equals(this.pod, podStatsReport.pod);
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                blockIO, CID, CPU, mem, memUsage, memUsageBytes, name, netIO, PIDS, pod);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PodStatsReport {\n");
        sb.append("    blockIO: ").append(toIndentedString(blockIO)).append("\n");
        sb.append("    CID: ").append(toIndentedString(CID)).append("\n");
        sb.append("    CPU: ").append(toIndentedString(CPU)).append("\n");
        sb.append("    mem: ").append(toIndentedString(mem)).append("\n");
        sb.append("    memUsage: ").append(toIndentedString(memUsage)).append("\n");
        sb.append("    memUsageBytes: ").append(toIndentedString(memUsageBytes)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    netIO: ").append(toIndentedString(netIO)).append("\n");
        sb.append("    PIDS: ").append(toIndentedString(PIDS)).append("\n");
        sb.append("    pod: ").append(toIndentedString(pod)).append("\n");
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
        openapiFields.add("BlockIO");
        openapiFields.add("CID");
        openapiFields.add("CPU");
        openapiFields.add("Mem");
        openapiFields.add("MemUsage");
        openapiFields.add("MemUsageBytes");
        openapiFields.add("Name");
        openapiFields.add("NetIO");
        openapiFields.add("PIDS");
        openapiFields.add("Pod");

        // a set of required properties/fields (JSON key names)
        openapiRequiredFields = new HashSet<String>();
    }

    /**
     * Validates the JSON Element and throws an exception if issues found
     *
     * @param jsonElement JSON Element
     * @throws IOException if the JSON Element is invalid with respect to PodStatsReport
     */
    public static void validateJsonElement(JsonElement jsonElement) throws IOException {
        if (jsonElement == null) {
            if (!PodStatsReport.openapiRequiredFields
                    .isEmpty()) { // has required fields but JSON element is null
                throw new IllegalArgumentException(
                        String.format(
                                "The required field(s) %s in PodStatsReport is not found in the"
                                        + " empty JSON string",
                                PodStatsReport.openapiRequiredFields.toString()));
            }
        }

        Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
        // check to see if the JSON string contains additional fields
        for (Map.Entry<String, JsonElement> entry : entries) {
            if (!PodStatsReport.openapiFields.contains(entry.getKey())) {
                throw new IllegalArgumentException(
                        String.format(
                                "The field `%s` in the JSON string is not defined in the"
                                        + " `PodStatsReport` properties. JSON: %s",
                                entry.getKey(), jsonElement.toString()));
            }
        }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
        if ((jsonObj.get("BlockIO") != null && !jsonObj.get("BlockIO").isJsonNull())
                && !jsonObj.get("BlockIO").isJsonPrimitive()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `BlockIO` to be a primitive type in the JSON string"
                                    + " but got `%s`",
                            jsonObj.get("BlockIO").toString()));
        }
        if ((jsonObj.get("CID") != null && !jsonObj.get("CID").isJsonNull())
                && !jsonObj.get("CID").isJsonPrimitive()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `CID` to be a primitive type in the JSON string but"
                                    + " got `%s`",
                            jsonObj.get("CID").toString()));
        }
        if ((jsonObj.get("CPU") != null && !jsonObj.get("CPU").isJsonNull())
                && !jsonObj.get("CPU").isJsonPrimitive()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `CPU` to be a primitive type in the JSON string but"
                                    + " got `%s`",
                            jsonObj.get("CPU").toString()));
        }
        if ((jsonObj.get("Mem") != null && !jsonObj.get("Mem").isJsonNull())
                && !jsonObj.get("Mem").isJsonPrimitive()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `Mem` to be a primitive type in the JSON string but"
                                    + " got `%s`",
                            jsonObj.get("Mem").toString()));
        }
        if ((jsonObj.get("MemUsage") != null && !jsonObj.get("MemUsage").isJsonNull())
                && !jsonObj.get("MemUsage").isJsonPrimitive()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `MemUsage` to be a primitive type in the JSON"
                                    + " string but got `%s`",
                            jsonObj.get("MemUsage").toString()));
        }
        if ((jsonObj.get("MemUsageBytes") != null && !jsonObj.get("MemUsageBytes").isJsonNull())
                && !jsonObj.get("MemUsageBytes").isJsonPrimitive()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `MemUsageBytes` to be a primitive type in the JSON"
                                    + " string but got `%s`",
                            jsonObj.get("MemUsageBytes").toString()));
        }
        if ((jsonObj.get("Name") != null && !jsonObj.get("Name").isJsonNull())
                && !jsonObj.get("Name").isJsonPrimitive()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `Name` to be a primitive type in the JSON string"
                                    + " but got `%s`",
                            jsonObj.get("Name").toString()));
        }
        if ((jsonObj.get("NetIO") != null && !jsonObj.get("NetIO").isJsonNull())
                && !jsonObj.get("NetIO").isJsonPrimitive()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `NetIO` to be a primitive type in the JSON string"
                                    + " but got `%s`",
                            jsonObj.get("NetIO").toString()));
        }
        if ((jsonObj.get("PIDS") != null && !jsonObj.get("PIDS").isJsonNull())
                && !jsonObj.get("PIDS").isJsonPrimitive()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `PIDS` to be a primitive type in the JSON string"
                                    + " but got `%s`",
                            jsonObj.get("PIDS").toString()));
        }
        if ((jsonObj.get("Pod") != null && !jsonObj.get("Pod").isJsonNull())
                && !jsonObj.get("Pod").isJsonPrimitive()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `Pod` to be a primitive type in the JSON string but"
                                    + " got `%s`",
                            jsonObj.get("Pod").toString()));
        }
    }

    public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
        @SuppressWarnings("unchecked")
        @Override
        public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
            if (!PodStatsReport.class.isAssignableFrom(type.getRawType())) {
                return null; // this class only serializes 'PodStatsReport' and its subtypes
            }
            final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
            final TypeAdapter<PodStatsReport> thisAdapter =
                    gson.getDelegateAdapter(this, TypeToken.get(PodStatsReport.class));

            return (TypeAdapter<T>)
                    new TypeAdapter<PodStatsReport>() {
                        @Override
                        public void write(JsonWriter out, PodStatsReport value) throws IOException {
                            JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
                            elementAdapter.write(out, obj);
                        }

                        @Override
                        public PodStatsReport read(JsonReader in) throws IOException {
                            JsonElement jsonElement = elementAdapter.read(in);
                            validateJsonElement(jsonElement);
                            return thisAdapter.fromJsonTree(jsonElement);
                        }
                    }.nullSafe();
        }
    }

    /**
     * Create an instance of PodStatsReport given an JSON string
     *
     * @param jsonString JSON string
     * @return An instance of PodStatsReport
     * @throws IOException if the JSON string is invalid with respect to PodStatsReport
     */
    public static PodStatsReport fromJson(String jsonString) throws IOException {
        return JSON.getGson().fromJson(jsonString, PodStatsReport.class);
    }

    /**
     * Convert an instance of PodStatsReport to an JSON string
     *
     * @return JSON string
     */
    public String toJson() {
        return JSON.getGson().toJson(this);
    }
}
