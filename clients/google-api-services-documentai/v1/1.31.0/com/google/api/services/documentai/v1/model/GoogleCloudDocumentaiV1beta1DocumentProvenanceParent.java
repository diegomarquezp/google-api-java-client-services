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

package com.google.api.services.documentai.v1.model;

/**
 * Structure for referencing parent provenances. When an element replaces one of more other elements
 * parent references identify the elements that are replaced.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Cloud Document AI API. For a detailed explanation
 * see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class GoogleCloudDocumentaiV1beta1DocumentProvenanceParent extends com.google.api.client.json.GenericJson {

  /**
   * The id of the parent provenance.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Integer id;

  /**
   * The index of the parent revisions corresponding collection of items (eg. list of entities,
   * properties within entities, etc.)
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Integer index;

  /**
   * The index of the [Document.revisions] identifying the parent revision.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Integer revision;

  /**
   * The id of the parent provenance.
   * @return value or {@code null} for none
   */
  public java.lang.Integer getId() {
    return id;
  }

  /**
   * The id of the parent provenance.
   * @param id id or {@code null} for none
   */
  public GoogleCloudDocumentaiV1beta1DocumentProvenanceParent setId(java.lang.Integer id) {
    this.id = id;
    return this;
  }

  /**
   * The index of the parent revisions corresponding collection of items (eg. list of entities,
   * properties within entities, etc.)
   * @return value or {@code null} for none
   */
  public java.lang.Integer getIndex() {
    return index;
  }

  /**
   * The index of the parent revisions corresponding collection of items (eg. list of entities,
   * properties within entities, etc.)
   * @param index index or {@code null} for none
   */
  public GoogleCloudDocumentaiV1beta1DocumentProvenanceParent setIndex(java.lang.Integer index) {
    this.index = index;
    return this;
  }

  /**
   * The index of the [Document.revisions] identifying the parent revision.
   * @return value or {@code null} for none
   */
  public java.lang.Integer getRevision() {
    return revision;
  }

  /**
   * The index of the [Document.revisions] identifying the parent revision.
   * @param revision revision or {@code null} for none
   */
  public GoogleCloudDocumentaiV1beta1DocumentProvenanceParent setRevision(java.lang.Integer revision) {
    this.revision = revision;
    return this;
  }

  @Override
  public GoogleCloudDocumentaiV1beta1DocumentProvenanceParent set(String fieldName, Object value) {
    return (GoogleCloudDocumentaiV1beta1DocumentProvenanceParent) super.set(fieldName, value);
  }

  @Override
  public GoogleCloudDocumentaiV1beta1DocumentProvenanceParent clone() {
    return (GoogleCloudDocumentaiV1beta1DocumentProvenanceParent) super.clone();
  }

}
