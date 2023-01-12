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

package com.google.api.services.integrations.v1.model;

/**
 * Request for [Suspensions.ResolveSuspensions].
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Application Integration API. For a detailed
 * explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class GoogleCloudIntegrationsV1alphaResolveSuspensionRequest extends com.google.api.client.json.GenericJson {

  /**
   * Suspension, containing the event_execution_info_id, task_id, and state to set on the
   * corresponding suspension record.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private GoogleCloudIntegrationsV1alphaSuspension suspension;

  /**
   * Suspension, containing the event_execution_info_id, task_id, and state to set on the
   * corresponding suspension record.
   * @return value or {@code null} for none
   */
  public GoogleCloudIntegrationsV1alphaSuspension getSuspension() {
    return suspension;
  }

  /**
   * Suspension, containing the event_execution_info_id, task_id, and state to set on the
   * corresponding suspension record.
   * @param suspension suspension or {@code null} for none
   */
  public GoogleCloudIntegrationsV1alphaResolveSuspensionRequest setSuspension(GoogleCloudIntegrationsV1alphaSuspension suspension) {
    this.suspension = suspension;
    return this;
  }

  @Override
  public GoogleCloudIntegrationsV1alphaResolveSuspensionRequest set(String fieldName, Object value) {
    return (GoogleCloudIntegrationsV1alphaResolveSuspensionRequest) super.set(fieldName, value);
  }

  @Override
  public GoogleCloudIntegrationsV1alphaResolveSuspensionRequest clone() {
    return (GoogleCloudIntegrationsV1alphaResolveSuspensionRequest) super.clone();
  }

}