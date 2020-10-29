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

package com.google.api.services.deploymentmanager.model;

/**
 * A response that returns all Type Providers supported by Deployment Manager
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Cloud Deployment Manager V2 API. For a detailed
 * explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class TypeProvidersListResponse extends com.google.api.client.json.GenericJson {

  /**
   * A token used to continue a truncated list request.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String nextPageToken;

  /**
   * Output only. A list of resource type providers supported by Deployment Manager.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<TypeProvider> typeProviders;

  static {
    // hack to force ProGuard to consider TypeProvider used, since otherwise it would be stripped out
    // see https://github.com/google/google-api-java-client/issues/543
    com.google.api.client.util.Data.nullOf(TypeProvider.class);
  }

  /**
   * A token used to continue a truncated list request.
   * @return value or {@code null} for none
   */
  public java.lang.String getNextPageToken() {
    return nextPageToken;
  }

  /**
   * A token used to continue a truncated list request.
   * @param nextPageToken nextPageToken or {@code null} for none
   */
  public TypeProvidersListResponse setNextPageToken(java.lang.String nextPageToken) {
    this.nextPageToken = nextPageToken;
    return this;
  }

  /**
   * Output only. A list of resource type providers supported by Deployment Manager.
   * @return value or {@code null} for none
   */
  public java.util.List<TypeProvider> getTypeProviders() {
    return typeProviders;
  }

  /**
   * Output only. A list of resource type providers supported by Deployment Manager.
   * @param typeProviders typeProviders or {@code null} for none
   */
  public TypeProvidersListResponse setTypeProviders(java.util.List<TypeProvider> typeProviders) {
    this.typeProviders = typeProviders;
    return this;
  }

  @Override
  public TypeProvidersListResponse set(String fieldName, Object value) {
    return (TypeProvidersListResponse) super.set(fieldName, value);
  }

  @Override
  public TypeProvidersListResponse clone() {
    return (TypeProvidersListResponse) super.clone();
  }

}
