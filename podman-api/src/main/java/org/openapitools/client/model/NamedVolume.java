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
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

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
 * NamedVolume holds information about a named volume that will be mounted into the container.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-11-16T16:02:35.210602253+07:00[Asia/Barnaul]", comments = "Generator version: 7.8.0")
public class NamedVolume {
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
  private List<String> options = new ArrayList<>();

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
   */
  @javax.annotation.Nullable
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
   */
  @javax.annotation.Nullable
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
   */
  @javax.annotation.Nullable
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
   */
  @javax.annotation.Nullable
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
   */
  @javax.annotation.Nullable
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
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to NamedVolume
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!NamedVolume.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in NamedVolume is not found in the empty JSON string", NamedVolume.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!NamedVolume.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `NamedVolume` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("Dest") != null && !jsonObj.get("Dest").isJsonNull()) && !jsonObj.get("Dest").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `Dest` to be a primitive type in the JSON string but got `%s`", jsonObj.get("Dest").toString()));
      }
      if ((jsonObj.get("Name") != null && !jsonObj.get("Name").isJsonNull()) && !jsonObj.get("Name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `Name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("Name").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("Options") != null && !jsonObj.get("Options").isJsonNull() && !jsonObj.get("Options").isJsonArray()) {
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
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
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

