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

package com.google.api.services.cloudfunctions.v2beta.model;

/**
 * Configuration for a secret environment variable. It has the information necessary to fetch the
 * secret value from secret manager and expose it as an environment variable.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Cloud Functions API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class SecretEnvVar extends com.google.api.client.json.GenericJson {

  /**
   * Name of the environment variable.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String key;

  /**
   * Project identifier (preferably project number but can also be the project ID) of the project
   * that contains the secret. If not set, it will be populated with the function's project assuming
   * that the secret exists in the same project as of the function.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String projectId;

  /**
   * Name of the secret in secret manager (not the full resource name).
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String secret;

  /**
   * Version of the secret (version number or the string 'latest'). It is recommended to use a
   * numeric version for secret environment variables as any updates to the secret value is not
   * reflected until new instances start.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String version;

  /**
   * Name of the environment variable.
   * @return value or {@code null} for none
   */
  public java.lang.String getKey() {
    return key;
  }

  /**
   * Name of the environment variable.
   * @param key key or {@code null} for none
   */
  public SecretEnvVar setKey(java.lang.String key) {
    this.key = key;
    return this;
  }

  /**
   * Project identifier (preferably project number but can also be the project ID) of the project
   * that contains the secret. If not set, it will be populated with the function's project assuming
   * that the secret exists in the same project as of the function.
   * @return value or {@code null} for none
   */
  public java.lang.String getProjectId() {
    return projectId;
  }

  /**
   * Project identifier (preferably project number but can also be the project ID) of the project
   * that contains the secret. If not set, it will be populated with the function's project assuming
   * that the secret exists in the same project as of the function.
   * @param projectId projectId or {@code null} for none
   */
  public SecretEnvVar setProjectId(java.lang.String projectId) {
    this.projectId = projectId;
    return this;
  }

  /**
   * Name of the secret in secret manager (not the full resource name).
   * @return value or {@code null} for none
   */
  public java.lang.String getSecret() {
    return secret;
  }

  /**
   * Name of the secret in secret manager (not the full resource name).
   * @param secret secret or {@code null} for none
   */
  public SecretEnvVar setSecret(java.lang.String secret) {
    this.secret = secret;
    return this;
  }

  /**
   * Version of the secret (version number or the string 'latest'). It is recommended to use a
   * numeric version for secret environment variables as any updates to the secret value is not
   * reflected until new instances start.
   * @return value or {@code null} for none
   */
  public java.lang.String getVersion() {
    return version;
  }

  /**
   * Version of the secret (version number or the string 'latest'). It is recommended to use a
   * numeric version for secret environment variables as any updates to the secret value is not
   * reflected until new instances start.
   * @param version version or {@code null} for none
   */
  public SecretEnvVar setVersion(java.lang.String version) {
    this.version = version;
    return this;
  }

  @Override
  public SecretEnvVar set(String fieldName, Object value) {
    return (SecretEnvVar) super.set(fieldName, value);
  }

  @Override
  public SecretEnvVar clone() {
    return (SecretEnvVar) super.clone();
  }

}
