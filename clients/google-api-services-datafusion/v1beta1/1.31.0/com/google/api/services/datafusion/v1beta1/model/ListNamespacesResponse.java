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

package com.google.api.services.datafusion.v1beta1.model;

/**
 * List namespaces response.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Cloud Data Fusion API. For a detailed explanation
 * see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class ListNamespacesResponse extends com.google.api.client.json.GenericJson {

  /**
   * List of namespaces
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<Namespace> namespaces;

  /**
   * Token to retrieve the next page of results or empty if there are no more results in the list.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String nextPageToken;

  /**
   * List of namespaces
   * @return value or {@code null} for none
   */
  public java.util.List<Namespace> getNamespaces() {
    return namespaces;
  }

  /**
   * List of namespaces
   * @param namespaces namespaces or {@code null} for none
   */
  public ListNamespacesResponse setNamespaces(java.util.List<Namespace> namespaces) {
    this.namespaces = namespaces;
    return this;
  }

  /**
   * Token to retrieve the next page of results or empty if there are no more results in the list.
   * @return value or {@code null} for none
   */
  public java.lang.String getNextPageToken() {
    return nextPageToken;
  }

  /**
   * Token to retrieve the next page of results or empty if there are no more results in the list.
   * @param nextPageToken nextPageToken or {@code null} for none
   */
  public ListNamespacesResponse setNextPageToken(java.lang.String nextPageToken) {
    this.nextPageToken = nextPageToken;
    return this;
  }

  @Override
  public ListNamespacesResponse set(String fieldName, Object value) {
    return (ListNamespacesResponse) super.set(fieldName, value);
  }

  @Override
  public ListNamespacesResponse clone() {
    return (ListNamespacesResponse) super.clone();
  }

}
