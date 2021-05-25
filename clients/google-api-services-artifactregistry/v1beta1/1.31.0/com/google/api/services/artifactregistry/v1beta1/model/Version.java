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

package com.google.api.services.artifactregistry.v1beta1.model;

/**
 * The body of a version resource. A version resource represents a collection of components, such as
 * files and other data. This may correspond to a version in many package management schemes.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Artifact Registry API. For a detailed explanation
 * see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class Version extends com.google.api.client.json.GenericJson {

  /**
   * The time when the version was created.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private String createTime;

  /**
   * Optional. Description of the version, as specified in its metadata.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String description;

  /**
   * The name of the version, for example: "projects/p1/locations/us-
   * central1/repositories/repo1/packages/pkg1/versions/art1". If the package or version ID parts
   * contain slashes, the slashes are escaped.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String name;

  /**
   * Output only. A list of related tags. Will contain up to 100 tags that reference this version.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<Tag> relatedTags;

  static {
    // hack to force ProGuard to consider Tag used, since otherwise it would be stripped out
    // see https://github.com/google/google-api-java-client/issues/543
    com.google.api.client.util.Data.nullOf(Tag.class);
  }

  /**
   * The time when the version was last updated.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private String updateTime;

  /**
   * The time when the version was created.
   * @return value or {@code null} for none
   */
  public String getCreateTime() {
    return createTime;
  }

  /**
   * The time when the version was created.
   * @param createTime createTime or {@code null} for none
   */
  public Version setCreateTime(String createTime) {
    this.createTime = createTime;
    return this;
  }

  /**
   * Optional. Description of the version, as specified in its metadata.
   * @return value or {@code null} for none
   */
  public java.lang.String getDescription() {
    return description;
  }

  /**
   * Optional. Description of the version, as specified in its metadata.
   * @param description description or {@code null} for none
   */
  public Version setDescription(java.lang.String description) {
    this.description = description;
    return this;
  }

  /**
   * The name of the version, for example: "projects/p1/locations/us-
   * central1/repositories/repo1/packages/pkg1/versions/art1". If the package or version ID parts
   * contain slashes, the slashes are escaped.
   * @return value or {@code null} for none
   */
  public java.lang.String getName() {
    return name;
  }

  /**
   * The name of the version, for example: "projects/p1/locations/us-
   * central1/repositories/repo1/packages/pkg1/versions/art1". If the package or version ID parts
   * contain slashes, the slashes are escaped.
   * @param name name or {@code null} for none
   */
  public Version setName(java.lang.String name) {
    this.name = name;
    return this;
  }

  /**
   * Output only. A list of related tags. Will contain up to 100 tags that reference this version.
   * @return value or {@code null} for none
   */
  public java.util.List<Tag> getRelatedTags() {
    return relatedTags;
  }

  /**
   * Output only. A list of related tags. Will contain up to 100 tags that reference this version.
   * @param relatedTags relatedTags or {@code null} for none
   */
  public Version setRelatedTags(java.util.List<Tag> relatedTags) {
    this.relatedTags = relatedTags;
    return this;
  }

  /**
   * The time when the version was last updated.
   * @return value or {@code null} for none
   */
  public String getUpdateTime() {
    return updateTime;
  }

  /**
   * The time when the version was last updated.
   * @param updateTime updateTime or {@code null} for none
   */
  public Version setUpdateTime(String updateTime) {
    this.updateTime = updateTime;
    return this;
  }

  @Override
  public Version set(String fieldName, Object value) {
    return (Version) super.set(fieldName, value);
  }

  @Override
  public Version clone() {
    return (Version) super.clone();
  }

}
