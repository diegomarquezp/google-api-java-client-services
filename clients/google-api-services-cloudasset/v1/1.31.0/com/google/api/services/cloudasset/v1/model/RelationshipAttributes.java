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

package com.google.api.services.cloudasset.v1.model;

/**
 * DEPRECATED. This message only presents for the purpose of backward-compatibility. The server will
 * never populate this message in responses. The relationship attributes which include `type`,
 * `source_resource_type`, `target_resource_type` and `action`.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Cloud Asset API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class RelationshipAttributes extends com.google.api.client.json.GenericJson {

  /**
   * The detail of the relationship, e.g. `contains`, `attaches`
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String action;

  /**
   * The source asset type. Example: `compute.googleapis.com/Instance`
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String sourceResourceType;

  /**
   * The target asset type. Example: `compute.googleapis.com/Disk`
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String targetResourceType;

  /**
   * The unique identifier of the relationship type. Example: `INSTANCE_TO_INSTANCEGROUP`
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String type;

  /**
   * The detail of the relationship, e.g. `contains`, `attaches`
   * @return value or {@code null} for none
   */
  public java.lang.String getAction() {
    return action;
  }

  /**
   * The detail of the relationship, e.g. `contains`, `attaches`
   * @param action action or {@code null} for none
   */
  public RelationshipAttributes setAction(java.lang.String action) {
    this.action = action;
    return this;
  }

  /**
   * The source asset type. Example: `compute.googleapis.com/Instance`
   * @return value or {@code null} for none
   */
  public java.lang.String getSourceResourceType() {
    return sourceResourceType;
  }

  /**
   * The source asset type. Example: `compute.googleapis.com/Instance`
   * @param sourceResourceType sourceResourceType or {@code null} for none
   */
  public RelationshipAttributes setSourceResourceType(java.lang.String sourceResourceType) {
    this.sourceResourceType = sourceResourceType;
    return this;
  }

  /**
   * The target asset type. Example: `compute.googleapis.com/Disk`
   * @return value or {@code null} for none
   */
  public java.lang.String getTargetResourceType() {
    return targetResourceType;
  }

  /**
   * The target asset type. Example: `compute.googleapis.com/Disk`
   * @param targetResourceType targetResourceType or {@code null} for none
   */
  public RelationshipAttributes setTargetResourceType(java.lang.String targetResourceType) {
    this.targetResourceType = targetResourceType;
    return this;
  }

  /**
   * The unique identifier of the relationship type. Example: `INSTANCE_TO_INSTANCEGROUP`
   * @return value or {@code null} for none
   */
  public java.lang.String getType() {
    return type;
  }

  /**
   * The unique identifier of the relationship type. Example: `INSTANCE_TO_INSTANCEGROUP`
   * @param type type or {@code null} for none
   */
  public RelationshipAttributes setType(java.lang.String type) {
    this.type = type;
    return this;
  }

  @Override
  public RelationshipAttributes set(String fieldName, Object value) {
    return (RelationshipAttributes) super.set(fieldName, value);
  }

  @Override
  public RelationshipAttributes clone() {
    return (RelationshipAttributes) super.clone();
  }

}
