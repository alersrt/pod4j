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
import io.github.alersrt.pod4j.openapi.model.Topology;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;


import io.github.alersrt.pod4j.openapi.ApiClient;
/**
 * TopologyRequirement expresses the user&#39;s requirements for a volume&#39;s accessible topology.
 */
@JsonPropertyOrder({
  TopologyRequirement.JSON_PROPERTY_PREFERRED,
  TopologyRequirement.JSON_PROPERTY_REQUISITE
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-11-28T20:49:08.759389952+07:00[Asia/Barnaul]", comments = "Generator version: 7.7.0")
public class TopologyRequirement {
  public static final String JSON_PROPERTY_PREFERRED = "Preferred";
  private List<@Valid Topology> preferred = new ArrayList<>();

  public static final String JSON_PROPERTY_REQUISITE = "Requisite";
  private List<@Valid Topology> requisite = new ArrayList<>();

  public TopologyRequirement() { 
  }

  public TopologyRequirement preferred(List<@Valid Topology> preferred) {
    this.preferred = preferred;
    return this;
  }

  public TopologyRequirement addPreferredItem(Topology preferredItem) {
    if (this.preferred == null) {
      this.preferred = new ArrayList<>();
    }
    this.preferred.add(preferredItem);
    return this;
  }

  /**
   * Preferred is a list of Topologies that the volume should attempt to be provisioned in.  Taken from the CSI spec:  Specifies the list of topologies the CO would prefer the volume to be provisioned in.  This field is OPTIONAL. If TopologyRequirement is specified either requisite or preferred or both MUST be specified.  An SP MUST attempt to make the provisioned volume available using the preferred topologies in order from first to last.  If requisite is specified, all topologies in preferred list MUST also be present in the list of requisite topologies.  If the SP is unable to make the provisioned volume available from any of the preferred topologies, the SP MAY choose a topology from the list of requisite topologies. If the list of requisite topologies is not specified, then the SP MAY choose from the list of all possible topologies. If the list of requisite topologies is specified and the SP is unable to make the provisioned volume available from any of the requisite topologies it MUST fail the CreateVolume call.  Example 1: Given a volume should be accessible from a single zone, and requisite &#x3D; {\&quot;region\&quot;: \&quot;R1\&quot;, \&quot;zone\&quot;: \&quot;Z2\&quot;}, {\&quot;region\&quot;: \&quot;R1\&quot;, \&quot;zone\&quot;: \&quot;Z3\&quot;} preferred &#x3D; {\&quot;region\&quot;: \&quot;R1\&quot;, \&quot;zone\&quot;: \&quot;Z3\&quot;} then the SP SHOULD first attempt to make the provisioned volume available from \&quot;zone\&quot; \&quot;Z3\&quot; in the \&quot;region\&quot; \&quot;R1\&quot; and fall back to \&quot;zone\&quot; \&quot;Z2\&quot; in the \&quot;region\&quot; \&quot;R1\&quot; if that is not possible.  Example 2: Given a volume should be accessible from a single zone, and requisite &#x3D; {\&quot;region\&quot;: \&quot;R1\&quot;, \&quot;zone\&quot;: \&quot;Z2\&quot;}, {\&quot;region\&quot;: \&quot;R1\&quot;, \&quot;zone\&quot;: \&quot;Z3\&quot;}, {\&quot;region\&quot;: \&quot;R1\&quot;, \&quot;zone\&quot;: \&quot;Z4\&quot;}, {\&quot;region\&quot;: \&quot;R1\&quot;, \&quot;zone\&quot;: \&quot;Z5\&quot;} preferred &#x3D; {\&quot;region\&quot;: \&quot;R1\&quot;, \&quot;zone\&quot;: \&quot;Z4\&quot;}, {\&quot;region\&quot;: \&quot;R1\&quot;, \&quot;zone\&quot;: \&quot;Z2\&quot;} then the SP SHOULD first attempt to make the provisioned volume accessible from \&quot;zone\&quot; \&quot;Z4\&quot; in the \&quot;region\&quot; \&quot;R1\&quot; and fall back to \&quot;zone\&quot; \&quot;Z2\&quot; in the \&quot;region\&quot; \&quot;R1\&quot; if that is not possible. If that is not possible, the SP may choose between either the \&quot;zone\&quot; \&quot;Z3\&quot; or \&quot;Z5\&quot; in the \&quot;region\&quot; \&quot;R1\&quot;.  Example 3: Given a volume should be accessible from TWO zones (because an opaque parameter in CreateVolumeRequest, for example, specifies the volume is accessible from two zones, aka synchronously replicated), and requisite &#x3D; {\&quot;region\&quot;: \&quot;R1\&quot;, \&quot;zone\&quot;: \&quot;Z2\&quot;}, {\&quot;region\&quot;: \&quot;R1\&quot;, \&quot;zone\&quot;: \&quot;Z3\&quot;}, {\&quot;region\&quot;: \&quot;R1\&quot;, \&quot;zone\&quot;: \&quot;Z4\&quot;}, {\&quot;region\&quot;: \&quot;R1\&quot;, \&quot;zone\&quot;: \&quot;Z5\&quot;} preferred &#x3D; {\&quot;region\&quot;: \&quot;R1\&quot;, \&quot;zone\&quot;: \&quot;Z5\&quot;}, {\&quot;region\&quot;: \&quot;R1\&quot;, \&quot;zone\&quot;: \&quot;Z3\&quot;} then the SP SHOULD first attempt to make the provisioned volume accessible from the combination of the two \&quot;zones\&quot; \&quot;Z5\&quot; and \&quot;Z3\&quot; in the \&quot;region\&quot; \&quot;R1\&quot;. If that&#39;s not possible, it should fall back to a combination of \&quot;Z5\&quot; and other possibilities from the list of requisite. If that&#39;s not possible, it should fall back  to a combination of \&quot;Z3\&quot; and other possibilities from the list of requisite. If that&#39;s not possible, it should fall back  to a combination of other possibilities from the list of requisite.
   * @return preferred
   */
  @jakarta.annotation.Nullable
  @Valid

  @JsonProperty(JSON_PROPERTY_PREFERRED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public List<@Valid Topology> getPreferred() {
    return preferred;
  }


  @JsonProperty(JSON_PROPERTY_PREFERRED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPreferred(List<@Valid Topology> preferred) {
    this.preferred = preferred;
  }


  public TopologyRequirement requisite(List<@Valid Topology> requisite) {
    this.requisite = requisite;
    return this;
  }

  public TopologyRequirement addRequisiteItem(Topology requisiteItem) {
    if (this.requisite == null) {
      this.requisite = new ArrayList<>();
    }
    this.requisite.add(requisiteItem);
    return this;
  }

  /**
   * Requisite specifies a list of Topologies, at least one of which the volume must be accessible from.  Taken verbatim from the CSI Spec:  Specifies the list of topologies the provisioned volume MUST be accessible from. This field is OPTIONAL. If TopologyRequirement is specified either requisite or preferred or both MUST be specified.  If requisite is specified, the provisioned volume MUST be accessible from at least one of the requisite topologies.  Given x &#x3D; number of topologies provisioned volume is accessible from n &#x3D; number of requisite topologies The CO MUST ensure n &gt;&#x3D; 1. The SP MUST ensure x &gt;&#x3D; 1 If x&#x3D;&#x3D;n, then the SP MUST make the provisioned volume available to all topologies from the list of requisite topologies. If it is unable to do so, the SP MUST fail the CreateVolume call. For example, if a volume should be accessible from a single zone, and requisite &#x3D; {\&quot;region\&quot;: \&quot;R1\&quot;, \&quot;zone\&quot;: \&quot;Z2\&quot;} then the provisioned volume MUST be accessible from the \&quot;region\&quot; \&quot;R1\&quot; and the \&quot;zone\&quot; \&quot;Z2\&quot;. Similarly, if a volume should be accessible from two zones, and requisite &#x3D; {\&quot;region\&quot;: \&quot;R1\&quot;, \&quot;zone\&quot;: \&quot;Z2\&quot;}, {\&quot;region\&quot;: \&quot;R1\&quot;, \&quot;zone\&quot;: \&quot;Z3\&quot;} then the provisioned volume MUST be accessible from the \&quot;region\&quot; \&quot;R1\&quot; and both \&quot;zone\&quot; \&quot;Z2\&quot; and \&quot;zone\&quot; \&quot;Z3\&quot;.  If x&lt;n, then the SP SHALL choose x unique topologies from the list of requisite topologies. If it is unable to do so, the SP MUST fail the CreateVolume call. For example, if a volume should be accessible from a single zone, and requisite &#x3D; {\&quot;region\&quot;: \&quot;R1\&quot;, \&quot;zone\&quot;: \&quot;Z2\&quot;}, {\&quot;region\&quot;: \&quot;R1\&quot;, \&quot;zone\&quot;: \&quot;Z3\&quot;} then the SP may choose to make the provisioned volume available in either the \&quot;zone\&quot; \&quot;Z2\&quot; or the \&quot;zone\&quot; \&quot;Z3\&quot; in the \&quot;region\&quot; \&quot;R1\&quot;. Similarly, if a volume should be accessible from two zones, and requisite &#x3D; {\&quot;region\&quot;: \&quot;R1\&quot;, \&quot;zone\&quot;: \&quot;Z2\&quot;}, {\&quot;region\&quot;: \&quot;R1\&quot;, \&quot;zone\&quot;: \&quot;Z3\&quot;}, {\&quot;region\&quot;: \&quot;R1\&quot;, \&quot;zone\&quot;: \&quot;Z4\&quot;} then the provisioned volume MUST be accessible from any combination of two unique topologies: e.g. \&quot;R1/Z2\&quot; and \&quot;R1/Z3\&quot;, or \&quot;R1/Z2\&quot; and \&quot;R1/Z4\&quot;, or \&quot;R1/Z3\&quot; and \&quot;R1/Z4\&quot;.  If x&gt;n, then the SP MUST make the provisioned volume available from all topologies from the list of requisite topologies and MAY choose the remaining x-n unique topologies from the list of all possible topologies. If it is unable to do so, the SP MUST fail the CreateVolume call. For example, if a volume should be accessible from two zones, and requisite &#x3D; {\&quot;region\&quot;: \&quot;R1\&quot;, \&quot;zone\&quot;: \&quot;Z2\&quot;} then the provisioned volume MUST be accessible from the \&quot;region\&quot; \&quot;R1\&quot; and the \&quot;zone\&quot; \&quot;Z2\&quot; and the SP may select the second zone independently, e.g. \&quot;R1/Z4\&quot;.
   * @return requisite
   */
  @jakarta.annotation.Nullable
  @Valid

  @JsonProperty(JSON_PROPERTY_REQUISITE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public List<@Valid Topology> getRequisite() {
    return requisite;
  }


  @JsonProperty(JSON_PROPERTY_REQUISITE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setRequisite(List<@Valid Topology> requisite) {
    this.requisite = requisite;
  }


  /**
   * Return true if this TopologyRequirement object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TopologyRequirement topologyRequirement = (TopologyRequirement) o;
    return Objects.equals(this.preferred, topologyRequirement.preferred) &&
        Objects.equals(this.requisite, topologyRequirement.requisite);
  }

  @Override
  public int hashCode() {
    return Objects.hash(preferred, requisite);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TopologyRequirement {\n");
    sb.append("    preferred: ").append(toIndentedString(preferred)).append("\n");
    sb.append("    requisite: ").append(toIndentedString(requisite)).append("\n");
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

    // add `Preferred` to the URL query string
    if (getPreferred() != null) {
      for (int i = 0; i < getPreferred().size(); i++) {
        if (getPreferred().get(i) != null) {
          joiner.add(getPreferred().get(i).toUrlQueryString(String.format("%sPreferred%s%s", prefix, suffix,
          "".equals(suffix) ? "" : String.format("%s%d%s", containerPrefix, i, containerSuffix))));
        }
      }
    }

    // add `Requisite` to the URL query string
    if (getRequisite() != null) {
      for (int i = 0; i < getRequisite().size(); i++) {
        if (getRequisite().get(i) != null) {
          joiner.add(getRequisite().get(i).toUrlQueryString(String.format("%sRequisite%s%s", prefix, suffix,
          "".equals(suffix) ? "" : String.format("%s%d%s", containerPrefix, i, containerSuffix))));
        }
      }
    }

    return joiner.toString();
  }
}

