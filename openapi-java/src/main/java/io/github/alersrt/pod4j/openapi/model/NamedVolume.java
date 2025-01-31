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
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Map.Entry;
import java.util.Objects;
import java.util.Set;

/**
 * NamedVolume holds information about a named volume that will be mounted into the container.
 */
@ApiModel(description = "NamedVolume holds information about a named volume that will be mounted into the container.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class NamedVolume implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String SERIALIZED_NAME_DEST = "Dest";
  @SerializedName(SERIALIZED_NAME_DEST)
  private String dest;

  public static final String SERIALIZED_NAME_IS_ANONYMOUS = "IsAnonymous";
  @SerializedName(SERIALIZED_NAME_IS_ANONYMOUS)
  private Boolean isAnonymous;

  public static final String SERIALIZED_NAME_NAME = "Name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_OPTIONS = "Options";
  @SerializedName(SERIALIZED_NAME_OPTIONS)
  private List<String> options = null;

  public static final String SERIALIZED_NAME_SUB_PATH = "SubPath";
  @SerializedName(SERIALIZED_NAME_SUB_PATH)
  private String subPath;

  public NamedVolume() {
  }

  public NamedVolume dest(String dest) {

    this.dest = dest;
    return this;
  }

  /**
   * Destination to mount the named volume within the container. Must be an absolute path. Path will be created if it does not exist.
   * @return dest
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Destination to mount the named volume within the container. Must be an absolute path. Path will be created if it does not exist.")

  public String getDest() {
    return dest;
  }


  public void setDest(String dest) {
    this.dest = dest;
  }


  public NamedVolume isAnonymous(Boolean isAnonymous) {

    this.isAnonymous = isAnonymous;
    return this;
  }

  /**
   * IsAnonymous sets the named volume as anonymous even if it has a name This is used for emptyDir volumes from a kube yaml
   * @return isAnonymous
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "IsAnonymous sets the named volume as anonymous even if it has a name This is used for emptyDir volumes from a kube yaml")

  public Boolean getIsAnonymous() {
    return isAnonymous;
  }


  public void setIsAnonymous(Boolean isAnonymous) {
    this.isAnonymous = isAnonymous;
  }


  public NamedVolume name(String name) {

    this.name = name;
    return this;
  }

  /**
   * Name is the name of the named volume to be mounted. May be empty. If empty, a new named volume with a pseudorandomly generated name will be mounted at the given destination.
   * @return name
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Name is the name of the named volume to be mounted. May be empty. If empty, a new named volume with a pseudorandomly generated name will be mounted at the given destination.")

  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public NamedVolume options(List<String> options) {

    this.options = options;
    return this;
  }

  public NamedVolume addOptionsItem(String optionsItem) {
    if (this.options == null) {
      this.options = new ArrayList<>();
    }
    this.options.add(optionsItem);
    return this;
  }

  /**
   * Options are options that the named volume will be mounted with.
   * @return options
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Options are options that the named volume will be mounted with.")

  public List<String> getOptions() {
    return options;
  }


  public void setOptions(List<String> options) {
    this.options = options;
  }


  public NamedVolume subPath(String subPath) {

    this.subPath = subPath;
    return this;
  }

  /**
   * SubPath stores the sub directory of the named volume to be mounted in the container
   * @return subPath
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "SubPath stores the sub directory of the named volume to be mounted in the container")

  public String getSubPath() {
    return subPath;
  }


  public void setSubPath(String subPath) {
    this.subPath = subPath;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    NamedVolume namedVolume = (NamedVolume) o;
    return Objects.equals(this.dest, namedVolume.dest) &&
        Objects.equals(this.isAnonymous, namedVolume.isAnonymous) &&
        Objects.equals(this.name, namedVolume.name) &&
        Objects.equals(this.options, namedVolume.options) &&
        Objects.equals(this.subPath, namedVolume.subPath);
  }

  @Override
  public int hashCode() {
    return Objects.hash(dest, isAnonymous, name, options, subPath);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NamedVolume {\n");
    sb.append("    dest: ").append(toIndentedString(dest)).append("\n");
    sb.append("    isAnonymous: ").append(toIndentedString(isAnonymous)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    options: ").append(toIndentedString(options)).append("\n");
    sb.append("    subPath: ").append(toIndentedString(subPath)).append("\n");
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
    openapiFields.add("Dest");
    openapiFields.add("IsAnonymous");
    openapiFields.add("Name");
    openapiFields.add("Options");
    openapiFields.add("SubPath");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Object and throws an exception if issues found
   *
   * @param jsonObj JSON Object
   * @throws IOException if the JSON Object is invalid with respect to NamedVolume
   */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
    if (jsonObj == null) {
      if (NamedVolume.openapiRequiredFields.isEmpty()) {
        return;
      } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in NamedVolume is not found in the empty JSON string", NamedVolume.openapiRequiredFields.toString()));
      }
    }

    Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
    for (Entry<String, JsonElement> entry : entries) {
        if (!NamedVolume.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `NamedVolume` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if ((jsonObj.get("Dest") != null && !jsonObj.get("Dest").isJsonNull()) && !jsonObj.get("Dest").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `Dest` to be a primitive type in the JSON string but got `%s`", jsonObj.get("Dest").toString()));
      }
      if ((jsonObj.get("Name") != null && !jsonObj.get("Name").isJsonNull()) && !jsonObj.get("Name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `Name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("Name").toString()));
      }
    // ensure the json data is an array
    if ((jsonObj.get("Options") != null && !jsonObj.get("Options").isJsonNull()) && !jsonObj.get("Options").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `Options` to be an array in the JSON string but got `%s`", jsonObj.get("Options").toString()));
      }
      if ((jsonObj.get("SubPath") != null && !jsonObj.get("SubPath").isJsonNull()) && !jsonObj.get("SubPath").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `SubPath` to be a primitive type in the JSON string but got `%s`", jsonObj.get("SubPath").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!NamedVolume.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'NamedVolume' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<NamedVolume> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(NamedVolume.class));

       return (TypeAdapter<T>) new TypeAdapter<NamedVolume>() {
           @Override
           public void write(JsonWriter out, NamedVolume value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public NamedVolume read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of NamedVolume given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of NamedVolume
   * @throws IOException if the JSON string is invalid with respect to NamedVolume
  */
  public static NamedVolume fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, NamedVolume.class);
  }

  /**
   * Convert an instance of NamedVolume to an JSON string
   *
   * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

