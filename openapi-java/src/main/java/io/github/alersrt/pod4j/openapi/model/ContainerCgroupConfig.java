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
import io.github.alersrt.pod4j.openapi.model.Namespace;
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

import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import io.github.alersrt.pod4j.openapi.JSON;

/**
 * ContainerCgroupConfig contains configuration information about a container&#39;s cgroups.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-11-19T11:19:05.435500352+07:00[Asia/Barnaul]", comments = "Generator version: 7.7.0")
public class ContainerCgroupConfig {
  public static final String SERIALIZED_NAME_CGROUP_PARENT = "cgroup_parent";
  @SerializedName(SERIALIZED_NAME_CGROUP_PARENT)
  private String cgroupParent;

  public static final String SERIALIZED_NAME_CGROUPNS = "cgroupns";
  @SerializedName(SERIALIZED_NAME_CGROUPNS)
  private Namespace cgroupns;

  public static final String SERIALIZED_NAME_CGROUPS_MODE = "cgroups_mode";
  @SerializedName(SERIALIZED_NAME_CGROUPS_MODE)
  private String cgroupsMode;

  public ContainerCgroupConfig() {
  }

  public ContainerCgroupConfig cgroupParent(String cgroupParent) {
    this.cgroupParent = cgroupParent;
    return this;
  }

  /**
   * CgroupParent is the container&#39;s Cgroup parent. If not set, the default for the current cgroup driver will be used. Optional.
   * @return cgroupParent
   */
  @javax.annotation.Nullable
  public String getCgroupParent() {
    return cgroupParent;
  }

  public void setCgroupParent(String cgroupParent) {
    this.cgroupParent = cgroupParent;
  }


  public ContainerCgroupConfig cgroupns(Namespace cgroupns) {
    this.cgroupns = cgroupns;
    return this;
  }

  /**
   * Get cgroupns
   * @return cgroupns
   */
  @javax.annotation.Nullable
  public Namespace getCgroupns() {
    return cgroupns;
  }

  public void setCgroupns(Namespace cgroupns) {
    this.cgroupns = cgroupns;
  }


  public ContainerCgroupConfig cgroupsMode(String cgroupsMode) {
    this.cgroupsMode = cgroupsMode;
    return this;
  }

  /**
   * CgroupsMode sets a policy for how cgroups will be created for the container, including the ability to disable creation entirely. Optional.
   * @return cgroupsMode
   */
  @javax.annotation.Nullable
  public String getCgroupsMode() {
    return cgroupsMode;
  }

  public void setCgroupsMode(String cgroupsMode) {
    this.cgroupsMode = cgroupsMode;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ContainerCgroupConfig containerCgroupConfig = (ContainerCgroupConfig) o;
    return Objects.equals(this.cgroupParent, containerCgroupConfig.cgroupParent) &&
        Objects.equals(this.cgroupns, containerCgroupConfig.cgroupns) &&
        Objects.equals(this.cgroupsMode, containerCgroupConfig.cgroupsMode);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cgroupParent, cgroupns, cgroupsMode);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ContainerCgroupConfig {\n");
    sb.append("    cgroupParent: ").append(toIndentedString(cgroupParent)).append("\n");
    sb.append("    cgroupns: ").append(toIndentedString(cgroupns)).append("\n");
    sb.append("    cgroupsMode: ").append(toIndentedString(cgroupsMode)).append("\n");
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
    openapiFields.add("cgroup_parent");
    openapiFields.add("cgroupns");
    openapiFields.add("cgroups_mode");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to ContainerCgroupConfig
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!ContainerCgroupConfig.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ContainerCgroupConfig is not found in the empty JSON string", ContainerCgroupConfig.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!ContainerCgroupConfig.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ContainerCgroupConfig` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("cgroup_parent") != null && !jsonObj.get("cgroup_parent").isJsonNull()) && !jsonObj.get("cgroup_parent").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `cgroup_parent` to be a primitive type in the JSON string but got `%s`", jsonObj.get("cgroup_parent").toString()));
      }
      // validate the optional field `cgroupns`
      if (jsonObj.get("cgroupns") != null && !jsonObj.get("cgroupns").isJsonNull()) {
        Namespace.validateJsonElement(jsonObj.get("cgroupns"));
      }
      if ((jsonObj.get("cgroups_mode") != null && !jsonObj.get("cgroups_mode").isJsonNull()) && !jsonObj.get("cgroups_mode").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `cgroups_mode` to be a primitive type in the JSON string but got `%s`", jsonObj.get("cgroups_mode").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ContainerCgroupConfig.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ContainerCgroupConfig' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ContainerCgroupConfig> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ContainerCgroupConfig.class));

       return (TypeAdapter<T>) new TypeAdapter<ContainerCgroupConfig>() {
           @Override
           public void write(JsonWriter out, ContainerCgroupConfig value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ContainerCgroupConfig read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of ContainerCgroupConfig given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of ContainerCgroupConfig
   * @throws IOException if the JSON string is invalid with respect to ContainerCgroupConfig
   */
  public static ContainerCgroupConfig fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ContainerCgroupConfig.class);
  }

  /**
   * Convert an instance of ContainerCgroupConfig to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
