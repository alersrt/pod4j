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
import io.github.alersrt.pod4j.openapi.model.EndpointResource;
import io.github.alersrt.pod4j.openapi.model.IPAM;
import io.github.alersrt.pod4j.openapi.model.PeerInfo;
import io.github.alersrt.pod4j.openapi.model.ServiceInfo;
import java.io.IOException;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
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
 * Inspect
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-11-18T19:32:04.765618819+07:00[Asia/Barnaul]", comments = "Generator version: 7.7.0")
public class Inspect {
  public static final String SERIALIZED_NAME_ATTACHABLE = "Attachable";
  @SerializedName(SERIALIZED_NAME_ATTACHABLE)
  private Boolean attachable;

  public static final String SERIALIZED_NAME_CONFIG_FROM = "ConfigFrom";
  @SerializedName(SERIALIZED_NAME_CONFIG_FROM)
  private ConfigReference configFrom;

  public static final String SERIALIZED_NAME_CONFIG_ONLY = "ConfigOnly";
  @SerializedName(SERIALIZED_NAME_CONFIG_ONLY)
  private Boolean configOnly;

  public static final String SERIALIZED_NAME_CONTAINERS = "Containers";
  @SerializedName(SERIALIZED_NAME_CONTAINERS)
  private Map<String, EndpointResource> containers = new HashMap<>();

  public static final String SERIALIZED_NAME_CREATED = "Created";
  @SerializedName(SERIALIZED_NAME_CREATED)
  private OffsetDateTime created;

  public static final String SERIALIZED_NAME_DRIVER = "Driver";
  @SerializedName(SERIALIZED_NAME_DRIVER)
  private String driver;

  public static final String SERIALIZED_NAME_ENABLE_I_PV6 = "EnableIPv6";
  @SerializedName(SERIALIZED_NAME_ENABLE_I_PV6)
  private Boolean enableIPv6;

  public static final String SERIALIZED_NAME_I_P_A_M = "IPAM";
  @SerializedName(SERIALIZED_NAME_I_P_A_M)
  private IPAM ipam;

  public static final String SERIALIZED_NAME_ID = "Id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  public static final String SERIALIZED_NAME_INGRESS = "Ingress";
  @SerializedName(SERIALIZED_NAME_INGRESS)
  private Boolean ingress;

  public static final String SERIALIZED_NAME_INTERNAL = "Internal";
  @SerializedName(SERIALIZED_NAME_INTERNAL)
  private Boolean internal;

  public static final String SERIALIZED_NAME_LABELS = "Labels";
  @SerializedName(SERIALIZED_NAME_LABELS)
  private Map<String, String> labels = new HashMap<>();

  public static final String SERIALIZED_NAME_NAME = "Name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_OPTIONS = "Options";
  @SerializedName(SERIALIZED_NAME_OPTIONS)
  private Map<String, String> options = new HashMap<>();

  public static final String SERIALIZED_NAME_PEERS = "Peers";
  @SerializedName(SERIALIZED_NAME_PEERS)
  private List<PeerInfo> peers = new ArrayList<>();

  public static final String SERIALIZED_NAME_SCOPE = "Scope";
  @SerializedName(SERIALIZED_NAME_SCOPE)
  private String scope;

  public static final String SERIALIZED_NAME_SERVICES = "Services";
  @SerializedName(SERIALIZED_NAME_SERVICES)
  private Map<String, ServiceInfo> services = new HashMap<>();

  public Inspect() {
  }

  public Inspect attachable(Boolean attachable) {
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


  public Inspect configFrom(ConfigReference configFrom) {
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


  public Inspect configOnly(Boolean configOnly) {
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


  public Inspect containers(Map<String, EndpointResource> containers) {
    this.containers = containers;
    return this;
  }

  public Inspect putContainersItem(String key, EndpointResource containersItem) {
    if (this.containers == null) {
      this.containers = new HashMap<>();
    }
    this.containers.put(key, containersItem);
    return this;
  }

  /**
   * Get containers
   * @return containers
   */
  @javax.annotation.Nullable
  public Map<String, EndpointResource> getContainers() {
    return containers;
  }

  public void setContainers(Map<String, EndpointResource> containers) {
    this.containers = containers;
  }


  public Inspect created(OffsetDateTime created) {
    this.created = created;
    return this;
  }

  /**
   * Get created
   * @return created
   */
  @javax.annotation.Nullable
  public OffsetDateTime getCreated() {
    return created;
  }

  public void setCreated(OffsetDateTime created) {
    this.created = created;
  }


  public Inspect driver(String driver) {
    this.driver = driver;
    return this;
  }

  /**
   * Get driver
   * @return driver
   */
  @javax.annotation.Nullable
  public String getDriver() {
    return driver;
  }

  public void setDriver(String driver) {
    this.driver = driver;
  }


  public Inspect enableIPv6(Boolean enableIPv6) {
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


  public Inspect ipam(IPAM ipam) {
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


  public Inspect id(String id) {
    this.id = id;
    return this;
  }

  /**
   * Get id
   * @return id
   */
  @javax.annotation.Nullable
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }


  public Inspect ingress(Boolean ingress) {
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


  public Inspect internal(Boolean internal) {
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


  public Inspect labels(Map<String, String> labels) {
    this.labels = labels;
    return this;
  }

  public Inspect putLabelsItem(String key, String labelsItem) {
    if (this.labels == null) {
      this.labels = new HashMap<>();
    }
    this.labels.put(key, labelsItem);
    return this;
  }

  /**
   * Get labels
   * @return labels
   */
  @javax.annotation.Nullable
  public Map<String, String> getLabels() {
    return labels;
  }

  public void setLabels(Map<String, String> labels) {
    this.labels = labels;
  }


  public Inspect name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Get name
   * @return name
   */
  @javax.annotation.Nullable
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }


  public Inspect options(Map<String, String> options) {
    this.options = options;
    return this;
  }

  public Inspect putOptionsItem(String key, String optionsItem) {
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


  public Inspect peers(List<PeerInfo> peers) {
    this.peers = peers;
    return this;
  }

  public Inspect addPeersItem(PeerInfo peersItem) {
    if (this.peers == null) {
      this.peers = new ArrayList<>();
    }
    this.peers.add(peersItem);
    return this;
  }

  /**
   * Get peers
   * @return peers
   */
  @javax.annotation.Nullable
  public List<PeerInfo> getPeers() {
    return peers;
  }

  public void setPeers(List<PeerInfo> peers) {
    this.peers = peers;
  }


  public Inspect scope(String scope) {
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


  public Inspect services(Map<String, ServiceInfo> services) {
    this.services = services;
    return this;
  }

  public Inspect putServicesItem(String key, ServiceInfo servicesItem) {
    if (this.services == null) {
      this.services = new HashMap<>();
    }
    this.services.put(key, servicesItem);
    return this;
  }

  /**
   * Get services
   * @return services
   */
  @javax.annotation.Nullable
  public Map<String, ServiceInfo> getServices() {
    return services;
  }

  public void setServices(Map<String, ServiceInfo> services) {
    this.services = services;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Inspect inspect = (Inspect) o;
    return Objects.equals(this.attachable, inspect.attachable) &&
        Objects.equals(this.configFrom, inspect.configFrom) &&
        Objects.equals(this.configOnly, inspect.configOnly) &&
        Objects.equals(this.containers, inspect.containers) &&
        Objects.equals(this.created, inspect.created) &&
        Objects.equals(this.driver, inspect.driver) &&
        Objects.equals(this.enableIPv6, inspect.enableIPv6) &&
        Objects.equals(this.ipam, inspect.ipam) &&
        Objects.equals(this.id, inspect.id) &&
        Objects.equals(this.ingress, inspect.ingress) &&
        Objects.equals(this.internal, inspect.internal) &&
        Objects.equals(this.labels, inspect.labels) &&
        Objects.equals(this.name, inspect.name) &&
        Objects.equals(this.options, inspect.options) &&
        Objects.equals(this.peers, inspect.peers) &&
        Objects.equals(this.scope, inspect.scope) &&
        Objects.equals(this.services, inspect.services);
  }

  @Override
  public int hashCode() {
    return Objects.hash(attachable, configFrom, configOnly, containers, created, driver, enableIPv6, ipam, id, ingress, internal, labels, name, options, peers, scope, services);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Inspect {\n");
    sb.append("    attachable: ").append(toIndentedString(attachable)).append("\n");
    sb.append("    configFrom: ").append(toIndentedString(configFrom)).append("\n");
    sb.append("    configOnly: ").append(toIndentedString(configOnly)).append("\n");
    sb.append("    containers: ").append(toIndentedString(containers)).append("\n");
    sb.append("    created: ").append(toIndentedString(created)).append("\n");
    sb.append("    driver: ").append(toIndentedString(driver)).append("\n");
    sb.append("    enableIPv6: ").append(toIndentedString(enableIPv6)).append("\n");
    sb.append("    ipam: ").append(toIndentedString(ipam)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    ingress: ").append(toIndentedString(ingress)).append("\n");
    sb.append("    internal: ").append(toIndentedString(internal)).append("\n");
    sb.append("    labels: ").append(toIndentedString(labels)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    options: ").append(toIndentedString(options)).append("\n");
    sb.append("    peers: ").append(toIndentedString(peers)).append("\n");
    sb.append("    scope: ").append(toIndentedString(scope)).append("\n");
    sb.append("    services: ").append(toIndentedString(services)).append("\n");
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
    openapiFields.add("Containers");
    openapiFields.add("Created");
    openapiFields.add("Driver");
    openapiFields.add("EnableIPv6");
    openapiFields.add("IPAM");
    openapiFields.add("Id");
    openapiFields.add("Ingress");
    openapiFields.add("Internal");
    openapiFields.add("Labels");
    openapiFields.add("Name");
    openapiFields.add("Options");
    openapiFields.add("Peers");
    openapiFields.add("Scope");
    openapiFields.add("Services");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to Inspect
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!Inspect.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in Inspect is not found in the empty JSON string", Inspect.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!Inspect.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `Inspect` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
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
      if ((jsonObj.get("Id") != null && !jsonObj.get("Id").isJsonNull()) && !jsonObj.get("Id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `Id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("Id").toString()));
      }
      if ((jsonObj.get("Name") != null && !jsonObj.get("Name").isJsonNull()) && !jsonObj.get("Name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `Name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("Name").toString()));
      }
      if (jsonObj.get("Peers") != null && !jsonObj.get("Peers").isJsonNull()) {
        JsonArray jsonArraypeers = jsonObj.getAsJsonArray("Peers");
        if (jsonArraypeers != null) {
          // ensure the json data is an array
          if (!jsonObj.get("Peers").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `Peers` to be an array in the JSON string but got `%s`", jsonObj.get("Peers").toString()));
          }

          // validate the optional field `Peers` (array)
          for (int i = 0; i < jsonArraypeers.size(); i++) {
            PeerInfo.validateJsonElement(jsonArraypeers.get(i));
          };
        }
      }
      if ((jsonObj.get("Scope") != null && !jsonObj.get("Scope").isJsonNull()) && !jsonObj.get("Scope").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `Scope` to be a primitive type in the JSON string but got `%s`", jsonObj.get("Scope").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!Inspect.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'Inspect' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<Inspect> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(Inspect.class));

       return (TypeAdapter<T>) new TypeAdapter<Inspect>() {
           @Override
           public void write(JsonWriter out, Inspect value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public Inspect read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of Inspect given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of Inspect
   * @throws IOException if the JSON string is invalid with respect to Inspect
   */
  public static Inspect fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, Inspect.class);
  }

  /**
   * Convert an instance of Inspect to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

