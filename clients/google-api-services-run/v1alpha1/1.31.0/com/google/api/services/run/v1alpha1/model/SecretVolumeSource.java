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

package com.google.api.services.run.v1alpha1.model;

/**
 * The secret's value will be presented as the content of a file whose name is defined in the item
 * path. If no items are defined, the name of the file is the secret_name. The contents of the
 * target Secret's Data field will be presented in a volume as files using the keys in the Data
 * field as the file names.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Cloud Run Admin API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class SecretVolumeSource extends com.google.api.client.json.GenericJson {

  /**
   * Integer representation of mode bits to use on created files by default. Must be a value between
   * 01 and 0777 (octal). If 0 or not set, it will default to 0644. Directories within the path are
   * not affected by this setting. Notes * Internally, a umask of 0222 will be applied to any non-
   * zero value. * This is an integer representation of the mode bits. So, the octal integer value
   * should look exactly as the chmod numeric notation with a leading zero. Some examples: for chmod
   * 777 (a=rwx), set to 0777 (octal) or 511 (base-10). For chmod 640 (u=rw,g=r), set to 0640
   * (octal) or 416 (base-10). For chmod 755 (u=rwx,g=rx,o=rx), set to 0755 (octal) or 493
   * (base-10). * This might be in conflict with other options that affect the file mode, like
   * fsGroup, and the result can be other mode bits set.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Integer defaultMode;

  /**
   * (Optional) If unspecified, the volume will expose a file whose name is the secret_name. If
   * specified, the key will be used as the version to fetch from Cloud Secret Manager and the path
   * will be the name of the file exposed in the volume. When items are defined, they must specify a
   * key and a path. If unspecified, each key-value pair in the Data field of the referenced Secret
   * will be projected into the volume as a file whose name is the key and content is the value. If
   * specified, the listed keys will be projected into the specified paths, and unlisted keys will
   * not be present. If a key is specified that is not present in the Secret, the volume setup will
   * error unless it is marked optional.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<KeyToPath> items;

  static {
    // hack to force ProGuard to consider KeyToPath used, since otherwise it would be stripped out
    // see https://github.com/google/google-api-java-client/issues/543
    com.google.api.client.util.Data.nullOf(KeyToPath.class);
  }

  /**
   * (Optional) Specify whether the Secret or its keys must be defined.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean optional;

  /**
   * The name of the secret in Cloud Secret Manager. By default, the secret is assumed to be in the
   * same project. If the secret is in another project, you must define an alias. An alias
   * definition has the form: :projects//secrets/. If multiple alias definitions are needed, they
   * must be separated by commas. The alias definitions must be set on the
   * run.googleapis.com/secrets annotation. Name of the secret in the container's namespace to use.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String secretName;

  /**
   * Integer representation of mode bits to use on created files by default. Must be a value between
   * 01 and 0777 (octal). If 0 or not set, it will default to 0644. Directories within the path are
   * not affected by this setting. Notes * Internally, a umask of 0222 will be applied to any non-
   * zero value. * This is an integer representation of the mode bits. So, the octal integer value
   * should look exactly as the chmod numeric notation with a leading zero. Some examples: for chmod
   * 777 (a=rwx), set to 0777 (octal) or 511 (base-10). For chmod 640 (u=rw,g=r), set to 0640
   * (octal) or 416 (base-10). For chmod 755 (u=rwx,g=rx,o=rx), set to 0755 (octal) or 493
   * (base-10). * This might be in conflict with other options that affect the file mode, like
   * fsGroup, and the result can be other mode bits set.
   * @return value or {@code null} for none
   */
  public java.lang.Integer getDefaultMode() {
    return defaultMode;
  }

  /**
   * Integer representation of mode bits to use on created files by default. Must be a value between
   * 01 and 0777 (octal). If 0 or not set, it will default to 0644. Directories within the path are
   * not affected by this setting. Notes * Internally, a umask of 0222 will be applied to any non-
   * zero value. * This is an integer representation of the mode bits. So, the octal integer value
   * should look exactly as the chmod numeric notation with a leading zero. Some examples: for chmod
   * 777 (a=rwx), set to 0777 (octal) or 511 (base-10). For chmod 640 (u=rw,g=r), set to 0640
   * (octal) or 416 (base-10). For chmod 755 (u=rwx,g=rx,o=rx), set to 0755 (octal) or 493
   * (base-10). * This might be in conflict with other options that affect the file mode, like
   * fsGroup, and the result can be other mode bits set.
   * @param defaultMode defaultMode or {@code null} for none
   */
  public SecretVolumeSource setDefaultMode(java.lang.Integer defaultMode) {
    this.defaultMode = defaultMode;
    return this;
  }

  /**
   * (Optional) If unspecified, the volume will expose a file whose name is the secret_name. If
   * specified, the key will be used as the version to fetch from Cloud Secret Manager and the path
   * will be the name of the file exposed in the volume. When items are defined, they must specify a
   * key and a path. If unspecified, each key-value pair in the Data field of the referenced Secret
   * will be projected into the volume as a file whose name is the key and content is the value. If
   * specified, the listed keys will be projected into the specified paths, and unlisted keys will
   * not be present. If a key is specified that is not present in the Secret, the volume setup will
   * error unless it is marked optional.
   * @return value or {@code null} for none
   */
  public java.util.List<KeyToPath> getItems() {
    return items;
  }

  /**
   * (Optional) If unspecified, the volume will expose a file whose name is the secret_name. If
   * specified, the key will be used as the version to fetch from Cloud Secret Manager and the path
   * will be the name of the file exposed in the volume. When items are defined, they must specify a
   * key and a path. If unspecified, each key-value pair in the Data field of the referenced Secret
   * will be projected into the volume as a file whose name is the key and content is the value. If
   * specified, the listed keys will be projected into the specified paths, and unlisted keys will
   * not be present. If a key is specified that is not present in the Secret, the volume setup will
   * error unless it is marked optional.
   * @param items items or {@code null} for none
   */
  public SecretVolumeSource setItems(java.util.List<KeyToPath> items) {
    this.items = items;
    return this;
  }

  /**
   * (Optional) Specify whether the Secret or its keys must be defined.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getOptional() {
    return optional;
  }

  /**
   * (Optional) Specify whether the Secret or its keys must be defined.
   * @param optional optional or {@code null} for none
   */
  public SecretVolumeSource setOptional(java.lang.Boolean optional) {
    this.optional = optional;
    return this;
  }

  /**
   * The name of the secret in Cloud Secret Manager. By default, the secret is assumed to be in the
   * same project. If the secret is in another project, you must define an alias. An alias
   * definition has the form: :projects//secrets/. If multiple alias definitions are needed, they
   * must be separated by commas. The alias definitions must be set on the
   * run.googleapis.com/secrets annotation. Name of the secret in the container's namespace to use.
   * @return value or {@code null} for none
   */
  public java.lang.String getSecretName() {
    return secretName;
  }

  /**
   * The name of the secret in Cloud Secret Manager. By default, the secret is assumed to be in the
   * same project. If the secret is in another project, you must define an alias. An alias
   * definition has the form: :projects//secrets/. If multiple alias definitions are needed, they
   * must be separated by commas. The alias definitions must be set on the
   * run.googleapis.com/secrets annotation. Name of the secret in the container's namespace to use.
   * @param secretName secretName or {@code null} for none
   */
  public SecretVolumeSource setSecretName(java.lang.String secretName) {
    this.secretName = secretName;
    return this;
  }

  @Override
  public SecretVolumeSource set(String fieldName, Object value) {
    return (SecretVolumeSource) super.set(fieldName, value);
  }

  @Override
  public SecretVolumeSource clone() {
    return (SecretVolumeSource) super.clone();
  }

}
