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

package com.google.api.services.run.v1.model;

/**
 * Volume represents a named volume in a container.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Cloud Run Admin API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class Volume extends com.google.api.client.json.GenericJson {

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private ConfigMapVolumeSource configMap;

  /**
   * Volume's name. In Cloud Run Fully Managed, the name 'cloudsql' is reserved.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String name;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private SecretVolumeSource secret;

  /**
   * @return value or {@code null} for none
   */
  public ConfigMapVolumeSource getConfigMap() {
    return configMap;
  }

  /**
   * @param configMap configMap or {@code null} for none
   */
  public Volume setConfigMap(ConfigMapVolumeSource configMap) {
    this.configMap = configMap;
    return this;
  }

  /**
   * Volume's name. In Cloud Run Fully Managed, the name 'cloudsql' is reserved.
   * @return value or {@code null} for none
   */
  public java.lang.String getName() {
    return name;
  }

  /**
   * Volume's name. In Cloud Run Fully Managed, the name 'cloudsql' is reserved.
   * @param name name or {@code null} for none
   */
  public Volume setName(java.lang.String name) {
    this.name = name;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public SecretVolumeSource getSecret() {
    return secret;
  }

  /**
   * @param secret secret or {@code null} for none
   */
  public Volume setSecret(SecretVolumeSource secret) {
    this.secret = secret;
    return this;
  }

  @Override
  public Volume set(String fieldName, Object value) {
    return (Volume) super.set(fieldName, value);
  }

  @Override
  public Volume clone() {
    return (Volume) super.clone();
  }

}
