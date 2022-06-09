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

package com.google.api.services.dfareporting.model;

/**
 * Represents the dimensions of ads, placements, creatives, or creative assets.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Campaign Manager 360 API. For a detailed explanation
 * see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class Size extends com.google.api.client.json.GenericJson {

  /**
   * Height of this size. Acceptable values are 0 to 32767, inclusive.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Integer height;

  /**
   * IAB standard size. This is a read-only, auto-generated field.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean iab;

  /**
   * ID of this size. This is a read-only, auto-generated field.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key @com.google.api.client.json.JsonString
  private java.lang.Long id;

  /**
   * Identifies what kind of resource this is. Value: the fixed string "dfareporting#size".
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String kind;

  /**
   * Width of this size. Acceptable values are 0 to 32767, inclusive.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Integer width;

  /**
   * Height of this size. Acceptable values are 0 to 32767, inclusive.
   * @return value or {@code null} for none
   */
  public java.lang.Integer getHeight() {
    return height;
  }

  /**
   * Height of this size. Acceptable values are 0 to 32767, inclusive.
   * @param height height or {@code null} for none
   */
  public Size setHeight(java.lang.Integer height) {
    this.height = height;
    return this;
  }

  /**
   * IAB standard size. This is a read-only, auto-generated field.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getIab() {
    return iab;
  }

  /**
   * IAB standard size. This is a read-only, auto-generated field.
   * @param iab iab or {@code null} for none
   */
  public Size setIab(java.lang.Boolean iab) {
    this.iab = iab;
    return this;
  }

  /**
   * ID of this size. This is a read-only, auto-generated field.
   * @return value or {@code null} for none
   */
  public java.lang.Long getId() {
    return id;
  }

  /**
   * ID of this size. This is a read-only, auto-generated field.
   * @param id id or {@code null} for none
   */
  public Size setId(java.lang.Long id) {
    this.id = id;
    return this;
  }

  /**
   * Identifies what kind of resource this is. Value: the fixed string "dfareporting#size".
   * @return value or {@code null} for none
   */
  public java.lang.String getKind() {
    return kind;
  }

  /**
   * Identifies what kind of resource this is. Value: the fixed string "dfareporting#size".
   * @param kind kind or {@code null} for none
   */
  public Size setKind(java.lang.String kind) {
    this.kind = kind;
    return this;
  }

  /**
   * Width of this size. Acceptable values are 0 to 32767, inclusive.
   * @return value or {@code null} for none
   */
  public java.lang.Integer getWidth() {
    return width;
  }

  /**
   * Width of this size. Acceptable values are 0 to 32767, inclusive.
   * @param width width or {@code null} for none
   */
  public Size setWidth(java.lang.Integer width) {
    this.width = width;
    return this;
  }

  @Override
  public Size set(String fieldName, Object value) {
    return (Size) super.set(fieldName, value);
  }

  @Override
  public Size clone() {
    return (Size) super.clone();
  }

}
