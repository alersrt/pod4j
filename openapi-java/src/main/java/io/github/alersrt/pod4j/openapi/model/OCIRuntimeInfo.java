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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.IOException;
import java.io.Serializable;
import java.util.HashSet;
import java.util.Map.Entry;
import java.util.Objects;
import java.util.Set;

/**
 * OCIRuntimeInfo describes the runtime (crun or runc) being used with podman
 */
@ApiModel(description = "OCIRuntimeInfo describes the runtime (crun or runc) being used with podman")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class OCIRuntimeInfo implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_PACKAGE = "package";
  @SerializedName(SERIALIZED_NAME_PACKAGE)
  private String _package;

  public static final String SERIALIZED_NAME_PATH = "path";
  @SerializedName(SERIALIZED_NAME_PATH)
  private String path;

  public static final String SERIALIZED_NAME_VERSION = "version";
  @SerializedName(SERIALIZED_NAME_VERSION)
  private String version;

  public OCIRuntimeInfo() {
  }

  public OCIRuntimeInfo name(String name) {

    this.name = name;
    return this;
  }

  /**
   * Get name
   * @return name
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public OCIRuntimeInfo _package(String _package) {

    this._package = _package;
    return this;
  }

  /**
   * Get _package
   * @return _package
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getPackage() {
    return _package;
  }


  public void setPackage(String _package) {
    this._package = _package;
  }


  public OCIRuntimeInfo path(String path) {

    this.path = path;
    return this;
  }

  /**
   * Get path
   * @return path
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getPath() {
    return path;
  }


  public void setPath(String path) {
    this.path = path;
  }


  public OCIRuntimeInfo version(String version) {

    this.version = version;
    return this;
  }

  /**
   * Get version
   * @return version
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

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
    OCIRuntimeInfo ocIRuntimeInfo = (OCIRuntimeInfo) o;
    return Objects.equals(this.name, ocIRuntimeInfo.name) &&
        Objects.equals(this._package, ocIRuntimeInfo._package) &&
        Objects.equals(this.path, ocIRuntimeInfo.path) &&
        Objects.equals(this.version, ocIRuntimeInfo.version);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, _package, path, version);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OCIRuntimeInfo {\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    _package: ").append(toIndentedString(_package)).append("\n");
    sb.append("    path: ").append(toIndentedString(path)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
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
    openapiFields.add("name");
    openapiFields.add("package");
    openapiFields.add("path");
    openapiFields.add("version");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Object and throws an exception if issues found
   *
   * @param jsonObj JSON Object
   * @throws IOException if the JSON Object is invalid with respect to OCIRuntimeInfo
   */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
    if (jsonObj == null) {
      if (OCIRuntimeInfo.openapiRequiredFields.isEmpty()) {
        return;
      } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in OCIRuntimeInfo is not found in the empty JSON string", OCIRuntimeInfo.openapiRequiredFields.toString()));
      }
    }

    Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
    for (Entry<String, JsonElement> entry : entries) {
        if (!OCIRuntimeInfo.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `OCIRuntimeInfo` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if ((jsonObj.get("name") != null && !jsonObj.get("name").isJsonNull()) && !jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
      if ((jsonObj.get("package") != null && !jsonObj.get("package").isJsonNull()) && !jsonObj.get("package").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `package` to be a primitive type in the JSON string but got `%s`", jsonObj.get("package").toString()));
      }
      if ((jsonObj.get("path") != null && !jsonObj.get("path").isJsonNull()) && !jsonObj.get("path").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `path` to be a primitive type in the JSON string but got `%s`", jsonObj.get("path").toString()));
      }
      if ((jsonObj.get("version") != null && !jsonObj.get("version").isJsonNull()) && !jsonObj.get("version").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `version` to be a primitive type in the JSON string but got `%s`", jsonObj.get("version").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!OCIRuntimeInfo.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'OCIRuntimeInfo' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<OCIRuntimeInfo> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(OCIRuntimeInfo.class));

       return (TypeAdapter<T>) new TypeAdapter<OCIRuntimeInfo>() {
           @Override
           public void write(JsonWriter out, OCIRuntimeInfo value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public OCIRuntimeInfo read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of OCIRuntimeInfo given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of OCIRuntimeInfo
   * @throws IOException if the JSON string is invalid with respect to OCIRuntimeInfo
  */
  public static OCIRuntimeInfo fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, OCIRuntimeInfo.class);
  }

  /**
   * Convert an instance of OCIRuntimeInfo to an JSON string
   *
   * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

