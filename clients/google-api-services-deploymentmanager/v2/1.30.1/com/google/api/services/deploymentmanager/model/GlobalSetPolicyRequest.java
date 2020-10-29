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
 * Model definition for GlobalSetPolicyRequest.
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
public final class GlobalSetPolicyRequest extends com.google.api.client.json.GenericJson {

  /**
   * Flatten Policy to create a backward compatible wire-format. Deprecated. Use 'policy' to specify
   * bindings.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<Binding> bindings;

  static {
    // hack to force ProGuard to consider Binding used, since otherwise it would be stripped out
    // see https://github.com/google/google-api-java-client/issues/543
    com.google.api.client.util.Data.nullOf(Binding.class);
  }

  /**
   * Flatten Policy to create a backward compatible wire-format. Deprecated. Use 'policy' to specify
   * the etag.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String etag;

  /**
   * REQUIRED: The complete policy to be applied to the 'resource'. The size of the policy is
   * limited to a few 10s of KB. An empty policy is in general a valid policy but certain services
   * (like Projects) might reject them.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private Policy policy;

  /**
   * Flatten Policy to create a backward compatible wire-format. Deprecated. Use 'policy' to specify
   * bindings.
   * @return value or {@code null} for none
   */
  public java.util.List<Binding> getBindings() {
    return bindings;
  }

  /**
   * Flatten Policy to create a backward compatible wire-format. Deprecated. Use 'policy' to specify
   * bindings.
   * @param bindings bindings or {@code null} for none
   */
  public GlobalSetPolicyRequest setBindings(java.util.List<Binding> bindings) {
    this.bindings = bindings;
    return this;
  }

  /**
   * Flatten Policy to create a backward compatible wire-format. Deprecated. Use 'policy' to specify
   * the etag.
   * @see #decodeEtag()
   * @return value or {@code null} for none
   */
  public java.lang.String getEtag() {
    return etag;
  }

  /**
   * Flatten Policy to create a backward compatible wire-format. Deprecated. Use 'policy' to specify
   * the etag.
   * @see #getEtag()
   * @return Base64 decoded value or {@code null} for none
   *
   * @since 1.14
   */
  public byte[] decodeEtag() {
    return com.google.api.client.util.Base64.decodeBase64(etag);
  }

  /**
   * Flatten Policy to create a backward compatible wire-format. Deprecated. Use 'policy' to specify
   * the etag.
   * @see #encodeEtag()
   * @param etag etag or {@code null} for none
   */
  public GlobalSetPolicyRequest setEtag(java.lang.String etag) {
    this.etag = etag;
    return this;
  }

  /**
   * Flatten Policy to create a backward compatible wire-format. Deprecated. Use 'policy' to specify
   * the etag.
   * @see #setEtag()
   *
   * <p>
   * The value is encoded Base64 or {@code null} for none.
   * </p>
   *
   * @since 1.14
   */
  public GlobalSetPolicyRequest encodeEtag(byte[] etag) {
    this.etag = com.google.api.client.util.Base64.encodeBase64URLSafeString(etag);
    return this;
  }

  /**
   * REQUIRED: The complete policy to be applied to the 'resource'. The size of the policy is
   * limited to a few 10s of KB. An empty policy is in general a valid policy but certain services
   * (like Projects) might reject them.
   * @return value or {@code null} for none
   */
  public Policy getPolicy() {
    return policy;
  }

  /**
   * REQUIRED: The complete policy to be applied to the 'resource'. The size of the policy is
   * limited to a few 10s of KB. An empty policy is in general a valid policy but certain services
   * (like Projects) might reject them.
   * @param policy policy or {@code null} for none
   */
  public GlobalSetPolicyRequest setPolicy(Policy policy) {
    this.policy = policy;
    return this;
  }

  @Override
  public GlobalSetPolicyRequest set(String fieldName, Object value) {
    return (GlobalSetPolicyRequest) super.set(fieldName, value);
  }

  @Override
  public GlobalSetPolicyRequest clone() {
    return (GlobalSetPolicyRequest) super.clone();
  }

}
