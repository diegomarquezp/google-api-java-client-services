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

package com.google.api.services.cloudbuild.v1.model;

/**
 * Pairs a secret environment variable with a SecretVersion in Secret Manager.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Cloud Build API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class SecretManagerSecret extends com.google.api.client.json.GenericJson {

  /**
   * Environment variable name to associate with the secret. Secret environment variables must be
   * unique across all of a build's secrets, and must be used by at least one build step.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String env;

  /**
   * Resource name of the SecretVersion. In format: projects/secrets/versions
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String versionName;

  /**
   * Environment variable name to associate with the secret. Secret environment variables must be
   * unique across all of a build's secrets, and must be used by at least one build step.
   * @return value or {@code null} for none
   */
  public java.lang.String getEnv() {
    return env;
  }

  /**
   * Environment variable name to associate with the secret. Secret environment variables must be
   * unique across all of a build's secrets, and must be used by at least one build step.
   * @param env env or {@code null} for none
   */
  public SecretManagerSecret setEnv(java.lang.String env) {
    this.env = env;
    return this;
  }

  /**
   * Resource name of the SecretVersion. In format: projects/secrets/versions
   * @return value or {@code null} for none
   */
  public java.lang.String getVersionName() {
    return versionName;
  }

  /**
   * Resource name of the SecretVersion. In format: projects/secrets/versions
   * @param versionName versionName or {@code null} for none
   */
  public SecretManagerSecret setVersionName(java.lang.String versionName) {
    this.versionName = versionName;
    return this;
  }

  @Override
  public SecretManagerSecret set(String fieldName, Object value) {
    return (SecretManagerSecret) super.set(fieldName, value);
  }

  @Override
  public SecretManagerSecret clone() {
    return (SecretManagerSecret) super.clone();
  }

}
