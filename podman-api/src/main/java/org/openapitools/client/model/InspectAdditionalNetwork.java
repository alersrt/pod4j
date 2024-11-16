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
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.openapitools.client.model.Address;

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
 * InspectAdditionalNetwork holds information about non-default networks the container has been connected to. As with InspectNetworkSettings, many fields are unused and maintained only for compatibility with Docker.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-11-16T18:07:05.610979114+07:00[Asia/Barnaul]", comments = "Generator version: 7.8.0")
public class InspectAdditionalNetwork {
  public static final String SERIALIZED_NAME_ADDITIONAL_M_A_C_ADDRESSES = "AdditionalMACAddresses";
  @SerializedName(SERIALIZED_NAME_ADDITIONAL_M_A_C_ADDRESSES)
  private List<String> additionalMACAddresses = new ArrayList<>();

  public static final String SERIALIZED_NAME_ALIASES = "Aliases";
  @SerializedName(SERIALIZED_NAME_ALIASES)
  private List<String> aliases = new ArrayList<>();

  public static final String SERIALIZED_NAME_DRIVER_OPTS = "DriverOpts";
  @SerializedName(SERIALIZED_NAME_DRIVER_OPTS)
  private Map<String, String> driverOpts = new HashMap<>();

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
  private Map<String, String> ipAMConfig = new HashMap<>();

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
  private List<String> links = new ArrayList<>();

  public static final String SERIALIZED_NAME_MAC_ADDRESS = "MacAddress";
  @SerializedName(SERIALIZED_NAME_MAC_ADDRESS)
  private String macAddress;

  public static final String SERIALIZED_NAME_NETWORK_I_D = "NetworkID";
  @SerializedName(SERIALIZED_NAME_NETWORK_I_D)
  private String networkID;

  public static final String SERIALIZED_NAME_SECONDARY_I_P_ADDRESSES = "SecondaryIPAddresses";
  @SerializedName(SERIALIZED_NAME_SECONDARY_I_P_ADDRESSES)
  private List<Address> secondaryIPAddresses = new ArrayList<>();

  public static final String SERIALIZED_NAME_SECONDARY_I_PV6_ADDRESSES = "SecondaryIPv6Addresses";
  @SerializedName(SERIALIZED_NAME_SECONDARY_I_PV6_ADDRESSES)
  private List<Address> secondaryIPv6Addresses = new ArrayList<>();

  public InspectAdditionalNetwork() {
  }

  public InspectAdditionalNetwork additionalMACAddresses(List<String> additionalMACAddresses) {
    this.additionalMACAddresses = additionalMACAddresses;
    return this;
  }

  public InspectAdditionalNetwork addAdditionalMACAddressesItem(String additionalMACAddressesItem) {
    if (this.additionalMACAddresses == null) {
      this.additionalMACAddresses = new ArrayList<>();
    }
    this.additionalMACAddresses.add(additionalMACAddressesItem);
    return this;
  }

  /**
   * AdditionalMacAddresses is a set of additional MAC Addresses beyond the first. CNI may configure more than one interface for a single network, which can cause this.
   * @return additionalMACAddresses
   */
  @javax.annotation.Nullable
  public List<String> getAdditionalMACAddresses() {
    return additionalMACAddresses;
  }

  public void setAdditionalMACAddresses(List<String> additionalMACAddresses) {
    this.additionalMACAddresses = additionalMACAddresses;
  }


  public InspectAdditionalNetwork aliases(List<String> aliases) {
    this.aliases = aliases;
    return this;
  }

  public InspectAdditionalNetwork addAliasesItem(String aliasesItem) {
    if (this.aliases == null) {
      this.aliases = new ArrayList<>();
    }
    this.aliases.add(aliasesItem);
    return this;
  }

  /**
   * Aliases are any network aliases the container has in this network.
   * @return aliases
   */
  @javax.annotation.Nullable
  public List<String> getAliases() {
    return aliases;
  }

  public void setAliases(List<String> aliases) {
    this.aliases = aliases;
  }


  public InspectAdditionalNetwork driverOpts(Map<String, String> driverOpts) {
    this.driverOpts = driverOpts;
    return this;
  }

  public InspectAdditionalNetwork putDriverOptsItem(String key, String driverOptsItem) {
    if (this.driverOpts == null) {
      this.driverOpts = new HashMap<>();
    }
    this.driverOpts.put(key, driverOptsItem);
    return this;
  }

  /**
   * DriverOpts is presently unused and maintained exclusively for compatibility.
   * @return driverOpts
   */
  @javax.annotation.Nullable
  public Map<String, String> getDriverOpts() {
    return driverOpts;
  }

  public void setDriverOpts(Map<String, String> driverOpts) {
    this.driverOpts = driverOpts;
  }


  public InspectAdditionalNetwork endpointID(String endpointID) {
    this.endpointID = endpointID;
    return this;
  }

  /**
   * EndpointID is unused, maintained exclusively for compatibility.
   * @return endpointID
   */
  @javax.annotation.Nullable
  public String getEndpointID() {
    return endpointID;
  }

  public void setEndpointID(String endpointID) {
    this.endpointID = endpointID;
  }


  public InspectAdditionalNetwork gateway(String gateway) {
    this.gateway = gateway;
    return this;
  }

  /**
   * Gateway is the IP address of the gateway this network will use.
   * @return gateway
   */
  @javax.annotation.Nullable
  public String getGateway() {
    return gateway;
  }

  public void setGateway(String gateway) {
    this.gateway = gateway;
  }


  public InspectAdditionalNetwork globalIPv6Address(String globalIPv6Address) {
    this.globalIPv6Address = globalIPv6Address;
    return this;
  }

  /**
   * GlobalIPv6Address is the global-scope IPv6 Address for this network.
   * @return globalIPv6Address
   */
  @javax.annotation.Nullable
  public String getGlobalIPv6Address() {
    return globalIPv6Address;
  }

  public void setGlobalIPv6Address(String globalIPv6Address) {
    this.globalIPv6Address = globalIPv6Address;
  }


  public InspectAdditionalNetwork globalIPv6PrefixLen(Long globalIPv6PrefixLen) {
    this.globalIPv6PrefixLen = globalIPv6PrefixLen;
    return this;
  }

  /**
   * GlobalIPv6PrefixLen is the length of the subnet mask of this network.
   * @return globalIPv6PrefixLen
   */
  @javax.annotation.Nullable
  public Long getGlobalIPv6PrefixLen() {
    return globalIPv6PrefixLen;
  }

  public void setGlobalIPv6PrefixLen(Long globalIPv6PrefixLen) {
    this.globalIPv6PrefixLen = globalIPv6PrefixLen;
  }


  public InspectAdditionalNetwork ipAMConfig(Map<String, String> ipAMConfig) {
    this.ipAMConfig = ipAMConfig;
    return this;
  }

  public InspectAdditionalNetwork putIpAMConfigItem(String key, String ipAMConfigItem) {
    if (this.ipAMConfig == null) {
      this.ipAMConfig = new HashMap<>();
    }
    this.ipAMConfig.put(key, ipAMConfigItem);
    return this;
  }

  /**
   * IPAMConfig is presently unused and maintained exclusively for compatibility.
   * @return ipAMConfig
   */
  @javax.annotation.Nullable
  public Map<String, String> getIpAMConfig() {
    return ipAMConfig;
  }

  public void setIpAMConfig(Map<String, String> ipAMConfig) {
    this.ipAMConfig = ipAMConfig;
  }


  public InspectAdditionalNetwork ipAddress(String ipAddress) {
    this.ipAddress = ipAddress;
    return this;
  }

  /**
   * IPAddress is the IP address for this network.
   * @return ipAddress
   */
  @javax.annotation.Nullable
  public String getIpAddress() {
    return ipAddress;
  }

  public void setIpAddress(String ipAddress) {
    this.ipAddress = ipAddress;
  }


  public InspectAdditionalNetwork ipPrefixLen(Long ipPrefixLen) {
    this.ipPrefixLen = ipPrefixLen;
    return this;
  }

  /**
   * IPPrefixLen is the length of the subnet mask of this network.
   * @return ipPrefixLen
   */
  @javax.annotation.Nullable
  public Long getIpPrefixLen() {
    return ipPrefixLen;
  }

  public void setIpPrefixLen(Long ipPrefixLen) {
    this.ipPrefixLen = ipPrefixLen;
  }


  public InspectAdditionalNetwork ipv6Gateway(String ipv6Gateway) {
    this.ipv6Gateway = ipv6Gateway;
    return this;
  }

  /**
   * IPv6Gateway is the IPv6 gateway this network will use.
   * @return ipv6Gateway
   */
  @javax.annotation.Nullable
  public String getIpv6Gateway() {
    return ipv6Gateway;
  }

  public void setIpv6Gateway(String ipv6Gateway) {
    this.ipv6Gateway = ipv6Gateway;
  }


  public InspectAdditionalNetwork links(List<String> links) {
    this.links = links;
    return this;
  }

  public InspectAdditionalNetwork addLinksItem(String linksItem) {
    if (this.links == null) {
      this.links = new ArrayList<>();
    }
    this.links.add(linksItem);
    return this;
  }

  /**
   * Links is presently unused and maintained exclusively for compatibility.
   * @return links
   */
  @javax.annotation.Nullable
  public List<String> getLinks() {
    return links;
  }

  public void setLinks(List<String> links) {
    this.links = links;
  }


  public InspectAdditionalNetwork macAddress(String macAddress) {
    this.macAddress = macAddress;
    return this;
  }

  /**
   * MacAddress is the MAC address for the interface in this network.
   * @return macAddress
   */
  @javax.annotation.Nullable
  public String getMacAddress() {
    return macAddress;
  }

  public void setMacAddress(String macAddress) {
    this.macAddress = macAddress;
  }


  public InspectAdditionalNetwork networkID(String networkID) {
    this.networkID = networkID;
    return this;
  }

  /**
   * Name of the network we&#39;re connecting to.
   * @return networkID
   */
  @javax.annotation.Nullable
  public String getNetworkID() {
    return networkID;
  }

  public void setNetworkID(String networkID) {
    this.networkID = networkID;
  }


  public InspectAdditionalNetwork secondaryIPAddresses(List<Address> secondaryIPAddresses) {
    this.secondaryIPAddresses = secondaryIPAddresses;
    return this;
  }

  public InspectAdditionalNetwork addSecondaryIPAddressesItem(Address secondaryIPAddressesItem) {
    if (this.secondaryIPAddresses == null) {
      this.secondaryIPAddresses = new ArrayList<>();
    }
    this.secondaryIPAddresses.add(secondaryIPAddressesItem);
    return this;
  }

  /**
   * SecondaryIPAddresses is a list of extra IP Addresses that the container has been assigned in this network.
   * @return secondaryIPAddresses
   */
  @javax.annotation.Nullable
  public List<Address> getSecondaryIPAddresses() {
    return secondaryIPAddresses;
  }

  public void setSecondaryIPAddresses(List<Address> secondaryIPAddresses) {
    this.secondaryIPAddresses = secondaryIPAddresses;
  }


  public InspectAdditionalNetwork secondaryIPv6Addresses(List<Address> secondaryIPv6Addresses) {
    this.secondaryIPv6Addresses = secondaryIPv6Addresses;
    return this;
  }

  public InspectAdditionalNetwork addSecondaryIPv6AddressesItem(Address secondaryIPv6AddressesItem) {
    if (this.secondaryIPv6Addresses == null) {
      this.secondaryIPv6Addresses = new ArrayList<>();
    }
    this.secondaryIPv6Addresses.add(secondaryIPv6AddressesItem);
    return this;
  }

  /**
   * SecondaryIPv6Addresses is a list of extra IPv6 Addresses that the container has been assigned in this network.
   * @return secondaryIPv6Addresses
   */
  @javax.annotation.Nullable
  public List<Address> getSecondaryIPv6Addresses() {
    return secondaryIPv6Addresses;
  }

  public void setSecondaryIPv6Addresses(List<Address> secondaryIPv6Addresses) {
    this.secondaryIPv6Addresses = secondaryIPv6Addresses;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InspectAdditionalNetwork inspectAdditionalNetwork = (InspectAdditionalNetwork) o;
    return Objects.equals(this.additionalMACAddresses, inspectAdditionalNetwork.additionalMACAddresses) &&
        Objects.equals(this.aliases, inspectAdditionalNetwork.aliases) &&
        Objects.equals(this.driverOpts, inspectAdditionalNetwork.driverOpts) &&
        Objects.equals(this.endpointID, inspectAdditionalNetwork.endpointID) &&
        Objects.equals(this.gateway, inspectAdditionalNetwork.gateway) &&
        Objects.equals(this.globalIPv6Address, inspectAdditionalNetwork.globalIPv6Address) &&
        Objects.equals(this.globalIPv6PrefixLen, inspectAdditionalNetwork.globalIPv6PrefixLen) &&
        Objects.equals(this.ipAMConfig, inspectAdditionalNetwork.ipAMConfig) &&
        Objects.equals(this.ipAddress, inspectAdditionalNetwork.ipAddress) &&
        Objects.equals(this.ipPrefixLen, inspectAdditionalNetwork.ipPrefixLen) &&
        Objects.equals(this.ipv6Gateway, inspectAdditionalNetwork.ipv6Gateway) &&
        Objects.equals(this.links, inspectAdditionalNetwork.links) &&
        Objects.equals(this.macAddress, inspectAdditionalNetwork.macAddress) &&
        Objects.equals(this.networkID, inspectAdditionalNetwork.networkID) &&
        Objects.equals(this.secondaryIPAddresses, inspectAdditionalNetwork.secondaryIPAddresses) &&
        Objects.equals(this.secondaryIPv6Addresses, inspectAdditionalNetwork.secondaryIPv6Addresses);
  }

  @Override
  public int hashCode() {
    return Objects.hash(additionalMACAddresses, aliases, driverOpts, endpointID, gateway, globalIPv6Address, globalIPv6PrefixLen, ipAMConfig, ipAddress, ipPrefixLen, ipv6Gateway, links, macAddress, networkID, secondaryIPAddresses, secondaryIPv6Addresses);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InspectAdditionalNetwork {\n");
    sb.append("    additionalMACAddresses: ").append(toIndentedString(additionalMACAddresses)).append("\n");
    sb.append("    aliases: ").append(toIndentedString(aliases)).append("\n");
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
    sb.append("    secondaryIPAddresses: ").append(toIndentedString(secondaryIPAddresses)).append("\n");
    sb.append("    secondaryIPv6Addresses: ").append(toIndentedString(secondaryIPv6Addresses)).append("\n");
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
    openapiFields.add("AdditionalMACAddresses");
    openapiFields.add("Aliases");
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
    openapiFields.add("SecondaryIPAddresses");
    openapiFields.add("SecondaryIPv6Addresses");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to InspectAdditionalNetwork
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!InspectAdditionalNetwork.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in InspectAdditionalNetwork is not found in the empty JSON string", InspectAdditionalNetwork.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!InspectAdditionalNetwork.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `InspectAdditionalNetwork` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // ensure the optional json data is an array if present
      if (jsonObj.get("AdditionalMACAddresses") != null && !jsonObj.get("AdditionalMACAddresses").isJsonNull() && !jsonObj.get("AdditionalMACAddresses").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `AdditionalMACAddresses` to be an array in the JSON string but got `%s`", jsonObj.get("AdditionalMACAddresses").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("Aliases") != null && !jsonObj.get("Aliases").isJsonNull() && !jsonObj.get("Aliases").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `Aliases` to be an array in the JSON string but got `%s`", jsonObj.get("Aliases").toString()));
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
      if ((jsonObj.get("IPAddress") != null && !jsonObj.get("IPAddress").isJsonNull()) && !jsonObj.get("IPAddress").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `IPAddress` to be a primitive type in the JSON string but got `%s`", jsonObj.get("IPAddress").toString()));
      }
      if ((jsonObj.get("IPv6Gateway") != null && !jsonObj.get("IPv6Gateway").isJsonNull()) && !jsonObj.get("IPv6Gateway").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `IPv6Gateway` to be a primitive type in the JSON string but got `%s`", jsonObj.get("IPv6Gateway").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("Links") != null && !jsonObj.get("Links").isJsonNull() && !jsonObj.get("Links").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `Links` to be an array in the JSON string but got `%s`", jsonObj.get("Links").toString()));
      }
      if ((jsonObj.get("MacAddress") != null && !jsonObj.get("MacAddress").isJsonNull()) && !jsonObj.get("MacAddress").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `MacAddress` to be a primitive type in the JSON string but got `%s`", jsonObj.get("MacAddress").toString()));
      }
      if ((jsonObj.get("NetworkID") != null && !jsonObj.get("NetworkID").isJsonNull()) && !jsonObj.get("NetworkID").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `NetworkID` to be a primitive type in the JSON string but got `%s`", jsonObj.get("NetworkID").toString()));
      }
      if (jsonObj.get("SecondaryIPAddresses") != null && !jsonObj.get("SecondaryIPAddresses").isJsonNull()) {
        JsonArray jsonArraysecondaryIPAddresses = jsonObj.getAsJsonArray("SecondaryIPAddresses");
        if (jsonArraysecondaryIPAddresses != null) {
          // ensure the json data is an array
          if (!jsonObj.get("SecondaryIPAddresses").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `SecondaryIPAddresses` to be an array in the JSON string but got `%s`", jsonObj.get("SecondaryIPAddresses").toString()));
          }

          // validate the optional field `SecondaryIPAddresses` (array)
          for (int i = 0; i < jsonArraysecondaryIPAddresses.size(); i++) {
            Address.validateJsonElement(jsonArraysecondaryIPAddresses.get(i));
          };
        }
      }
      if (jsonObj.get("SecondaryIPv6Addresses") != null && !jsonObj.get("SecondaryIPv6Addresses").isJsonNull()) {
        JsonArray jsonArraysecondaryIPv6Addresses = jsonObj.getAsJsonArray("SecondaryIPv6Addresses");
        if (jsonArraysecondaryIPv6Addresses != null) {
          // ensure the json data is an array
          if (!jsonObj.get("SecondaryIPv6Addresses").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `SecondaryIPv6Addresses` to be an array in the JSON string but got `%s`", jsonObj.get("SecondaryIPv6Addresses").toString()));
          }

          // validate the optional field `SecondaryIPv6Addresses` (array)
          for (int i = 0; i < jsonArraysecondaryIPv6Addresses.size(); i++) {
            Address.validateJsonElement(jsonArraysecondaryIPv6Addresses.get(i));
          };
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!InspectAdditionalNetwork.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'InspectAdditionalNetwork' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<InspectAdditionalNetwork> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(InspectAdditionalNetwork.class));

       return (TypeAdapter<T>) new TypeAdapter<InspectAdditionalNetwork>() {
           @Override
           public void write(JsonWriter out, InspectAdditionalNetwork value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public InspectAdditionalNetwork read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of InspectAdditionalNetwork given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of InspectAdditionalNetwork
   * @throws IOException if the JSON string is invalid with respect to InspectAdditionalNetwork
   */
  public static InspectAdditionalNetwork fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, InspectAdditionalNetwork.class);
  }

  /**
   * Convert an instance of InspectAdditionalNetwork to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

