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

import java.util.Objects;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.github.alersrt.pod4j.openapi.model.LinuxBlockIO;
import io.github.alersrt.pod4j.openapi.model.LinuxCPU;
import io.github.alersrt.pod4j.openapi.model.LinuxDeviceCgroup;
import io.github.alersrt.pod4j.openapi.model.LinuxHugepageLimit;
import io.github.alersrt.pod4j.openapi.model.LinuxMemory;
import io.github.alersrt.pod4j.openapi.model.LinuxNetwork;
import io.github.alersrt.pod4j.openapi.model.LinuxPids;
import io.github.alersrt.pod4j.openapi.model.LinuxRdma;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonArray;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.reflect.TypeToken;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;

import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import io.github.alersrt.pod4j.openapi.JSON;

/**
 * LinuxResources has container runtime resource constraints
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-11-19T11:19:05.435500352+07:00[Asia/Barnaul]", comments = "Generator version: 7.7.0")
public class LinuxResources {
  public static final String SERIALIZED_NAME_BLOCK_I_O = "blockIO";
  @SerializedName(SERIALIZED_NAME_BLOCK_I_O)
  private LinuxBlockIO blockIO;

  public static final String SERIALIZED_NAME_CPU = "cpu";
  @SerializedName(SERIALIZED_NAME_CPU)
  private LinuxCPU cpu;

  public static final String SERIALIZED_NAME_DEVICES = "devices";
  @SerializedName(SERIALIZED_NAME_DEVICES)
  private List<LinuxDeviceCgroup> devices = new ArrayList<>();

  public static final String SERIALIZED_NAME_HUGEPAGE_LIMITS = "hugepageLimits";
  @SerializedName(SERIALIZED_NAME_HUGEPAGE_LIMITS)
  private List<LinuxHugepageLimit> hugepageLimits = new ArrayList<>();

  public static final String SERIALIZED_NAME_MEMORY = "memory";
  @SerializedName(SERIALIZED_NAME_MEMORY)
  private LinuxMemory memory;

  public static final String SERIALIZED_NAME_NETWORK = "network";
  @SerializedName(SERIALIZED_NAME_NETWORK)
  private LinuxNetwork network;

  public static final String SERIALIZED_NAME_PIDS = "pids";
  @SerializedName(SERIALIZED_NAME_PIDS)
  private LinuxPids pids;

  public static final String SERIALIZED_NAME_RDMA = "rdma";
  @SerializedName(SERIALIZED_NAME_RDMA)
  private Map<String, LinuxRdma> rdma = new HashMap<>();

  public static final String SERIALIZED_NAME_UNIFIED = "unified";
  @SerializedName(SERIALIZED_NAME_UNIFIED)
  private Map<String, String> unified = new HashMap<>();

  public LinuxResources() {
  }

  public LinuxResources blockIO(LinuxBlockIO blockIO) {
    this.blockIO = blockIO;
    return this;
  }

  /**
   * Get blockIO
   * @return blockIO
   */
  @javax.annotation.Nullable
  public LinuxBlockIO getBlockIO() {
    return blockIO;
  }

  public void setBlockIO(LinuxBlockIO blockIO) {
    this.blockIO = blockIO;
  }


  public LinuxResources cpu(LinuxCPU cpu) {
    this.cpu = cpu;
    return this;
  }

  /**
   * Get cpu
   * @return cpu
   */
  @javax.annotation.Nullable
  public LinuxCPU getCpu() {
    return cpu;
  }

  public void setCpu(LinuxCPU cpu) {
    this.cpu = cpu;
  }


  public LinuxResources devices(List<LinuxDeviceCgroup> devices) {
    this.devices = devices;
    return this;
  }

  public LinuxResources addDevicesItem(LinuxDeviceCgroup devicesItem) {
    if (this.devices == null) {
      this.devices = new ArrayList<>();
    }
    this.devices.add(devicesItem);
    return this;
  }

  /**
   * Devices configures the device allowlist.
   * @return devices
   */
  @javax.annotation.Nullable
  public List<LinuxDeviceCgroup> getDevices() {
    return devices;
  }

  public void setDevices(List<LinuxDeviceCgroup> devices) {
    this.devices = devices;
  }


  public LinuxResources hugepageLimits(List<LinuxHugepageLimit> hugepageLimits) {
    this.hugepageLimits = hugepageLimits;
    return this;
  }

  public LinuxResources addHugepageLimitsItem(LinuxHugepageLimit hugepageLimitsItem) {
    if (this.hugepageLimits == null) {
      this.hugepageLimits = new ArrayList<>();
    }
    this.hugepageLimits.add(hugepageLimitsItem);
    return this;
  }

  /**
   * Hugetlb limits (in bytes). Default to reservation limits if supported.
   * @return hugepageLimits
   */
  @javax.annotation.Nullable
  public List<LinuxHugepageLimit> getHugepageLimits() {
    return hugepageLimits;
  }

  public void setHugepageLimits(List<LinuxHugepageLimit> hugepageLimits) {
    this.hugepageLimits = hugepageLimits;
  }


  public LinuxResources memory(LinuxMemory memory) {
    this.memory = memory;
    return this;
  }

  /**
   * Get memory
   * @return memory
   */
  @javax.annotation.Nullable
  public LinuxMemory getMemory() {
    return memory;
  }

  public void setMemory(LinuxMemory memory) {
    this.memory = memory;
  }


  public LinuxResources network(LinuxNetwork network) {
    this.network = network;
    return this;
  }

  /**
   * Get network
   * @return network
   */
  @javax.annotation.Nullable
  public LinuxNetwork getNetwork() {
    return network;
  }

  public void setNetwork(LinuxNetwork network) {
    this.network = network;
  }


  public LinuxResources pids(LinuxPids pids) {
    this.pids = pids;
    return this;
  }

  /**
   * Get pids
   * @return pids
   */
  @javax.annotation.Nullable
  public LinuxPids getPids() {
    return pids;
  }

  public void setPids(LinuxPids pids) {
    this.pids = pids;
  }


  public LinuxResources rdma(Map<String, LinuxRdma> rdma) {
    this.rdma = rdma;
    return this;
  }

  public LinuxResources putRdmaItem(String key, LinuxRdma rdmaItem) {
    if (this.rdma == null) {
      this.rdma = new HashMap<>();
    }
    this.rdma.put(key, rdmaItem);
    return this;
  }

  /**
   * Rdma resource restriction configuration. Limits are a set of key value pairs that define RDMA resource limits, where the key is device name and value is resource limits.
   * @return rdma
   */
  @javax.annotation.Nullable
  public Map<String, LinuxRdma> getRdma() {
    return rdma;
  }

  public void setRdma(Map<String, LinuxRdma> rdma) {
    this.rdma = rdma;
  }


  public LinuxResources unified(Map<String, String> unified) {
    this.unified = unified;
    return this;
  }

  public LinuxResources putUnifiedItem(String key, String unifiedItem) {
    if (this.unified == null) {
      this.unified = new HashMap<>();
    }
    this.unified.put(key, unifiedItem);
    return this;
  }

  /**
   * Unified resources.
   * @return unified
   */
  @javax.annotation.Nullable
  public Map<String, String> getUnified() {
    return unified;
  }

  public void setUnified(Map<String, String> unified) {
    this.unified = unified;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LinuxResources linuxResources = (LinuxResources) o;
    return Objects.equals(this.blockIO, linuxResources.blockIO) &&
        Objects.equals(this.cpu, linuxResources.cpu) &&
        Objects.equals(this.devices, linuxResources.devices) &&
        Objects.equals(this.hugepageLimits, linuxResources.hugepageLimits) &&
        Objects.equals(this.memory, linuxResources.memory) &&
        Objects.equals(this.network, linuxResources.network) &&
        Objects.equals(this.pids, linuxResources.pids) &&
        Objects.equals(this.rdma, linuxResources.rdma) &&
        Objects.equals(this.unified, linuxResources.unified);
  }

  @Override
  public int hashCode() {
    return Objects.hash(blockIO, cpu, devices, hugepageLimits, memory, network, pids, rdma, unified);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LinuxResources {\n");
    sb.append("    blockIO: ").append(toIndentedString(blockIO)).append("\n");
    sb.append("    cpu: ").append(toIndentedString(cpu)).append("\n");
    sb.append("    devices: ").append(toIndentedString(devices)).append("\n");
    sb.append("    hugepageLimits: ").append(toIndentedString(hugepageLimits)).append("\n");
    sb.append("    memory: ").append(toIndentedString(memory)).append("\n");
    sb.append("    network: ").append(toIndentedString(network)).append("\n");
    sb.append("    pids: ").append(toIndentedString(pids)).append("\n");
    sb.append("    rdma: ").append(toIndentedString(rdma)).append("\n");
    sb.append("    unified: ").append(toIndentedString(unified)).append("\n");
    sb.append("}");
    return sb.toString();
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


  public static HashSet<String> openapiFields;
  public static HashSet<String> openapiRequiredFields;

  static {
    // a set of all properties/fields (JSON key names)
    openapiFields = new HashSet<String>();
    openapiFields.add("blockIO");
    openapiFields.add("cpu");
    openapiFields.add("devices");
    openapiFields.add("hugepageLimits");
    openapiFields.add("memory");
    openapiFields.add("network");
    openapiFields.add("pids");
    openapiFields.add("rdma");
    openapiFields.add("unified");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to LinuxResources
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!LinuxResources.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in LinuxResources is not found in the empty JSON string", LinuxResources.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!LinuxResources.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `LinuxResources` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the optional field `blockIO`
      if (jsonObj.get("blockIO") != null && !jsonObj.get("blockIO").isJsonNull()) {
        LinuxBlockIO.validateJsonElement(jsonObj.get("blockIO"));
      }
      // validate the optional field `cpu`
      if (jsonObj.get("cpu") != null && !jsonObj.get("cpu").isJsonNull()) {
        LinuxCPU.validateJsonElement(jsonObj.get("cpu"));
      }
      if (jsonObj.get("devices") != null && !jsonObj.get("devices").isJsonNull()) {
        JsonArray jsonArraydevices = jsonObj.getAsJsonArray("devices");
        if (jsonArraydevices != null) {
          // ensure the json data is an array
          if (!jsonObj.get("devices").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `devices` to be an array in the JSON string but got `%s`", jsonObj.get("devices").toString()));
          }

          // validate the optional field `devices` (array)
          for (int i = 0; i < jsonArraydevices.size(); i++) {
            LinuxDeviceCgroup.validateJsonElement(jsonArraydevices.get(i));
          };
        }
      }
      if (jsonObj.get("hugepageLimits") != null && !jsonObj.get("hugepageLimits").isJsonNull()) {
        JsonArray jsonArrayhugepageLimits = jsonObj.getAsJsonArray("hugepageLimits");
        if (jsonArrayhugepageLimits != null) {
          // ensure the json data is an array
          if (!jsonObj.get("hugepageLimits").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `hugepageLimits` to be an array in the JSON string but got `%s`", jsonObj.get("hugepageLimits").toString()));
          }

          // validate the optional field `hugepageLimits` (array)
          for (int i = 0; i < jsonArrayhugepageLimits.size(); i++) {
            LinuxHugepageLimit.validateJsonElement(jsonArrayhugepageLimits.get(i));
          };
        }
      }
      // validate the optional field `memory`
      if (jsonObj.get("memory") != null && !jsonObj.get("memory").isJsonNull()) {
        LinuxMemory.validateJsonElement(jsonObj.get("memory"));
      }
      // validate the optional field `network`
      if (jsonObj.get("network") != null && !jsonObj.get("network").isJsonNull()) {
        LinuxNetwork.validateJsonElement(jsonObj.get("network"));
      }
      // validate the optional field `pids`
      if (jsonObj.get("pids") != null && !jsonObj.get("pids").isJsonNull()) {
        LinuxPids.validateJsonElement(jsonObj.get("pids"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!LinuxResources.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'LinuxResources' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<LinuxResources> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(LinuxResources.class));

       return (TypeAdapter<T>) new TypeAdapter<LinuxResources>() {
           @Override
           public void write(JsonWriter out, LinuxResources value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public LinuxResources read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of LinuxResources given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of LinuxResources
   * @throws IOException if the JSON string is invalid with respect to LinuxResources
   */
  public static LinuxResources fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, LinuxResources.class);
  }

  /**
   * Convert an instance of LinuxResources to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

