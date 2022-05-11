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

package com.google.api.services.containeranalysis.v1beta1.model;

/**
 * MUST match https://github.com/secure-systems-lab/dsse/blob/master/envelope.proto. An
 * authenticated message of arbitrary type.
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
public final class Envelope extends com.google.api.client.json.GenericJson {

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String payload;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String payloadType;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<EnvelopeSignature> signatures;

  /**
   * @see #decodePayload()
   * @return value or {@code null} for none
   */
  public java.lang.String getPayload() {
    return payload;
  }

  /**

   * @see #getPayload()
   * @return Base64 decoded value or {@code null} for none
   *
   * @since 1.14
   */
  public byte[] decodePayload() {
    return com.google.api.client.util.Base64.decodeBase64(payload);
  }

  /**
   * @see #encodePayload()
   * @param payload payload or {@code null} for none
   */
  public Envelope setPayload(java.lang.String payload) {
    this.payload = payload;
    return this;
  }

  /**

   * @see #setPayload()
   *
   * <p>
   * The value is encoded Base64 or {@code null} for none.
   * </p>
   *
   * @since 1.14
   */
  public Envelope encodePayload(byte[] payload) {
    this.payload = com.google.api.client.util.Base64.encodeBase64URLSafeString(payload);
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.String getPayloadType() {
    return payloadType;
  }

  /**
   * @param payloadType payloadType or {@code null} for none
   */
  public Envelope setPayloadType(java.lang.String payloadType) {
    this.payloadType = payloadType;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.util.List<EnvelopeSignature> getSignatures() {
    return signatures;
  }

  /**
   * @param signatures signatures or {@code null} for none
   */
  public Envelope setSignatures(java.util.List<EnvelopeSignature> signatures) {
    this.signatures = signatures;
    return this;
  }

  @Override
  public Envelope set(String fieldName, Object value) {
    return (Envelope) super.set(fieldName, value);
  }

  @Override
  public Envelope clone() {
    return (Envelope) super.clone();
  }

}
