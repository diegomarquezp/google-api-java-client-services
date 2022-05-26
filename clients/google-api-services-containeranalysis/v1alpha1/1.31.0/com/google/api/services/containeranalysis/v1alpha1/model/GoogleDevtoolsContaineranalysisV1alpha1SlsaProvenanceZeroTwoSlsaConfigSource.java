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

package com.google.api.services.containeranalysis.v1alpha1.model;

/**
 * Describes where the config file that kicked off the build came from. This is effectively a
 * pointer to the source where buildConfig came from.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Container Analysis API. For a detailed explanation
 * see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class GoogleDevtoolsContaineranalysisV1alpha1SlsaProvenanceZeroTwoSlsaConfigSource extends com.google.api.client.json.GenericJson {

  /**
   * Collection of cryptographic digests for the contents of the artifact specified by
   * invocation.configSource.uri.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.Map<String, java.lang.String> digest;

  /**
   * String identifying the entry point into the build.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String entryPoint;

  /**
   * URI indicating the identity of the source of the config.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String uri;

  /**
   * Collection of cryptographic digests for the contents of the artifact specified by
   * invocation.configSource.uri.
   * @return value or {@code null} for none
   */
  public java.util.Map<String, java.lang.String> getDigest() {
    return digest;
  }

  /**
   * Collection of cryptographic digests for the contents of the artifact specified by
   * invocation.configSource.uri.
   * @param digest digest or {@code null} for none
   */
  public GoogleDevtoolsContaineranalysisV1alpha1SlsaProvenanceZeroTwoSlsaConfigSource setDigest(java.util.Map<String, java.lang.String> digest) {
    this.digest = digest;
    return this;
  }

  /**
   * String identifying the entry point into the build.
   * @return value or {@code null} for none
   */
  public java.lang.String getEntryPoint() {
    return entryPoint;
  }

  /**
   * String identifying the entry point into the build.
   * @param entryPoint entryPoint or {@code null} for none
   */
  public GoogleDevtoolsContaineranalysisV1alpha1SlsaProvenanceZeroTwoSlsaConfigSource setEntryPoint(java.lang.String entryPoint) {
    this.entryPoint = entryPoint;
    return this;
  }

  /**
   * URI indicating the identity of the source of the config.
   * @return value or {@code null} for none
   */
  public java.lang.String getUri() {
    return uri;
  }

  /**
   * URI indicating the identity of the source of the config.
   * @param uri uri or {@code null} for none
   */
  public GoogleDevtoolsContaineranalysisV1alpha1SlsaProvenanceZeroTwoSlsaConfigSource setUri(java.lang.String uri) {
    this.uri = uri;
    return this;
  }

  @Override
  public GoogleDevtoolsContaineranalysisV1alpha1SlsaProvenanceZeroTwoSlsaConfigSource set(String fieldName, Object value) {
    return (GoogleDevtoolsContaineranalysisV1alpha1SlsaProvenanceZeroTwoSlsaConfigSource) super.set(fieldName, value);
  }

  @Override
  public GoogleDevtoolsContaineranalysisV1alpha1SlsaProvenanceZeroTwoSlsaConfigSource clone() {
    return (GoogleDevtoolsContaineranalysisV1alpha1SlsaProvenanceZeroTwoSlsaConfigSource) super.clone();
  }

}
