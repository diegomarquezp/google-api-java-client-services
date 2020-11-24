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

package com.google.api.services.websecurityscanner.v1alpha.model;

/**
 * Information regarding any resource causing the vulnerability such as JavaScript sources, image,
 * audio files, etc.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Web Security Scanner API. For a detailed explanation
 * see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class ViolatingResource extends com.google.api.client.json.GenericJson {

  /**
   * The MIME type of this resource.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String contentType;

  /**
   * URL of this violating resource.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String resourceUrl;

  /**
   * The MIME type of this resource.
   * @return value or {@code null} for none
   */
  public java.lang.String getContentType() {
    return contentType;
  }

  /**
   * The MIME type of this resource.
   * @param contentType contentType or {@code null} for none
   */
  public ViolatingResource setContentType(java.lang.String contentType) {
    this.contentType = contentType;
    return this;
  }

  /**
   * URL of this violating resource.
   * @return value or {@code null} for none
   */
  public java.lang.String getResourceUrl() {
    return resourceUrl;
  }

  /**
   * URL of this violating resource.
   * @param resourceUrl resourceUrl or {@code null} for none
   */
  public ViolatingResource setResourceUrl(java.lang.String resourceUrl) {
    this.resourceUrl = resourceUrl;
    return this;
  }

  @Override
  public ViolatingResource set(String fieldName, Object value) {
    return (ViolatingResource) super.set(fieldName, value);
  }

  @Override
  public ViolatingResource clone() {
    return (ViolatingResource) super.clone();
  }

}
