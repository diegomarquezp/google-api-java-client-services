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
 * Extra data for an android intent. Valid keys are defined in the hosting app contract.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Google Chat API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class GoogleAppsCardV1ExtraData extends com.google.api.client.json.GenericJson {

  /**
   * A key for the intent extra data.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String key;

  /**
   * Value for the given extra data key.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String value;

  /**
   * A key for the intent extra data.
   * @return value or {@code null} for none
   */
  public java.lang.String getKey() {
    return key;
  }

  /**
   * A key for the intent extra data.
   * @param key key or {@code null} for none
   */
  public GoogleAppsCardV1ExtraData setKey(java.lang.String key) {
    this.key = key;
    return this;
  }

  /**
   * Value for the given extra data key.
   * @return value or {@code null} for none
   */
  public java.lang.String getValue() {
    return value;
  }

  /**
   * Value for the given extra data key.
   * @param value value or {@code null} for none
   */
  public GoogleAppsCardV1ExtraData setValue(java.lang.String value) {
    this.value = value;
    return this;
  }

  @Override
  public GoogleAppsCardV1ExtraData set(String fieldName, Object value) {
    return (GoogleAppsCardV1ExtraData) super.set(fieldName, value);
  }

  @Override
  public GoogleAppsCardV1ExtraData clone() {
    return (GoogleAppsCardV1ExtraData) super.clone();
  }

}
