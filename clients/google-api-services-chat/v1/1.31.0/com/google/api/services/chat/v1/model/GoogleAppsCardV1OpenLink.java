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

package com.google.api.services.chat.v1.model;

/**
 * Model definition for GoogleAppsCardV1OpenLink.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Google Chat API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class GoogleAppsCardV1OpenLink extends com.google.api.client.json.GenericJson {

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String onClose;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String openAs;

  /**
   * The URL to open.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String url;

  /**
   * @return value or {@code null} for none
   */
  public java.lang.String getOnClose() {
    return onClose;
  }

  /**
   * @param onClose onClose or {@code null} for none
   */
  public GoogleAppsCardV1OpenLink setOnClose(java.lang.String onClose) {
    this.onClose = onClose;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.String getOpenAs() {
    return openAs;
  }

  /**
   * @param openAs openAs or {@code null} for none
   */
  public GoogleAppsCardV1OpenLink setOpenAs(java.lang.String openAs) {
    this.openAs = openAs;
    return this;
  }

  /**
   * The URL to open.
   * @return value or {@code null} for none
   */
  public java.lang.String getUrl() {
    return url;
  }

  /**
   * The URL to open.
   * @param url url or {@code null} for none
   */
  public GoogleAppsCardV1OpenLink setUrl(java.lang.String url) {
    this.url = url;
    return this;
  }

  @Override
  public GoogleAppsCardV1OpenLink set(String fieldName, Object value) {
    return (GoogleAppsCardV1OpenLink) super.set(fieldName, value);
  }

  @Override
  public GoogleAppsCardV1OpenLink clone() {
    return (GoogleAppsCardV1OpenLink) super.clone();
  }

}
