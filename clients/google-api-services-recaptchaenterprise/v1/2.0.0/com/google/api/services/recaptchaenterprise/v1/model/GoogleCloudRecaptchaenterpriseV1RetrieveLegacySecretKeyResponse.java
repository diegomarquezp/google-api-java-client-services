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

package com.google.api.services.recaptchaenterprise.v1.model;

/**
 * Secret key used in legacy reCAPTCHA only. Should be used when integrating with a 3rd party which
 * is still using legacy reCAPTCHA.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the reCAPTCHA Enterprise API. For a detailed explanation
 * see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class GoogleCloudRecaptchaenterpriseV1RetrieveLegacySecretKeyResponse extends com.google.api.client.json.GenericJson {

  /**
   * The secret key (also known as shared secret) authorizes communication between your application
   * backend and the reCAPTCHA Enterprise server to create an assessment. The secret key needs to be
   * kept safe for security purposes.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String legacySecretKey;

  /**
   * The secret key (also known as shared secret) authorizes communication between your application
   * backend and the reCAPTCHA Enterprise server to create an assessment. The secret key needs to be
   * kept safe for security purposes.
   * @return value or {@code null} for none
   */
  public java.lang.String getLegacySecretKey() {
    return legacySecretKey;
  }

  /**
   * The secret key (also known as shared secret) authorizes communication between your application
   * backend and the reCAPTCHA Enterprise server to create an assessment. The secret key needs to be
   * kept safe for security purposes.
   * @param legacySecretKey legacySecretKey or {@code null} for none
   */
  public GoogleCloudRecaptchaenterpriseV1RetrieveLegacySecretKeyResponse setLegacySecretKey(java.lang.String legacySecretKey) {
    this.legacySecretKey = legacySecretKey;
    return this;
  }

  @Override
  public GoogleCloudRecaptchaenterpriseV1RetrieveLegacySecretKeyResponse set(String fieldName, Object value) {
    return (GoogleCloudRecaptchaenterpriseV1RetrieveLegacySecretKeyResponse) super.set(fieldName, value);
  }

  @Override
  public GoogleCloudRecaptchaenterpriseV1RetrieveLegacySecretKeyResponse clone() {
    return (GoogleCloudRecaptchaenterpriseV1RetrieveLegacySecretKeyResponse) super.clone();
  }

}
