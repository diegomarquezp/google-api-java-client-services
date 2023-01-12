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
 * LINT.IfChange This message is used for processing and persisting (when applicable) key value pair
 * parameters for each event in the event bus. Please see go/integration-platform/event_bus.md for
 * more details. Next id: 4
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
public final class EnterpriseCrmFrontendsEventbusProtoEventParameters extends com.google.api.client.json.GenericJson {

  /**
   * Parameters are a part of Event and can be used to communicate between different tasks that are
   * part of the same workflow execution.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<EnterpriseCrmFrontendsEventbusProtoParameterEntry> parameters;

  /**
   * Parameters are a part of Event and can be used to communicate between different tasks that are
   * part of the same workflow execution.
   * @return value or {@code null} for none
   */
  public java.util.List<EnterpriseCrmFrontendsEventbusProtoParameterEntry> getParameters() {
    return parameters;
  }

  /**
   * Parameters are a part of Event and can be used to communicate between different tasks that are
   * part of the same workflow execution.
   * @param parameters parameters or {@code null} for none
   */
  public EnterpriseCrmFrontendsEventbusProtoEventParameters setParameters(java.util.List<EnterpriseCrmFrontendsEventbusProtoParameterEntry> parameters) {
    this.parameters = parameters;
    return this;
  }

  @Override
  public EnterpriseCrmFrontendsEventbusProtoEventParameters set(String fieldName, Object value) {
    return (EnterpriseCrmFrontendsEventbusProtoEventParameters) super.set(fieldName, value);
  }

  @Override
  public EnterpriseCrmFrontendsEventbusProtoEventParameters clone() {
    return (EnterpriseCrmFrontendsEventbusProtoEventParameters) super.clone();
  }

}