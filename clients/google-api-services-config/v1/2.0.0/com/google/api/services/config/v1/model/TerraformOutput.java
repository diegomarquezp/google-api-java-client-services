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

package com.google.api.services.config.v1.model;

/**
 * Describes a Terraform output.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Infrastructure Manager API. For a detailed
 * explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class TerraformOutput extends com.google.api.client.json.GenericJson {

  /**
   * Identifies whether Terraform has set this output as a potential sensitive value.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean sensitive;

  /**
   * Value of output.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Object value;

  /**
   * Identifies whether Terraform has set this output as a potential sensitive value.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getSensitive() {
    return sensitive;
  }

  /**
   * Identifies whether Terraform has set this output as a potential sensitive value.
   * @param sensitive sensitive or {@code null} for none
   */
  public TerraformOutput setSensitive(java.lang.Boolean sensitive) {
    this.sensitive = sensitive;
    return this;
  }

  /**
   * Value of output.
   * @return value or {@code null} for none
   */
  public java.lang.Object getValue() {
    return value;
  }

  /**
   * Value of output.
   * @param value value or {@code null} for none
   */
  public TerraformOutput setValue(java.lang.Object value) {
    this.value = value;
    return this;
  }

  @Override
  public TerraformOutput set(String fieldName, Object value) {
    return (TerraformOutput) super.set(fieldName, value);
  }

  @Override
  public TerraformOutput clone() {
    return (TerraformOutput) super.clone();
  }

}
