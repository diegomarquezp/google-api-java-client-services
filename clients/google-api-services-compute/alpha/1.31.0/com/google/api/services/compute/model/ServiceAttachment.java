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
 * Represents a ServiceAttachment resource.
 *
 * A service attachment represents a service that a producer has exposed. It encapsulates the load
 * balancer which fronts the service runs and a list of NAT IP ranges that the producers uses to
 * represent the consumers connecting to the service. next tag = 19
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Compute Engine API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class ServiceAttachment extends com.google.api.client.json.GenericJson {

  /**
   * The connection preference of service attachment. The value can be set to ACCEPT_AUTOMATIC. An
   * ACCEPT_AUTOMATIC service attachment is one that always accepts the connection from consumer
   * forwarding rules.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String connectionPreference;

  /**
   * Projects that are allowed to connect to this service attachment.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<ServiceAttachmentConsumerProjectLimit> consumerAcceptLists;

  /**
   * [Output Only] An array of forwarding rules for all the consumers connected to this service
   * attachment.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<ServiceAttachmentConsumerForwardingRule> consumerForwardingRules;

  /**
   * Projects that are not allowed to connect to this service attachment. The project can be
   * specified using its id or number.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<java.lang.String> consumerRejectLists;

  /**
   * [Output Only] Creation timestamp in RFC3339 text format.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String creationTimestamp;

  /**
   * An optional description of this resource. Provide this property when you create the resource.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String description;

  /**
   * If true, enable the proxy protocol which is for supplying client TCP/IP address data in TCP
   * connections that traverse proxies on their way to destination servers.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean enableProxyProtocol;

  /**
   * Fingerprint of this resource. A hash of the contents stored in this object. This field is used
   * in optimistic locking. This field will be ignored when inserting a ServiceAttachment. An up-to-
   * date fingerprint must be provided in order to patch/update the ServiceAttachment; otherwise,
   * the request will fail with error 412 conditionNotMet. To see the latest fingerprint, make a
   * get() request to retrieve the ServiceAttachment.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String fingerprint;

  /**
   * [Output Only] The unique identifier for the resource type. The server generates this
   * identifier.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key @com.google.api.client.json.JsonString
  private java.math.BigInteger id;

  /**
   * [Output Only] Type of the resource. Always compute#serviceAttachment for service attachments.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String kind;

  /**
   * Name of the resource. Provided by the client when the resource is created. The name must be
   * 1-63 characters long, and comply with RFC1035. Specifically, the name must be 1-63 characters
   * long and match the regular expression `[a-z]([-a-z0-9]*[a-z0-9])?` which means the first
   * character must be a lowercase letter, and all following characters must be a dash, lowercase
   * letter, or digit, except the last character, which cannot be a dash.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String name;

  /**
   * An array of URLs where each entry is the URL of a subnet provided by the service producer to
   * use for NAT in this service attachment.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<java.lang.String> natSubnets;

  /**
   * The URL of a forwarding rule with loadBalancingScheme INTERNAL* that is serving the endpoint
   * identified by this service attachment.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String producerForwardingRule;

  /**
   * [Output Only] URL of the region where the service attachment resides. This field applies only
   * to the region resource. You must specify this field as part of the HTTP request URL. It is not
   * settable as a field in the request body.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String region;

  /**
   * [Output Only] Server-defined URL for the resource.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String selfLink;

  /**
   * The URL of a service serving the endpoint identified by this service attachment.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String targetService;

  /**
   * The connection preference of service attachment. The value can be set to ACCEPT_AUTOMATIC. An
   * ACCEPT_AUTOMATIC service attachment is one that always accepts the connection from consumer
   * forwarding rules.
   * @return value or {@code null} for none
   */
  public java.lang.String getConnectionPreference() {
    return connectionPreference;
  }

  /**
   * The connection preference of service attachment. The value can be set to ACCEPT_AUTOMATIC. An
   * ACCEPT_AUTOMATIC service attachment is one that always accepts the connection from consumer
   * forwarding rules.
   * @param connectionPreference connectionPreference or {@code null} for none
   */
  public ServiceAttachment setConnectionPreference(java.lang.String connectionPreference) {
    this.connectionPreference = connectionPreference;
    return this;
  }

  /**
   * Projects that are allowed to connect to this service attachment.
   * @return value or {@code null} for none
   */
  public java.util.List<ServiceAttachmentConsumerProjectLimit> getConsumerAcceptLists() {
    return consumerAcceptLists;
  }

  /**
   * Projects that are allowed to connect to this service attachment.
   * @param consumerAcceptLists consumerAcceptLists or {@code null} for none
   */
  public ServiceAttachment setConsumerAcceptLists(java.util.List<ServiceAttachmentConsumerProjectLimit> consumerAcceptLists) {
    this.consumerAcceptLists = consumerAcceptLists;
    return this;
  }

  /**
   * [Output Only] An array of forwarding rules for all the consumers connected to this service
   * attachment.
   * @return value or {@code null} for none
   */
  public java.util.List<ServiceAttachmentConsumerForwardingRule> getConsumerForwardingRules() {
    return consumerForwardingRules;
  }

  /**
   * [Output Only] An array of forwarding rules for all the consumers connected to this service
   * attachment.
   * @param consumerForwardingRules consumerForwardingRules or {@code null} for none
   */
  public ServiceAttachment setConsumerForwardingRules(java.util.List<ServiceAttachmentConsumerForwardingRule> consumerForwardingRules) {
    this.consumerForwardingRules = consumerForwardingRules;
    return this;
  }

  /**
   * Projects that are not allowed to connect to this service attachment. The project can be
   * specified using its id or number.
   * @return value or {@code null} for none
   */
  public java.util.List<java.lang.String> getConsumerRejectLists() {
    return consumerRejectLists;
  }

  /**
   * Projects that are not allowed to connect to this service attachment. The project can be
   * specified using its id or number.
   * @param consumerRejectLists consumerRejectLists or {@code null} for none
   */
  public ServiceAttachment setConsumerRejectLists(java.util.List<java.lang.String> consumerRejectLists) {
    this.consumerRejectLists = consumerRejectLists;
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
  public ServiceAttachment setCreationTimestamp(java.lang.String creationTimestamp) {
    this.creationTimestamp = creationTimestamp;
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
  public ServiceAttachment setDescription(java.lang.String description) {
    this.description = description;
    return this;
  }

  /**
   * If true, enable the proxy protocol which is for supplying client TCP/IP address data in TCP
   * connections that traverse proxies on their way to destination servers.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getEnableProxyProtocol() {
    return enableProxyProtocol;
  }

  /**
   * If true, enable the proxy protocol which is for supplying client TCP/IP address data in TCP
   * connections that traverse proxies on their way to destination servers.
   * @param enableProxyProtocol enableProxyProtocol or {@code null} for none
   */
  public ServiceAttachment setEnableProxyProtocol(java.lang.Boolean enableProxyProtocol) {
    this.enableProxyProtocol = enableProxyProtocol;
    return this;
  }

  /**
   * Fingerprint of this resource. A hash of the contents stored in this object. This field is used
   * in optimistic locking. This field will be ignored when inserting a ServiceAttachment. An up-to-
   * date fingerprint must be provided in order to patch/update the ServiceAttachment; otherwise,
   * the request will fail with error 412 conditionNotMet. To see the latest fingerprint, make a
   * get() request to retrieve the ServiceAttachment.
   * @see #decodeFingerprint()
   * @return value or {@code null} for none
   */
  public java.lang.String getFingerprint() {
    return fingerprint;
  }

  /**
   * Fingerprint of this resource. A hash of the contents stored in this object. This field is used
   * in optimistic locking. This field will be ignored when inserting a ServiceAttachment. An up-to-
   * date fingerprint must be provided in order to patch/update the ServiceAttachment; otherwise,
   * the request will fail with error 412 conditionNotMet. To see the latest fingerprint, make a
   * get() request to retrieve the ServiceAttachment.
   * @see #getFingerprint()
   * @return Base64 decoded value or {@code null} for none
   *
   * @since 1.14
   */
  public byte[] decodeFingerprint() {
    return com.google.api.client.util.Base64.decodeBase64(fingerprint);
  }

  /**
   * Fingerprint of this resource. A hash of the contents stored in this object. This field is used
   * in optimistic locking. This field will be ignored when inserting a ServiceAttachment. An up-to-
   * date fingerprint must be provided in order to patch/update the ServiceAttachment; otherwise,
   * the request will fail with error 412 conditionNotMet. To see the latest fingerprint, make a
   * get() request to retrieve the ServiceAttachment.
   * @see #encodeFingerprint()
   * @param fingerprint fingerprint or {@code null} for none
   */
  public ServiceAttachment setFingerprint(java.lang.String fingerprint) {
    this.fingerprint = fingerprint;
    return this;
  }

  /**
   * Fingerprint of this resource. A hash of the contents stored in this object. This field is used
   * in optimistic locking. This field will be ignored when inserting a ServiceAttachment. An up-to-
   * date fingerprint must be provided in order to patch/update the ServiceAttachment; otherwise,
   * the request will fail with error 412 conditionNotMet. To see the latest fingerprint, make a
   * get() request to retrieve the ServiceAttachment.
   * @see #setFingerprint()
   *
   * <p>
   * The value is encoded Base64 or {@code null} for none.
   * </p>
   *
   * @since 1.14
   */
  public ServiceAttachment encodeFingerprint(byte[] fingerprint) {
    this.fingerprint = com.google.api.client.util.Base64.encodeBase64URLSafeString(fingerprint);
    return this;
  }

  /**
   * [Output Only] The unique identifier for the resource type. The server generates this
   * identifier.
   * @return value or {@code null} for none
   */
  public java.math.BigInteger getId() {
    return id;
  }

  /**
   * [Output Only] The unique identifier for the resource type. The server generates this
   * identifier.
   * @param id id or {@code null} for none
   */
  public ServiceAttachment setId(java.math.BigInteger id) {
    this.id = id;
    return this;
  }

  /**
   * [Output Only] Type of the resource. Always compute#serviceAttachment for service attachments.
   * @return value or {@code null} for none
   */
  public java.lang.String getKind() {
    return kind;
  }

  /**
   * [Output Only] Type of the resource. Always compute#serviceAttachment for service attachments.
   * @param kind kind or {@code null} for none
   */
  public ServiceAttachment setKind(java.lang.String kind) {
    this.kind = kind;
    return this;
  }

  /**
   * Name of the resource. Provided by the client when the resource is created. The name must be
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
   * Name of the resource. Provided by the client when the resource is created. The name must be
   * 1-63 characters long, and comply with RFC1035. Specifically, the name must be 1-63 characters
   * long and match the regular expression `[a-z]([-a-z0-9]*[a-z0-9])?` which means the first
   * character must be a lowercase letter, and all following characters must be a dash, lowercase
   * letter, or digit, except the last character, which cannot be a dash.
   * @param name name or {@code null} for none
   */
  public ServiceAttachment setName(java.lang.String name) {
    this.name = name;
    return this;
  }

  /**
   * An array of URLs where each entry is the URL of a subnet provided by the service producer to
   * use for NAT in this service attachment.
   * @return value or {@code null} for none
   */
  public java.util.List<java.lang.String> getNatSubnets() {
    return natSubnets;
  }

  /**
   * An array of URLs where each entry is the URL of a subnet provided by the service producer to
   * use for NAT in this service attachment.
   * @param natSubnets natSubnets or {@code null} for none
   */
  public ServiceAttachment setNatSubnets(java.util.List<java.lang.String> natSubnets) {
    this.natSubnets = natSubnets;
    return this;
  }

  /**
   * The URL of a forwarding rule with loadBalancingScheme INTERNAL* that is serving the endpoint
   * identified by this service attachment.
   * @return value or {@code null} for none
   */
  public java.lang.String getProducerForwardingRule() {
    return producerForwardingRule;
  }

  /**
   * The URL of a forwarding rule with loadBalancingScheme INTERNAL* that is serving the endpoint
   * identified by this service attachment.
   * @param producerForwardingRule producerForwardingRule or {@code null} for none
   */
  public ServiceAttachment setProducerForwardingRule(java.lang.String producerForwardingRule) {
    this.producerForwardingRule = producerForwardingRule;
    return this;
  }

  /**
   * [Output Only] URL of the region where the service attachment resides. This field applies only
   * to the region resource. You must specify this field as part of the HTTP request URL. It is not
   * settable as a field in the request body.
   * @return value or {@code null} for none
   */
  public java.lang.String getRegion() {
    return region;
  }

  /**
   * [Output Only] URL of the region where the service attachment resides. This field applies only
   * to the region resource. You must specify this field as part of the HTTP request URL. It is not
   * settable as a field in the request body.
   * @param region region or {@code null} for none
   */
  public ServiceAttachment setRegion(java.lang.String region) {
    this.region = region;
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
  public ServiceAttachment setSelfLink(java.lang.String selfLink) {
    this.selfLink = selfLink;
    return this;
  }

  /**
   * The URL of a service serving the endpoint identified by this service attachment.
   * @return value or {@code null} for none
   */
  public java.lang.String getTargetService() {
    return targetService;
  }

  /**
   * The URL of a service serving the endpoint identified by this service attachment.
   * @param targetService targetService or {@code null} for none
   */
  public ServiceAttachment setTargetService(java.lang.String targetService) {
    this.targetService = targetService;
    return this;
  }

  @Override
  public ServiceAttachment set(String fieldName, Object value) {
    return (ServiceAttachment) super.set(fieldName, value);
  }

  @Override
  public ServiceAttachment clone() {
    return (ServiceAttachment) super.clone();
  }

}
