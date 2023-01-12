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

package com.google.api.services.discoveryengine.v1beta.model;

/**
 * Indicates a location in the source code of the service for which errors are reported.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Discovery Engine API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class GoogleCloudDiscoveryengineLoggingSourceLocation extends com.google.api.client.json.GenericJson {

  /**
   * Human-readable name of a function or method. For example, "
   * google.cloud.discoveryengine.v1alpha.RecommendationService.Recommend".
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String functionName;

  /**
   * Human-readable name of a function or method. For example, "
   * google.cloud.discoveryengine.v1alpha.RecommendationService.Recommend".
   * @return value or {@code null} for none
   */
  public java.lang.String getFunctionName() {
    return functionName;
  }

  /**
   * Human-readable name of a function or method. For example, "
   * google.cloud.discoveryengine.v1alpha.RecommendationService.Recommend".
   * @param functionName functionName or {@code null} for none
   */
  public GoogleCloudDiscoveryengineLoggingSourceLocation setFunctionName(java.lang.String functionName) {
    this.functionName = functionName;
    return this;
  }

  @Override
  public GoogleCloudDiscoveryengineLoggingSourceLocation set(String fieldName, Object value) {
    return (GoogleCloudDiscoveryengineLoggingSourceLocation) super.set(fieldName, value);
  }

  @Override
  public GoogleCloudDiscoveryengineLoggingSourceLocation clone() {
    return (GoogleCloudDiscoveryengineLoggingSourceLocation) super.clone();
  }

}