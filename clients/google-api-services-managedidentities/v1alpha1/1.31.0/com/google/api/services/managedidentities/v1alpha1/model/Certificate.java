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

package com.google.api.services.managedidentities.v1alpha1.model;

/**
 * Certificate used to configure LDAPS.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Managed Service for Microsoft Active Directory API.
 * For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class Certificate extends com.google.api.client.json.GenericJson {

  /**
   * The certificate expire time.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private String expireTime;

  /**
   * The issuer of this certificate.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private Certificate issuingCertificate;

  /**
   * The certificate subject.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String subject;

  /**
   * The additional hostnames for the domain.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<java.lang.String> subjectAlternativeName;

  /**
   * The certificate thumbprint which uniquely identifies the certificate.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String thumbprint;

  /**
   * The certificate expire time.
   * @return value or {@code null} for none
   */
  public String getExpireTime() {
    return expireTime;
  }

  /**
   * The certificate expire time.
   * @param expireTime expireTime or {@code null} for none
   */
  public Certificate setExpireTime(String expireTime) {
    this.expireTime = expireTime;
    return this;
  }

  /**
   * The issuer of this certificate.
   * @return value or {@code null} for none
   */
  public Certificate getIssuingCertificate() {
    return issuingCertificate;
  }

  /**
   * The issuer of this certificate.
   * @param issuingCertificate issuingCertificate or {@code null} for none
   */
  public Certificate setIssuingCertificate(Certificate issuingCertificate) {
    this.issuingCertificate = issuingCertificate;
    return this;
  }

  /**
   * The certificate subject.
   * @return value or {@code null} for none
   */
  public java.lang.String getSubject() {
    return subject;
  }

  /**
   * The certificate subject.
   * @param subject subject or {@code null} for none
   */
  public Certificate setSubject(java.lang.String subject) {
    this.subject = subject;
    return this;
  }

  /**
   * The additional hostnames for the domain.
   * @return value or {@code null} for none
   */
  public java.util.List<java.lang.String> getSubjectAlternativeName() {
    return subjectAlternativeName;
  }

  /**
   * The additional hostnames for the domain.
   * @param subjectAlternativeName subjectAlternativeName or {@code null} for none
   */
  public Certificate setSubjectAlternativeName(java.util.List<java.lang.String> subjectAlternativeName) {
    this.subjectAlternativeName = subjectAlternativeName;
    return this;
  }

  /**
   * The certificate thumbprint which uniquely identifies the certificate.
   * @return value or {@code null} for none
   */
  public java.lang.String getThumbprint() {
    return thumbprint;
  }

  /**
   * The certificate thumbprint which uniquely identifies the certificate.
   * @param thumbprint thumbprint or {@code null} for none
   */
  public Certificate setThumbprint(java.lang.String thumbprint) {
    this.thumbprint = thumbprint;
    return this;
  }

  @Override
  public Certificate set(String fieldName, Object value) {
    return (Certificate) super.set(fieldName, value);
  }

  @Override
  public Certificate clone() {
    return (Certificate) super.clone();
  }

}
