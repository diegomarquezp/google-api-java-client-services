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

package com.google.api.services.displayvideo.v2.model;

/**
 * The common attributes for InStreamAd, NonSkippableAd and BumperAd.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Display & Video 360 API. For a detailed explanation
 * see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class CommonInStreamAttribute extends com.google.api.client.json.GenericJson {

  /**
   * The text on the call-to-action button.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String actionButtonLabel;

  /**
   * The headline of the call-to-action banner.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String actionHeadline;

  /**
   * The image which shows next to the video Ad.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private ImageAsset companionBanner;

  /**
   * The webpage address that appears with the ad.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String displayUrl;

  /**
   * The URL address of the webpage that people reach after they click the ad.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String finalUrl;

  /**
   * The URL address which is loaded in background for tracking purpose.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String trackingUrl;

  /**
   * The YouTube video of the ad.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private YoutubeVideoDetails video;

  /**
   * The text on the call-to-action button.
   * @return value or {@code null} for none
   */
  public java.lang.String getActionButtonLabel() {
    return actionButtonLabel;
  }

  /**
   * The text on the call-to-action button.
   * @param actionButtonLabel actionButtonLabel or {@code null} for none
   */
  public CommonInStreamAttribute setActionButtonLabel(java.lang.String actionButtonLabel) {
    this.actionButtonLabel = actionButtonLabel;
    return this;
  }

  /**
   * The headline of the call-to-action banner.
   * @return value or {@code null} for none
   */
  public java.lang.String getActionHeadline() {
    return actionHeadline;
  }

  /**
   * The headline of the call-to-action banner.
   * @param actionHeadline actionHeadline or {@code null} for none
   */
  public CommonInStreamAttribute setActionHeadline(java.lang.String actionHeadline) {
    this.actionHeadline = actionHeadline;
    return this;
  }

  /**
   * The image which shows next to the video Ad.
   * @return value or {@code null} for none
   */
  public ImageAsset getCompanionBanner() {
    return companionBanner;
  }

  /**
   * The image which shows next to the video Ad.
   * @param companionBanner companionBanner or {@code null} for none
   */
  public CommonInStreamAttribute setCompanionBanner(ImageAsset companionBanner) {
    this.companionBanner = companionBanner;
    return this;
  }

  /**
   * The webpage address that appears with the ad.
   * @return value or {@code null} for none
   */
  public java.lang.String getDisplayUrl() {
    return displayUrl;
  }

  /**
   * The webpage address that appears with the ad.
   * @param displayUrl displayUrl or {@code null} for none
   */
  public CommonInStreamAttribute setDisplayUrl(java.lang.String displayUrl) {
    this.displayUrl = displayUrl;
    return this;
  }

  /**
   * The URL address of the webpage that people reach after they click the ad.
   * @return value or {@code null} for none
   */
  public java.lang.String getFinalUrl() {
    return finalUrl;
  }

  /**
   * The URL address of the webpage that people reach after they click the ad.
   * @param finalUrl finalUrl or {@code null} for none
   */
  public CommonInStreamAttribute setFinalUrl(java.lang.String finalUrl) {
    this.finalUrl = finalUrl;
    return this;
  }

  /**
   * The URL address which is loaded in background for tracking purpose.
   * @return value or {@code null} for none
   */
  public java.lang.String getTrackingUrl() {
    return trackingUrl;
  }

  /**
   * The URL address which is loaded in background for tracking purpose.
   * @param trackingUrl trackingUrl or {@code null} for none
   */
  public CommonInStreamAttribute setTrackingUrl(java.lang.String trackingUrl) {
    this.trackingUrl = trackingUrl;
    return this;
  }

  /**
   * The YouTube video of the ad.
   * @return value or {@code null} for none
   */
  public YoutubeVideoDetails getVideo() {
    return video;
  }

  /**
   * The YouTube video of the ad.
   * @param video video or {@code null} for none
   */
  public CommonInStreamAttribute setVideo(YoutubeVideoDetails video) {
    this.video = video;
    return this;
  }

  @Override
  public CommonInStreamAttribute set(String fieldName, Object value) {
    return (CommonInStreamAttribute) super.set(fieldName, value);
  }

  @Override
  public CommonInStreamAttribute clone() {
    return (CommonInStreamAttribute) super.clone();
  }

}