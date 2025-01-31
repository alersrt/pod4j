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
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Objects;
import java.util.Set;
import javax.validation.Valid;

/**
 * EndpointSettings stores the network endpoint details
 */
@ApiModel(description = "EndpointSettings stores the network endpoint details")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class EndpointSettings implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String SERIALIZED_NAME_ALIASES = "Aliases";
  @SerializedName(SERIALIZED_NAME_ALIASES)
  private List<String> aliases = null;

  public static final String SERIALIZED_NAME_DN_S_NAMES = "DNSNames";
  @SerializedName(SERIALIZED_NAME_DN_S_NAMES)
  private List<String> dnSNames = null;

  public static final String SERIALIZED_NAME_DRIVER_OPTS = "DriverOpts";
  @SerializedName(SERIALIZED_NAME_DRIVER_OPTS)
  private Map<String, String> driverOpts = null;

  public static final String SERIALIZED_NAME_ENDPOINT_I_D = "EndpointID";
  @SerializedName(SERIALIZED_NAME_ENDPOINT_I_D)
  private String endpointID;

  public static final String SERIALIZED_NAME_GATEWAY = "Gateway";
  @SerializedName(SERIALIZED_NAME_GATEWAY)
  private String gateway;

  public static final String SERIALIZED_NAME_GLOBAL_I_PV6_ADDRESS = "GlobalIPv6Address";
  @SerializedName(SERIALIZED_NAME_GLOBAL_I_PV6_ADDRESS)
  private String globalIPv6Address;

  public static final String SERIALIZED_NAME_GLOBAL_I_PV6_PREFIX_LEN = "GlobalIPv6PrefixLen";
  @SerializedName(SERIALIZED_NAME_GLOBAL_I_PV6_PREFIX_LEN)
  private Long globalIPv6PrefixLen;

  public static final String SERIALIZED_NAME_IP_A_M_CONFIG = "IPAMConfig";
  @SerializedName(SERIALIZED_NAME_IP_A_M_CONFIG)
  private EndpointIPAMConfig ipAMConfig;

  public static final String SERIALIZED_NAME_IP_ADDRESS = "IPAddress";
  @SerializedName(SERIALIZED_NAME_IP_ADDRESS)
  private String ipAddress;

  public static final String SERIALIZED_NAME_IP_PREFIX_LEN = "IPPrefixLen";
  @SerializedName(SERIALIZED_NAME_IP_PREFIX_LEN)
  private Long ipPrefixLen;

  public static final String SERIALIZED_NAME_IPV6_GATEWAY = "IPv6Gateway";
  @SerializedName(SERIALIZED_NAME_IPV6_GATEWAY)
  private String ipv6Gateway;

  public static final String SERIALIZED_NAME_LINKS = "Links";
  @SerializedName(SERIALIZED_NAME_LINKS)
  private List<String> links = null;

  public static final String SERIALIZED_NAME_MAC_ADDRESS = "MacAddress";
  @SerializedName(SERIALIZED_NAME_MAC_ADDRESS)
  private String macAddress;

  public static final String SERIALIZED_NAME_NETWORK_I_D = "NetworkID";
  @SerializedName(SERIALIZED_NAME_NETWORK_I_D)
  private String networkID;

  public EndpointSettings() {
  }

  public EndpointSettings aliases(List<String> aliases) {

    this.aliases = aliases;
    return this;
  }

  public EndpointSettings addAliasesItem(String aliasesItem) {
    if (this.aliases == null) {
      this.aliases = new ArrayList<>();
    }
    this.aliases.add(aliasesItem);
    return this;
  }

  /**
   * Get aliases
   * @return aliases
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<String> getAliases() {
    return aliases;
  }


  public void setAliases(List<String> aliases) {
    this.aliases = aliases;
  }


  public EndpointSettings dnSNames(List<String> dnSNames) {

    this.dnSNames = dnSNames;
    return this;
  }

  public EndpointSettings addDnSNamesItem(String dnSNamesItem) {
    if (this.dnSNames == null) {
      this.dnSNames = new ArrayList<>();
    }
    this.dnSNames.add(dnSNamesItem);
    return this;
  }

  /**
   * DNSNames holds all the (non fully qualified) DNS names associated to this endpoint. First entry is used to generate PTR records.
   * @return dnSNames
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "DNSNames holds all the (non fully qualified) DNS names associated to this endpoint. First entry is used to generate PTR records.")

  public List<String> getDnSNames() {
    return dnSNames;
  }


  public void setDnSNames(List<String> dnSNames) {
    this.dnSNames = dnSNames;
  }


  public EndpointSettings driverOpts(Map<String, String> driverOpts) {

    this.driverOpts = driverOpts;
    return this;
  }

  public EndpointSettings putDriverOptsItem(String key, String driverOptsItem) {
    if (this.driverOpts == null) {
      this.driverOpts = new HashMap<>();
    }
    this.driverOpts.put(key, driverOptsItem);
    return this;
  }

  /**
   * Get driverOpts
   * @return driverOpts
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Map<String, String> getDriverOpts() {
    return driverOpts;
  }


  public void setDriverOpts(Map<String, String> driverOpts) {
    this.driverOpts = driverOpts;
  }


  public EndpointSettings endpointID(String endpointID) {

    this.endpointID = endpointID;
    return this;
  }

  /**
   * Get endpointID
   * @return endpointID
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getEndpointID() {
    return endpointID;
  }


  public void setEndpointID(String endpointID) {
    this.endpointID = endpointID;
  }


  public EndpointSettings gateway(String gateway) {

    this.gateway = gateway;
    return this;
  }

  /**
   * Get gateway
   * @return gateway
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getGateway() {
    return gateway;
  }


  public void setGateway(String gateway) {
    this.gateway = gateway;
  }


  public EndpointSettings globalIPv6Address(String globalIPv6Address) {

    this.globalIPv6Address = globalIPv6Address;
    return this;
  }

  /**
   * Get globalIPv6Address
   * @return globalIPv6Address
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getGlobalIPv6Address() {
    return globalIPv6Address;
  }


  public void setGlobalIPv6Address(String globalIPv6Address) {
    this.globalIPv6Address = globalIPv6Address;
  }


  public EndpointSettings globalIPv6PrefixLen(Long globalIPv6PrefixLen) {

    this.globalIPv6PrefixLen = globalIPv6PrefixLen;
    return this;
  }

  /**
   * Get globalIPv6PrefixLen
   * @return globalIPv6PrefixLen
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Long getGlobalIPv6PrefixLen() {
    return globalIPv6PrefixLen;
  }


  public void setGlobalIPv6PrefixLen(Long globalIPv6PrefixLen) {
    this.globalIPv6PrefixLen = globalIPv6PrefixLen;
  }


  public EndpointSettings ipAMConfig(EndpointIPAMConfig ipAMConfig) {

    this.ipAMConfig = ipAMConfig;
    return this;
  }

  /**
   * Get ipAMConfig
   * @return ipAMConfig
   **/
  @javax.annotation.Nullable
  @Valid
  @ApiModelProperty(value = "")

  public EndpointIPAMConfig getIpAMConfig() {
    return ipAMConfig;
  }


  public void setIpAMConfig(EndpointIPAMConfig ipAMConfig) {
    this.ipAMConfig = ipAMConfig;
  }


  public EndpointSettings ipAddress(String ipAddress) {

    this.ipAddress = ipAddress;
    return this;
  }

  /**
   * Get ipAddress
   * @return ipAddress
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getIpAddress() {
    return ipAddress;
  }


  public void setIpAddress(String ipAddress) {
    this.ipAddress = ipAddress;
  }


  public EndpointSettings ipPrefixLen(Long ipPrefixLen) {

    this.ipPrefixLen = ipPrefixLen;
    return this;
  }

  /**
   * Get ipPrefixLen
   * @return ipPrefixLen
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Long getIpPrefixLen() {
    return ipPrefixLen;
  }


  public void setIpPrefixLen(Long ipPrefixLen) {
    this.ipPrefixLen = ipPrefixLen;
  }


  public EndpointSettings ipv6Gateway(String ipv6Gateway) {

    this.ipv6Gateway = ipv6Gateway;
    return this;
  }

  /**
   * Get ipv6Gateway
   * @return ipv6Gateway
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getIpv6Gateway() {
    return ipv6Gateway;
  }


  public void setIpv6Gateway(String ipv6Gateway) {
    this.ipv6Gateway = ipv6Gateway;
  }


  public EndpointSettings links(List<String> links) {

    this.links = links;
    return this;
  }

  public EndpointSettings addLinksItem(String linksItem) {
    if (this.links == null) {
      this.links = new ArrayList<>();
    }
    this.links.add(linksItem);
    return this;
  }

  /**
   * Get links
   * @return links
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<String> getLinks() {
    return links;
  }


  public void setLinks(List<String> links) {
    this.links = links;
  }


  public EndpointSettings macAddress(String macAddress) {

    this.macAddress = macAddress;
    return this;
  }

  /**
   * MacAddress may be used to specify a MAC address when the container is created. Once the container is running, it becomes operational data (it may contain a generated address).
   * @return macAddress
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "MacAddress may be used to specify a MAC address when the container is created. Once the container is running, it becomes operational data (it may contain a generated address).")

  public String getMacAddress() {
    return macAddress;
  }


  public void setMacAddress(String macAddress) {
    this.macAddress = macAddress;
  }


  public EndpointSettings networkID(String networkID) {

    this.networkID = networkID;
    return this;
  }

  /**
   * Operational data
   * @return networkID
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Operational data")

  public String getNetworkID() {
    return networkID;
  }


  public void setNetworkID(String networkID) {
    this.networkID = networkID;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EndpointSettings endpointSettings = (EndpointSettings) o;
    return Objects.equals(this.aliases, endpointSettings.aliases) &&
        Objects.equals(this.dnSNames, endpointSettings.dnSNames) &&
        Objects.equals(this.driverOpts, endpointSettings.driverOpts) &&
        Objects.equals(this.endpointID, endpointSettings.endpointID) &&
        Objects.equals(this.gateway, endpointSettings.gateway) &&
        Objects.equals(this.globalIPv6Address, endpointSettings.globalIPv6Address) &&
        Objects.equals(this.globalIPv6PrefixLen, endpointSettings.globalIPv6PrefixLen) &&
        Objects.equals(this.ipAMConfig, endpointSettings.ipAMConfig) &&
        Objects.equals(this.ipAddress, endpointSettings.ipAddress) &&
        Objects.equals(this.ipPrefixLen, endpointSettings.ipPrefixLen) &&
        Objects.equals(this.ipv6Gateway, endpointSettings.ipv6Gateway) &&
        Objects.equals(this.links, endpointSettings.links) &&
        Objects.equals(this.macAddress, endpointSettings.macAddress) &&
        Objects.equals(this.networkID, endpointSettings.networkID);
  }

  @Override
  public int hashCode() {
    return Objects.hash(aliases, dnSNames, driverOpts, endpointID, gateway, globalIPv6Address, globalIPv6PrefixLen, ipAMConfig, ipAddress, ipPrefixLen, ipv6Gateway, links, macAddress, networkID);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EndpointSettings {\n");
    sb.append("    aliases: ").append(toIndentedString(aliases)).append("\n");
    sb.append("    dnSNames: ").append(toIndentedString(dnSNames)).append("\n");
    sb.append("    driverOpts: ").append(toIndentedString(driverOpts)).append("\n");
    sb.append("    endpointID: ").append(toIndentedString(endpointID)).append("\n");
    sb.append("    gateway: ").append(toIndentedString(gateway)).append("\n");
    sb.append("    globalIPv6Address: ").append(toIndentedString(globalIPv6Address)).append("\n");
    sb.append("    globalIPv6PrefixLen: ").append(toIndentedString(globalIPv6PrefixLen)).append("\n");
    sb.append("    ipAMConfig: ").append(toIndentedString(ipAMConfig)).append("\n");
    sb.append("    ipAddress: ").append(toIndentedString(ipAddress)).append("\n");
    sb.append("    ipPrefixLen: ").append(toIndentedString(ipPrefixLen)).append("\n");
    sb.append("    ipv6Gateway: ").append(toIndentedString(ipv6Gateway)).append("\n");
    sb.append("    links: ").append(toIndentedString(links)).append("\n");
    sb.append("    macAddress: ").append(toIndentedString(macAddress)).append("\n");
    sb.append("    networkID: ").append(toIndentedString(networkID)).append("\n");
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
    openapiFields.add("Aliases");
    openapiFields.add("DNSNames");
    openapiFields.add("DriverOpts");
    openapiFields.add("EndpointID");
    openapiFields.add("Gateway");
    openapiFields.add("GlobalIPv6Address");
    openapiFields.add("GlobalIPv6PrefixLen");
    openapiFields.add("IPAMConfig");
    openapiFields.add("IPAddress");
    openapiFields.add("IPPrefixLen");
    openapiFields.add("IPv6Gateway");
    openapiFields.add("Links");
    openapiFields.add("MacAddress");
    openapiFields.add("NetworkID");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Object and throws an exception if issues found
   *
   * @param jsonObj JSON Object
   * @throws IOException if the JSON Object is invalid with respect to EndpointSettings
   */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (EndpointSettings.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in EndpointSettings is not found in the empty JSON string", EndpointSettings.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!EndpointSettings.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `EndpointSettings` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      // ensure the json data is an array
      if ((jsonObj.get("Aliases") != null && !jsonObj.get("Aliases").isJsonNull()) && !jsonObj.get("Aliases").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `Aliases` to be an array in the JSON string but got `%s`", jsonObj.get("Aliases").toString()));
      }
      // ensure the json data is an array
      if ((jsonObj.get("DNSNames") != null && !jsonObj.get("DNSNames").isJsonNull()) && !jsonObj.get("DNSNames").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `DNSNames` to be an array in the JSON string but got `%s`", jsonObj.get("DNSNames").toString()));
      }
      if ((jsonObj.get("EndpointID") != null && !jsonObj.get("EndpointID").isJsonNull()) && !jsonObj.get("EndpointID").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `EndpointID` to be a primitive type in the JSON string but got `%s`", jsonObj.get("EndpointID").toString()));
      }
      if ((jsonObj.get("Gateway") != null && !jsonObj.get("Gateway").isJsonNull()) && !jsonObj.get("Gateway").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `Gateway` to be a primitive type in the JSON string but got `%s`", jsonObj.get("Gateway").toString()));
      }
      if ((jsonObj.get("GlobalIPv6Address") != null && !jsonObj.get("GlobalIPv6Address").isJsonNull()) && !jsonObj.get("GlobalIPv6Address").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `GlobalIPv6Address` to be a primitive type in the JSON string but got `%s`", jsonObj.get("GlobalIPv6Address").toString()));
      }
      // validate the optional field `IPAMConfig`
      if (jsonObj.get("IPAMConfig") != null && !jsonObj.get("IPAMConfig").isJsonNull()) {
        EndpointIPAMConfig.validateJsonObject(jsonObj.getAsJsonObject("IPAMConfig"));
      }
      if ((jsonObj.get("IPAddress") != null && !jsonObj.get("IPAddress").isJsonNull()) && !jsonObj.get("IPAddress").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `IPAddress` to be a primitive type in the JSON string but got `%s`", jsonObj.get("IPAddress").toString()));
      }
      if ((jsonObj.get("IPv6Gateway") != null && !jsonObj.get("IPv6Gateway").isJsonNull()) && !jsonObj.get("IPv6Gateway").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `IPv6Gateway` to be a primitive type in the JSON string but got `%s`", jsonObj.get("IPv6Gateway").toString()));
      }
      // ensure the json data is an array
      if ((jsonObj.get("Links") != null && !jsonObj.get("Links").isJsonNull()) && !jsonObj.get("Links").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `Links` to be an array in the JSON string but got `%s`", jsonObj.get("Links").toString()));
      }
      if ((jsonObj.get("MacAddress") != null && !jsonObj.get("MacAddress").isJsonNull()) && !jsonObj.get("MacAddress").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `MacAddress` to be a primitive type in the JSON string but got `%s`", jsonObj.get("MacAddress").toString()));
      }
      if ((jsonObj.get("NetworkID") != null && !jsonObj.get("NetworkID").isJsonNull()) && !jsonObj.get("NetworkID").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `NetworkID` to be a primitive type in the JSON string but got `%s`", jsonObj.get("NetworkID").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!EndpointSettings.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'EndpointSettings' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<EndpointSettings> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(EndpointSettings.class));

       return (TypeAdapter<T>) new TypeAdapter<EndpointSettings>() {
           @Override
           public void write(JsonWriter out, EndpointSettings value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public EndpointSettings read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of EndpointSettings given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of EndpointSettings
   * @throws IOException if the JSON string is invalid with respect to EndpointSettings
  */
  public static EndpointSettings fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, EndpointSettings.class);
  }

  /**
   * Convert an instance of EndpointSettings to an JSON string
   *
   * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

