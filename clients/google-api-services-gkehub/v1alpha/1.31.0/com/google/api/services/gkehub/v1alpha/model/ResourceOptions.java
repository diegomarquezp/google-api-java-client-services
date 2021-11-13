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

package com.google.api.services.gkehub.v1alpha.model;

/**
 * ResourceOptions represent options for Kubernetes resource generation.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the GKE Hub API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class ResourceOptions extends com.google.api.client.json.GenericJson {

  /**
   * Optional. The Connect agent version to use for connect_resources. Defaults to the latest GKE
   * Connect version. The version must be a currently supported version, obsolete versions will be
   * rejected.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String connectVersion;

  /**
   * Optional. Use `apiextensions/v1beta1` instead of `apiextensions/v1` for
   * CustomResourceDefinition resources. This option should be set for clusters with Kubernetes
   * apiserver versions <1.16.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean v1beta1Crd;

  /**
   * Optional. The Connect agent version to use for connect_resources. Defaults to the latest GKE
   * Connect version. The version must be a currently supported version, obsolete versions will be
   * rejected.
   * @return value or {@code null} for none
   */
  public java.lang.String getConnectVersion() {
    return connectVersion;
  }

  /**
   * Optional. The Connect agent version to use for connect_resources. Defaults to the latest GKE
   * Connect version. The version must be a currently supported version, obsolete versions will be
   * rejected.
   * @param connectVersion connectVersion or {@code null} for none
   */
  public ResourceOptions setConnectVersion(java.lang.String connectVersion) {
    this.connectVersion = connectVersion;
    return this;
  }

  /**
   * Optional. Use `apiextensions/v1beta1` instead of `apiextensions/v1` for
   * CustomResourceDefinition resources. This option should be set for clusters with Kubernetes
   * apiserver versions <1.16.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getV1beta1Crd() {
    return v1beta1Crd;
  }

  /**
   * Optional. Use `apiextensions/v1beta1` instead of `apiextensions/v1` for
   * CustomResourceDefinition resources. This option should be set for clusters with Kubernetes
   * apiserver versions <1.16.
   * @param v1beta1Crd v1beta1Crd or {@code null} for none
   */
  public ResourceOptions setV1beta1Crd(java.lang.Boolean v1beta1Crd) {
    this.v1beta1Crd = v1beta1Crd;
    return this;
  }

  @Override
  public ResourceOptions set(String fieldName, Object value) {
    return (ResourceOptions) super.set(fieldName, value);
  }

  @Override
  public ResourceOptions clone() {
    return (ResourceOptions) super.clone();
  }

}
