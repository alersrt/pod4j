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
 * CPUUsage
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-11-28T15:23:24.636316917+07:00[Asia/Barnaul]", comments = "Generator version: 7.7.0")
public class CPUUsage {
  public static final String SERIALIZED_NAME_IDLE_PERCENT = "idlePercent";
  @SerializedName(SERIALIZED_NAME_IDLE_PERCENT)
  private Double idlePercent;

  public static final String SERIALIZED_NAME_SYSTEM_PERCENT = "systemPercent";
  @SerializedName(SERIALIZED_NAME_SYSTEM_PERCENT)
  private Double systemPercent;

  public static final String SERIALIZED_NAME_USER_PERCENT = "userPercent";
  @SerializedName(SERIALIZED_NAME_USER_PERCENT)
  private Double userPercent;

  public CPUUsage() {
  }

  public CPUUsage idlePercent(Double idlePercent) {
    this.idlePercent = idlePercent;
    return this;
  }

  /**
   * Get idlePercent
   * @return idlePercent
   */
  @javax.annotation.Nullable
  public Double getIdlePercent() {
    return idlePercent;
  }

  public void setIdlePercent(Double idlePercent) {
    this.idlePercent = idlePercent;
  }


  public CPUUsage systemPercent(Double systemPercent) {
    this.systemPercent = systemPercent;
    return this;
  }

  /**
   * Get systemPercent
   * @return systemPercent
   */
  @javax.annotation.Nullable
  public Double getSystemPercent() {
    return systemPercent;
  }

  public void setSystemPercent(Double systemPercent) {
    this.systemPercent = systemPercent;
  }


  public CPUUsage userPercent(Double userPercent) {
    this.userPercent = userPercent;
    return this;
  }

  /**
   * Get userPercent
   * @return userPercent
   */
  @javax.annotation.Nullable
  public Double getUserPercent() {
    return userPercent;
  }

  public void setUserPercent(Double userPercent) {
    this.userPercent = userPercent;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CPUUsage cpUUsage = (CPUUsage) o;
    return Objects.equals(this.idlePercent, cpUUsage.idlePercent) &&
        Objects.equals(this.systemPercent, cpUUsage.systemPercent) &&
        Objects.equals(this.userPercent, cpUUsage.userPercent);
  }

  @Override
  public int hashCode() {
    return Objects.hash(idlePercent, systemPercent, userPercent);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CPUUsage {\n");
    sb.append("    idlePercent: ").append(toIndentedString(idlePercent)).append("\n");
    sb.append("    systemPercent: ").append(toIndentedString(systemPercent)).append("\n");
    sb.append("    userPercent: ").append(toIndentedString(userPercent)).append("\n");
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
    openapiFields.add("idlePercent");
    openapiFields.add("systemPercent");
    openapiFields.add("userPercent");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to CPUUsage
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!CPUUsage.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in CPUUsage is not found in the empty JSON string", CPUUsage.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!CPUUsage.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `CPUUsage` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!CPUUsage.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'CPUUsage' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<CPUUsage> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(CPUUsage.class));

       return (TypeAdapter<T>) new TypeAdapter<CPUUsage>() {
           @Override
           public void write(JsonWriter out, CPUUsage value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public CPUUsage read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of CPUUsage given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of CPUUsage
   * @throws IOException if the JSON string is invalid with respect to CPUUsage
   */
  public static CPUUsage fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CPUUsage.class);
  }

  /**
   * Convert an instance of CPUUsage to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

