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
import io.github.alersrt.pod4j.openapi.model.ConfigReference;
import io.github.alersrt.pod4j.openapi.model.IPAM;
import java.io.IOException;
import java.util.Arrays;
import java.util.HashMap;
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
 * CreateOptions
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-11-19T11:19:05.435500352+07:00[Asia/Barnaul]", comments = "Generator version: 7.7.0")
public class CreateOptions {
  public static final String SERIALIZED_NAME_ATTACHABLE = "Attachable";
  @SerializedName(SERIALIZED_NAME_ATTACHABLE)
  private Boolean attachable;

  public static final String SERIALIZED_NAME_CONFIG_FROM = "ConfigFrom";
  @SerializedName(SERIALIZED_NAME_CONFIG_FROM)
  private ConfigReference configFrom;

  public static final String SERIALIZED_NAME_CONFIG_ONLY = "ConfigOnly";
  @SerializedName(SERIALIZED_NAME_CONFIG_ONLY)
  private Boolean configOnly;

  public static final String SERIALIZED_NAME_DRIVER = "Driver";
  @SerializedName(SERIALIZED_NAME_DRIVER)
  private String driver;

  public static final String SERIALIZED_NAME_ENABLE_I_PV6 = "EnableIPv6";
  @SerializedName(SERIALIZED_NAME_ENABLE_I_PV6)
  private Boolean enableIPv6;

  public static final String SERIALIZED_NAME_I_P_A_M = "IPAM";
  @SerializedName(SERIALIZED_NAME_I_P_A_M)
  private IPAM ipam;

  public static final String SERIALIZED_NAME_INGRESS = "Ingress";
  @SerializedName(SERIALIZED_NAME_INGRESS)
  private Boolean ingress;

  public static final String SERIALIZED_NAME_INTERNAL = "Internal";
  @SerializedName(SERIALIZED_NAME_INTERNAL)
  private Boolean internal;

  public static final String SERIALIZED_NAME_LABELS = "Labels";
  @SerializedName(SERIALIZED_NAME_LABELS)
  private Map<String, String> labels = new HashMap<>();

  public static final String SERIALIZED_NAME_OPTIONS = "Options";
  @SerializedName(SERIALIZED_NAME_OPTIONS)
  private Map<String, String> options = new HashMap<>();

  public static final String SERIALIZED_NAME_SCOPE = "Scope";
  @SerializedName(SERIALIZED_NAME_SCOPE)
  private String scope;

  public CreateOptions() {
  }

  public CreateOptions attachable(Boolean attachable) {
    this.attachable = attachable;
    return this;
  }

  /**
   * Get attachable
   * @return attachable
   */
  @javax.annotation.Nullable
  public Boolean getAttachable() {
    return attachable;
  }

  public void setAttachable(Boolean attachable) {
    this.attachable = attachable;
  }


  public CreateOptions configFrom(ConfigReference configFrom) {
    this.configFrom = configFrom;
    return this;
  }

  /**
   * Get configFrom
   * @return configFrom
   */
  @javax.annotation.Nullable
  public ConfigReference getConfigFrom() {
    return configFrom;
  }

  public void setConfigFrom(ConfigReference configFrom) {
    this.configFrom = configFrom;
  }


  public CreateOptions configOnly(Boolean configOnly) {
    this.configOnly = configOnly;
    return this;
  }

  /**
   * Get configOnly
   * @return configOnly
   */
  @javax.annotation.Nullable
  public Boolean getConfigOnly() {
    return configOnly;
  }

  public void setConfigOnly(Boolean configOnly) {
    this.configOnly = configOnly;
  }


  public CreateOptions driver(String driver) {
    this.driver = driver;
    return this;
  }

  /**
   * Name of the volume driver to use.
   * @return driver
   */
  @javax.annotation.Nullable
  public String getDriver() {
    return driver;
  }

  public void setDriver(String driver) {
    this.driver = driver;
  }


  public CreateOptions enableIPv6(Boolean enableIPv6) {
    this.enableIPv6 = enableIPv6;
    return this;
  }

  /**
   * Get enableIPv6
   * @return enableIPv6
   */
  @javax.annotation.Nullable
  public Boolean getEnableIPv6() {
    return enableIPv6;
  }

  public void setEnableIPv6(Boolean enableIPv6) {
    this.enableIPv6 = enableIPv6;
  }


  public CreateOptions ipam(IPAM ipam) {
    this.ipam = ipam;
    return this;
  }

  /**
   * Get ipam
   * @return ipam
   */
  @javax.annotation.Nullable
  public IPAM getIPAM() {
    return ipam;
  }

  public void setIPAM(IPAM ipam) {
    this.ipam = ipam;
  }


  public CreateOptions ingress(Boolean ingress) {
    this.ingress = ingress;
    return this;
  }

  /**
   * Get ingress
   * @return ingress
   */
  @javax.annotation.Nullable
  public Boolean getIngress() {
    return ingress;
  }

  public void setIngress(Boolean ingress) {
    this.ingress = ingress;
  }


  public CreateOptions internal(Boolean internal) {
    this.internal = internal;
    return this;
  }

  /**
   * Get internal
   * @return internal
   */
  @javax.annotation.Nullable
  public Boolean getInternal() {
    return internal;
  }

  public void setInternal(Boolean internal) {
    this.internal = internal;
  }


  public CreateOptions labels(Map<String, String> labels) {
    this.labels = labels;
    return this;
  }

  public CreateOptions putLabelsItem(String key, String labelsItem) {
    if (this.labels == null) {
      this.labels = new HashMap<>();
    }
    this.labels.put(key, labelsItem);
    return this;
  }

  /**
   * User-defined key/value metadata.
   * @return labels
   */
  @javax.annotation.Nullable
  public Map<String, String> getLabels() {
    return labels;
  }

  public void setLabels(Map<String, String> labels) {
    this.labels = labels;
  }


  public CreateOptions options(Map<String, String> options) {
    this.options = options;
    return this;
  }

  public CreateOptions putOptionsItem(String key, String optionsItem) {
    if (this.options == null) {
      this.options = new HashMap<>();
    }
    this.options.put(key, optionsItem);
    return this;
  }

  /**
   * Get options
   * @return options
   */
  @javax.annotation.Nullable
  public Map<String, String> getOptions() {
    return options;
  }

  public void setOptions(Map<String, String> options) {
    this.options = options;
  }


  public CreateOptions scope(String scope) {
    this.scope = scope;
    return this;
  }

  /**
   * Get scope
   * @return scope
   */
  @javax.annotation.Nullable
  public String getScope() {
    return scope;
  }

  public void setScope(String scope) {
    this.scope = scope;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateOptions createOptions = (CreateOptions) o;
    return Objects.equals(this.attachable, createOptions.attachable) &&
        Objects.equals(this.configFrom, createOptions.configFrom) &&
        Objects.equals(this.configOnly, createOptions.configOnly) &&
        Objects.equals(this.driver, createOptions.driver) &&
        Objects.equals(this.enableIPv6, createOptions.enableIPv6) &&
        Objects.equals(this.ipam, createOptions.ipam) &&
        Objects.equals(this.ingress, createOptions.ingress) &&
        Objects.equals(this.internal, createOptions.internal) &&
        Objects.equals(this.labels, createOptions.labels) &&
        Objects.equals(this.options, createOptions.options) &&
        Objects.equals(this.scope, createOptions.scope);
  }

  @Override
  public int hashCode() {
    return Objects.hash(attachable, configFrom, configOnly, driver, enableIPv6, ipam, ingress, internal, labels, options, scope);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateOptions {\n");
    sb.append("    attachable: ").append(toIndentedString(attachable)).append("\n");
    sb.append("    configFrom: ").append(toIndentedString(configFrom)).append("\n");
    sb.append("    configOnly: ").append(toIndentedString(configOnly)).append("\n");
    sb.append("    driver: ").append(toIndentedString(driver)).append("\n");
    sb.append("    enableIPv6: ").append(toIndentedString(enableIPv6)).append("\n");
    sb.append("    ipam: ").append(toIndentedString(ipam)).append("\n");
    sb.append("    ingress: ").append(toIndentedString(ingress)).append("\n");
    sb.append("    internal: ").append(toIndentedString(internal)).append("\n");
    sb.append("    labels: ").append(toIndentedString(labels)).append("\n");
    sb.append("    options: ").append(toIndentedString(options)).append("\n");
    sb.append("    scope: ").append(toIndentedString(scope)).append("\n");
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
    openapiFields.add("Attachable");
    openapiFields.add("ConfigFrom");
    openapiFields.add("ConfigOnly");
    openapiFields.add("Driver");
    openapiFields.add("EnableIPv6");
    openapiFields.add("IPAM");
    openapiFields.add("Ingress");
    openapiFields.add("Internal");
    openapiFields.add("Labels");
    openapiFields.add("Options");
    openapiFields.add("Scope");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to CreateOptions
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!CreateOptions.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in CreateOptions is not found in the empty JSON string", CreateOptions.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!CreateOptions.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `CreateOptions` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the optional field `ConfigFrom`
      if (jsonObj.get("ConfigFrom") != null && !jsonObj.get("ConfigFrom").isJsonNull()) {
        ConfigReference.validateJsonElement(jsonObj.get("ConfigFrom"));
      }
      if ((jsonObj.get("Driver") != null && !jsonObj.get("Driver").isJsonNull()) && !jsonObj.get("Driver").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `Driver` to be a primitive type in the JSON string but got `%s`", jsonObj.get("Driver").toString()));
      }
      // validate the optional field `IPAM`
      if (jsonObj.get("IPAM") != null && !jsonObj.get("IPAM").isJsonNull()) {
        IPAM.validateJsonElement(jsonObj.get("IPAM"));
      }
      if ((jsonObj.get("Scope") != null && !jsonObj.get("Scope").isJsonNull()) && !jsonObj.get("Scope").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `Scope` to be a primitive type in the JSON string but got `%s`", jsonObj.get("Scope").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!CreateOptions.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'CreateOptions' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<CreateOptions> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(CreateOptions.class));

       return (TypeAdapter<T>) new TypeAdapter<CreateOptions>() {
           @Override
           public void write(JsonWriter out, CreateOptions value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public CreateOptions read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of CreateOptions given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of CreateOptions
   * @throws IOException if the JSON string is invalid with respect to CreateOptions
   */
  public static CreateOptions fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CreateOptions.class);
  }

  /**
   * Convert an instance of CreateOptions to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

