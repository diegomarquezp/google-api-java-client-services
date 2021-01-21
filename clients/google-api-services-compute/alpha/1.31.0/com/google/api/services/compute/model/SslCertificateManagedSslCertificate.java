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
 * Configuration and status of a managed SSL certificate.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Compute Engine API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class SslCertificateManagedSslCertificate extends com.google.api.client.json.GenericJson {

  /**
   * [Output only] Detailed statuses of the domains specified for managed certificate resource.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.Map<String, java.lang.String> domainStatus;

  /**
   * The domains for which a managed SSL certificate will be generated. Each Google-managed SSL
   * certificate supports up to the [maximum number of domains per Google-managed SSL certificate
   * ](/load-balancing/docs/quotas#ssl_certificates).
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<java.lang.String> domains;

  /**
   * [Output only] Status of the managed certificate resource.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String status;

  /**
   * [Output only] Detailed statuses of the domains specified for managed certificate resource.
   * @return value or {@code null} for none
   */
  public java.util.Map<String, java.lang.String> getDomainStatus() {
    return domainStatus;
  }

  /**
   * [Output only] Detailed statuses of the domains specified for managed certificate resource.
   * @param domainStatus domainStatus or {@code null} for none
   */
  public SslCertificateManagedSslCertificate setDomainStatus(java.util.Map<String, java.lang.String> domainStatus) {
    this.domainStatus = domainStatus;
    return this;
  }

  /**
   * The domains for which a managed SSL certificate will be generated. Each Google-managed SSL
   * certificate supports up to the [maximum number of domains per Google-managed SSL certificate
   * ](/load-balancing/docs/quotas#ssl_certificates).
   * @return value or {@code null} for none
   */
  public java.util.List<java.lang.String> getDomains() {
    return domains;
  }

  /**
   * The domains for which a managed SSL certificate will be generated. Each Google-managed SSL
   * certificate supports up to the [maximum number of domains per Google-managed SSL certificate
   * ](/load-balancing/docs/quotas#ssl_certificates).
   * @param domains domains or {@code null} for none
   */
  public SslCertificateManagedSslCertificate setDomains(java.util.List<java.lang.String> domains) {
    this.domains = domains;
    return this;
  }

  /**
   * [Output only] Status of the managed certificate resource.
   * @return value or {@code null} for none
   */
  public java.lang.String getStatus() {
    return status;
  }

  /**
   * [Output only] Status of the managed certificate resource.
   * @param status status or {@code null} for none
   */
  public SslCertificateManagedSslCertificate setStatus(java.lang.String status) {
    this.status = status;
    return this;
  }

  @Override
  public SslCertificateManagedSslCertificate set(String fieldName, Object value) {
    return (SslCertificateManagedSslCertificate) super.set(fieldName, value);
  }

  @Override
  public SslCertificateManagedSslCertificate clone() {
    return (SslCertificateManagedSslCertificate) super.clone();
  }

}
