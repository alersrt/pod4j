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
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;


import io.github.alersrt.pod4j.openapi.ApiClient;
/**
 * ContainerTopOKBody OK response to ContainerTop operation
 */
@JsonPropertyOrder({
  ContainerTopOKBody.JSON_PROPERTY_PROCESSES,
  ContainerTopOKBody.JSON_PROPERTY_TITLES
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-11-28T19:32:38.690938181+07:00[Asia/Barnaul]", comments = "Generator version: 7.7.0")
public class ContainerTopOKBody {
  public static final String JSON_PROPERTY_PROCESSES = "Processes";
  private List<List<String>> processes = new ArrayList<>();

  public static final String JSON_PROPERTY_TITLES = "Titles";
  private List<String> titles = new ArrayList<>();

  public ContainerTopOKBody() { 
  }

  public ContainerTopOKBody processes(List<List<String>> processes) {
    this.processes = processes;
    return this;
  }

  public ContainerTopOKBody addProcessesItem(List<String> processesItem) {
    if (this.processes == null) {
      this.processes = new ArrayList<>();
    }
    this.processes.add(processesItem);
    return this;
  }

  /**
   * Each process running in the container, where each is process is an array of values corresponding to the titles.
   * @return processes
   */
  @javax.annotation.Nonnull
  @NotNull
  @Valid

  @JsonProperty(JSON_PROPERTY_PROCESSES)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public List<List<String>> getProcesses() {
    return processes;
  }


  @JsonProperty(JSON_PROPERTY_PROCESSES)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setProcesses(List<List<String>> processes) {
    this.processes = processes;
  }


  public ContainerTopOKBody titles(List<String> titles) {
    this.titles = titles;
    return this;
  }

  public ContainerTopOKBody addTitlesItem(String titlesItem) {
    if (this.titles == null) {
      this.titles = new ArrayList<>();
    }
    this.titles.add(titlesItem);
    return this;
  }

  /**
   * The ps column titles
   * @return titles
   */
  @javax.annotation.Nonnull
  @NotNull

  @JsonProperty(JSON_PROPERTY_TITLES)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public List<String> getTitles() {
    return titles;
  }


  @JsonProperty(JSON_PROPERTY_TITLES)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setTitles(List<String> titles) {
    this.titles = titles;
  }


  /**
   * Return true if this ContainerTopOKBody object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ContainerTopOKBody containerTopOKBody = (ContainerTopOKBody) o;
    return Objects.equals(this.processes, containerTopOKBody.processes) &&
        Objects.equals(this.titles, containerTopOKBody.titles);
  }

  @Override
  public int hashCode() {
    return Objects.hash(processes, titles);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ContainerTopOKBody {\n");
    sb.append("    processes: ").append(toIndentedString(processes)).append("\n");
    sb.append("    titles: ").append(toIndentedString(titles)).append("\n");
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

    // add `Processes` to the URL query string
    if (getProcesses() != null) {
      for (int i = 0; i < getProcesses().size(); i++) {
        joiner.add(String.format("%sProcesses%s%s=%s", prefix, suffix,
            "".equals(suffix) ? "" : String.format("%s%d%s", containerPrefix, i, containerSuffix),
            URLEncoder.encode(ApiClient.valueToString(getProcesses().get(i)), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
      }
    }

    // add `Titles` to the URL query string
    if (getTitles() != null) {
      for (int i = 0; i < getTitles().size(); i++) {
        joiner.add(String.format("%sTitles%s%s=%s", prefix, suffix,
            "".equals(suffix) ? "" : String.format("%s%d%s", containerPrefix, i, containerSuffix),
            URLEncoder.encode(ApiClient.valueToString(getTitles().get(i)), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
      }
    }

    return joiner.toString();
  }
}

