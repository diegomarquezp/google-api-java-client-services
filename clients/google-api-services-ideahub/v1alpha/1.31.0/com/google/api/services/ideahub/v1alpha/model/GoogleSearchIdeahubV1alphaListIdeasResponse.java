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

package com.google.api.services.ideahub.v1alpha.model;

/**
 * Model definition for GoogleSearchIdeahubV1alphaListIdeasResponse.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Idea Hub API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class GoogleSearchIdeahubV1alphaListIdeasResponse extends com.google.api.client.json.GenericJson {

  /**
   * Results for the ListIdeasRequest.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<GoogleSearchIdeahubV1alphaIdea> ideas;

  static {
    // hack to force ProGuard to consider GoogleSearchIdeahubV1alphaIdea used, since otherwise it would be stripped out
    // see https://github.com/google/google-api-java-client/issues/543
    com.google.api.client.util.Data.nullOf(GoogleSearchIdeahubV1alphaIdea.class);
  }

  /**
   * Used to fetch the next page in a subsequent request.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String nextPageToken;

  /**
   * Results for the ListIdeasRequest.
   * @return value or {@code null} for none
   */
  public java.util.List<GoogleSearchIdeahubV1alphaIdea> getIdeas() {
    return ideas;
  }

  /**
   * Results for the ListIdeasRequest.
   * @param ideas ideas or {@code null} for none
   */
  public GoogleSearchIdeahubV1alphaListIdeasResponse setIdeas(java.util.List<GoogleSearchIdeahubV1alphaIdea> ideas) {
    this.ideas = ideas;
    return this;
  }

  /**
   * Used to fetch the next page in a subsequent request.
   * @return value or {@code null} for none
   */
  public java.lang.String getNextPageToken() {
    return nextPageToken;
  }

  /**
   * Used to fetch the next page in a subsequent request.
   * @param nextPageToken nextPageToken or {@code null} for none
   */
  public GoogleSearchIdeahubV1alphaListIdeasResponse setNextPageToken(java.lang.String nextPageToken) {
    this.nextPageToken = nextPageToken;
    return this;
  }

  @Override
  public GoogleSearchIdeahubV1alphaListIdeasResponse set(String fieldName, Object value) {
    return (GoogleSearchIdeahubV1alphaListIdeasResponse) super.set(fieldName, value);
  }

  @Override
  public GoogleSearchIdeahubV1alphaListIdeasResponse clone() {
    return (GoogleSearchIdeahubV1alphaListIdeasResponse) super.clone();
  }

}
