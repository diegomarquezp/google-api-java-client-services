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
 * A key used to identify and configure applications (web and/or mobile) that use reCAPTCHA
 * Enterprise.
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
public final class GoogleCloudRecaptchaenterpriseV1Key extends com.google.api.client.json.GenericJson {

  /**
   * Settings for keys that can be used by Android apps.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private GoogleCloudRecaptchaenterpriseV1AndroidKeySettings androidSettings;

  /**
   * The timestamp corresponding to the creation of this Key.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private String createTime;

  /**
   * Human-readable display name of this key. Modifiable by user.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String displayName;

  /**
   * Settings for keys that can be used by iOS apps.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private GoogleCloudRecaptchaenterpriseV1IOSKeySettings iosSettings;

  /**
   * See Creating and managing labels.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.Map<String, java.lang.String> labels;

  /**
   * The resource name for the Key in the format "projects/{project}/keys/{key}".
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String name;

  /**
   * Options for user acceptance testing.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private GoogleCloudRecaptchaenterpriseV1TestingOptions testingOptions;

  /**
   * Settings for WAF
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private GoogleCloudRecaptchaenterpriseV1WafSettings wafSettings;

  /**
   * Settings for keys that can be used by websites.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private GoogleCloudRecaptchaenterpriseV1WebKeySettings webSettings;

  /**
   * Settings for keys that can be used by Android apps.
   * @return value or {@code null} for none
   */
  public GoogleCloudRecaptchaenterpriseV1AndroidKeySettings getAndroidSettings() {
    return androidSettings;
  }

  /**
   * Settings for keys that can be used by Android apps.
   * @param androidSettings androidSettings or {@code null} for none
   */
  public GoogleCloudRecaptchaenterpriseV1Key setAndroidSettings(GoogleCloudRecaptchaenterpriseV1AndroidKeySettings androidSettings) {
    this.androidSettings = androidSettings;
    return this;
  }

  /**
   * The timestamp corresponding to the creation of this Key.
   * @return value or {@code null} for none
   */
  public String getCreateTime() {
    return createTime;
  }

  /**
   * The timestamp corresponding to the creation of this Key.
   * @param createTime createTime or {@code null} for none
   */
  public GoogleCloudRecaptchaenterpriseV1Key setCreateTime(String createTime) {
    this.createTime = createTime;
    return this;
  }

  /**
   * Human-readable display name of this key. Modifiable by user.
   * @return value or {@code null} for none
   */
  public java.lang.String getDisplayName() {
    return displayName;
  }

  /**
   * Human-readable display name of this key. Modifiable by user.
   * @param displayName displayName or {@code null} for none
   */
  public GoogleCloudRecaptchaenterpriseV1Key setDisplayName(java.lang.String displayName) {
    this.displayName = displayName;
    return this;
  }

  /**
   * Settings for keys that can be used by iOS apps.
   * @return value or {@code null} for none
   */
  public GoogleCloudRecaptchaenterpriseV1IOSKeySettings getIosSettings() {
    return iosSettings;
  }

  /**
   * Settings for keys that can be used by iOS apps.
   * @param iosSettings iosSettings or {@code null} for none
   */
  public GoogleCloudRecaptchaenterpriseV1Key setIosSettings(GoogleCloudRecaptchaenterpriseV1IOSKeySettings iosSettings) {
    this.iosSettings = iosSettings;
    return this;
  }

  /**
   * See Creating and managing labels.
   * @return value or {@code null} for none
   */
  public java.util.Map<String, java.lang.String> getLabels() {
    return labels;
  }

  /**
   * See Creating and managing labels.
   * @param labels labels or {@code null} for none
   */
  public GoogleCloudRecaptchaenterpriseV1Key setLabels(java.util.Map<String, java.lang.String> labels) {
    this.labels = labels;
    return this;
  }

  /**
   * The resource name for the Key in the format "projects/{project}/keys/{key}".
   * @return value or {@code null} for none
   */
  public java.lang.String getName() {
    return name;
  }

  /**
   * The resource name for the Key in the format "projects/{project}/keys/{key}".
   * @param name name or {@code null} for none
   */
  public GoogleCloudRecaptchaenterpriseV1Key setName(java.lang.String name) {
    this.name = name;
    return this;
  }

  /**
   * Options for user acceptance testing.
   * @return value or {@code null} for none
   */
  public GoogleCloudRecaptchaenterpriseV1TestingOptions getTestingOptions() {
    return testingOptions;
  }

  /**
   * Options for user acceptance testing.
   * @param testingOptions testingOptions or {@code null} for none
   */
  public GoogleCloudRecaptchaenterpriseV1Key setTestingOptions(GoogleCloudRecaptchaenterpriseV1TestingOptions testingOptions) {
    this.testingOptions = testingOptions;
    return this;
  }

  /**
   * Settings for WAF
   * @return value or {@code null} for none
   */
  public GoogleCloudRecaptchaenterpriseV1WafSettings getWafSettings() {
    return wafSettings;
  }

  /**
   * Settings for WAF
   * @param wafSettings wafSettings or {@code null} for none
   */
  public GoogleCloudRecaptchaenterpriseV1Key setWafSettings(GoogleCloudRecaptchaenterpriseV1WafSettings wafSettings) {
    this.wafSettings = wafSettings;
    return this;
  }

  /**
   * Settings for keys that can be used by websites.
   * @return value or {@code null} for none
   */
  public GoogleCloudRecaptchaenterpriseV1WebKeySettings getWebSettings() {
    return webSettings;
  }

  /**
   * Settings for keys that can be used by websites.
   * @param webSettings webSettings or {@code null} for none
   */
  public GoogleCloudRecaptchaenterpriseV1Key setWebSettings(GoogleCloudRecaptchaenterpriseV1WebKeySettings webSettings) {
    this.webSettings = webSettings;
    return this;
  }

  @Override
  public GoogleCloudRecaptchaenterpriseV1Key set(String fieldName, Object value) {
    return (GoogleCloudRecaptchaenterpriseV1Key) super.set(fieldName, value);
  }

  @Override
  public GoogleCloudRecaptchaenterpriseV1Key clone() {
    return (GoogleCloudRecaptchaenterpriseV1Key) super.clone();
  }

}
