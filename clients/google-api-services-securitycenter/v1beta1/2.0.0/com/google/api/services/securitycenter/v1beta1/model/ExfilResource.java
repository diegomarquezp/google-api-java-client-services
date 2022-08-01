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

package com.google.api.services.securitycenter.v1beta1.model;

/**
 * Resource that has been exfiltrated or exfiltrated_to.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Security Command Center API. For a detailed
 * explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class ExfilResource extends com.google.api.client.json.GenericJson {

  /**
   * Subcomponents of the asset that is exfiltrated - these could be URIs used during exfiltration,
   * table names, databases, filenames, etc. For example, multiple tables may be exfiltrated from
   * the same CloudSQL instance, or multiple files from the same Cloud Storage bucket.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<java.lang.String> components;

  /**
   * Resource's URI (https://google.aip.dev/122#full-resource-names)
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String name;

  /**
   * Subcomponents of the asset that is exfiltrated - these could be URIs used during exfiltration,
   * table names, databases, filenames, etc. For example, multiple tables may be exfiltrated from
   * the same CloudSQL instance, or multiple files from the same Cloud Storage bucket.
   * @return value or {@code null} for none
   */
  public java.util.List<java.lang.String> getComponents() {
    return components;
  }

  /**
   * Subcomponents of the asset that is exfiltrated - these could be URIs used during exfiltration,
   * table names, databases, filenames, etc. For example, multiple tables may be exfiltrated from
   * the same CloudSQL instance, or multiple files from the same Cloud Storage bucket.
   * @param components components or {@code null} for none
   */
  public ExfilResource setComponents(java.util.List<java.lang.String> components) {
    this.components = components;
    return this;
  }

  /**
   * Resource's URI (https://google.aip.dev/122#full-resource-names)
   * @return value or {@code null} for none
   */
  public java.lang.String getName() {
    return name;
  }

  /**
   * Resource's URI (https://google.aip.dev/122#full-resource-names)
   * @param name name or {@code null} for none
   */
  public ExfilResource setName(java.lang.String name) {
    this.name = name;
    return this;
  }

  @Override
  public ExfilResource set(String fieldName, Object value) {
    return (ExfilResource) super.set(fieldName, value);
  }

  @Override
  public ExfilResource clone() {
    return (ExfilResource) super.clone();
  }

}
