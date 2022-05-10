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

package com.google.api.services.cloudscheduler.v1.model;

/**
 * A message that is published by publishers and consumed by subscribers. The message must contain
 * either a non-empty data field or at least one attribute. Note that client libraries represent
 * this object differently depending on the language. See the corresponding [client library
 * documentation](https://cloud.google.com/pubsub/docs/reference/libraries) for more information.
 * See [quotas and limits] (https://cloud.google.com/pubsub/quotas) for more information about
 * message limits.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Cloud Scheduler API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class PubsubMessage extends com.google.api.client.json.GenericJson {

  /**
   * Attributes for this message. If this field is empty, the message must contain non-empty data.
   * This can be used to filter messages on the subscription.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.Map<String, java.lang.String> attributes;

  /**
   * The message data field. If this field is empty, the message must contain at least one
   * attribute.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String data;

  /**
   * ID of this message, assigned by the server when the message is published. Guaranteed to be
   * unique within the topic. This value may be read by a subscriber that receives a `PubsubMessage`
   * via a `Pull` call or a push delivery. It must not be populated by the publisher in a `Publish`
   * call.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String messageId;

  /**
   * If non-empty, identifies related messages for which publish order should be respected. If a
   * `Subscription` has `enable_message_ordering` set to `true`, messages published with the same
   * non-empty `ordering_key` value will be delivered to subscribers in the order in which they are
   * received by the Pub/Sub system. All `PubsubMessage`s published in a given `PublishRequest` must
   * specify the same `ordering_key` value. For more information, see [ordering
   * messages](https://cloud.google.com/pubsub/docs/ordering).
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String orderingKey;

  /**
   * The time at which the message was published, populated by the server when it receives the
   * `Publish` call. It must not be populated by the publisher in a `Publish` call.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private String publishTime;

  /**
   * Attributes for this message. If this field is empty, the message must contain non-empty data.
   * This can be used to filter messages on the subscription.
   * @return value or {@code null} for none
   */
  public java.util.Map<String, java.lang.String> getAttributes() {
    return attributes;
  }

  /**
   * Attributes for this message. If this field is empty, the message must contain non-empty data.
   * This can be used to filter messages on the subscription.
   * @param attributes attributes or {@code null} for none
   */
  public PubsubMessage setAttributes(java.util.Map<String, java.lang.String> attributes) {
    this.attributes = attributes;
    return this;
  }

  /**
   * The message data field. If this field is empty, the message must contain at least one
   * attribute.
   * @see #decodeData()
   * @return value or {@code null} for none
   */
  public java.lang.String getData() {
    return data;
  }

  /**
   * The message data field. If this field is empty, the message must contain at least one
   * attribute.
   * @see #getData()
   * @return Base64 decoded value or {@code null} for none
   *
   * @since 1.14
   */
  public byte[] decodeData() {
    return com.google.api.client.util.Base64.decodeBase64(data);
  }

  /**
   * The message data field. If this field is empty, the message must contain at least one
   * attribute.
   * @see #encodeData()
   * @param data data or {@code null} for none
   */
  public PubsubMessage setData(java.lang.String data) {
    this.data = data;
    return this;
  }

  /**
   * The message data field. If this field is empty, the message must contain at least one
   * attribute.
   * @see #setData()
   *
   * <p>
   * The value is encoded Base64 or {@code null} for none.
   * </p>
   *
   * @since 1.14
   */
  public PubsubMessage encodeData(byte[] data) {
    this.data = com.google.api.client.util.Base64.encodeBase64URLSafeString(data);
    return this;
  }

  /**
   * ID of this message, assigned by the server when the message is published. Guaranteed to be
   * unique within the topic. This value may be read by a subscriber that receives a `PubsubMessage`
   * via a `Pull` call or a push delivery. It must not be populated by the publisher in a `Publish`
   * call.
   * @return value or {@code null} for none
   */
  public java.lang.String getMessageId() {
    return messageId;
  }

  /**
   * ID of this message, assigned by the server when the message is published. Guaranteed to be
   * unique within the topic. This value may be read by a subscriber that receives a `PubsubMessage`
   * via a `Pull` call or a push delivery. It must not be populated by the publisher in a `Publish`
   * call.
   * @param messageId messageId or {@code null} for none
   */
  public PubsubMessage setMessageId(java.lang.String messageId) {
    this.messageId = messageId;
    return this;
  }

  /**
   * If non-empty, identifies related messages for which publish order should be respected. If a
   * `Subscription` has `enable_message_ordering` set to `true`, messages published with the same
   * non-empty `ordering_key` value will be delivered to subscribers in the order in which they are
   * received by the Pub/Sub system. All `PubsubMessage`s published in a given `PublishRequest` must
   * specify the same `ordering_key` value. For more information, see [ordering
   * messages](https://cloud.google.com/pubsub/docs/ordering).
   * @return value or {@code null} for none
   */
  public java.lang.String getOrderingKey() {
    return orderingKey;
  }

  /**
   * If non-empty, identifies related messages for which publish order should be respected. If a
   * `Subscription` has `enable_message_ordering` set to `true`, messages published with the same
   * non-empty `ordering_key` value will be delivered to subscribers in the order in which they are
   * received by the Pub/Sub system. All `PubsubMessage`s published in a given `PublishRequest` must
   * specify the same `ordering_key` value. For more information, see [ordering
   * messages](https://cloud.google.com/pubsub/docs/ordering).
   * @param orderingKey orderingKey or {@code null} for none
   */
  public PubsubMessage setOrderingKey(java.lang.String orderingKey) {
    this.orderingKey = orderingKey;
    return this;
  }

  /**
   * The time at which the message was published, populated by the server when it receives the
   * `Publish` call. It must not be populated by the publisher in a `Publish` call.
   * @return value or {@code null} for none
   */
  public String getPublishTime() {
    return publishTime;
  }

  /**
   * The time at which the message was published, populated by the server when it receives the
   * `Publish` call. It must not be populated by the publisher in a `Publish` call.
   * @param publishTime publishTime or {@code null} for none
   */
  public PubsubMessage setPublishTime(String publishTime) {
    this.publishTime = publishTime;
    return this;
  }

  @Override
  public PubsubMessage set(String fieldName, Object value) {
    return (PubsubMessage) super.set(fieldName, value);
  }

  @Override
  public PubsubMessage clone() {
    return (PubsubMessage) super.clone();
  }

}
