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

package com.google.api.services.adexchangebuyer2.v2beta1.model;

/**
 * Represents information for a creative that is associated with a Programmatic Guaranteed/Preferred
 * Deal in Ad Manager.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Ad Exchange Buyer API II. For a detailed explanation
 * see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class CreativeSpecification extends com.google.api.client.json.GenericJson {

  /**
   * Companion sizes may be filled in only when this is a video creative.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<AdSize> creativeCompanionSizes;

  static {
    // hack to force ProGuard to consider AdSize used, since otherwise it would be stripped out
    // see https://github.com/google/google-api-java-client/issues/543
    com.google.api.client.util.Data.nullOf(AdSize.class);
  }

  /**
   * The size of the creative.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private AdSize creativeSize;

  /**
   * Companion sizes may be filled in only when this is a video creative.
   * @return value or {@code null} for none
   */
  public java.util.List<AdSize> getCreativeCompanionSizes() {
    return creativeCompanionSizes;
  }

  /**
   * Companion sizes may be filled in only when this is a video creative.
   * @param creativeCompanionSizes creativeCompanionSizes or {@code null} for none
   */
  public CreativeSpecification setCreativeCompanionSizes(java.util.List<AdSize> creativeCompanionSizes) {
    this.creativeCompanionSizes = creativeCompanionSizes;
    return this;
  }

  /**
   * The size of the creative.
   * @return value or {@code null} for none
   */
  public AdSize getCreativeSize() {
    return creativeSize;
  }

  /**
   * The size of the creative.
   * @param creativeSize creativeSize or {@code null} for none
   */
  public CreativeSpecification setCreativeSize(AdSize creativeSize) {
    this.creativeSize = creativeSize;
    return this;
  }

  @Override
  public CreativeSpecification set(String fieldName, Object value) {
    return (CreativeSpecification) super.set(fieldName, value);
  }

  @Override
  public CreativeSpecification clone() {
    return (CreativeSpecification) super.clone();
  }

}
