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

package com.google.api.services.networksecurity.v1beta1.model;

/**
 * ServerTlsPolicy is a resource that specifies how a server should authenticate incoming requests.
 * This resource itself does not affect configuration unless it is attached to a target https proxy
 * or endpoint config selector resource.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Network Security API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class ServerTlsPolicy extends com.google.api.client.json.GenericJson {

  /**
   * Determines if server allows plaintext connections. If set to true, server allows plain text
   * connections. By default, it is set to false. This setting is not exclusive of other encryption
   * modes. For example, if `allow_open` and `mtls_policy` are set, server allows both plain text
   * and mTLS connections. See documentation of other encryption modes to confirm compatibility.
   * Consider using it if you wish to upgrade in place your deployment to TLS while having mixed TLS
   * and non-TLS traffic reaching port :80.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean allowOpen;

  /**
   * Output only. The timestamp when the resource was created.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private String createTime;

  /**
   * Free-text description of the resource.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String description;

  /**
   * Set of label tags associated with the resource.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.Map<String, java.lang.String> labels;

  /**
   * Defines a mechanism to provision peer validation certificates for peer to peer authentication
   * (Mutual TLS - mTLS). If not specified, client certificate will not be requested. The connection
   * is treated as TLS and not mTLS. If `allow_open` and `mtls_policy` are set, server allows both
   * plain text and mTLS connections.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private MTLSPolicy mtlsPolicy;

  /**
   * Required. Name of the ServerTlsPolicy resource. It matches the pattern
   * `projects/locations/{location}/serverTlsPolicies/{server_tls_policy}`
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String name;

  /**
   * Defines a mechanism to provision server identity (public and private keys). Cannot be combined
   * with `allow_open` as a permissive mode that allows both plain text and TLS is not supported.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private GoogleCloudNetworksecurityV1beta1CertificateProvider serverCertificate;

  /**
   * Output only. The timestamp when the resource was updated.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private String updateTime;

  /**
   * Determines if server allows plaintext connections. If set to true, server allows plain text
   * connections. By default, it is set to false. This setting is not exclusive of other encryption
   * modes. For example, if `allow_open` and `mtls_policy` are set, server allows both plain text
   * and mTLS connections. See documentation of other encryption modes to confirm compatibility.
   * Consider using it if you wish to upgrade in place your deployment to TLS while having mixed TLS
   * and non-TLS traffic reaching port :80.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getAllowOpen() {
    return allowOpen;
  }

  /**
   * Determines if server allows plaintext connections. If set to true, server allows plain text
   * connections. By default, it is set to false. This setting is not exclusive of other encryption
   * modes. For example, if `allow_open` and `mtls_policy` are set, server allows both plain text
   * and mTLS connections. See documentation of other encryption modes to confirm compatibility.
   * Consider using it if you wish to upgrade in place your deployment to TLS while having mixed TLS
   * and non-TLS traffic reaching port :80.
   * @param allowOpen allowOpen or {@code null} for none
   */
  public ServerTlsPolicy setAllowOpen(java.lang.Boolean allowOpen) {
    this.allowOpen = allowOpen;
    return this;
  }

  /**
   * Output only. The timestamp when the resource was created.
   * @return value or {@code null} for none
   */
  public String getCreateTime() {
    return createTime;
  }

  /**
   * Output only. The timestamp when the resource was created.
   * @param createTime createTime or {@code null} for none
   */
  public ServerTlsPolicy setCreateTime(String createTime) {
    this.createTime = createTime;
    return this;
  }

  /**
   * Free-text description of the resource.
   * @return value or {@code null} for none
   */
  public java.lang.String getDescription() {
    return description;
  }

  /**
   * Free-text description of the resource.
   * @param description description or {@code null} for none
   */
  public ServerTlsPolicy setDescription(java.lang.String description) {
    this.description = description;
    return this;
  }

  /**
   * Set of label tags associated with the resource.
   * @return value or {@code null} for none
   */
  public java.util.Map<String, java.lang.String> getLabels() {
    return labels;
  }

  /**
   * Set of label tags associated with the resource.
   * @param labels labels or {@code null} for none
   */
  public ServerTlsPolicy setLabels(java.util.Map<String, java.lang.String> labels) {
    this.labels = labels;
    return this;
  }

  /**
   * Defines a mechanism to provision peer validation certificates for peer to peer authentication
   * (Mutual TLS - mTLS). If not specified, client certificate will not be requested. The connection
   * is treated as TLS and not mTLS. If `allow_open` and `mtls_policy` are set, server allows both
   * plain text and mTLS connections.
   * @return value or {@code null} for none
   */
  public MTLSPolicy getMtlsPolicy() {
    return mtlsPolicy;
  }

  /**
   * Defines a mechanism to provision peer validation certificates for peer to peer authentication
   * (Mutual TLS - mTLS). If not specified, client certificate will not be requested. The connection
   * is treated as TLS and not mTLS. If `allow_open` and `mtls_policy` are set, server allows both
   * plain text and mTLS connections.
   * @param mtlsPolicy mtlsPolicy or {@code null} for none
   */
  public ServerTlsPolicy setMtlsPolicy(MTLSPolicy mtlsPolicy) {
    this.mtlsPolicy = mtlsPolicy;
    return this;
  }

  /**
   * Required. Name of the ServerTlsPolicy resource. It matches the pattern
   * `projects/locations/{location}/serverTlsPolicies/{server_tls_policy}`
   * @return value or {@code null} for none
   */
  public java.lang.String getName() {
    return name;
  }

  /**
   * Required. Name of the ServerTlsPolicy resource. It matches the pattern
   * `projects/locations/{location}/serverTlsPolicies/{server_tls_policy}`
   * @param name name or {@code null} for none
   */
  public ServerTlsPolicy setName(java.lang.String name) {
    this.name = name;
    return this;
  }

  /**
   * Defines a mechanism to provision server identity (public and private keys). Cannot be combined
   * with `allow_open` as a permissive mode that allows both plain text and TLS is not supported.
   * @return value or {@code null} for none
   */
  public GoogleCloudNetworksecurityV1beta1CertificateProvider getServerCertificate() {
    return serverCertificate;
  }

  /**
   * Defines a mechanism to provision server identity (public and private keys). Cannot be combined
   * with `allow_open` as a permissive mode that allows both plain text and TLS is not supported.
   * @param serverCertificate serverCertificate or {@code null} for none
   */
  public ServerTlsPolicy setServerCertificate(GoogleCloudNetworksecurityV1beta1CertificateProvider serverCertificate) {
    this.serverCertificate = serverCertificate;
    return this;
  }

  /**
   * Output only. The timestamp when the resource was updated.
   * @return value or {@code null} for none
   */
  public String getUpdateTime() {
    return updateTime;
  }

  /**
   * Output only. The timestamp when the resource was updated.
   * @param updateTime updateTime or {@code null} for none
   */
  public ServerTlsPolicy setUpdateTime(String updateTime) {
    this.updateTime = updateTime;
    return this;
  }

  @Override
  public ServerTlsPolicy set(String fieldName, Object value) {
    return (ServerTlsPolicy) super.set(fieldName, value);
  }

  @Override
  public ServerTlsPolicy clone() {
    return (ServerTlsPolicy) super.clone();
  }

}
