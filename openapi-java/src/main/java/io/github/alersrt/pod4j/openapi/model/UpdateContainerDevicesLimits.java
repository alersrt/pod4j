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
import io.github.alersrt.pod4j.openapi.model.ThrottleDevice;
import io.github.alersrt.pod4j.openapi.model.WeightDevice;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.io.Serializable;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;

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
 * UpdateContainerDevicesLimits
 */
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.7.0")
public class UpdateContainerDevicesLimits implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String SERIALIZED_NAME_BLK_I_O_WEIGHT_DEVICE = "BlkIOWeightDevice";
  @SerializedName(SERIALIZED_NAME_BLK_I_O_WEIGHT_DEVICE)
  private List<@Valid WeightDevice> blkIOWeightDevice = new ArrayList<>();

  public static final String SERIALIZED_NAME_DEVICE_READ_B_PS = "DeviceReadBPs";
  @SerializedName(SERIALIZED_NAME_DEVICE_READ_B_PS)
  private List<@Valid ThrottleDevice> deviceReadBPs = new ArrayList<>();

  public static final String SERIALIZED_NAME_DEVICE_READ_I_O_PS = "DeviceReadIOPs";
  @SerializedName(SERIALIZED_NAME_DEVICE_READ_I_O_PS)
  private List<@Valid ThrottleDevice> deviceReadIOPs = new ArrayList<>();

  public static final String SERIALIZED_NAME_DEVICE_WRITE_B_PS = "DeviceWriteBPs";
  @SerializedName(SERIALIZED_NAME_DEVICE_WRITE_B_PS)
  private List<@Valid ThrottleDevice> deviceWriteBPs = new ArrayList<>();

  public static final String SERIALIZED_NAME_DEVICE_WRITE_I_O_PS = "DeviceWriteIOPs";
  @SerializedName(SERIALIZED_NAME_DEVICE_WRITE_I_O_PS)
  private List<@Valid ThrottleDevice> deviceWriteIOPs = new ArrayList<>();

  public UpdateContainerDevicesLimits() {
  }

  public UpdateContainerDevicesLimits blkIOWeightDevice(List<@Valid WeightDevice> blkIOWeightDevice) {
    this.blkIOWeightDevice = blkIOWeightDevice;
    return this;
  }

  public UpdateContainerDevicesLimits addBlkIOWeightDeviceItem(WeightDevice blkIOWeightDeviceItem) {
    if (this.blkIOWeightDevice == null) {
      this.blkIOWeightDevice = new ArrayList<>();
    }
    this.blkIOWeightDevice.add(blkIOWeightDeviceItem);
    return this;
  }

  /**
   * Block IO weight (relative device weight) in the form: &#x60;&#x60;&#x60;[{\&quot;Path\&quot;: \&quot;device_path\&quot;, \&quot;Weight\&quot;: weight}]&#x60;&#x60;&#x60;
   * @return blkIOWeightDevice
   */
  @jakarta.annotation.Nullable
  @Valid

  public List<@Valid WeightDevice> getBlkIOWeightDevice() {
    return blkIOWeightDevice;
  }

  public void setBlkIOWeightDevice(List<@Valid WeightDevice> blkIOWeightDevice) {
    this.blkIOWeightDevice = blkIOWeightDevice;
  }


  public UpdateContainerDevicesLimits deviceReadBPs(List<@Valid ThrottleDevice> deviceReadBPs) {
    this.deviceReadBPs = deviceReadBPs;
    return this;
  }

  public UpdateContainerDevicesLimits addDeviceReadBPsItem(ThrottleDevice deviceReadBPsItem) {
    if (this.deviceReadBPs == null) {
      this.deviceReadBPs = new ArrayList<>();
    }
    this.deviceReadBPs.add(deviceReadBPsItem);
    return this;
  }

  /**
   * Limit read rate (bytes per second) from a device, in the form: &#x60;&#x60;&#x60;[{\&quot;Path\&quot;: \&quot;device_path\&quot;, \&quot;Rate\&quot;: rate}]&#x60;&#x60;&#x60;
   * @return deviceReadBPs
   */
  @jakarta.annotation.Nullable
  @Valid

  public List<@Valid ThrottleDevice> getDeviceReadBPs() {
    return deviceReadBPs;
  }

  public void setDeviceReadBPs(List<@Valid ThrottleDevice> deviceReadBPs) {
    this.deviceReadBPs = deviceReadBPs;
  }


  public UpdateContainerDevicesLimits deviceReadIOPs(List<@Valid ThrottleDevice> deviceReadIOPs) {
    this.deviceReadIOPs = deviceReadIOPs;
    return this;
  }

  public UpdateContainerDevicesLimits addDeviceReadIOPsItem(ThrottleDevice deviceReadIOPsItem) {
    if (this.deviceReadIOPs == null) {
      this.deviceReadIOPs = new ArrayList<>();
    }
    this.deviceReadIOPs.add(deviceReadIOPsItem);
    return this;
  }

  /**
   * Limit read rate (IO per second) from a device, in the form: &#x60;&#x60;&#x60;[{\&quot;Path\&quot;: \&quot;device_path\&quot;, \&quot;Rate\&quot;: rate}]&#x60;&#x60;&#x60;
   * @return deviceReadIOPs
   */
  @jakarta.annotation.Nullable
  @Valid

  public List<@Valid ThrottleDevice> getDeviceReadIOPs() {
    return deviceReadIOPs;
  }

  public void setDeviceReadIOPs(List<@Valid ThrottleDevice> deviceReadIOPs) {
    this.deviceReadIOPs = deviceReadIOPs;
  }


  public UpdateContainerDevicesLimits deviceWriteBPs(List<@Valid ThrottleDevice> deviceWriteBPs) {
    this.deviceWriteBPs = deviceWriteBPs;
    return this;
  }

  public UpdateContainerDevicesLimits addDeviceWriteBPsItem(ThrottleDevice deviceWriteBPsItem) {
    if (this.deviceWriteBPs == null) {
      this.deviceWriteBPs = new ArrayList<>();
    }
    this.deviceWriteBPs.add(deviceWriteBPsItem);
    return this;
  }

  /**
   * Limit write rate (bytes per second) to a device, in the form: &#x60;&#x60;&#x60;[{\&quot;Path\&quot;: \&quot;device_path\&quot;, \&quot;Rate\&quot;: rate}]&#x60;&#x60;&#x60;
   * @return deviceWriteBPs
   */
  @jakarta.annotation.Nullable
  @Valid

  public List<@Valid ThrottleDevice> getDeviceWriteBPs() {
    return deviceWriteBPs;
  }

  public void setDeviceWriteBPs(List<@Valid ThrottleDevice> deviceWriteBPs) {
    this.deviceWriteBPs = deviceWriteBPs;
  }


  public UpdateContainerDevicesLimits deviceWriteIOPs(List<@Valid ThrottleDevice> deviceWriteIOPs) {
    this.deviceWriteIOPs = deviceWriteIOPs;
    return this;
  }

  public UpdateContainerDevicesLimits addDeviceWriteIOPsItem(ThrottleDevice deviceWriteIOPsItem) {
    if (this.deviceWriteIOPs == null) {
      this.deviceWriteIOPs = new ArrayList<>();
    }
    this.deviceWriteIOPs.add(deviceWriteIOPsItem);
    return this;
  }

  /**
   * Limit write rate (IO per second) to a device, in the form: &#x60;&#x60;&#x60;[{\&quot;Path\&quot;: \&quot;device_path\&quot;, \&quot;Rate\&quot;: rate}]&#x60;&#x60;&#x60;
   * @return deviceWriteIOPs
   */
  @jakarta.annotation.Nullable
  @Valid

  public List<@Valid ThrottleDevice> getDeviceWriteIOPs() {
    return deviceWriteIOPs;
  }

  public void setDeviceWriteIOPs(List<@Valid ThrottleDevice> deviceWriteIOPs) {
    this.deviceWriteIOPs = deviceWriteIOPs;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UpdateContainerDevicesLimits updateContainerDevicesLimits = (UpdateContainerDevicesLimits) o;
    return Objects.equals(this.blkIOWeightDevice, updateContainerDevicesLimits.blkIOWeightDevice) &&
        Objects.equals(this.deviceReadBPs, updateContainerDevicesLimits.deviceReadBPs) &&
        Objects.equals(this.deviceReadIOPs, updateContainerDevicesLimits.deviceReadIOPs) &&
        Objects.equals(this.deviceWriteBPs, updateContainerDevicesLimits.deviceWriteBPs) &&
        Objects.equals(this.deviceWriteIOPs, updateContainerDevicesLimits.deviceWriteIOPs);
  }

  @Override
  public int hashCode() {
    return Objects.hash(blkIOWeightDevice, deviceReadBPs, deviceReadIOPs, deviceWriteBPs, deviceWriteIOPs);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UpdateContainerDevicesLimits {\n");
    sb.append("    blkIOWeightDevice: ").append(toIndentedString(blkIOWeightDevice)).append("\n");
    sb.append("    deviceReadBPs: ").append(toIndentedString(deviceReadBPs)).append("\n");
    sb.append("    deviceReadIOPs: ").append(toIndentedString(deviceReadIOPs)).append("\n");
    sb.append("    deviceWriteBPs: ").append(toIndentedString(deviceWriteBPs)).append("\n");
    sb.append("    deviceWriteIOPs: ").append(toIndentedString(deviceWriteIOPs)).append("\n");
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
    openapiFields.add("BlkIOWeightDevice");
    openapiFields.add("DeviceReadBPs");
    openapiFields.add("DeviceReadIOPs");
    openapiFields.add("DeviceWriteBPs");
    openapiFields.add("DeviceWriteIOPs");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to UpdateContainerDevicesLimits
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!UpdateContainerDevicesLimits.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in UpdateContainerDevicesLimits is not found in the empty JSON string", UpdateContainerDevicesLimits.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!UpdateContainerDevicesLimits.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `UpdateContainerDevicesLimits` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (jsonObj.get("BlkIOWeightDevice") != null && !jsonObj.get("BlkIOWeightDevice").isJsonNull()) {
        JsonArray jsonArrayblkIOWeightDevice = jsonObj.getAsJsonArray("BlkIOWeightDevice");
        if (jsonArrayblkIOWeightDevice != null) {
          // ensure the json data is an array
          if (!jsonObj.get("BlkIOWeightDevice").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `BlkIOWeightDevice` to be an array in the JSON string but got `%s`", jsonObj.get("BlkIOWeightDevice").toString()));
          }

          // validate the optional field `BlkIOWeightDevice` (array)
          for (int i = 0; i < jsonArrayblkIOWeightDevice.size(); i++) {
            WeightDevice.validateJsonElement(jsonArrayblkIOWeightDevice.get(i));
          };
        }
      }
      if (jsonObj.get("DeviceReadBPs") != null && !jsonObj.get("DeviceReadBPs").isJsonNull()) {
        JsonArray jsonArraydeviceReadBPs = jsonObj.getAsJsonArray("DeviceReadBPs");
        if (jsonArraydeviceReadBPs != null) {
          // ensure the json data is an array
          if (!jsonObj.get("DeviceReadBPs").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `DeviceReadBPs` to be an array in the JSON string but got `%s`", jsonObj.get("DeviceReadBPs").toString()));
          }

          // validate the optional field `DeviceReadBPs` (array)
          for (int i = 0; i < jsonArraydeviceReadBPs.size(); i++) {
            ThrottleDevice.validateJsonElement(jsonArraydeviceReadBPs.get(i));
          };
        }
      }
      if (jsonObj.get("DeviceReadIOPs") != null && !jsonObj.get("DeviceReadIOPs").isJsonNull()) {
        JsonArray jsonArraydeviceReadIOPs = jsonObj.getAsJsonArray("DeviceReadIOPs");
        if (jsonArraydeviceReadIOPs != null) {
          // ensure the json data is an array
          if (!jsonObj.get("DeviceReadIOPs").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `DeviceReadIOPs` to be an array in the JSON string but got `%s`", jsonObj.get("DeviceReadIOPs").toString()));
          }

          // validate the optional field `DeviceReadIOPs` (array)
          for (int i = 0; i < jsonArraydeviceReadIOPs.size(); i++) {
            ThrottleDevice.validateJsonElement(jsonArraydeviceReadIOPs.get(i));
          };
        }
      }
      if (jsonObj.get("DeviceWriteBPs") != null && !jsonObj.get("DeviceWriteBPs").isJsonNull()) {
        JsonArray jsonArraydeviceWriteBPs = jsonObj.getAsJsonArray("DeviceWriteBPs");
        if (jsonArraydeviceWriteBPs != null) {
          // ensure the json data is an array
          if (!jsonObj.get("DeviceWriteBPs").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `DeviceWriteBPs` to be an array in the JSON string but got `%s`", jsonObj.get("DeviceWriteBPs").toString()));
          }

          // validate the optional field `DeviceWriteBPs` (array)
          for (int i = 0; i < jsonArraydeviceWriteBPs.size(); i++) {
            ThrottleDevice.validateJsonElement(jsonArraydeviceWriteBPs.get(i));
          };
        }
      }
      if (jsonObj.get("DeviceWriteIOPs") != null && !jsonObj.get("DeviceWriteIOPs").isJsonNull()) {
        JsonArray jsonArraydeviceWriteIOPs = jsonObj.getAsJsonArray("DeviceWriteIOPs");
        if (jsonArraydeviceWriteIOPs != null) {
          // ensure the json data is an array
          if (!jsonObj.get("DeviceWriteIOPs").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `DeviceWriteIOPs` to be an array in the JSON string but got `%s`", jsonObj.get("DeviceWriteIOPs").toString()));
          }

          // validate the optional field `DeviceWriteIOPs` (array)
          for (int i = 0; i < jsonArraydeviceWriteIOPs.size(); i++) {
            ThrottleDevice.validateJsonElement(jsonArraydeviceWriteIOPs.get(i));
          };
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!UpdateContainerDevicesLimits.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'UpdateContainerDevicesLimits' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<UpdateContainerDevicesLimits> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(UpdateContainerDevicesLimits.class));

       return (TypeAdapter<T>) new TypeAdapter<UpdateContainerDevicesLimits>() {
           @Override
           public void write(JsonWriter out, UpdateContainerDevicesLimits value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public UpdateContainerDevicesLimits read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of UpdateContainerDevicesLimits given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of UpdateContainerDevicesLimits
   * @throws IOException if the JSON string is invalid with respect to UpdateContainerDevicesLimits
   */
  public static UpdateContainerDevicesLimits fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, UpdateContainerDevicesLimits.class);
  }

  /**
   * Convert an instance of UpdateContainerDevicesLimits to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
