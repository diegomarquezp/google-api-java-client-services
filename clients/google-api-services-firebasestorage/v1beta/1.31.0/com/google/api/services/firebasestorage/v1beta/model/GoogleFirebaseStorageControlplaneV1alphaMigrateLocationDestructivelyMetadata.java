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

package com.google.api.services.firebasestorage.v1beta.model;

/**
 * Metadata for MigrateLocationDestructively LRO.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Cloud Storage for Firebase API. For a detailed
 * explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class GoogleFirebaseStorageControlplaneV1alphaMigrateLocationDestructivelyMetadata extends com.google.api.client.json.GenericJson {

  /**
   * The time the LRO was created.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private String createTime;

  /**
   * The time the LRO was last updated.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private String lastUpdateTime;

  /**
   * The current state of the migration.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String state;

  /**
   * The time the LRO was created.
   * @return value or {@code null} for none
   */
  public String getCreateTime() {
    return createTime;
  }

  /**
   * The time the LRO was created.
   * @param createTime createTime or {@code null} for none
   */
  public GoogleFirebaseStorageControlplaneV1alphaMigrateLocationDestructivelyMetadata setCreateTime(String createTime) {
    this.createTime = createTime;
    return this;
  }

  /**
   * The time the LRO was last updated.
   * @return value or {@code null} for none
   */
  public String getLastUpdateTime() {
    return lastUpdateTime;
  }

  /**
   * The time the LRO was last updated.
   * @param lastUpdateTime lastUpdateTime or {@code null} for none
   */
  public GoogleFirebaseStorageControlplaneV1alphaMigrateLocationDestructivelyMetadata setLastUpdateTime(String lastUpdateTime) {
    this.lastUpdateTime = lastUpdateTime;
    return this;
  }

  /**
   * The current state of the migration.
   * @return value or {@code null} for none
   */
  public java.lang.String getState() {
    return state;
  }

  /**
   * The current state of the migration.
   * @param state state or {@code null} for none
   */
  public GoogleFirebaseStorageControlplaneV1alphaMigrateLocationDestructivelyMetadata setState(java.lang.String state) {
    this.state = state;
    return this;
  }

  @Override
  public GoogleFirebaseStorageControlplaneV1alphaMigrateLocationDestructivelyMetadata set(String fieldName, Object value) {
    return (GoogleFirebaseStorageControlplaneV1alphaMigrateLocationDestructivelyMetadata) super.set(fieldName, value);
  }

  @Override
  public GoogleFirebaseStorageControlplaneV1alphaMigrateLocationDestructivelyMetadata clone() {
    return (GoogleFirebaseStorageControlplaneV1alphaMigrateLocationDestructivelyMetadata) super.clone();
  }

}
