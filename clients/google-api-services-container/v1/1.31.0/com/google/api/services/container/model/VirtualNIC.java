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

package com.google.api.services.container.model;

/**
 * Configuration of gVNIC feature.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Kubernetes Engine API. For a detailed explanation
 * see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class VirtualNIC extends com.google.api.client.json.GenericJson {

  /**
   * Whether gVNIC features are enabled in the node pool.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean enabled;

  /**
   * Whether gVNIC features are enabled in the node pool.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getEnabled() {
    return enabled;
  }

  /**
   * Whether gVNIC features are enabled in the node pool.
   * @param enabled enabled or {@code null} for none
   */
  public VirtualNIC setEnabled(java.lang.Boolean enabled) {
    this.enabled = enabled;
    return this;
  }

  @Override
  public VirtualNIC set(String fieldName, Object value) {
    return (VirtualNIC) super.set(fieldName, value);
  }

  @Override
  public VirtualNIC clone() {
    return (VirtualNIC) super.clone();
  }

}
