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
import io.github.alersrt.pod4j.openapi.model.PerNetworkOptions;
import io.github.alersrt.pod4j.openapi.model.PortMapping;
import java.io.IOException;
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
 * NetOptions reflect the shared network options between pods and containers
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-11-19T11:19:05.435500352+07:00[Asia/Barnaul]", comments = "Generator version: 7.7.0")
public class NetOptions {
  public static final String SERIALIZED_NAME_DNS_OPTION = "dns_option";
  @SerializedName(SERIALIZED_NAME_DNS_OPTION)
  private List<String> dnsOption = new ArrayList<>();

  public static final String SERIALIZED_NAME_DNS_SEARCH = "dns_search";
  @SerializedName(SERIALIZED_NAME_DNS_SEARCH)
  private List<String> dnsSearch = new ArrayList<>();

  public static final String SERIALIZED_NAME_DNS_SERVER = "dns_server";
  @SerializedName(SERIALIZED_NAME_DNS_SERVER)
  private List<String> dnsServer = new ArrayList<>();

  public static final String SERIALIZED_NAME_HOSTADD = "hostadd";
  @SerializedName(SERIALIZED_NAME_HOSTADD)
  private List<String> hostadd = new ArrayList<>();

  public static final String SERIALIZED_NAME_NETNS = "netns";
  @SerializedName(SERIALIZED_NAME_NETNS)
  private Namespace netns;

  public static final String SERIALIZED_NAME_NETWORK_ALIAS = "network_alias";
  @SerializedName(SERIALIZED_NAME_NETWORK_ALIAS)
  private List<String> networkAlias = new ArrayList<>();

  public static final String SERIALIZED_NAME_NETWORK_OPTIONS = "network_options";
  @SerializedName(SERIALIZED_NAME_NETWORK_OPTIONS)
  private Map<String, List<String>> networkOptions = new HashMap<>();

  public static final String SERIALIZED_NAME_NETWORKS = "networks";
  @SerializedName(SERIALIZED_NAME_NETWORKS)
  private Map<String, PerNetworkOptions> networks = new HashMap<>();

  public static final String SERIALIZED_NAME_NO_MANAGE_HOSTS = "no_manage_hosts";
  @SerializedName(SERIALIZED_NAME_NO_MANAGE_HOSTS)
  private Boolean noManageHosts;

  public static final String SERIALIZED_NAME_NO_MANAGE_RESOLV_CONF = "no_manage_resolv_conf";
  @SerializedName(SERIALIZED_NAME_NO_MANAGE_RESOLV_CONF)
  private Boolean noManageResolvConf;

  public static final String SERIALIZED_NAME_PORTMAPPINGS = "portmappings";
  @SerializedName(SERIALIZED_NAME_PORTMAPPINGS)
  private List<PortMapping> portmappings = new ArrayList<>();

  public NetOptions() {
  }

  public NetOptions dnsOption(List<String> dnsOption) {
    this.dnsOption = dnsOption;
    return this;
  }

  public NetOptions addDnsOptionItem(String dnsOptionItem) {
    if (this.dnsOption == null) {
      this.dnsOption = new ArrayList<>();
    }
    this.dnsOption.add(dnsOptionItem);
    return this;
  }

  /**
   * Get dnsOption
   * @return dnsOption
   */
  @javax.annotation.Nullable
  public List<String> getDnsOption() {
    return dnsOption;
  }

  public void setDnsOption(List<String> dnsOption) {
    this.dnsOption = dnsOption;
  }


  public NetOptions dnsSearch(List<String> dnsSearch) {
    this.dnsSearch = dnsSearch;
    return this;
  }

  public NetOptions addDnsSearchItem(String dnsSearchItem) {
    if (this.dnsSearch == null) {
      this.dnsSearch = new ArrayList<>();
    }
    this.dnsSearch.add(dnsSearchItem);
    return this;
  }

  /**
   * Get dnsSearch
   * @return dnsSearch
   */
  @javax.annotation.Nullable
  public List<String> getDnsSearch() {
    return dnsSearch;
  }

  public void setDnsSearch(List<String> dnsSearch) {
    this.dnsSearch = dnsSearch;
  }


  public NetOptions dnsServer(List<String> dnsServer) {
    this.dnsServer = dnsServer;
    return this;
  }

  public NetOptions addDnsServerItem(String dnsServerItem) {
    if (this.dnsServer == null) {
      this.dnsServer = new ArrayList<>();
    }
    this.dnsServer.add(dnsServerItem);
    return this;
  }

  /**
   * Get dnsServer
   * @return dnsServer
   */
  @javax.annotation.Nullable
  public List<String> getDnsServer() {
    return dnsServer;
  }

  public void setDnsServer(List<String> dnsServer) {
    this.dnsServer = dnsServer;
  }


  public NetOptions hostadd(List<String> hostadd) {
    this.hostadd = hostadd;
    return this;
  }

  public NetOptions addHostaddItem(String hostaddItem) {
    if (this.hostadd == null) {
      this.hostadd = new ArrayList<>();
    }
    this.hostadd.add(hostaddItem);
    return this;
  }

  /**
   * Get hostadd
   * @return hostadd
   */
  @javax.annotation.Nullable
  public List<String> getHostadd() {
    return hostadd;
  }

  public void setHostadd(List<String> hostadd) {
    this.hostadd = hostadd;
  }


  public NetOptions netns(Namespace netns) {
    this.netns = netns;
    return this;
  }

  /**
   * Get netns
   * @return netns
   */
  @javax.annotation.Nullable
  public Namespace getNetns() {
    return netns;
  }

  public void setNetns(Namespace netns) {
    this.netns = netns;
  }


  public NetOptions networkAlias(List<String> networkAlias) {
    this.networkAlias = networkAlias;
    return this;
  }

  public NetOptions addNetworkAliasItem(String networkAliasItem) {
    if (this.networkAlias == null) {
      this.networkAlias = new ArrayList<>();
    }
    this.networkAlias.add(networkAliasItem);
    return this;
  }

  /**
   * Get networkAlias
   * @return networkAlias
   */
  @javax.annotation.Nullable
  public List<String> getNetworkAlias() {
    return networkAlias;
  }

  public void setNetworkAlias(List<String> networkAlias) {
    this.networkAlias = networkAlias;
  }


  public NetOptions networkOptions(Map<String, List<String>> networkOptions) {
    this.networkOptions = networkOptions;
    return this;
  }

  public NetOptions putNetworkOptionsItem(String key, List<String> networkOptionsItem) {
    if (this.networkOptions == null) {
      this.networkOptions = new HashMap<>();
    }
    this.networkOptions.put(key, networkOptionsItem);
    return this;
  }

  /**
   * NetworkOptions are additional options for each network
   * @return networkOptions
   */
  @javax.annotation.Nullable
  public Map<String, List<String>> getNetworkOptions() {
    return networkOptions;
  }

  public void setNetworkOptions(Map<String, List<String>> networkOptions) {
    this.networkOptions = networkOptions;
  }


  public NetOptions networks(Map<String, PerNetworkOptions> networks) {
    this.networks = networks;
    return this;
  }

  public NetOptions putNetworksItem(String key, PerNetworkOptions networksItem) {
    if (this.networks == null) {
      this.networks = new HashMap<>();
    }
    this.networks.put(key, networksItem);
    return this;
  }

  /**
   * Get networks
   * @return networks
   */
  @javax.annotation.Nullable
  public Map<String, PerNetworkOptions> getNetworks() {
    return networks;
  }

  public void setNetworks(Map<String, PerNetworkOptions> networks) {
    this.networks = networks;
  }


  public NetOptions noManageHosts(Boolean noManageHosts) {
    this.noManageHosts = noManageHosts;
    return this;
  }

  /**
   * Get noManageHosts
   * @return noManageHosts
   */
  @javax.annotation.Nullable
  public Boolean getNoManageHosts() {
    return noManageHosts;
  }

  public void setNoManageHosts(Boolean noManageHosts) {
    this.noManageHosts = noManageHosts;
  }


  public NetOptions noManageResolvConf(Boolean noManageResolvConf) {
    this.noManageResolvConf = noManageResolvConf;
    return this;
  }

  /**
   * Get noManageResolvConf
   * @return noManageResolvConf
   */
  @javax.annotation.Nullable
  public Boolean getNoManageResolvConf() {
    return noManageResolvConf;
  }

  public void setNoManageResolvConf(Boolean noManageResolvConf) {
    this.noManageResolvConf = noManageResolvConf;
  }


  public NetOptions portmappings(List<PortMapping> portmappings) {
    this.portmappings = portmappings;
    return this;
  }

  public NetOptions addPortmappingsItem(PortMapping portmappingsItem) {
    if (this.portmappings == null) {
      this.portmappings = new ArrayList<>();
    }
    this.portmappings.add(portmappingsItem);
    return this;
  }

  /**
   * Get portmappings
   * @return portmappings
   */
  @javax.annotation.Nullable
  public List<PortMapping> getPortmappings() {
    return portmappings;
  }

  public void setPortmappings(List<PortMapping> portmappings) {
    this.portmappings = portmappings;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    NetOptions netOptions = (NetOptions) o;
    return Objects.equals(this.dnsOption, netOptions.dnsOption) &&
        Objects.equals(this.dnsSearch, netOptions.dnsSearch) &&
        Objects.equals(this.dnsServer, netOptions.dnsServer) &&
        Objects.equals(this.hostadd, netOptions.hostadd) &&
        Objects.equals(this.netns, netOptions.netns) &&
        Objects.equals(this.networkAlias, netOptions.networkAlias) &&
        Objects.equals(this.networkOptions, netOptions.networkOptions) &&
        Objects.equals(this.networks, netOptions.networks) &&
        Objects.equals(this.noManageHosts, netOptions.noManageHosts) &&
        Objects.equals(this.noManageResolvConf, netOptions.noManageResolvConf) &&
        Objects.equals(this.portmappings, netOptions.portmappings);
  }

  @Override
  public int hashCode() {
    return Objects.hash(dnsOption, dnsSearch, dnsServer, hostadd, netns, networkAlias, networkOptions, networks, noManageHosts, noManageResolvConf, portmappings);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NetOptions {\n");
    sb.append("    dnsOption: ").append(toIndentedString(dnsOption)).append("\n");
    sb.append("    dnsSearch: ").append(toIndentedString(dnsSearch)).append("\n");
    sb.append("    dnsServer: ").append(toIndentedString(dnsServer)).append("\n");
    sb.append("    hostadd: ").append(toIndentedString(hostadd)).append("\n");
    sb.append("    netns: ").append(toIndentedString(netns)).append("\n");
    sb.append("    networkAlias: ").append(toIndentedString(networkAlias)).append("\n");
    sb.append("    networkOptions: ").append(toIndentedString(networkOptions)).append("\n");
    sb.append("    networks: ").append(toIndentedString(networks)).append("\n");
    sb.append("    noManageHosts: ").append(toIndentedString(noManageHosts)).append("\n");
    sb.append("    noManageResolvConf: ").append(toIndentedString(noManageResolvConf)).append("\n");
    sb.append("    portmappings: ").append(toIndentedString(portmappings)).append("\n");
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
    openapiFields.add("dns_option");
    openapiFields.add("dns_search");
    openapiFields.add("dns_server");
    openapiFields.add("hostadd");
    openapiFields.add("netns");
    openapiFields.add("network_alias");
    openapiFields.add("network_options");
    openapiFields.add("networks");
    openapiFields.add("no_manage_hosts");
    openapiFields.add("no_manage_resolv_conf");
    openapiFields.add("portmappings");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to NetOptions
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!NetOptions.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in NetOptions is not found in the empty JSON string", NetOptions.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!NetOptions.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `NetOptions` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // ensure the optional json data is an array if present
      if (jsonObj.get("dns_option") != null && !jsonObj.get("dns_option").isJsonNull() && !jsonObj.get("dns_option").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `dns_option` to be an array in the JSON string but got `%s`", jsonObj.get("dns_option").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("dns_search") != null && !jsonObj.get("dns_search").isJsonNull() && !jsonObj.get("dns_search").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `dns_search` to be an array in the JSON string but got `%s`", jsonObj.get("dns_search").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("dns_server") != null && !jsonObj.get("dns_server").isJsonNull() && !jsonObj.get("dns_server").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `dns_server` to be an array in the JSON string but got `%s`", jsonObj.get("dns_server").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("hostadd") != null && !jsonObj.get("hostadd").isJsonNull() && !jsonObj.get("hostadd").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `hostadd` to be an array in the JSON string but got `%s`", jsonObj.get("hostadd").toString()));
      }
      // validate the optional field `netns`
      if (jsonObj.get("netns") != null && !jsonObj.get("netns").isJsonNull()) {
        Namespace.validateJsonElement(jsonObj.get("netns"));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("network_alias") != null && !jsonObj.get("network_alias").isJsonNull() && !jsonObj.get("network_alias").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `network_alias` to be an array in the JSON string but got `%s`", jsonObj.get("network_alias").toString()));
      }
      if (jsonObj.get("portmappings") != null && !jsonObj.get("portmappings").isJsonNull()) {
        JsonArray jsonArrayportmappings = jsonObj.getAsJsonArray("portmappings");
        if (jsonArrayportmappings != null) {
          // ensure the json data is an array
          if (!jsonObj.get("portmappings").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `portmappings` to be an array in the JSON string but got `%s`", jsonObj.get("portmappings").toString()));
          }

          // validate the optional field `portmappings` (array)
          for (int i = 0; i < jsonArrayportmappings.size(); i++) {
            PortMapping.validateJsonElement(jsonArrayportmappings.get(i));
          };
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!NetOptions.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'NetOptions' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<NetOptions> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(NetOptions.class));

       return (TypeAdapter<T>) new TypeAdapter<NetOptions>() {
           @Override
           public void write(JsonWriter out, NetOptions value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public NetOptions read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of NetOptions given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of NetOptions
   * @throws IOException if the JSON string is invalid with respect to NetOptions
   */
  public static NetOptions fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, NetOptions.class);
  }

  /**
   * Convert an instance of NetOptions to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

