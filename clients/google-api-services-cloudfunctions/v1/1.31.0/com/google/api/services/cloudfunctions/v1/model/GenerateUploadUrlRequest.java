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

package com.google.api.services.cloudfunctions.v1.model;

/**
 * Request of `GenerateSourceUploadUrl` method.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Cloud Functions API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class GenerateUploadUrlRequest extends com.google.api.client.json.GenericJson {

  /**
   * Resource name of a KMS crypto key (managed by the user) used to encrypt/decrypt function source
   * code objects in staging Cloud Storage buckets. When you generate an upload url and upload your
   * source code, it gets copied to a staging Cloud Storage bucket in an internal regional project.
   * The source code is then copied to a versioned directory in the sources bucket in the consumer
   * project during the function deployment. It must match the pattern
   * `projects/{project}/locations/{location}/keyRings/{key_ring}/cryptoKeys/{crypto_key}`. The
   * Google Cloud Functions service account (service-{project_number}@gcf-admin-
   * robot.iam.gserviceaccount.com) must be granted the role 'Cloud KMS CryptoKey
   * Encrypter/Decrypter (roles/cloudkms.cryptoKeyEncrypterDecrypter)' on the
   * Key/KeyRing/Project/Organization (least access preferred). GCF will delegate access to the
   * Google Storage service account in the internal project.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String kmsKeyName;

  /**
   * Resource name of a KMS crypto key (managed by the user) used to encrypt/decrypt function source
   * code objects in staging Cloud Storage buckets. When you generate an upload url and upload your
   * source code, it gets copied to a staging Cloud Storage bucket in an internal regional project.
   * The source code is then copied to a versioned directory in the sources bucket in the consumer
   * project during the function deployment. It must match the pattern
   * `projects/{project}/locations/{location}/keyRings/{key_ring}/cryptoKeys/{crypto_key}`. The
   * Google Cloud Functions service account (service-{project_number}@gcf-admin-
   * robot.iam.gserviceaccount.com) must be granted the role 'Cloud KMS CryptoKey
   * Encrypter/Decrypter (roles/cloudkms.cryptoKeyEncrypterDecrypter)' on the
   * Key/KeyRing/Project/Organization (least access preferred). GCF will delegate access to the
   * Google Storage service account in the internal project.
   * @return value or {@code null} for none
   */
  public java.lang.String getKmsKeyName() {
    return kmsKeyName;
  }

  /**
   * Resource name of a KMS crypto key (managed by the user) used to encrypt/decrypt function source
   * code objects in staging Cloud Storage buckets. When you generate an upload url and upload your
   * source code, it gets copied to a staging Cloud Storage bucket in an internal regional project.
   * The source code is then copied to a versioned directory in the sources bucket in the consumer
   * project during the function deployment. It must match the pattern
   * `projects/{project}/locations/{location}/keyRings/{key_ring}/cryptoKeys/{crypto_key}`. The
   * Google Cloud Functions service account (service-{project_number}@gcf-admin-
   * robot.iam.gserviceaccount.com) must be granted the role 'Cloud KMS CryptoKey
   * Encrypter/Decrypter (roles/cloudkms.cryptoKeyEncrypterDecrypter)' on the
   * Key/KeyRing/Project/Organization (least access preferred). GCF will delegate access to the
   * Google Storage service account in the internal project.
   * @param kmsKeyName kmsKeyName or {@code null} for none
   */
  public GenerateUploadUrlRequest setKmsKeyName(java.lang.String kmsKeyName) {
    this.kmsKeyName = kmsKeyName;
    return this;
  }

  @Override
  public GenerateUploadUrlRequest set(String fieldName, Object value) {
    return (GenerateUploadUrlRequest) super.set(fieldName, value);
  }

  @Override
  public GenerateUploadUrlRequest clone() {
    return (GenerateUploadUrlRequest) super.clone();
  }

}
