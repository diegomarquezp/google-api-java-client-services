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
 * Represents the information of a namespace
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
public final class Namespace extends com.google.api.client.json.GenericJson {

  /**
   * IAM policy associated with this namespace.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private IAMPolicy iamPolicy;

  /**
   * Name of the given namespace.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String name;

  /**
   * IAM policy associated with this namespace.
   * @return value or {@code null} for none
   */
  public IAMPolicy getIamPolicy() {
    return iamPolicy;
  }

  /**
   * IAM policy associated with this namespace.
   * @param iamPolicy iamPolicy or {@code null} for none
   */
  public Namespace setIamPolicy(IAMPolicy iamPolicy) {
    this.iamPolicy = iamPolicy;
    return this;
  }

  /**
   * Name of the given namespace.
   * @return value or {@code null} for none
   */
  public java.lang.String getName() {
    return name;
  }

  /**
   * Name of the given namespace.
   * @param name name or {@code null} for none
   */
  public Namespace setName(java.lang.String name) {
    this.name = name;
    return this;
  }

  @Override
  public Namespace set(String fieldName, Object value) {
    return (Namespace) super.set(fieldName, value);
  }

  @Override
  public Namespace clone() {
    return (Namespace) super.clone();
  }

}
