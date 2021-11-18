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

package com.google.api.services.dialogflow.v2beta1.model;

/**
 * Represents the parameters of human assist query.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Dialogflow API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class GoogleCloudDialogflowV2beta1AssistQueryParameters extends com.google.api.client.json.GenericJson {

  /**
   * Key-value filters on the metadata of documents returned by article suggestion. If specified,
   * article suggestion only returns suggested documents that match all filters in their
   * Document.metadata. Multiple values for a metadata key should be concatenated by comma. For
   * example, filters to match all documents that have 'US' or 'CA' in their market metadata values
   * and 'agent' in their user metadata values will be ``` documents_metadata_filters { key:
   * "market" value: "US,CA" } documents_metadata_filters { key: "user" value: "agent" } ```
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.Map<String, java.lang.String> documentsMetadataFilters;

  /**
   * Key-value filters on the metadata of documents returned by article suggestion. If specified,
   * article suggestion only returns suggested documents that match all filters in their
   * Document.metadata. Multiple values for a metadata key should be concatenated by comma. For
   * example, filters to match all documents that have 'US' or 'CA' in their market metadata values
   * and 'agent' in their user metadata values will be ``` documents_metadata_filters { key:
   * "market" value: "US,CA" } documents_metadata_filters { key: "user" value: "agent" } ```
   * @return value or {@code null} for none
   */
  public java.util.Map<String, java.lang.String> getDocumentsMetadataFilters() {
    return documentsMetadataFilters;
  }

  /**
   * Key-value filters on the metadata of documents returned by article suggestion. If specified,
   * article suggestion only returns suggested documents that match all filters in their
   * Document.metadata. Multiple values for a metadata key should be concatenated by comma. For
   * example, filters to match all documents that have 'US' or 'CA' in their market metadata values
   * and 'agent' in their user metadata values will be ``` documents_metadata_filters { key:
   * "market" value: "US,CA" } documents_metadata_filters { key: "user" value: "agent" } ```
   * @param documentsMetadataFilters documentsMetadataFilters or {@code null} for none
   */
  public GoogleCloudDialogflowV2beta1AssistQueryParameters setDocumentsMetadataFilters(java.util.Map<String, java.lang.String> documentsMetadataFilters) {
    this.documentsMetadataFilters = documentsMetadataFilters;
    return this;
  }

  @Override
  public GoogleCloudDialogflowV2beta1AssistQueryParameters set(String fieldName, Object value) {
    return (GoogleCloudDialogflowV2beta1AssistQueryParameters) super.set(fieldName, value);
  }

  @Override
  public GoogleCloudDialogflowV2beta1AssistQueryParameters clone() {
    return (GoogleCloudDialogflowV2beta1AssistQueryParameters) super.clone();
  }

}
