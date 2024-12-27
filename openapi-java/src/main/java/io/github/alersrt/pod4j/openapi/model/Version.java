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
 * Version
 */
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-12-28T03:11:38.353612246+07:00[Asia/Barnaul]", comments = "Generator version: 7.7.0")
public class Version implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String SERIALIZED_NAME_AP_I_VERSION = "APIVersion";
  @SerializedName(SERIALIZED_NAME_AP_I_VERSION)
  private String apIVersion;

  public static final String SERIALIZED_NAME_VERSION = "Version";
  @SerializedName(SERIALIZED_NAME_VERSION)
  private String version;

  public static final String SERIALIZED_NAME_GO_VERSION = "GoVersion";
  @SerializedName(SERIALIZED_NAME_GO_VERSION)
  private String goVersion;

  public static final String SERIALIZED_NAME_GIT_COMMIT = "GitCommit";
  @SerializedName(SERIALIZED_NAME_GIT_COMMIT)
  private String gitCommit;

  public static final String SERIALIZED_NAME_BUILT_TIME = "BuiltTime";
  @SerializedName(SERIALIZED_NAME_BUILT_TIME)
  private String builtTime;

  public static final String SERIALIZED_NAME_BUILT = "Built";
  @SerializedName(SERIALIZED_NAME_BUILT)
  private Integer built;

  public static final String SERIALIZED_NAME_OS_ARCH = "OsArch";
  @SerializedName(SERIALIZED_NAME_OS_ARCH)
  private String osArch;

  public static final String SERIALIZED_NAME_OS = "Os";
  @SerializedName(SERIALIZED_NAME_OS)
  private String os;

  public Version() {
  }

  public Version apIVersion(String apIVersion) {
    this.apIVersion = apIVersion;
    return this;
  }

  /**
   * Get apIVersion
   * @return apIVersion
   */
  @jakarta.annotation.Nullable

  public String getApIVersion() {
    return apIVersion;
  }

  public void setApIVersion(String apIVersion) {
    this.apIVersion = apIVersion;
  }


  public Version version(String version) {
    this.version = version;
    return this;
  }

  /**
   * Get version
   * @return version
   */
  @jakarta.annotation.Nullable

  public String getVersion() {
    return version;
  }

  public void setVersion(String version) {
    this.version = version;
  }


  public Version goVersion(String goVersion) {
    this.goVersion = goVersion;
    return this;
  }

  /**
   * Get goVersion
   * @return goVersion
   */
  @jakarta.annotation.Nullable

  public String getGoVersion() {
    return goVersion;
  }

  public void setGoVersion(String goVersion) {
    this.goVersion = goVersion;
  }


  public Version gitCommit(String gitCommit) {
    this.gitCommit = gitCommit;
    return this;
  }

  /**
   * Get gitCommit
   * @return gitCommit
   */
  @jakarta.annotation.Nullable

  public String getGitCommit() {
    return gitCommit;
  }

  public void setGitCommit(String gitCommit) {
    this.gitCommit = gitCommit;
  }


  public Version builtTime(String builtTime) {
    this.builtTime = builtTime;
    return this;
  }

  /**
   * Get builtTime
   * @return builtTime
   */
  @jakarta.annotation.Nullable

  public String getBuiltTime() {
    return builtTime;
  }

  public void setBuiltTime(String builtTime) {
    this.builtTime = builtTime;
  }


  public Version built(Integer built) {
    this.built = built;
    return this;
  }

  /**
   * Get built
   * @return built
   */
  @jakarta.annotation.Nullable

  public Integer getBuilt() {
    return built;
  }

  public void setBuilt(Integer built) {
    this.built = built;
  }


  public Version osArch(String osArch) {
    this.osArch = osArch;
    return this;
  }

  /**
   * Get osArch
   * @return osArch
   */
  @jakarta.annotation.Nullable

  public String getOsArch() {
    return osArch;
  }

  public void setOsArch(String osArch) {
    this.osArch = osArch;
  }


  public Version os(String os) {
    this.os = os;
    return this;
  }

  /**
   * Get os
   * @return os
   */
  @jakarta.annotation.Nullable

  public String getOs() {
    return os;
  }

  public void setOs(String os) {
    this.os = os;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Version version = (Version) o;
    return Objects.equals(this.apIVersion, version.apIVersion) &&
        Objects.equals(this.version, version.version) &&
        Objects.equals(this.goVersion, version.goVersion) &&
        Objects.equals(this.gitCommit, version.gitCommit) &&
        Objects.equals(this.builtTime, version.builtTime) &&
        Objects.equals(this.built, version.built) &&
        Objects.equals(this.osArch, version.osArch) &&
        Objects.equals(this.os, version.os);
  }

  @Override
  public int hashCode() {
    return Objects.hash(apIVersion, version, goVersion, gitCommit, builtTime, built, osArch, os);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Version {\n");
    sb.append("    apIVersion: ").append(toIndentedString(apIVersion)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
    sb.append("    goVersion: ").append(toIndentedString(goVersion)).append("\n");
    sb.append("    gitCommit: ").append(toIndentedString(gitCommit)).append("\n");
    sb.append("    builtTime: ").append(toIndentedString(builtTime)).append("\n");
    sb.append("    built: ").append(toIndentedString(built)).append("\n");
    sb.append("    osArch: ").append(toIndentedString(osArch)).append("\n");
    sb.append("    os: ").append(toIndentedString(os)).append("\n");
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
    openapiFields.add("APIVersion");
    openapiFields.add("Version");
    openapiFields.add("GoVersion");
    openapiFields.add("GitCommit");
    openapiFields.add("BuiltTime");
    openapiFields.add("Built");
    openapiFields.add("OsArch");
    openapiFields.add("Os");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to Version
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!Version.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in Version is not found in the empty JSON string", Version.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!Version.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `Version` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("APIVersion") != null && !jsonObj.get("APIVersion").isJsonNull()) && !jsonObj.get("APIVersion").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `APIVersion` to be a primitive type in the JSON string but got `%s`", jsonObj.get("APIVersion").toString()));
      }
      if ((jsonObj.get("Version") != null && !jsonObj.get("Version").isJsonNull()) && !jsonObj.get("Version").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `Version` to be a primitive type in the JSON string but got `%s`", jsonObj.get("Version").toString()));
      }
      if ((jsonObj.get("GoVersion") != null && !jsonObj.get("GoVersion").isJsonNull()) && !jsonObj.get("GoVersion").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `GoVersion` to be a primitive type in the JSON string but got `%s`", jsonObj.get("GoVersion").toString()));
      }
      if ((jsonObj.get("GitCommit") != null && !jsonObj.get("GitCommit").isJsonNull()) && !jsonObj.get("GitCommit").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `GitCommit` to be a primitive type in the JSON string but got `%s`", jsonObj.get("GitCommit").toString()));
      }
      if ((jsonObj.get("BuiltTime") != null && !jsonObj.get("BuiltTime").isJsonNull()) && !jsonObj.get("BuiltTime").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `BuiltTime` to be a primitive type in the JSON string but got `%s`", jsonObj.get("BuiltTime").toString()));
      }
      if ((jsonObj.get("OsArch") != null && !jsonObj.get("OsArch").isJsonNull()) && !jsonObj.get("OsArch").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `OsArch` to be a primitive type in the JSON string but got `%s`", jsonObj.get("OsArch").toString()));
      }
      if ((jsonObj.get("Os") != null && !jsonObj.get("Os").isJsonNull()) && !jsonObj.get("Os").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `Os` to be a primitive type in the JSON string but got `%s`", jsonObj.get("Os").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!Version.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'Version' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<Version> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(Version.class));

       return (TypeAdapter<T>) new TypeAdapter<Version>() {
           @Override
           public void write(JsonWriter out, Version value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public Version read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of Version given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of Version
   * @throws IOException if the JSON string is invalid with respect to Version
   */
  public static Version fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, Version.class);
  }

  /**
   * Convert an instance of Version to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

