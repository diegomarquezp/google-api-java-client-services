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

package com.google.api.services.dataplex.v1.model;

/**
 * DataTaxonomy represents a set of hierarchical DataAttributes resources, grouped with a common
 * theme Eg: 'SensitiveDataTaxonomy' can have attributes to manage PII data. It is defined at
 * project level.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Cloud Dataplex API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class GoogleCloudDataplexV1DataTaxonomy extends com.google.api.client.json.GenericJson {

  /**
   * Output only. The number of attributes in the DataTaxonomy.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Integer attributeCount;

  /**
   * Output only. The time when the DataTaxonomy was created.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private String createTime;

  /**
   * Optional. Description of the DataTaxonomy.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String description;

  /**
   * Optional. User friendly display name.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String displayName;

  /**
   * This checksum is computed by the server based on the value of other fields, and may be sent on
   * update and delete requests to ensure the client has an up-to-date value before proceeding.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String etag;

  /**
   * Optional. User-defined labels for the DataTaxonomy.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.Map<String, java.lang.String> labels;

  /**
   * Output only. The relative resource name of the DataTaxonomy, of the form:
   * projects/{project_number}/locations/{location_id}/dataTaxonomies/{data_taxonomy_id}.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String name;

  /**
   * Output only. System generated globally unique ID for the dataTaxonomy. This ID will be
   * different if the DataTaxonomy is deleted and re-created with the same name.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String uid;

  /**
   * Output only. The time when the DataTaxonomy was last updated.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private String updateTime;

  /**
   * Output only. The number of attributes in the DataTaxonomy.
   * @return value or {@code null} for none
   */
  public java.lang.Integer getAttributeCount() {
    return attributeCount;
  }

  /**
   * Output only. The number of attributes in the DataTaxonomy.
   * @param attributeCount attributeCount or {@code null} for none
   */
  public GoogleCloudDataplexV1DataTaxonomy setAttributeCount(java.lang.Integer attributeCount) {
    this.attributeCount = attributeCount;
    return this;
  }

  /**
   * Output only. The time when the DataTaxonomy was created.
   * @return value or {@code null} for none
   */
  public String getCreateTime() {
    return createTime;
  }

  /**
   * Output only. The time when the DataTaxonomy was created.
   * @param createTime createTime or {@code null} for none
   */
  public GoogleCloudDataplexV1DataTaxonomy setCreateTime(String createTime) {
    this.createTime = createTime;
    return this;
  }

  /**
   * Optional. Description of the DataTaxonomy.
   * @return value or {@code null} for none
   */
  public java.lang.String getDescription() {
    return description;
  }

  /**
   * Optional. Description of the DataTaxonomy.
   * @param description description or {@code null} for none
   */
  public GoogleCloudDataplexV1DataTaxonomy setDescription(java.lang.String description) {
    this.description = description;
    return this;
  }

  /**
   * Optional. User friendly display name.
   * @return value or {@code null} for none
   */
  public java.lang.String getDisplayName() {
    return displayName;
  }

  /**
   * Optional. User friendly display name.
   * @param displayName displayName or {@code null} for none
   */
  public GoogleCloudDataplexV1DataTaxonomy setDisplayName(java.lang.String displayName) {
    this.displayName = displayName;
    return this;
  }

  /**
   * This checksum is computed by the server based on the value of other fields, and may be sent on
   * update and delete requests to ensure the client has an up-to-date value before proceeding.
   * @return value or {@code null} for none
   */
  public java.lang.String getEtag() {
    return etag;
  }

  /**
   * This checksum is computed by the server based on the value of other fields, and may be sent on
   * update and delete requests to ensure the client has an up-to-date value before proceeding.
   * @param etag etag or {@code null} for none
   */
  public GoogleCloudDataplexV1DataTaxonomy setEtag(java.lang.String etag) {
    this.etag = etag;
    return this;
  }

  /**
   * Optional. User-defined labels for the DataTaxonomy.
   * @return value or {@code null} for none
   */
  public java.util.Map<String, java.lang.String> getLabels() {
    return labels;
  }

  /**
   * Optional. User-defined labels for the DataTaxonomy.
   * @param labels labels or {@code null} for none
   */
  public GoogleCloudDataplexV1DataTaxonomy setLabels(java.util.Map<String, java.lang.String> labels) {
    this.labels = labels;
    return this;
  }

  /**
   * Output only. The relative resource name of the DataTaxonomy, of the form:
   * projects/{project_number}/locations/{location_id}/dataTaxonomies/{data_taxonomy_id}.
   * @return value or {@code null} for none
   */
  public java.lang.String getName() {
    return name;
  }

  /**
   * Output only. The relative resource name of the DataTaxonomy, of the form:
   * projects/{project_number}/locations/{location_id}/dataTaxonomies/{data_taxonomy_id}.
   * @param name name or {@code null} for none
   */
  public GoogleCloudDataplexV1DataTaxonomy setName(java.lang.String name) {
    this.name = name;
    return this;
  }

  /**
   * Output only. System generated globally unique ID for the dataTaxonomy. This ID will be
   * different if the DataTaxonomy is deleted and re-created with the same name.
   * @return value or {@code null} for none
   */
  public java.lang.String getUid() {
    return uid;
  }

  /**
   * Output only. System generated globally unique ID for the dataTaxonomy. This ID will be
   * different if the DataTaxonomy is deleted and re-created with the same name.
   * @param uid uid or {@code null} for none
   */
  public GoogleCloudDataplexV1DataTaxonomy setUid(java.lang.String uid) {
    this.uid = uid;
    return this;
  }

  /**
   * Output only. The time when the DataTaxonomy was last updated.
   * @return value or {@code null} for none
   */
  public String getUpdateTime() {
    return updateTime;
  }

  /**
   * Output only. The time when the DataTaxonomy was last updated.
   * @param updateTime updateTime or {@code null} for none
   */
  public GoogleCloudDataplexV1DataTaxonomy setUpdateTime(String updateTime) {
    this.updateTime = updateTime;
    return this;
  }

  @Override
  public GoogleCloudDataplexV1DataTaxonomy set(String fieldName, Object value) {
    return (GoogleCloudDataplexV1DataTaxonomy) super.set(fieldName, value);
  }

  @Override
  public GoogleCloudDataplexV1DataTaxonomy clone() {
    return (GoogleCloudDataplexV1DataTaxonomy) super.clone();
  }

}