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
import java.io.IOException;
import java.util.Arrays;
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
 * LinuxDeviceCgroup represents a device rule for the devices specified to the device controller
 */
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-12-27T23:04:06.361421791+07:00[Asia/Barnaul]", comments = "Generator version: 7.7.0")
public class LinuxDeviceCgroup implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String SERIALIZED_NAME_ACCESS = "access";
  @SerializedName(SERIALIZED_NAME_ACCESS)
  private String access;

  public static final String SERIALIZED_NAME_ALLOW = "allow";
  @SerializedName(SERIALIZED_NAME_ALLOW)
  private Boolean allow;

  public static final String SERIALIZED_NAME_MAJOR = "major";
  @SerializedName(SERIALIZED_NAME_MAJOR)
  private Long major;

  public static final String SERIALIZED_NAME_MINOR = "minor";
  @SerializedName(SERIALIZED_NAME_MINOR)
  private Long minor;

  public static final String SERIALIZED_NAME_TYPE = "type";
  @SerializedName(SERIALIZED_NAME_TYPE)
  private String type;

  public LinuxDeviceCgroup() {
  }

  public LinuxDeviceCgroup access(String access) {
    this.access = access;
    return this;
  }

  /**
   * Cgroup access permissions format, rwm.
   * @return access
   */
  @jakarta.annotation.Nullable

  public String getAccess() {
    return access;
  }

  public void setAccess(String access) {
    this.access = access;
  }


  public LinuxDeviceCgroup allow(Boolean allow) {
    this.allow = allow;
    return this;
  }

  /**
   * Allow or deny
   * @return allow
   */
  @jakarta.annotation.Nullable

  public Boolean getAllow() {
    return allow;
  }

  public void setAllow(Boolean allow) {
    this.allow = allow;
  }


  public LinuxDeviceCgroup major(Long major) {
    this.major = major;
    return this;
  }

  /**
   * Major is the device&#39;s major number.
   * @return major
   */
  @jakarta.annotation.Nullable

  public Long getMajor() {
    return major;
  }

  public void setMajor(Long major) {
    this.major = major;
  }


  public LinuxDeviceCgroup minor(Long minor) {
    this.minor = minor;
    return this;
  }

  /**
   * Minor is the device&#39;s minor number.
   * @return minor
   */
  @jakarta.annotation.Nullable

  public Long getMinor() {
    return minor;
  }

  public void setMinor(Long minor) {
    this.minor = minor;
  }


  public LinuxDeviceCgroup type(String type) {
    this.type = type;
    return this;
  }

  /**
   * Device type, block, char, etc.
   * @return type
   */
  @jakarta.annotation.Nullable

  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LinuxDeviceCgroup linuxDeviceCgroup = (LinuxDeviceCgroup) o;
    return Objects.equals(this.access, linuxDeviceCgroup.access) &&
        Objects.equals(this.allow, linuxDeviceCgroup.allow) &&
        Objects.equals(this.major, linuxDeviceCgroup.major) &&
        Objects.equals(this.minor, linuxDeviceCgroup.minor) &&
        Objects.equals(this.type, linuxDeviceCgroup.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(access, allow, major, minor, type);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LinuxDeviceCgroup {\n");
    sb.append("    access: ").append(toIndentedString(access)).append("\n");
    sb.append("    allow: ").append(toIndentedString(allow)).append("\n");
    sb.append("    major: ").append(toIndentedString(major)).append("\n");
    sb.append("    minor: ").append(toIndentedString(minor)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
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
    openapiFields.add("access");
    openapiFields.add("allow");
    openapiFields.add("major");
    openapiFields.add("minor");
    openapiFields.add("type");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to LinuxDeviceCgroup
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!LinuxDeviceCgroup.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in LinuxDeviceCgroup is not found in the empty JSON string", LinuxDeviceCgroup.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!LinuxDeviceCgroup.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `LinuxDeviceCgroup` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("access") != null && !jsonObj.get("access").isJsonNull()) && !jsonObj.get("access").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `access` to be a primitive type in the JSON string but got `%s`", jsonObj.get("access").toString()));
      }
      if ((jsonObj.get("type") != null && !jsonObj.get("type").isJsonNull()) && !jsonObj.get("type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("type").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!LinuxDeviceCgroup.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'LinuxDeviceCgroup' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<LinuxDeviceCgroup> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(LinuxDeviceCgroup.class));

       return (TypeAdapter<T>) new TypeAdapter<LinuxDeviceCgroup>() {
           @Override
           public void write(JsonWriter out, LinuxDeviceCgroup value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public LinuxDeviceCgroup read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of LinuxDeviceCgroup given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of LinuxDeviceCgroup
   * @throws IOException if the JSON string is invalid with respect to LinuxDeviceCgroup
   */
  public static LinuxDeviceCgroup fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, LinuxDeviceCgroup.class);
  }

  /**
   * Convert an instance of LinuxDeviceCgroup to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

