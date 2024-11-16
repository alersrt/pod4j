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


package org.openapitools.client.model;

import java.util.Objects;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.util.Arrays;

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

import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.openapitools.client.JSON;

/**
 * LinuxWeightDevice struct holds a &#x60;major:minor weight&#x60; pair for weightDevice
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-11-16T16:02:35.210602253+07:00[Asia/Barnaul]", comments = "Generator version: 7.8.0")
public class LinuxWeightDevice {
  public static final String SERIALIZED_NAME_LEAF_WEIGHT = "leafWeight";
  @SerializedName(SERIALIZED_NAME_LEAF_WEIGHT)
  private Integer leafWeight;

  public static final String SERIALIZED_NAME_MAJOR = "major";
  @SerializedName(SERIALIZED_NAME_MAJOR)
  private Long major;

  public static final String SERIALIZED_NAME_MINOR = "minor";
  @SerializedName(SERIALIZED_NAME_MINOR)
  private Long minor;

  public static final String SERIALIZED_NAME_WEIGHT = "weight";
  @SerializedName(SERIALIZED_NAME_WEIGHT)
  private Integer weight;

  public LinuxWeightDevice() {
  }

  public LinuxWeightDevice leafWeight(Integer leafWeight) {
    this.leafWeight = leafWeight;
    return this;
  }

  /**
   * LeafWeight is the bandwidth rate for the device while competing with the cgroup&#39;s child cgroups, CFQ scheduler only
   * @return leafWeight
   */
  @javax.annotation.Nullable
  public Integer getLeafWeight() {
    return leafWeight;
  }

  public void setLeafWeight(Integer leafWeight) {
    this.leafWeight = leafWeight;
  }


  public LinuxWeightDevice major(Long major) {
    this.major = major;
    return this;
  }

  /**
   * Major is the device&#39;s major number.
   * @return major
   */
  @javax.annotation.Nullable
  public Long getMajor() {
    return major;
  }

  public void setMajor(Long major) {
    this.major = major;
  }


  public LinuxWeightDevice minor(Long minor) {
    this.minor = minor;
    return this;
  }

  /**
   * Minor is the device&#39;s minor number.
   * @return minor
   */
  @javax.annotation.Nullable
  public Long getMinor() {
    return minor;
  }

  public void setMinor(Long minor) {
    this.minor = minor;
  }


  public LinuxWeightDevice weight(Integer weight) {
    this.weight = weight;
    return this;
  }

  /**
   * Weight is the bandwidth rate for the device.
   * @return weight
   */
  @javax.annotation.Nullable
  public Integer getWeight() {
    return weight;
  }

  public void setWeight(Integer weight) {
    this.weight = weight;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LinuxWeightDevice linuxWeightDevice = (LinuxWeightDevice) o;
    return Objects.equals(this.leafWeight, linuxWeightDevice.leafWeight) &&
        Objects.equals(this.major, linuxWeightDevice.major) &&
        Objects.equals(this.minor, linuxWeightDevice.minor) &&
        Objects.equals(this.weight, linuxWeightDevice.weight);
  }

  @Override
  public int hashCode() {
    return Objects.hash(leafWeight, major, minor, weight);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LinuxWeightDevice {\n");
    sb.append("    leafWeight: ").append(toIndentedString(leafWeight)).append("\n");
    sb.append("    major: ").append(toIndentedString(major)).append("\n");
    sb.append("    minor: ").append(toIndentedString(minor)).append("\n");
    sb.append("    weight: ").append(toIndentedString(weight)).append("\n");
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
    openapiFields.add("leafWeight");
    openapiFields.add("major");
    openapiFields.add("minor");
    openapiFields.add("weight");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to LinuxWeightDevice
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!LinuxWeightDevice.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in LinuxWeightDevice is not found in the empty JSON string", LinuxWeightDevice.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!LinuxWeightDevice.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `LinuxWeightDevice` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!LinuxWeightDevice.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'LinuxWeightDevice' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<LinuxWeightDevice> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(LinuxWeightDevice.class));

       return (TypeAdapter<T>) new TypeAdapter<LinuxWeightDevice>() {
           @Override
           public void write(JsonWriter out, LinuxWeightDevice value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public LinuxWeightDevice read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of LinuxWeightDevice given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of LinuxWeightDevice
   * @throws IOException if the JSON string is invalid with respect to LinuxWeightDevice
   */
  public static LinuxWeightDevice fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, LinuxWeightDevice.class);
  }

  /**
   * Convert an instance of LinuxWeightDevice to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

