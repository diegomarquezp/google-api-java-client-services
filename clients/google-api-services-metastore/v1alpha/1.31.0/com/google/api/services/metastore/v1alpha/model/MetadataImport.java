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

package com.google.api.services.metastore.v1alpha.model;

/**
 * A metastore resource that imports metadata.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Dataproc Metastore API. For a detailed explanation
 * see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class MetadataImport extends com.google.api.client.json.GenericJson {

  /**
   * Output only. The time when the metadata import was started.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private String createTime;

  /**
   * Immutable. A database dump from a pre-existing metastore's database.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private DatabaseDump databaseDump;

  /**
   * The description of the metadata import.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String description;

  /**
   * Output only. The time when the metadata import finished.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private String endTime;

  /**
   * Immutable. The relative resource name of the metadata import, of the form:projects/{project_num
   * ber}/locations/{location_id}/services/{service_id}/metadataImports/{metadata_import_id}.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String name;

  /**
   * Output only. The current state of the metadata import.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String state;

  /**
   * Output only. The time when the metadata import was last updated.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private String updateTime;

  /**
   * Output only. The time when the metadata import was started.
   * @return value or {@code null} for none
   */
  public String getCreateTime() {
    return createTime;
  }

  /**
   * Output only. The time when the metadata import was started.
   * @param createTime createTime or {@code null} for none
   */
  public MetadataImport setCreateTime(String createTime) {
    this.createTime = createTime;
    return this;
  }

  /**
   * Immutable. A database dump from a pre-existing metastore's database.
   * @return value or {@code null} for none
   */
  public DatabaseDump getDatabaseDump() {
    return databaseDump;
  }

  /**
   * Immutable. A database dump from a pre-existing metastore's database.
   * @param databaseDump databaseDump or {@code null} for none
   */
  public MetadataImport setDatabaseDump(DatabaseDump databaseDump) {
    this.databaseDump = databaseDump;
    return this;
  }

  /**
   * The description of the metadata import.
   * @return value or {@code null} for none
   */
  public java.lang.String getDescription() {
    return description;
  }

  /**
   * The description of the metadata import.
   * @param description description or {@code null} for none
   */
  public MetadataImport setDescription(java.lang.String description) {
    this.description = description;
    return this;
  }

  /**
   * Output only. The time when the metadata import finished.
   * @return value or {@code null} for none
   */
  public String getEndTime() {
    return endTime;
  }

  /**
   * Output only. The time when the metadata import finished.
   * @param endTime endTime or {@code null} for none
   */
  public MetadataImport setEndTime(String endTime) {
    this.endTime = endTime;
    return this;
  }

  /**
   * Immutable. The relative resource name of the metadata import, of the form:projects/{project_num
   * ber}/locations/{location_id}/services/{service_id}/metadataImports/{metadata_import_id}.
   * @return value or {@code null} for none
   */
  public java.lang.String getName() {
    return name;
  }

  /**
   * Immutable. The relative resource name of the metadata import, of the form:projects/{project_num
   * ber}/locations/{location_id}/services/{service_id}/metadataImports/{metadata_import_id}.
   * @param name name or {@code null} for none
   */
  public MetadataImport setName(java.lang.String name) {
    this.name = name;
    return this;
  }

  /**
   * Output only. The current state of the metadata import.
   * @return value or {@code null} for none
   */
  public java.lang.String getState() {
    return state;
  }

  /**
   * Output only. The current state of the metadata import.
   * @param state state or {@code null} for none
   */
  public MetadataImport setState(java.lang.String state) {
    this.state = state;
    return this;
  }

  /**
   * Output only. The time when the metadata import was last updated.
   * @return value or {@code null} for none
   */
  public String getUpdateTime() {
    return updateTime;
  }

  /**
   * Output only. The time when the metadata import was last updated.
   * @param updateTime updateTime or {@code null} for none
   */
  public MetadataImport setUpdateTime(String updateTime) {
    this.updateTime = updateTime;
    return this;
  }

  @Override
  public MetadataImport set(String fieldName, Object value) {
    return (MetadataImport) super.set(fieldName, value);
  }

  @Override
  public MetadataImport clone() {
    return (MetadataImport) super.clone();
  }

}
