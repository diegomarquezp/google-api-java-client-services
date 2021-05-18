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

package com.google.api.services.analyticsadmin.v1alpha.model;

/**
 * Settings values for Google Signals. This is a singleton resource.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Google Analytics Admin API. For a detailed
 * explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class GoogleAnalyticsAdminV1alphaGoogleSignalsSettings extends com.google.api.client.json.GenericJson {

  /**
   * Output only. Terms of Service acceptance.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String consent;

  /**
   * Output only. Resource name of this setting. Format:
   * properties/{property_id}/googleSignalsSettings Example: "properties/1000/googleSignalsSettings"
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String name;

  /**
   * Status of this setting.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String state;

  /**
   * Output only. Terms of Service acceptance.
   * @return value or {@code null} for none
   */
  public java.lang.String getConsent() {
    return consent;
  }

  /**
   * Output only. Terms of Service acceptance.
   * @param consent consent or {@code null} for none
   */
  public GoogleAnalyticsAdminV1alphaGoogleSignalsSettings setConsent(java.lang.String consent) {
    this.consent = consent;
    return this;
  }

  /**
   * Output only. Resource name of this setting. Format:
   * properties/{property_id}/googleSignalsSettings Example: "properties/1000/googleSignalsSettings"
   * @return value or {@code null} for none
   */
  public java.lang.String getName() {
    return name;
  }

  /**
   * Output only. Resource name of this setting. Format:
   * properties/{property_id}/googleSignalsSettings Example: "properties/1000/googleSignalsSettings"
   * @param name name or {@code null} for none
   */
  public GoogleAnalyticsAdminV1alphaGoogleSignalsSettings setName(java.lang.String name) {
    this.name = name;
    return this;
  }

  /**
   * Status of this setting.
   * @return value or {@code null} for none
   */
  public java.lang.String getState() {
    return state;
  }

  /**
   * Status of this setting.
   * @param state state or {@code null} for none
   */
  public GoogleAnalyticsAdminV1alphaGoogleSignalsSettings setState(java.lang.String state) {
    this.state = state;
    return this;
  }

  @Override
  public GoogleAnalyticsAdminV1alphaGoogleSignalsSettings set(String fieldName, Object value) {
    return (GoogleAnalyticsAdminV1alphaGoogleSignalsSettings) super.set(fieldName, value);
  }

  @Override
  public GoogleAnalyticsAdminV1alphaGoogleSignalsSettings clone() {
    return (GoogleAnalyticsAdminV1alphaGoogleSignalsSettings) super.clone();
  }

}
