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

package com.google.api.services.adsense.v2.model;

/**
 * Representation of a URL channel. URL channels allow you to track the performance of particular
 * pages in your site; see [URL channels](https://support.google.com/adsense/answer/2923836) for
 * more information.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the AdSense Management API. For a detailed explanation
 * see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class UrlChannel extends com.google.api.client.json.GenericJson {

  /**
   * Resource name of the URL channel. Format:
   * accounts/{account}/adclient/{adclient}/urlchannels/{urlchannel}
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String name;

  /**
   * Output only. Unique ID of the custom channel as used in the `URL_CHANNEL_ID` reporting
   * dimension.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String reportingDimensionId;

  /**
   * URI pattern of the channel. Does not include "http://" or "https://". Example:
   * www.example.com/home
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String uriPattern;

  /**
   * Resource name of the URL channel. Format:
   * accounts/{account}/adclient/{adclient}/urlchannels/{urlchannel}
   * @return value or {@code null} for none
   */
  public java.lang.String getName() {
    return name;
  }

  /**
   * Resource name of the URL channel. Format:
   * accounts/{account}/adclient/{adclient}/urlchannels/{urlchannel}
   * @param name name or {@code null} for none
   */
  public UrlChannel setName(java.lang.String name) {
    this.name = name;
    return this;
  }

  /**
   * Output only. Unique ID of the custom channel as used in the `URL_CHANNEL_ID` reporting
   * dimension.
   * @return value or {@code null} for none
   */
  public java.lang.String getReportingDimensionId() {
    return reportingDimensionId;
  }

  /**
   * Output only. Unique ID of the custom channel as used in the `URL_CHANNEL_ID` reporting
   * dimension.
   * @param reportingDimensionId reportingDimensionId or {@code null} for none
   */
  public UrlChannel setReportingDimensionId(java.lang.String reportingDimensionId) {
    this.reportingDimensionId = reportingDimensionId;
    return this;
  }

  /**
   * URI pattern of the channel. Does not include "http://" or "https://". Example:
   * www.example.com/home
   * @return value or {@code null} for none
   */
  public java.lang.String getUriPattern() {
    return uriPattern;
  }

  /**
   * URI pattern of the channel. Does not include "http://" or "https://". Example:
   * www.example.com/home
   * @param uriPattern uriPattern or {@code null} for none
   */
  public UrlChannel setUriPattern(java.lang.String uriPattern) {
    this.uriPattern = uriPattern;
    return this;
  }

  @Override
  public UrlChannel set(String fieldName, Object value) {
    return (UrlChannel) super.set(fieldName, value);
  }

  @Override
  public UrlChannel clone() {
    return (UrlChannel) super.clone();
  }

}
