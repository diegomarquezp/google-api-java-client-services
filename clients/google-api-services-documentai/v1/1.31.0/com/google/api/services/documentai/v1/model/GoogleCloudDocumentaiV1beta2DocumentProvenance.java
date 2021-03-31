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
 * Structure to identify provenance relationships between annotations in different revisions.
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
public final class GoogleCloudDocumentaiV1beta2DocumentProvenance extends com.google.api.client.json.GenericJson {

  /**
   * The Id of this operation. Needs to be unique within the scope of the revision.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Integer id;

  /**
   * References to the original elements that are replaced.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<GoogleCloudDocumentaiV1beta2DocumentProvenanceParent> parents;

  /**
   * The index of the revision that produced this element.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Integer revision;

  /**
   * The type of provenance operation.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String type;

  /**
   * The Id of this operation. Needs to be unique within the scope of the revision.
   * @return value or {@code null} for none
   */
  public java.lang.Integer getId() {
    return id;
  }

  /**
   * The Id of this operation. Needs to be unique within the scope of the revision.
   * @param id id or {@code null} for none
   */
  public GoogleCloudDocumentaiV1beta2DocumentProvenance setId(java.lang.Integer id) {
    this.id = id;
    return this;
  }

  /**
   * References to the original elements that are replaced.
   * @return value or {@code null} for none
   */
  public java.util.List<GoogleCloudDocumentaiV1beta2DocumentProvenanceParent> getParents() {
    return parents;
  }

  /**
   * References to the original elements that are replaced.
   * @param parents parents or {@code null} for none
   */
  public GoogleCloudDocumentaiV1beta2DocumentProvenance setParents(java.util.List<GoogleCloudDocumentaiV1beta2DocumentProvenanceParent> parents) {
    this.parents = parents;
    return this;
  }

  /**
   * The index of the revision that produced this element.
   * @return value or {@code null} for none
   */
  public java.lang.Integer getRevision() {
    return revision;
  }

  /**
   * The index of the revision that produced this element.
   * @param revision revision or {@code null} for none
   */
  public GoogleCloudDocumentaiV1beta2DocumentProvenance setRevision(java.lang.Integer revision) {
    this.revision = revision;
    return this;
  }

  /**
   * The type of provenance operation.
   * @return value or {@code null} for none
   */
  public java.lang.String getType() {
    return type;
  }

  /**
   * The type of provenance operation.
   * @param type type or {@code null} for none
   */
  public GoogleCloudDocumentaiV1beta2DocumentProvenance setType(java.lang.String type) {
    this.type = type;
    return this;
  }

  @Override
  public GoogleCloudDocumentaiV1beta2DocumentProvenance set(String fieldName, Object value) {
    return (GoogleCloudDocumentaiV1beta2DocumentProvenance) super.set(fieldName, value);
  }

  @Override
  public GoogleCloudDocumentaiV1beta2DocumentProvenance clone() {
    return (GoogleCloudDocumentaiV1beta2DocumentProvenance) super.clone();
  }

}
