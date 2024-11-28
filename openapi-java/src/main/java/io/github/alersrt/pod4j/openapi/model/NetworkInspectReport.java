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

import java.net.URLEncoder;
import java.nio.charset.StandardCharsets;
import java.util.StringJoiner;
import java.util.Objects;
import java.util.Map;
import java.util.HashMap;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import io.github.alersrt.pod4j.openapi.model.NetworkContainerInfo;
import io.github.alersrt.pod4j.openapi.model.Route;
import io.github.alersrt.pod4j.openapi.model.Subnet;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;


import io.github.alersrt.pod4j.openapi.ApiClient;
/**
 * NetworkInspectReport
 */
@JsonPropertyOrder({
  NetworkInspectReport.JSON_PROPERTY_CONTAINERS,
  NetworkInspectReport.JSON_PROPERTY_CREATED,
  NetworkInspectReport.JSON_PROPERTY_DNS_ENABLED,
  NetworkInspectReport.JSON_PROPERTY_DRIVER,
  NetworkInspectReport.JSON_PROPERTY_ID,
  NetworkInspectReport.JSON_PROPERTY_INTERNAL,
  NetworkInspectReport.JSON_PROPERTY_IPAM_OPTIONS,
  NetworkInspectReport.JSON_PROPERTY_IPV6_ENABLED,
  NetworkInspectReport.JSON_PROPERTY_LABELS,
  NetworkInspectReport.JSON_PROPERTY_NAME,
  NetworkInspectReport.JSON_PROPERTY_NETWORK_DNS_SERVERS,
  NetworkInspectReport.JSON_PROPERTY_NETWORK_INTERFACE,
  NetworkInspectReport.JSON_PROPERTY_OPTIONS,
  NetworkInspectReport.JSON_PROPERTY_ROUTES,
  NetworkInspectReport.JSON_PROPERTY_SUBNETS
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-11-28T20:49:08.759389952+07:00[Asia/Barnaul]", comments = "Generator version: 7.7.0")
public class NetworkInspectReport {
  public static final String JSON_PROPERTY_CONTAINERS = "containers";
  private Map<String, NetworkContainerInfo> containers = new HashMap<>();

  public static final String JSON_PROPERTY_CREATED = "created";
  private OffsetDateTime created;

  public static final String JSON_PROPERTY_DNS_ENABLED = "dns_enabled";
  private Boolean dnsEnabled;

  public static final String JSON_PROPERTY_DRIVER = "driver";
  private String driver;

  public static final String JSON_PROPERTY_ID = "id";
  private String id;

  public static final String JSON_PROPERTY_INTERNAL = "internal";
  private Boolean internal;

  public static final String JSON_PROPERTY_IPAM_OPTIONS = "ipam_options";
  private Map<String, String> ipamOptions = new HashMap<>();

  public static final String JSON_PROPERTY_IPV6_ENABLED = "ipv6_enabled";
  private Boolean ipv6Enabled;

  public static final String JSON_PROPERTY_LABELS = "labels";
  private Map<String, String> labels = new HashMap<>();

  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public static final String JSON_PROPERTY_NETWORK_DNS_SERVERS = "network_dns_servers";
  private List<String> networkDnsServers = new ArrayList<>();

  public static final String JSON_PROPERTY_NETWORK_INTERFACE = "network_interface";
  private String networkInterface;

  public static final String JSON_PROPERTY_OPTIONS = "options";
  private Map<String, String> options = new HashMap<>();

  public static final String JSON_PROPERTY_ROUTES = "routes";
  private List<@Valid Route> routes = new ArrayList<>();

  public static final String JSON_PROPERTY_SUBNETS = "subnets";
  private List<@Valid Subnet> subnets = new ArrayList<>();

  public NetworkInspectReport() { 
  }

  public NetworkInspectReport containers(Map<String, NetworkContainerInfo> containers) {
    this.containers = containers;
    return this;
  }

  public NetworkInspectReport putContainersItem(String key, NetworkContainerInfo containersItem) {
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
  @jakarta.annotation.Nullable
  @Valid

  @JsonProperty(JSON_PROPERTY_CONTAINERS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Map<String, NetworkContainerInfo> getContainers() {
    return containers;
  }


  @JsonProperty(JSON_PROPERTY_CONTAINERS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setContainers(Map<String, NetworkContainerInfo> containers) {
    this.containers = containers;
  }


  public NetworkInspectReport created(OffsetDateTime created) {
    this.created = created;
    return this;
  }

  /**
   * Created contains the timestamp when this network was created.
   * @return created
   */
  @jakarta.annotation.Nullable
  @Valid

  @JsonProperty(JSON_PROPERTY_CREATED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public OffsetDateTime getCreated() {
    return created;
  }


  @JsonProperty(JSON_PROPERTY_CREATED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCreated(OffsetDateTime created) {
    this.created = created;
  }


  public NetworkInspectReport dnsEnabled(Boolean dnsEnabled) {
    this.dnsEnabled = dnsEnabled;
    return this;
  }

  /**
   * DNSEnabled is whether name resolution is active for container on this Network. Only supported with the bridge driver.
   * @return dnsEnabled
   */
  @jakarta.annotation.Nullable

  @JsonProperty(JSON_PROPERTY_DNS_ENABLED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Boolean getDnsEnabled() {
    return dnsEnabled;
  }


  @JsonProperty(JSON_PROPERTY_DNS_ENABLED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDnsEnabled(Boolean dnsEnabled) {
    this.dnsEnabled = dnsEnabled;
  }


  public NetworkInspectReport driver(String driver) {
    this.driver = driver;
    return this;
  }

  /**
   * Driver for this Network, e.g. bridge, macvlan...
   * @return driver
   */
  @jakarta.annotation.Nullable

  @JsonProperty(JSON_PROPERTY_DRIVER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getDriver() {
    return driver;
  }


  @JsonProperty(JSON_PROPERTY_DRIVER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDriver(String driver) {
    this.driver = driver;
  }


  public NetworkInspectReport id(String id) {
    this.id = id;
    return this;
  }

  /**
   * ID of the Network.
   * @return id
   */
  @jakarta.annotation.Nullable

  @JsonProperty(JSON_PROPERTY_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getId() {
    return id;
  }


  @JsonProperty(JSON_PROPERTY_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setId(String id) {
    this.id = id;
  }


  public NetworkInspectReport internal(Boolean internal) {
    this.internal = internal;
    return this;
  }

  /**
   * Internal is whether the Network should not have external routes to public or other Networks.
   * @return internal
   */
  @jakarta.annotation.Nullable

  @JsonProperty(JSON_PROPERTY_INTERNAL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Boolean getInternal() {
    return internal;
  }


  @JsonProperty(JSON_PROPERTY_INTERNAL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setInternal(Boolean internal) {
    this.internal = internal;
  }


  public NetworkInspectReport ipamOptions(Map<String, String> ipamOptions) {
    this.ipamOptions = ipamOptions;
    return this;
  }

  public NetworkInspectReport putIpamOptionsItem(String key, String ipamOptionsItem) {
    if (this.ipamOptions == null) {
      this.ipamOptions = new HashMap<>();
    }
    this.ipamOptions.put(key, ipamOptionsItem);
    return this;
  }

  /**
   * IPAMOptions contains options used for the ip assignment.
   * @return ipamOptions
   */
  @jakarta.annotation.Nullable

  @JsonProperty(JSON_PROPERTY_IPAM_OPTIONS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Map<String, String> getIpamOptions() {
    return ipamOptions;
  }


  @JsonProperty(JSON_PROPERTY_IPAM_OPTIONS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setIpamOptions(Map<String, String> ipamOptions) {
    this.ipamOptions = ipamOptions;
  }


  public NetworkInspectReport ipv6Enabled(Boolean ipv6Enabled) {
    this.ipv6Enabled = ipv6Enabled;
    return this;
  }

  /**
   * IPv6Enabled if set to true an ipv6 subnet should be created for this net.
   * @return ipv6Enabled
   */
  @jakarta.annotation.Nullable

  @JsonProperty(JSON_PROPERTY_IPV6_ENABLED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Boolean getIpv6Enabled() {
    return ipv6Enabled;
  }


  @JsonProperty(JSON_PROPERTY_IPV6_ENABLED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setIpv6Enabled(Boolean ipv6Enabled) {
    this.ipv6Enabled = ipv6Enabled;
  }


  public NetworkInspectReport labels(Map<String, String> labels) {
    this.labels = labels;
    return this;
  }

  public NetworkInspectReport putLabelsItem(String key, String labelsItem) {
    if (this.labels == null) {
      this.labels = new HashMap<>();
    }
    this.labels.put(key, labelsItem);
    return this;
  }

  /**
   * Labels is a set of key-value labels that have been applied to the Network.
   * @return labels
   */
  @jakarta.annotation.Nullable

  @JsonProperty(JSON_PROPERTY_LABELS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Map<String, String> getLabels() {
    return labels;
  }


  @JsonProperty(JSON_PROPERTY_LABELS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setLabels(Map<String, String> labels) {
    this.labels = labels;
  }


  public NetworkInspectReport name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Name of the Network.
   * @return name
   */
  @jakarta.annotation.Nullable

  @JsonProperty(JSON_PROPERTY_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getName() {
    return name;
  }


  @JsonProperty(JSON_PROPERTY_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setName(String name) {
    this.name = name;
  }


  public NetworkInspectReport networkDnsServers(List<String> networkDnsServers) {
    this.networkDnsServers = networkDnsServers;
    return this;
  }

  public NetworkInspectReport addNetworkDnsServersItem(String networkDnsServersItem) {
    if (this.networkDnsServers == null) {
      this.networkDnsServers = new ArrayList<>();
    }
    this.networkDnsServers.add(networkDnsServersItem);
    return this;
  }

  /**
   * List of custom DNS server for podman&#39;s DNS resolver at network level, all the containers attached to this network will consider resolvers configured at network level.
   * @return networkDnsServers
   */
  @jakarta.annotation.Nullable

  @JsonProperty(JSON_PROPERTY_NETWORK_DNS_SERVERS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public List<String> getNetworkDnsServers() {
    return networkDnsServers;
  }


  @JsonProperty(JSON_PROPERTY_NETWORK_DNS_SERVERS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setNetworkDnsServers(List<String> networkDnsServers) {
    this.networkDnsServers = networkDnsServers;
  }


  public NetworkInspectReport networkInterface(String networkInterface) {
    this.networkInterface = networkInterface;
    return this;
  }

  /**
   * NetworkInterface is the network interface name on the host.
   * @return networkInterface
   */
  @jakarta.annotation.Nullable

  @JsonProperty(JSON_PROPERTY_NETWORK_INTERFACE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getNetworkInterface() {
    return networkInterface;
  }


  @JsonProperty(JSON_PROPERTY_NETWORK_INTERFACE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setNetworkInterface(String networkInterface) {
    this.networkInterface = networkInterface;
  }


  public NetworkInspectReport options(Map<String, String> options) {
    this.options = options;
    return this;
  }

  public NetworkInspectReport putOptionsItem(String key, String optionsItem) {
    if (this.options == null) {
      this.options = new HashMap<>();
    }
    this.options.put(key, optionsItem);
    return this;
  }

  /**
   * Options is a set of key-value options that have been applied to the Network.
   * @return options
   */
  @jakarta.annotation.Nullable

  @JsonProperty(JSON_PROPERTY_OPTIONS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Map<String, String> getOptions() {
    return options;
  }


  @JsonProperty(JSON_PROPERTY_OPTIONS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setOptions(Map<String, String> options) {
    this.options = options;
  }


  public NetworkInspectReport routes(List<@Valid Route> routes) {
    this.routes = routes;
    return this;
  }

  public NetworkInspectReport addRoutesItem(Route routesItem) {
    if (this.routes == null) {
      this.routes = new ArrayList<>();
    }
    this.routes.add(routesItem);
    return this;
  }

  /**
   * Routes to use for this network.
   * @return routes
   */
  @jakarta.annotation.Nullable
  @Valid

  @JsonProperty(JSON_PROPERTY_ROUTES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public List<@Valid Route> getRoutes() {
    return routes;
  }


  @JsonProperty(JSON_PROPERTY_ROUTES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setRoutes(List<@Valid Route> routes) {
    this.routes = routes;
  }


  public NetworkInspectReport subnets(List<@Valid Subnet> subnets) {
    this.subnets = subnets;
    return this;
  }

  public NetworkInspectReport addSubnetsItem(Subnet subnetsItem) {
    if (this.subnets == null) {
      this.subnets = new ArrayList<>();
    }
    this.subnets.add(subnetsItem);
    return this;
  }

  /**
   * Subnets to use for this network.
   * @return subnets
   */
  @jakarta.annotation.Nullable
  @Valid

  @JsonProperty(JSON_PROPERTY_SUBNETS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public List<@Valid Subnet> getSubnets() {
    return subnets;
  }


  @JsonProperty(JSON_PROPERTY_SUBNETS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSubnets(List<@Valid Subnet> subnets) {
    this.subnets = subnets;
  }


  /**
   * Return true if this NetworkInspectReport object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    NetworkInspectReport networkInspectReport = (NetworkInspectReport) o;
    return Objects.equals(this.containers, networkInspectReport.containers) &&
        Objects.equals(this.created, networkInspectReport.created) &&
        Objects.equals(this.dnsEnabled, networkInspectReport.dnsEnabled) &&
        Objects.equals(this.driver, networkInspectReport.driver) &&
        Objects.equals(this.id, networkInspectReport.id) &&
        Objects.equals(this.internal, networkInspectReport.internal) &&
        Objects.equals(this.ipamOptions, networkInspectReport.ipamOptions) &&
        Objects.equals(this.ipv6Enabled, networkInspectReport.ipv6Enabled) &&
        Objects.equals(this.labels, networkInspectReport.labels) &&
        Objects.equals(this.name, networkInspectReport.name) &&
        Objects.equals(this.networkDnsServers, networkInspectReport.networkDnsServers) &&
        Objects.equals(this.networkInterface, networkInspectReport.networkInterface) &&
        Objects.equals(this.options, networkInspectReport.options) &&
        Objects.equals(this.routes, networkInspectReport.routes) &&
        Objects.equals(this.subnets, networkInspectReport.subnets);
  }

  @Override
  public int hashCode() {
    return Objects.hash(containers, created, dnsEnabled, driver, id, internal, ipamOptions, ipv6Enabled, labels, name, networkDnsServers, networkInterface, options, routes, subnets);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NetworkInspectReport {\n");
    sb.append("    containers: ").append(toIndentedString(containers)).append("\n");
    sb.append("    created: ").append(toIndentedString(created)).append("\n");
    sb.append("    dnsEnabled: ").append(toIndentedString(dnsEnabled)).append("\n");
    sb.append("    driver: ").append(toIndentedString(driver)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    internal: ").append(toIndentedString(internal)).append("\n");
    sb.append("    ipamOptions: ").append(toIndentedString(ipamOptions)).append("\n");
    sb.append("    ipv6Enabled: ").append(toIndentedString(ipv6Enabled)).append("\n");
    sb.append("    labels: ").append(toIndentedString(labels)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    networkDnsServers: ").append(toIndentedString(networkDnsServers)).append("\n");
    sb.append("    networkInterface: ").append(toIndentedString(networkInterface)).append("\n");
    sb.append("    options: ").append(toIndentedString(options)).append("\n");
    sb.append("    routes: ").append(toIndentedString(routes)).append("\n");
    sb.append("    subnets: ").append(toIndentedString(subnets)).append("\n");
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

  /**
   * Convert the instance into URL query string.
   *
   * @return URL query string
   */
  public String toUrlQueryString() {
    return toUrlQueryString(null);
  }

  /**
   * Convert the instance into URL query string.
   *
   * @param prefix prefix of the query string
   * @return URL query string
   */
  public String toUrlQueryString(String prefix) {
    String suffix = "";
    String containerSuffix = "";
    String containerPrefix = "";
    if (prefix == null) {
      // style=form, explode=true, e.g. /pet?name=cat&type=manx
      prefix = "";
    } else {
      // deepObject style e.g. /pet?id[name]=cat&id[type]=manx
      prefix = prefix + "[";
      suffix = "]";
      containerSuffix = "]";
      containerPrefix = "[";
    }

    StringJoiner joiner = new StringJoiner("&");

    // add `containers` to the URL query string
    if (getContainers() != null) {
      for (String _key : getContainers().keySet()) {
        if (getContainers().get(_key) != null) {
          joiner.add(getContainers().get(_key).toUrlQueryString(String.format("%scontainers%s%s", prefix, suffix,
              "".equals(suffix) ? "" : String.format("%s%d%s", containerPrefix, _key, containerSuffix))));
        }
      }
    }

    // add `created` to the URL query string
    if (getCreated() != null) {
      joiner.add(String.format("%screated%s=%s", prefix, suffix, URLEncoder.encode(ApiClient.valueToString(getCreated()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `dns_enabled` to the URL query string
    if (getDnsEnabled() != null) {
      joiner.add(String.format("%sdns_enabled%s=%s", prefix, suffix, URLEncoder.encode(ApiClient.valueToString(getDnsEnabled()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `driver` to the URL query string
    if (getDriver() != null) {
      joiner.add(String.format("%sdriver%s=%s", prefix, suffix, URLEncoder.encode(ApiClient.valueToString(getDriver()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `id` to the URL query string
    if (getId() != null) {
      joiner.add(String.format("%sid%s=%s", prefix, suffix, URLEncoder.encode(ApiClient.valueToString(getId()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `internal` to the URL query string
    if (getInternal() != null) {
      joiner.add(String.format("%sinternal%s=%s", prefix, suffix, URLEncoder.encode(ApiClient.valueToString(getInternal()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `ipam_options` to the URL query string
    if (getIpamOptions() != null) {
      for (String _key : getIpamOptions().keySet()) {
        joiner.add(String.format("%sipam_options%s%s=%s", prefix, suffix,
            "".equals(suffix) ? "" : String.format("%s%d%s", containerPrefix, _key, containerSuffix),
            getIpamOptions().get(_key), URLEncoder.encode(ApiClient.valueToString(getIpamOptions().get(_key)), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
      }
    }

    // add `ipv6_enabled` to the URL query string
    if (getIpv6Enabled() != null) {
      joiner.add(String.format("%sipv6_enabled%s=%s", prefix, suffix, URLEncoder.encode(ApiClient.valueToString(getIpv6Enabled()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `labels` to the URL query string
    if (getLabels() != null) {
      for (String _key : getLabels().keySet()) {
        joiner.add(String.format("%slabels%s%s=%s", prefix, suffix,
            "".equals(suffix) ? "" : String.format("%s%d%s", containerPrefix, _key, containerSuffix),
            getLabels().get(_key), URLEncoder.encode(ApiClient.valueToString(getLabels().get(_key)), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
      }
    }

    // add `name` to the URL query string
    if (getName() != null) {
      joiner.add(String.format("%sname%s=%s", prefix, suffix, URLEncoder.encode(ApiClient.valueToString(getName()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `network_dns_servers` to the URL query string
    if (getNetworkDnsServers() != null) {
      for (int i = 0; i < getNetworkDnsServers().size(); i++) {
        joiner.add(String.format("%snetwork_dns_servers%s%s=%s", prefix, suffix,
            "".equals(suffix) ? "" : String.format("%s%d%s", containerPrefix, i, containerSuffix),
            URLEncoder.encode(ApiClient.valueToString(getNetworkDnsServers().get(i)), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
      }
    }

    // add `network_interface` to the URL query string
    if (getNetworkInterface() != null) {
      joiner.add(String.format("%snetwork_interface%s=%s", prefix, suffix, URLEncoder.encode(ApiClient.valueToString(getNetworkInterface()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `options` to the URL query string
    if (getOptions() != null) {
      for (String _key : getOptions().keySet()) {
        joiner.add(String.format("%soptions%s%s=%s", prefix, suffix,
            "".equals(suffix) ? "" : String.format("%s%d%s", containerPrefix, _key, containerSuffix),
            getOptions().get(_key), URLEncoder.encode(ApiClient.valueToString(getOptions().get(_key)), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
      }
    }

    // add `routes` to the URL query string
    if (getRoutes() != null) {
      for (int i = 0; i < getRoutes().size(); i++) {
        if (getRoutes().get(i) != null) {
          joiner.add(getRoutes().get(i).toUrlQueryString(String.format("%sroutes%s%s", prefix, suffix,
          "".equals(suffix) ? "" : String.format("%s%d%s", containerPrefix, i, containerSuffix))));
        }
      }
    }

    // add `subnets` to the URL query string
    if (getSubnets() != null) {
      for (int i = 0; i < getSubnets().size(); i++) {
        if (getSubnets().get(i) != null) {
          joiner.add(getSubnets().get(i).toUrlQueryString(String.format("%ssubnets%s%s", prefix, suffix,
          "".equals(suffix) ? "" : String.format("%s%d%s", containerPrefix, i, containerSuffix))));
        }
      }
    }

    return joiner.toString();
  }
}

