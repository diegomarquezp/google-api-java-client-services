/*
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except
 * in compliance with the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the License
 * is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express
 * or implied. See the License for the specific language governing permissions and limitations under
 * the License.
 */
/*
 * This code was generated by https://github.com/googleapis/google-api-java-client-services/
 * Modify at your own risk.
 */

package com.google.api.services.compute.model;

/**
 * Represents a collection of network endpoints.
 *
 * A network endpoint group (NEG) defines how a set of endpoints should be reached, whether they are
 * reachable, and where they are located. For more information about using NEGs, see  Setting up
 * internet NEGs or  Setting up zonal NEGs. (== resource_for {$api_version}.networkEndpointGroups
 * ==) (== resource_for {$api_version}.globalNetworkEndpointGroups ==)
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Compute Engine API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class NetworkEndpointGroup extends com.google.api.client.json.GenericJson {

  /**
   * Metadata defined as annotations on the network endpoint group.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.Map<String, java.lang.String> annotations;

  /**
   * [Output Only] Creation timestamp in RFC3339 text format.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String creationTimestamp;

  /**
   * The default port used if the port number is not specified in the network endpoint.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Integer defaultPort;

  /**
   * An optional description of this resource. Provide this property when you create the resource.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String description;

  /**
   * [Output Only] The unique identifier for the resource. This identifier is defined by the server.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key @com.google.api.client.json.JsonString
  private java.math.BigInteger id;

  /**
   * [Output Only] Type of the resource. Always compute#networkEndpointGroup for network endpoint
   * group.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String kind;

  /**
   * Name of the resource; provided by the client when the resource is created. The name must be
   * 1-63 characters long, and comply with RFC1035. Specifically, the name must be 1-63 characters
   * long and match the regular expression `[a-z]([-a-z0-9]*[a-z0-9])?` which means the first
   * character must be a lowercase letter, and all following characters must be a dash, lowercase
   * letter, or digit, except the last character, which cannot be a dash.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String name;

  /**
   * The URL of the network to which all network endpoints in the NEG belong. Uses "default" project
   * network if unspecified.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String network;

  /**
   * Type of network endpoints in this network endpoint group.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String networkEndpointType;

  /**
   * [Output Only] Server-defined URL for the resource.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String selfLink;

  /**
   * [Output only] Number of network endpoints in the network endpoint group.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Integer size;

  /**
   * Optional URL of the subnetwork to which all network endpoints in the NEG belong.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String subnetwork;

  /**
   * [Output Only] The URL of the zone where the network endpoint group is located.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String zone;

  /**
   * Metadata defined as annotations on the network endpoint group.
   * @return value or {@code null} for none
   */
  public java.util.Map<String, java.lang.String> getAnnotations() {
    return annotations;
  }

  /**
   * Metadata defined as annotations on the network endpoint group.
   * @param annotations annotations or {@code null} for none
   */
  public NetworkEndpointGroup setAnnotations(java.util.Map<String, java.lang.String> annotations) {
    this.annotations = annotations;
    return this;
  }

  /**
   * [Output Only] Creation timestamp in RFC3339 text format.
   * @return value or {@code null} for none
   */
  public java.lang.String getCreationTimestamp() {
    return creationTimestamp;
  }

  /**
   * [Output Only] Creation timestamp in RFC3339 text format.
   * @param creationTimestamp creationTimestamp or {@code null} for none
   */
  public NetworkEndpointGroup setCreationTimestamp(java.lang.String creationTimestamp) {
    this.creationTimestamp = creationTimestamp;
    return this;
  }

  /**
   * The default port used if the port number is not specified in the network endpoint.
   * @return value or {@code null} for none
   */
  public java.lang.Integer getDefaultPort() {
    return defaultPort;
  }

  /**
   * The default port used if the port number is not specified in the network endpoint.
   * @param defaultPort defaultPort or {@code null} for none
   */
  public NetworkEndpointGroup setDefaultPort(java.lang.Integer defaultPort) {
    this.defaultPort = defaultPort;
    return this;
  }

  /**
   * An optional description of this resource. Provide this property when you create the resource.
   * @return value or {@code null} for none
   */
  public java.lang.String getDescription() {
    return description;
  }

  /**
   * An optional description of this resource. Provide this property when you create the resource.
   * @param description description or {@code null} for none
   */
  public NetworkEndpointGroup setDescription(java.lang.String description) {
    this.description = description;
    return this;
  }

  /**
   * [Output Only] The unique identifier for the resource. This identifier is defined by the server.
   * @return value or {@code null} for none
   */
  public java.math.BigInteger getId() {
    return id;
  }

  /**
   * [Output Only] The unique identifier for the resource. This identifier is defined by the server.
   * @param id id or {@code null} for none
   */
  public NetworkEndpointGroup setId(java.math.BigInteger id) {
    this.id = id;
    return this;
  }

  /**
   * [Output Only] Type of the resource. Always compute#networkEndpointGroup for network endpoint
   * group.
   * @return value or {@code null} for none
   */
  public java.lang.String getKind() {
    return kind;
  }

  /**
   * [Output Only] Type of the resource. Always compute#networkEndpointGroup for network endpoint
   * group.
   * @param kind kind or {@code null} for none
   */
  public NetworkEndpointGroup setKind(java.lang.String kind) {
    this.kind = kind;
    return this;
  }

  /**
   * Name of the resource; provided by the client when the resource is created. The name must be
   * 1-63 characters long, and comply with RFC1035. Specifically, the name must be 1-63 characters
   * long and match the regular expression `[a-z]([-a-z0-9]*[a-z0-9])?` which means the first
   * character must be a lowercase letter, and all following characters must be a dash, lowercase
   * letter, or digit, except the last character, which cannot be a dash.
   * @return value or {@code null} for none
   */
  public java.lang.String getName() {
    return name;
  }

  /**
   * Name of the resource; provided by the client when the resource is created. The name must be
   * 1-63 characters long, and comply with RFC1035. Specifically, the name must be 1-63 characters
   * long and match the regular expression `[a-z]([-a-z0-9]*[a-z0-9])?` which means the first
   * character must be a lowercase letter, and all following characters must be a dash, lowercase
   * letter, or digit, except the last character, which cannot be a dash.
   * @param name name or {@code null} for none
   */
  public NetworkEndpointGroup setName(java.lang.String name) {
    this.name = name;
    return this;
  }

  /**
   * The URL of the network to which all network endpoints in the NEG belong. Uses "default" project
   * network if unspecified.
   * @return value or {@code null} for none
   */
  public java.lang.String getNetwork() {
    return network;
  }

  /**
   * The URL of the network to which all network endpoints in the NEG belong. Uses "default" project
   * network if unspecified.
   * @param network network or {@code null} for none
   */
  public NetworkEndpointGroup setNetwork(java.lang.String network) {
    this.network = network;
    return this;
  }

  /**
   * Type of network endpoints in this network endpoint group.
   * @return value or {@code null} for none
   */
  public java.lang.String getNetworkEndpointType() {
    return networkEndpointType;
  }

  /**
   * Type of network endpoints in this network endpoint group.
   * @param networkEndpointType networkEndpointType or {@code null} for none
   */
  public NetworkEndpointGroup setNetworkEndpointType(java.lang.String networkEndpointType) {
    this.networkEndpointType = networkEndpointType;
    return this;
  }

  /**
   * [Output Only] Server-defined URL for the resource.
   * @return value or {@code null} for none
   */
  public java.lang.String getSelfLink() {
    return selfLink;
  }

  /**
   * [Output Only] Server-defined URL for the resource.
   * @param selfLink selfLink or {@code null} for none
   */
  public NetworkEndpointGroup setSelfLink(java.lang.String selfLink) {
    this.selfLink = selfLink;
    return this;
  }

  /**
   * [Output only] Number of network endpoints in the network endpoint group.
   * @return value or {@code null} for none
   */
  public java.lang.Integer getSize() {
    return size;
  }

  /**
   * [Output only] Number of network endpoints in the network endpoint group.
   * @param size size or {@code null} for none
   */
  public NetworkEndpointGroup setSize(java.lang.Integer size) {
    this.size = size;
    return this;
  }

  /**
   * Optional URL of the subnetwork to which all network endpoints in the NEG belong.
   * @return value or {@code null} for none
   */
  public java.lang.String getSubnetwork() {
    return subnetwork;
  }

  /**
   * Optional URL of the subnetwork to which all network endpoints in the NEG belong.
   * @param subnetwork subnetwork or {@code null} for none
   */
  public NetworkEndpointGroup setSubnetwork(java.lang.String subnetwork) {
    this.subnetwork = subnetwork;
    return this;
  }

  /**
   * [Output Only] The URL of the zone where the network endpoint group is located.
   * @return value or {@code null} for none
   */
  public java.lang.String getZone() {
    return zone;
  }

  /**
   * [Output Only] The URL of the zone where the network endpoint group is located.
   * @param zone zone or {@code null} for none
   */
  public NetworkEndpointGroup setZone(java.lang.String zone) {
    this.zone = zone;
    return this;
  }

  @Override
  public NetworkEndpointGroup set(String fieldName, Object value) {
    return (NetworkEndpointGroup) super.set(fieldName, value);
  }

  @Override
  public NetworkEndpointGroup clone() {
    return (NetworkEndpointGroup) super.clone();
  }

}
