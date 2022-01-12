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

package com.google.api.services.run.v2.model;

/**
 * Settings for revision-level scaling settings.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Cloud Run Admin API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class GoogleCloudRunOpV2RevisionScaling extends com.google.api.client.json.GenericJson {

  /**
   * Maximum number of serving instances that this resource should have.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Integer maxInstanceCount;

  /**
   * Minimum number of serving instances that this resource should have.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Integer minInstanceCount;

  /**
   * Maximum number of serving instances that this resource should have.
   * @return value or {@code null} for none
   */
  public java.lang.Integer getMaxInstanceCount() {
    return maxInstanceCount;
  }

  /**
   * Maximum number of serving instances that this resource should have.
   * @param maxInstanceCount maxInstanceCount or {@code null} for none
   */
  public GoogleCloudRunOpV2RevisionScaling setMaxInstanceCount(java.lang.Integer maxInstanceCount) {
    this.maxInstanceCount = maxInstanceCount;
    return this;
  }

  /**
   * Minimum number of serving instances that this resource should have.
   * @return value or {@code null} for none
   */
  public java.lang.Integer getMinInstanceCount() {
    return minInstanceCount;
  }

  /**
   * Minimum number of serving instances that this resource should have.
   * @param minInstanceCount minInstanceCount or {@code null} for none
   */
  public GoogleCloudRunOpV2RevisionScaling setMinInstanceCount(java.lang.Integer minInstanceCount) {
    this.minInstanceCount = minInstanceCount;
    return this;
  }

  @Override
  public GoogleCloudRunOpV2RevisionScaling set(String fieldName, Object value) {
    return (GoogleCloudRunOpV2RevisionScaling) super.set(fieldName, value);
  }

  @Override
  public GoogleCloudRunOpV2RevisionScaling clone() {
    return (GoogleCloudRunOpV2RevisionScaling) super.clone();
  }

}
