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
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.TypeAdapter;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.annotations.SerializedName;
import com.google.gson.reflect.TypeToken;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.github.alersrt.pod4j.openapi.JSON;
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
 * PodNetworkConfig
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class PodNetworkConfig implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String SERIALIZED_NAME_NETWORKS = "Networks";
  @SerializedName(SERIALIZED_NAME_NETWORKS)
  private Map<String, PerNetworkOptions> networks = null;

  public static final String SERIALIZED_NAME_CNI_NETWORKS = "cni_networks";
  @SerializedName(SERIALIZED_NAME_CNI_NETWORKS)
  private List<String> cniNetworks = null;

  public static final String SERIALIZED_NAME_DNS_OPTION = "dns_option";
  @SerializedName(SERIALIZED_NAME_DNS_OPTION)
  private List<String> dnsOption = null;

  public static final String SERIALIZED_NAME_DNS_SEARCH = "dns_search";
  @SerializedName(SERIALIZED_NAME_DNS_SEARCH)
  private List<String> dnsSearch = null;

  public static final String SERIALIZED_NAME_DNS_SERVER = "dns_server";
  @SerializedName(SERIALIZED_NAME_DNS_SERVER)
  private List<String> dnsServer = null;

  public static final String SERIALIZED_NAME_HOSTADD = "hostadd";
  @SerializedName(SERIALIZED_NAME_HOSTADD)
  private List<String> hostadd = null;

  public static final String SERIALIZED_NAME_HOSTS_FILE = "hostsFile";
  @SerializedName(SERIALIZED_NAME_HOSTS_FILE)
  private String hostsFile;

  public static final String SERIALIZED_NAME_NETNS = "netns";
  @SerializedName(SERIALIZED_NAME_NETNS)
  private Namespace netns;

  public static final String SERIALIZED_NAME_NETWORK_OPTIONS = "network_options";
  @SerializedName(SERIALIZED_NAME_NETWORK_OPTIONS)
  private Map<String, List<String>> networkOptions = null;

  public static final String SERIALIZED_NAME_NO_MANAGE_HOSTNAME = "no_manage_hostname";
  @SerializedName(SERIALIZED_NAME_NO_MANAGE_HOSTNAME)
  private Boolean noManageHostname;

  public static final String SERIALIZED_NAME_NO_MANAGE_HOSTS = "no_manage_hosts";
  @SerializedName(SERIALIZED_NAME_NO_MANAGE_HOSTS)
  private Boolean noManageHosts;

  public static final String SERIALIZED_NAME_NO_MANAGE_RESOLV_CONF = "no_manage_resolv_conf";
  @SerializedName(SERIALIZED_NAME_NO_MANAGE_RESOLV_CONF)
  private Boolean noManageResolvConf;

  public static final String SERIALIZED_NAME_PORTMAPPINGS = "portmappings";
  @SerializedName(SERIALIZED_NAME_PORTMAPPINGS)
  private List<PortMapping> portmappings = null;

  public PodNetworkConfig() {
  }

  public PodNetworkConfig networks(Map<String, PerNetworkOptions> networks) {

    this.networks = networks;
    return this;
  }

  public PodNetworkConfig putNetworksItem(String key, PerNetworkOptions networksItem) {
    if (this.networks == null) {
      this.networks = new HashMap<>();
    }
    this.networks.put(key, networksItem);
    return this;
  }

  /**
   * Map of networks names to ids the container should join to. You can request additional settings for each network, you can set network aliases, static ips, static mac address  and the network interface name for this container on the specific network. If the map is empty and the bridge network mode is set the container will be joined to the default network.
   * @return networks
   **/
  @javax.annotation.Nullable
  @Valid
  @ApiModelProperty(value = "Map of networks names to ids the container should join to. You can request additional settings for each network, you can set network aliases, static ips, static mac address  and the network interface name for this container on the specific network. If the map is empty and the bridge network mode is set the container will be joined to the default network.")

  public Map<String, PerNetworkOptions> getNetworks() {
    return networks;
  }


  public void setNetworks(Map<String, PerNetworkOptions> networks) {
    this.networks = networks;
  }


  public PodNetworkConfig cniNetworks(List<String> cniNetworks) {

    this.cniNetworks = cniNetworks;
    return this;
  }

  public PodNetworkConfig addCniNetworksItem(String cniNetworksItem) {
    if (this.cniNetworks == null) {
      this.cniNetworks = new ArrayList<>();
    }
    this.cniNetworks.add(cniNetworksItem);
    return this;
  }

  /**
   * CNINetworks is a list of CNI networks to join the container to. If this list is empty, the default CNI network will be joined instead. If at least one entry is present, we will not join the default network (unless it is part of this list). Only available if NetNS is set to bridge. Optional. Deprecated: as of podman 4.0 use \&quot;Networks\&quot; instead.
   * @return cniNetworks
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "CNINetworks is a list of CNI networks to join the container to. If this list is empty, the default CNI network will be joined instead. If at least one entry is present, we will not join the default network (unless it is part of this list). Only available if NetNS is set to bridge. Optional. Deprecated: as of podman 4.0 use \"Networks\" instead.")

  public List<String> getCniNetworks() {
    return cniNetworks;
  }


  public void setCniNetworks(List<String> cniNetworks) {
    this.cniNetworks = cniNetworks;
  }


  public PodNetworkConfig dnsOption(List<String> dnsOption) {

    this.dnsOption = dnsOption;
    return this;
  }

  public PodNetworkConfig addDnsOptionItem(String dnsOptionItem) {
    if (this.dnsOption == null) {
      this.dnsOption = new ArrayList<>();
    }
    this.dnsOption.add(dnsOptionItem);
    return this;
  }

  /**
   * DNSOption is a set of DNS options that will be used in the infra container&#39;s resolv.conf, which will, by default, be shared with all containers in the pod. Conflicts with NoInfra&#x3D;true. Optional.
   * @return dnsOption
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "DNSOption is a set of DNS options that will be used in the infra container's resolv.conf, which will, by default, be shared with all containers in the pod. Conflicts with NoInfra=true. Optional.")

  public List<String> getDnsOption() {
    return dnsOption;
  }


  public void setDnsOption(List<String> dnsOption) {
    this.dnsOption = dnsOption;
  }


  public PodNetworkConfig dnsSearch(List<String> dnsSearch) {

    this.dnsSearch = dnsSearch;
    return this;
  }

  public PodNetworkConfig addDnsSearchItem(String dnsSearchItem) {
    if (this.dnsSearch == null) {
      this.dnsSearch = new ArrayList<>();
    }
    this.dnsSearch.add(dnsSearchItem);
    return this;
  }

  /**
   * DNSSearch is a set of DNS search domains that will be used in the infra container&#39;s resolv.conf, which will, by default, be shared with all containers in the pod. If not provided, DNS search domains from the host&#39;s resolv.conf will be used. Conflicts with NoInfra&#x3D;true. Optional.
   * @return dnsSearch
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "DNSSearch is a set of DNS search domains that will be used in the infra container's resolv.conf, which will, by default, be shared with all containers in the pod. If not provided, DNS search domains from the host's resolv.conf will be used. Conflicts with NoInfra=true. Optional.")

  public List<String> getDnsSearch() {
    return dnsSearch;
  }


  public void setDnsSearch(List<String> dnsSearch) {
    this.dnsSearch = dnsSearch;
  }


  public PodNetworkConfig dnsServer(List<String> dnsServer) {

    this.dnsServer = dnsServer;
    return this;
  }

  public PodNetworkConfig addDnsServerItem(String dnsServerItem) {
    if (this.dnsServer == null) {
      this.dnsServer = new ArrayList<>();
    }
    this.dnsServer.add(dnsServerItem);
    return this;
  }

  /**
   * DNSServer is a set of DNS servers that will be used in the infra container&#39;s resolv.conf, which will, by default, be shared with all containers in the pod. If not provided, the host&#39;s DNS servers will be used, unless the only server set is a localhost address. As the container cannot connect to the host&#39;s localhost, a default server will instead be set. Conflicts with NoInfra&#x3D;true. Optional.
   * @return dnsServer
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "DNSServer is a set of DNS servers that will be used in the infra container's resolv.conf, which will, by default, be shared with all containers in the pod. If not provided, the host's DNS servers will be used, unless the only server set is a localhost address. As the container cannot connect to the host's localhost, a default server will instead be set. Conflicts with NoInfra=true. Optional.")

  public List<String> getDnsServer() {
    return dnsServer;
  }


  public void setDnsServer(List<String> dnsServer) {
    this.dnsServer = dnsServer;
  }


  public PodNetworkConfig hostadd(List<String> hostadd) {

    this.hostadd = hostadd;
    return this;
  }

  public PodNetworkConfig addHostaddItem(String hostaddItem) {
    if (this.hostadd == null) {
      this.hostadd = new ArrayList<>();
    }
    this.hostadd.add(hostaddItem);
    return this;
  }

  /**
   * HostAdd is a set of hosts that will be added to the infra container&#39;s etc/hosts that will, by default, be shared with all containers in the pod. Conflicts with NoInfra&#x3D;true and NoManageHosts. Optional.
   * @return hostadd
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "HostAdd is a set of hosts that will be added to the infra container's etc/hosts that will, by default, be shared with all containers in the pod. Conflicts with NoInfra=true and NoManageHosts. Optional.")

  public List<String> getHostadd() {
    return hostadd;
  }


  public void setHostadd(List<String> hostadd) {
    this.hostadd = hostadd;
  }


  public PodNetworkConfig hostsFile(String hostsFile) {

    this.hostsFile = hostsFile;
    return this;
  }

  /**
   * HostsFile is the base file to create the &#x60;/etc/hosts&#x60; file inside the infra container. This must either be an absolute path to a file on the host system, or one of the special flags &#x60;image&#x60; or &#x60;none&#x60;. If it is empty it defaults to the base_hosts_file configuration in containers.conf. Conflicts with NoInfra&#x3D;true and NoManageHosts. Optional.
   * @return hostsFile
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "HostsFile is the base file to create the `/etc/hosts` file inside the infra container. This must either be an absolute path to a file on the host system, or one of the special flags `image` or `none`. If it is empty it defaults to the base_hosts_file configuration in containers.conf. Conflicts with NoInfra=true and NoManageHosts. Optional.")

  public String getHostsFile() {
    return hostsFile;
  }


  public void setHostsFile(String hostsFile) {
    this.hostsFile = hostsFile;
  }


  public PodNetworkConfig netns(Namespace netns) {

    this.netns = netns;
    return this;
  }

  /**
   * Get netns
   * @return netns
   **/
  @javax.annotation.Nullable
  @Valid
  @ApiModelProperty(value = "")

  public Namespace getNetns() {
    return netns;
  }


  public void setNetns(Namespace netns) {
    this.netns = netns;
  }


  public PodNetworkConfig networkOptions(Map<String, List<String>> networkOptions) {

    this.networkOptions = networkOptions;
    return this;
  }

  public PodNetworkConfig putNetworkOptionsItem(String key, List<String> networkOptionsItem) {
    if (this.networkOptions == null) {
      this.networkOptions = new HashMap<>();
    }
    this.networkOptions.put(key, networkOptionsItem);
    return this;
  }

  /**
   * NetworkOptions are additional options for each network Optional.
   * @return networkOptions
   **/
  @javax.annotation.Nullable
  @Valid
  @ApiModelProperty(value = "NetworkOptions are additional options for each network Optional.")

  public Map<String, List<String>> getNetworkOptions() {
    return networkOptions;
  }


  public void setNetworkOptions(Map<String, List<String>> networkOptions) {
    this.networkOptions = networkOptions;
  }


  public PodNetworkConfig noManageHostname(Boolean noManageHostname) {

    this.noManageHostname = noManageHostname;
    return this;
  }

  /**
   * NoManageHostname indicates that /etc/hostname should not be managed by the pod. Instead, each container will create a separate etc/hostname as they would if not in a pod.
   *
   * @return noManageHostname
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "NoManageHostname indicates that /etc/hostname should not be managed by the pod. Instead, each container will create a separate etc/hostname as they would if not in a pod.")

  public Boolean getNoManageHostname() {
    return noManageHostname;
  }


  public void setNoManageHostname(Boolean noManageHostname) {
    this.noManageHostname = noManageHostname;
  }


  public PodNetworkConfig noManageHosts(Boolean noManageHosts) {
    
    this.noManageHosts = noManageHosts;
    return this;
  }

   /**
   * NoManageHosts indicates that /etc/hosts should not be managed by the pod. Instead, each container will create a separate /etc/hosts as they would if not in a pod. Conflicts with HostAdd.
   * @return noManageHosts
    **/
   @javax.annotation.Nullable
   @ApiModelProperty(value = "NoManageHosts indicates that /etc/hosts should not be managed by the pod. Instead, each container will create a separate /etc/hosts as they would if not in a pod. Conflicts with HostAdd.")

  public Boolean getNoManageHosts() {
    return noManageHosts;
  }


  public void setNoManageHosts(Boolean noManageHosts) {
    this.noManageHosts = noManageHosts;
  }


  public PodNetworkConfig noManageResolvConf(Boolean noManageResolvConf) {
    
    this.noManageResolvConf = noManageResolvConf;
    return this;
  }

   /**
   * NoManageResolvConf indicates that /etc/resolv.conf should not be managed by the pod. Instead, each container will create and manage a separate resolv.conf as if they had not joined a pod. Conflicts with NoInfra&#x3D;true and DNSServer, DNSSearch, DNSOption. Optional.
   * @return noManageResolvConf
    **/
   @javax.annotation.Nullable
   @ApiModelProperty(value = "NoManageResolvConf indicates that /etc/resolv.conf should not be managed by the pod. Instead, each container will create and manage a separate resolv.conf as if they had not joined a pod. Conflicts with NoInfra=true and DNSServer, DNSSearch, DNSOption. Optional.")

  public Boolean getNoManageResolvConf() {
    return noManageResolvConf;
  }


  public void setNoManageResolvConf(Boolean noManageResolvConf) {
    this.noManageResolvConf = noManageResolvConf;
  }


  public PodNetworkConfig portmappings(List<PortMapping> portmappings) {
    
    this.portmappings = portmappings;
    return this;
  }

  public PodNetworkConfig addPortmappingsItem(PortMapping portmappingsItem) {
    if (this.portmappings == null) {
      this.portmappings = new ArrayList<>();
    }
    this.portmappings.add(portmappingsItem);
    return this;
  }

   /**
   * PortMappings is a set of ports to map into the infra container. As, by default, containers share their network with the infra container, this will forward the ports to the entire pod. Only available if NetNS is set to Bridge, Slirp, or Pasta. Optional.
   * @return portmappings
    **/
   @javax.annotation.Nullable
   @Valid
   @ApiModelProperty(value = "PortMappings is a set of ports to map into the infra container. As, by default, containers share their network with the infra container, this will forward the ports to the entire pod. Only available if NetNS is set to Bridge, Slirp, or Pasta. Optional.")

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
    PodNetworkConfig podNetworkConfig = (PodNetworkConfig) o;
    return Objects.equals(this.networks, podNetworkConfig.networks) &&
        Objects.equals(this.cniNetworks, podNetworkConfig.cniNetworks) &&
        Objects.equals(this.dnsOption, podNetworkConfig.dnsOption) &&
        Objects.equals(this.dnsSearch, podNetworkConfig.dnsSearch) &&
        Objects.equals(this.dnsServer, podNetworkConfig.dnsServer) &&
        Objects.equals(this.hostadd, podNetworkConfig.hostadd) &&
        Objects.equals(this.hostsFile, podNetworkConfig.hostsFile) &&
        Objects.equals(this.netns, podNetworkConfig.netns) &&
        Objects.equals(this.networkOptions, podNetworkConfig.networkOptions) &&
            Objects.equals(this.noManageHostname, podNetworkConfig.noManageHostname) &&
        Objects.equals(this.noManageHosts, podNetworkConfig.noManageHosts) &&
        Objects.equals(this.noManageResolvConf, podNetworkConfig.noManageResolvConf) &&
        Objects.equals(this.portmappings, podNetworkConfig.portmappings);
  }

  @Override
  public int hashCode() {
    return Objects.hash(networks, cniNetworks, dnsOption, dnsSearch, dnsServer, hostadd, hostsFile, netns, networkOptions, noManageHostname, noManageHosts, noManageResolvConf, portmappings);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PodNetworkConfig {\n");
    sb.append("    networks: ").append(toIndentedString(networks)).append("\n");
    sb.append("    cniNetworks: ").append(toIndentedString(cniNetworks)).append("\n");
    sb.append("    dnsOption: ").append(toIndentedString(dnsOption)).append("\n");
    sb.append("    dnsSearch: ").append(toIndentedString(dnsSearch)).append("\n");
    sb.append("    dnsServer: ").append(toIndentedString(dnsServer)).append("\n");
    sb.append("    hostadd: ").append(toIndentedString(hostadd)).append("\n");
    sb.append("    hostsFile: ").append(toIndentedString(hostsFile)).append("\n");
    sb.append("    netns: ").append(toIndentedString(netns)).append("\n");
    sb.append("    networkOptions: ").append(toIndentedString(networkOptions)).append("\n");
    sb.append("    noManageHostname: ").append(toIndentedString(noManageHostname)).append("\n");
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
    openapiFields.add("Networks");
    openapiFields.add("cni_networks");
    openapiFields.add("dns_option");
    openapiFields.add("dns_search");
    openapiFields.add("dns_server");
    openapiFields.add("hostadd");
    openapiFields.add("hostsFile");
    openapiFields.add("netns");
    openapiFields.add("network_options");
    openapiFields.add("no_manage_hostname");
    openapiFields.add("no_manage_hosts");
    openapiFields.add("no_manage_resolv_conf");
    openapiFields.add("portmappings");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Object and throws an exception if issues found
   *
   * @param jsonObj JSON Object
   * @throws IOException if the JSON Object is invalid with respect to PodNetworkConfig
   */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
    if (jsonObj == null) {
      if (PodNetworkConfig.openapiRequiredFields.isEmpty()) {
        return;
      } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in PodNetworkConfig is not found in the empty JSON string", PodNetworkConfig.openapiRequiredFields.toString()));
      }
    }

    Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
    for (Entry<String, JsonElement> entry : entries) {
        if (!PodNetworkConfig.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `PodNetworkConfig` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
    }
    // ensure the json data is an array
    if ((jsonObj.get("cni_networks") != null && !jsonObj.get("cni_networks").isJsonNull()) && !jsonObj.get("cni_networks").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `cni_networks` to be an array in the JSON string but got `%s`", jsonObj.get("cni_networks").toString()));
    }
    // ensure the json data is an array
    if ((jsonObj.get("dns_option") != null && !jsonObj.get("dns_option").isJsonNull()) && !jsonObj.get("dns_option").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `dns_option` to be an array in the JSON string but got `%s`", jsonObj.get("dns_option").toString()));
    }
    // ensure the json data is an array
    if ((jsonObj.get("dns_search") != null && !jsonObj.get("dns_search").isJsonNull()) && !jsonObj.get("dns_search").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `dns_search` to be an array in the JSON string but got `%s`", jsonObj.get("dns_search").toString()));
    }
    // ensure the json data is an array
    if ((jsonObj.get("dns_server") != null && !jsonObj.get("dns_server").isJsonNull()) && !jsonObj.get("dns_server").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `dns_server` to be an array in the JSON string but got `%s`", jsonObj.get("dns_server").toString()));
    }
    // ensure the json data is an array
    if ((jsonObj.get("hostadd") != null && !jsonObj.get("hostadd").isJsonNull()) && !jsonObj.get("hostadd").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `hostadd` to be an array in the JSON string but got `%s`", jsonObj.get("hostadd").toString()));
      }
      if ((jsonObj.get("hostsFile") != null && !jsonObj.get("hostsFile").isJsonNull()) && !jsonObj.get("hostsFile").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `hostsFile` to be a primitive type in the JSON string but got `%s`", jsonObj.get("hostsFile").toString()));
      }
      // validate the optional field `netns`
      if (jsonObj.get("netns") != null && !jsonObj.get("netns").isJsonNull()) {
        Namespace.validateJsonObject(jsonObj.getAsJsonObject("netns"));
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
            PortMapping.validateJsonObject(jsonArrayportmappings.get(i).getAsJsonObject());
          };
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!PodNetworkConfig.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'PodNetworkConfig' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<PodNetworkConfig> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(PodNetworkConfig.class));

       return (TypeAdapter<T>) new TypeAdapter<PodNetworkConfig>() {
           @Override
           public void write(JsonWriter out, PodNetworkConfig value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public PodNetworkConfig read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of PodNetworkConfig given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of PodNetworkConfig
   * @throws IOException if the JSON string is invalid with respect to PodNetworkConfig
  */
  public static PodNetworkConfig fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, PodNetworkConfig.class);
  }

  /**
   * Convert an instance of PodNetworkConfig to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

