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
 * A snapshot of a resource as before or after the result of a change in change history.
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
public final class GoogleAnalyticsAdminV1alphaChangeHistoryChangeChangeHistoryResource extends com.google.api.client.json.GenericJson {

  /**
   * A snapshot of an Account resource in change history.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private GoogleAnalyticsAdminV1alphaAccount account;

  /**
   * A snapshot of an AndroidAppDataStream resource in change history.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private GoogleAnalyticsAdminV1alphaAndroidAppDataStream androidAppDataStream;

  /**
   * A snapshot of a ConversionEvent resource in change history.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private GoogleAnalyticsAdminV1alphaConversionEvent conversionEvent;

  /**
   * A snapshot of a CustomDimension resource in change history.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private GoogleAnalyticsAdminV1alphaCustomDimension customDimension;

  /**
   * A snapshot of a CustomMetric resource in change history.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private GoogleAnalyticsAdminV1alphaCustomMetric customMetric;

  /**
   * A snapshot of a FirebaseLink resource in change history.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private GoogleAnalyticsAdminV1alphaFirebaseLink firebaseLink;

  /**
   * A snapshot of a GoogleAdsLink resource in change history.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private GoogleAnalyticsAdminV1alphaGoogleAdsLink googleAdsLink;

  /**
   * A snapshot of a GoogleSignalsSettings resource in change history.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private GoogleAnalyticsAdminV1alphaGoogleSignalsSettings googleSignalsSettings;

  /**
   * A snapshot of an IosAppDataStream resource in change history.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private GoogleAnalyticsAdminV1alphaIosAppDataStream iosAppDataStream;

  /**
   * A snapshot of a Property resource in change history.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private GoogleAnalyticsAdminV1alphaProperty property;

  /**
   * A snapshot of a WebDataStream resource in change history.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private GoogleAnalyticsAdminV1alphaWebDataStream webDataStream;

  /**
   * A snapshot of an Account resource in change history.
   * @return value or {@code null} for none
   */
  public GoogleAnalyticsAdminV1alphaAccount getAccount() {
    return account;
  }

  /**
   * A snapshot of an Account resource in change history.
   * @param account account or {@code null} for none
   */
  public GoogleAnalyticsAdminV1alphaChangeHistoryChangeChangeHistoryResource setAccount(GoogleAnalyticsAdminV1alphaAccount account) {
    this.account = account;
    return this;
  }

  /**
   * A snapshot of an AndroidAppDataStream resource in change history.
   * @return value or {@code null} for none
   */
  public GoogleAnalyticsAdminV1alphaAndroidAppDataStream getAndroidAppDataStream() {
    return androidAppDataStream;
  }

  /**
   * A snapshot of an AndroidAppDataStream resource in change history.
   * @param androidAppDataStream androidAppDataStream or {@code null} for none
   */
  public GoogleAnalyticsAdminV1alphaChangeHistoryChangeChangeHistoryResource setAndroidAppDataStream(GoogleAnalyticsAdminV1alphaAndroidAppDataStream androidAppDataStream) {
    this.androidAppDataStream = androidAppDataStream;
    return this;
  }

  /**
   * A snapshot of a ConversionEvent resource in change history.
   * @return value or {@code null} for none
   */
  public GoogleAnalyticsAdminV1alphaConversionEvent getConversionEvent() {
    return conversionEvent;
  }

  /**
   * A snapshot of a ConversionEvent resource in change history.
   * @param conversionEvent conversionEvent or {@code null} for none
   */
  public GoogleAnalyticsAdminV1alphaChangeHistoryChangeChangeHistoryResource setConversionEvent(GoogleAnalyticsAdminV1alphaConversionEvent conversionEvent) {
    this.conversionEvent = conversionEvent;
    return this;
  }

  /**
   * A snapshot of a CustomDimension resource in change history.
   * @return value or {@code null} for none
   */
  public GoogleAnalyticsAdminV1alphaCustomDimension getCustomDimension() {
    return customDimension;
  }

  /**
   * A snapshot of a CustomDimension resource in change history.
   * @param customDimension customDimension or {@code null} for none
   */
  public GoogleAnalyticsAdminV1alphaChangeHistoryChangeChangeHistoryResource setCustomDimension(GoogleAnalyticsAdminV1alphaCustomDimension customDimension) {
    this.customDimension = customDimension;
    return this;
  }

  /**
   * A snapshot of a CustomMetric resource in change history.
   * @return value or {@code null} for none
   */
  public GoogleAnalyticsAdminV1alphaCustomMetric getCustomMetric() {
    return customMetric;
  }

  /**
   * A snapshot of a CustomMetric resource in change history.
   * @param customMetric customMetric or {@code null} for none
   */
  public GoogleAnalyticsAdminV1alphaChangeHistoryChangeChangeHistoryResource setCustomMetric(GoogleAnalyticsAdminV1alphaCustomMetric customMetric) {
    this.customMetric = customMetric;
    return this;
  }

  /**
   * A snapshot of a FirebaseLink resource in change history.
   * @return value or {@code null} for none
   */
  public GoogleAnalyticsAdminV1alphaFirebaseLink getFirebaseLink() {
    return firebaseLink;
  }

  /**
   * A snapshot of a FirebaseLink resource in change history.
   * @param firebaseLink firebaseLink or {@code null} for none
   */
  public GoogleAnalyticsAdminV1alphaChangeHistoryChangeChangeHistoryResource setFirebaseLink(GoogleAnalyticsAdminV1alphaFirebaseLink firebaseLink) {
    this.firebaseLink = firebaseLink;
    return this;
  }

  /**
   * A snapshot of a GoogleAdsLink resource in change history.
   * @return value or {@code null} for none
   */
  public GoogleAnalyticsAdminV1alphaGoogleAdsLink getGoogleAdsLink() {
    return googleAdsLink;
  }

  /**
   * A snapshot of a GoogleAdsLink resource in change history.
   * @param googleAdsLink googleAdsLink or {@code null} for none
   */
  public GoogleAnalyticsAdminV1alphaChangeHistoryChangeChangeHistoryResource setGoogleAdsLink(GoogleAnalyticsAdminV1alphaGoogleAdsLink googleAdsLink) {
    this.googleAdsLink = googleAdsLink;
    return this;
  }

  /**
   * A snapshot of a GoogleSignalsSettings resource in change history.
   * @return value or {@code null} for none
   */
  public GoogleAnalyticsAdminV1alphaGoogleSignalsSettings getGoogleSignalsSettings() {
    return googleSignalsSettings;
  }

  /**
   * A snapshot of a GoogleSignalsSettings resource in change history.
   * @param googleSignalsSettings googleSignalsSettings or {@code null} for none
   */
  public GoogleAnalyticsAdminV1alphaChangeHistoryChangeChangeHistoryResource setGoogleSignalsSettings(GoogleAnalyticsAdminV1alphaGoogleSignalsSettings googleSignalsSettings) {
    this.googleSignalsSettings = googleSignalsSettings;
    return this;
  }

  /**
   * A snapshot of an IosAppDataStream resource in change history.
   * @return value or {@code null} for none
   */
  public GoogleAnalyticsAdminV1alphaIosAppDataStream getIosAppDataStream() {
    return iosAppDataStream;
  }

  /**
   * A snapshot of an IosAppDataStream resource in change history.
   * @param iosAppDataStream iosAppDataStream or {@code null} for none
   */
  public GoogleAnalyticsAdminV1alphaChangeHistoryChangeChangeHistoryResource setIosAppDataStream(GoogleAnalyticsAdminV1alphaIosAppDataStream iosAppDataStream) {
    this.iosAppDataStream = iosAppDataStream;
    return this;
  }

  /**
   * A snapshot of a Property resource in change history.
   * @return value or {@code null} for none
   */
  public GoogleAnalyticsAdminV1alphaProperty getProperty() {
    return property;
  }

  /**
   * A snapshot of a Property resource in change history.
   * @param property property or {@code null} for none
   */
  public GoogleAnalyticsAdminV1alphaChangeHistoryChangeChangeHistoryResource setProperty(GoogleAnalyticsAdminV1alphaProperty property) {
    this.property = property;
    return this;
  }

  /**
   * A snapshot of a WebDataStream resource in change history.
   * @return value or {@code null} for none
   */
  public GoogleAnalyticsAdminV1alphaWebDataStream getWebDataStream() {
    return webDataStream;
  }

  /**
   * A snapshot of a WebDataStream resource in change history.
   * @param webDataStream webDataStream or {@code null} for none
   */
  public GoogleAnalyticsAdminV1alphaChangeHistoryChangeChangeHistoryResource setWebDataStream(GoogleAnalyticsAdminV1alphaWebDataStream webDataStream) {
    this.webDataStream = webDataStream;
    return this;
  }

  @Override
  public GoogleAnalyticsAdminV1alphaChangeHistoryChangeChangeHistoryResource set(String fieldName, Object value) {
    return (GoogleAnalyticsAdminV1alphaChangeHistoryChangeChangeHistoryResource) super.set(fieldName, value);
  }

  @Override
  public GoogleAnalyticsAdminV1alphaChangeHistoryChangeChangeHistoryResource clone() {
    return (GoogleAnalyticsAdminV1alphaChangeHistoryChangeChangeHistoryResource) super.clone();
  }

}
