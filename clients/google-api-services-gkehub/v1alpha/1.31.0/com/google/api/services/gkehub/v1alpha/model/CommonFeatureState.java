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
 * CommonFeatureState contains Hub-wide Feature status information.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the GKE Hub API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class CommonFeatureState extends com.google.api.client.json.GenericJson {

  /**
   * Appdevexperience specific state.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private AppDevExperienceFeatureState appdevexperience;

  /**
   * Service Mesh-specific state.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private ServiceMeshFeatureState servicemesh;

  /**
   * Output only. The "running state" of the Feature in this Hub.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private FeatureState state;

  /**
   * Appdevexperience specific state.
   * @return value or {@code null} for none
   */
  public AppDevExperienceFeatureState getAppdevexperience() {
    return appdevexperience;
  }

  /**
   * Appdevexperience specific state.
   * @param appdevexperience appdevexperience or {@code null} for none
   */
  public CommonFeatureState setAppdevexperience(AppDevExperienceFeatureState appdevexperience) {
    this.appdevexperience = appdevexperience;
    return this;
  }

  /**
   * Service Mesh-specific state.
   * @return value or {@code null} for none
   */
  public ServiceMeshFeatureState getServicemesh() {
    return servicemesh;
  }

  /**
   * Service Mesh-specific state.
   * @param servicemesh servicemesh or {@code null} for none
   */
  public CommonFeatureState setServicemesh(ServiceMeshFeatureState servicemesh) {
    this.servicemesh = servicemesh;
    return this;
  }

  /**
   * Output only. The "running state" of the Feature in this Hub.
   * @return value or {@code null} for none
   */
  public FeatureState getState() {
    return state;
  }

  /**
   * Output only. The "running state" of the Feature in this Hub.
   * @param state state or {@code null} for none
   */
  public CommonFeatureState setState(FeatureState state) {
    this.state = state;
    return this;
  }

  @Override
  public CommonFeatureState set(String fieldName, Object value) {
    return (CommonFeatureState) super.set(fieldName, value);
  }

  @Override
  public CommonFeatureState clone() {
    return (CommonFeatureState) super.clone();
  }

}
