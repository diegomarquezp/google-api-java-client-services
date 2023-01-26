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

package com.google.api.services.searchads360.v0.model;

/**
 * Response message for SearchAds360FieldService.SearchSearchAds360Fields.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Search Ads 360 Reporting API. For a detailed
 * explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class GoogleAdsSearchads360V0ServicesSearchSearchAds360FieldsResponse extends com.google.api.client.json.GenericJson {

  /**
   * Pagination token used to retrieve the next page of results. Pass the content of this string as
   * the `page_token` attribute of the next request. `next_page_token` is not returned for the last
   * page.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String nextPageToken;

  /**
   * The list of fields that matched the query.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<GoogleAdsSearchads360V0ResourcesSearchAds360Field> results;

  static {
    // hack to force ProGuard to consider GoogleAdsSearchads360V0ResourcesSearchAds360Field used, since otherwise it would be stripped out
    // see https://github.com/google/google-api-java-client/issues/543
    com.google.api.client.util.Data.nullOf(GoogleAdsSearchads360V0ResourcesSearchAds360Field.class);
  }

  /**
   * Total number of results that match the query ignoring the LIMIT clause.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key @com.google.api.client.json.JsonString
  private java.lang.Long totalResultsCount;

  /**
   * Pagination token used to retrieve the next page of results. Pass the content of this string as
   * the `page_token` attribute of the next request. `next_page_token` is not returned for the last
   * page.
   * @return value or {@code null} for none
   */
  public java.lang.String getNextPageToken() {
    return nextPageToken;
  }

  /**
   * Pagination token used to retrieve the next page of results. Pass the content of this string as
   * the `page_token` attribute of the next request. `next_page_token` is not returned for the last
   * page.
   * @param nextPageToken nextPageToken or {@code null} for none
   */
  public GoogleAdsSearchads360V0ServicesSearchSearchAds360FieldsResponse setNextPageToken(java.lang.String nextPageToken) {
    this.nextPageToken = nextPageToken;
    return this;
  }

  /**
   * The list of fields that matched the query.
   * @return value or {@code null} for none
   */
  public java.util.List<GoogleAdsSearchads360V0ResourcesSearchAds360Field> getResults() {
    return results;
  }

  /**
   * The list of fields that matched the query.
   * @param results results or {@code null} for none
   */
  public GoogleAdsSearchads360V0ServicesSearchSearchAds360FieldsResponse setResults(java.util.List<GoogleAdsSearchads360V0ResourcesSearchAds360Field> results) {
    this.results = results;
    return this;
  }

  /**
   * Total number of results that match the query ignoring the LIMIT clause.
   * @return value or {@code null} for none
   */
  public java.lang.Long getTotalResultsCount() {
    return totalResultsCount;
  }

  /**
   * Total number of results that match the query ignoring the LIMIT clause.
   * @param totalResultsCount totalResultsCount or {@code null} for none
   */
  public GoogleAdsSearchads360V0ServicesSearchSearchAds360FieldsResponse setTotalResultsCount(java.lang.Long totalResultsCount) {
    this.totalResultsCount = totalResultsCount;
    return this;
  }

  @Override
  public GoogleAdsSearchads360V0ServicesSearchSearchAds360FieldsResponse set(String fieldName, Object value) {
    return (GoogleAdsSearchads360V0ServicesSearchSearchAds360FieldsResponse) super.set(fieldName, value);
  }

  @Override
  public GoogleAdsSearchads360V0ServicesSearchSearchAds360FieldsResponse clone() {
    return (GoogleAdsSearchads360V0ServicesSearchSearchAds360FieldsResponse) super.clone();
  }

}