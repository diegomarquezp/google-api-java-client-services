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

package com.google.api.services.integrations.v1.model;

/**
 * This message is used for processing and persisting (when applicable) key value pair parameters
 * for each event in the event bus.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Application Integration API. For a detailed
 * explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class GoogleCloudIntegrationsV1alphaEventParameter extends com.google.api.client.json.GenericJson {

  /**
   * Key is used to retrieve the corresponding parameter value. This should be unique for a given
   * fired event. These parameters must be predefined in the integration definition.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String key;

  /**
   * Values for the defined keys. Each value can either be string, int, double or any proto message.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private GoogleCloudIntegrationsV1alphaValueType value;

  /**
   * Key is used to retrieve the corresponding parameter value. This should be unique for a given
   * fired event. These parameters must be predefined in the integration definition.
   * @return value or {@code null} for none
   */
  public java.lang.String getKey() {
    return key;
  }

  /**
   * Key is used to retrieve the corresponding parameter value. This should be unique for a given
   * fired event. These parameters must be predefined in the integration definition.
   * @param key key or {@code null} for none
   */
  public GoogleCloudIntegrationsV1alphaEventParameter setKey(java.lang.String key) {
    this.key = key;
    return this;
  }

  /**
   * Values for the defined keys. Each value can either be string, int, double or any proto message.
   * @return value or {@code null} for none
   */
  public GoogleCloudIntegrationsV1alphaValueType getValue() {
    return value;
  }

  /**
   * Values for the defined keys. Each value can either be string, int, double or any proto message.
   * @param value value or {@code null} for none
   */
  public GoogleCloudIntegrationsV1alphaEventParameter setValue(GoogleCloudIntegrationsV1alphaValueType value) {
    this.value = value;
    return this;
  }

  @Override
  public GoogleCloudIntegrationsV1alphaEventParameter set(String fieldName, Object value) {
    return (GoogleCloudIntegrationsV1alphaEventParameter) super.set(fieldName, value);
  }

  @Override
  public GoogleCloudIntegrationsV1alphaEventParameter clone() {
    return (GoogleCloudIntegrationsV1alphaEventParameter) super.clone();
  }

}