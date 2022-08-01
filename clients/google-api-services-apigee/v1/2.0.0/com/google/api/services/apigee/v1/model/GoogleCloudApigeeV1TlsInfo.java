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

package com.google.api.services.apigee.v1.model;

/**
 * TLS configuration information for virtual hosts and TargetServers.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Apigee API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class GoogleCloudApigeeV1TlsInfo extends com.google.api.client.json.GenericJson {

  /**
   * The SSL/TLS cipher suites to be used. For programmable proxies, it must be one of the cipher
   * suite names listed in:
   * http://docs.oracle.com/javase/8/docs/technotes/guides/security/StandardNames.html#ciphersuites.
   * For configurable proxies, it must follow the configuration specified in:
   * https://commondatastorage.googleapis.com/chromium-boringssl-docs/ssl.h.html#Cipher-suite-
   * configuration. This setting has no effect for configurable proxies when negotiating TLS 1.3.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<java.lang.String> ciphers;

  /**
   * Optional. Enables two-way TLS.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean clientAuthEnabled;

  /**
   * The TLS Common Name of the certificate.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private GoogleCloudApigeeV1TlsInfoCommonName commonName;

  /**
   * Required. Enables TLS. If false, neither one-way nor two-way TLS will be enabled.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean enabled;

  /**
   * If true, Edge ignores TLS certificate errors. Valid when configuring TLS for target servers and
   * target endpoints, and when configuring virtual hosts that use 2-way TLS. When used with a
   * target endpoint/target server, if the backend system uses SNI and returns a cert with a subject
   * Distinguished Name (DN) that does not match the hostname, there is no way to ignore the error
   * and the connection fails.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean ignoreValidationErrors;

  /**
   * Required if `client_auth_enabled` is true. The resource ID for the alias containing the private
   * key and cert.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String keyAlias;

  /**
   * Required if `client_auth_enabled` is true. The resource ID of the keystore.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String keyStore;

  /**
   * The TLS versioins to be used.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<java.lang.String> protocols;

  /**
   * The resource ID of the truststore.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String trustStore;

  /**
   * The SSL/TLS cipher suites to be used. For programmable proxies, it must be one of the cipher
   * suite names listed in:
   * http://docs.oracle.com/javase/8/docs/technotes/guides/security/StandardNames.html#ciphersuites.
   * For configurable proxies, it must follow the configuration specified in:
   * https://commondatastorage.googleapis.com/chromium-boringssl-docs/ssl.h.html#Cipher-suite-
   * configuration. This setting has no effect for configurable proxies when negotiating TLS 1.3.
   * @return value or {@code null} for none
   */
  public java.util.List<java.lang.String> getCiphers() {
    return ciphers;
  }

  /**
   * The SSL/TLS cipher suites to be used. For programmable proxies, it must be one of the cipher
   * suite names listed in:
   * http://docs.oracle.com/javase/8/docs/technotes/guides/security/StandardNames.html#ciphersuites.
   * For configurable proxies, it must follow the configuration specified in:
   * https://commondatastorage.googleapis.com/chromium-boringssl-docs/ssl.h.html#Cipher-suite-
   * configuration. This setting has no effect for configurable proxies when negotiating TLS 1.3.
   * @param ciphers ciphers or {@code null} for none
   */
  public GoogleCloudApigeeV1TlsInfo setCiphers(java.util.List<java.lang.String> ciphers) {
    this.ciphers = ciphers;
    return this;
  }

  /**
   * Optional. Enables two-way TLS.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getClientAuthEnabled() {
    return clientAuthEnabled;
  }

  /**
   * Optional. Enables two-way TLS.
   * @param clientAuthEnabled clientAuthEnabled or {@code null} for none
   */
  public GoogleCloudApigeeV1TlsInfo setClientAuthEnabled(java.lang.Boolean clientAuthEnabled) {
    this.clientAuthEnabled = clientAuthEnabled;
    return this;
  }

  /**
   * The TLS Common Name of the certificate.
   * @return value or {@code null} for none
   */
  public GoogleCloudApigeeV1TlsInfoCommonName getCommonName() {
    return commonName;
  }

  /**
   * The TLS Common Name of the certificate.
   * @param commonName commonName or {@code null} for none
   */
  public GoogleCloudApigeeV1TlsInfo setCommonName(GoogleCloudApigeeV1TlsInfoCommonName commonName) {
    this.commonName = commonName;
    return this;
  }

  /**
   * Required. Enables TLS. If false, neither one-way nor two-way TLS will be enabled.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getEnabled() {
    return enabled;
  }

  /**
   * Required. Enables TLS. If false, neither one-way nor two-way TLS will be enabled.
   * @param enabled enabled or {@code null} for none
   */
  public GoogleCloudApigeeV1TlsInfo setEnabled(java.lang.Boolean enabled) {
    this.enabled = enabled;
    return this;
  }

  /**
   * If true, Edge ignores TLS certificate errors. Valid when configuring TLS for target servers and
   * target endpoints, and when configuring virtual hosts that use 2-way TLS. When used with a
   * target endpoint/target server, if the backend system uses SNI and returns a cert with a subject
   * Distinguished Name (DN) that does not match the hostname, there is no way to ignore the error
   * and the connection fails.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getIgnoreValidationErrors() {
    return ignoreValidationErrors;
  }

  /**
   * If true, Edge ignores TLS certificate errors. Valid when configuring TLS for target servers and
   * target endpoints, and when configuring virtual hosts that use 2-way TLS. When used with a
   * target endpoint/target server, if the backend system uses SNI and returns a cert with a subject
   * Distinguished Name (DN) that does not match the hostname, there is no way to ignore the error
   * and the connection fails.
   * @param ignoreValidationErrors ignoreValidationErrors or {@code null} for none
   */
  public GoogleCloudApigeeV1TlsInfo setIgnoreValidationErrors(java.lang.Boolean ignoreValidationErrors) {
    this.ignoreValidationErrors = ignoreValidationErrors;
    return this;
  }

  /**
   * Required if `client_auth_enabled` is true. The resource ID for the alias containing the private
   * key and cert.
   * @return value or {@code null} for none
   */
  public java.lang.String getKeyAlias() {
    return keyAlias;
  }

  /**
   * Required if `client_auth_enabled` is true. The resource ID for the alias containing the private
   * key and cert.
   * @param keyAlias keyAlias or {@code null} for none
   */
  public GoogleCloudApigeeV1TlsInfo setKeyAlias(java.lang.String keyAlias) {
    this.keyAlias = keyAlias;
    return this;
  }

  /**
   * Required if `client_auth_enabled` is true. The resource ID of the keystore.
   * @return value or {@code null} for none
   */
  public java.lang.String getKeyStore() {
    return keyStore;
  }

  /**
   * Required if `client_auth_enabled` is true. The resource ID of the keystore.
   * @param keyStore keyStore or {@code null} for none
   */
  public GoogleCloudApigeeV1TlsInfo setKeyStore(java.lang.String keyStore) {
    this.keyStore = keyStore;
    return this;
  }

  /**
   * The TLS versioins to be used.
   * @return value or {@code null} for none
   */
  public java.util.List<java.lang.String> getProtocols() {
    return protocols;
  }

  /**
   * The TLS versioins to be used.
   * @param protocols protocols or {@code null} for none
   */
  public GoogleCloudApigeeV1TlsInfo setProtocols(java.util.List<java.lang.String> protocols) {
    this.protocols = protocols;
    return this;
  }

  /**
   * The resource ID of the truststore.
   * @return value or {@code null} for none
   */
  public java.lang.String getTrustStore() {
    return trustStore;
  }

  /**
   * The resource ID of the truststore.
   * @param trustStore trustStore or {@code null} for none
   */
  public GoogleCloudApigeeV1TlsInfo setTrustStore(java.lang.String trustStore) {
    this.trustStore = trustStore;
    return this;
  }

  @Override
  public GoogleCloudApigeeV1TlsInfo set(String fieldName, Object value) {
    return (GoogleCloudApigeeV1TlsInfo) super.set(fieldName, value);
  }

  @Override
  public GoogleCloudApigeeV1TlsInfo clone() {
    return (GoogleCloudApigeeV1TlsInfo) super.clone();
  }

}
