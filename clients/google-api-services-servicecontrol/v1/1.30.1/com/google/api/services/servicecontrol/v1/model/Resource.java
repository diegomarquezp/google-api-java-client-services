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

package com.google.api.services.servicecontrol.v1.model;

/**
 * This message defines core attributes for a resource. A resource is an addressable (named) entity
 * provided by the destination service. For example, a file stored on a network storage service.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Service Control API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class Resource extends com.google.api.client.json.GenericJson {

  /**
   * The labels or tags on the resource, such as AWS resource tags and Kubernetes resource labels.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.Map<String, java.lang.String> labels;

  /**
   * The stable identifier (name) of a resource on the `service`. A resource can be logically
   * identified as "//{resource.service}/{resource.name}". The differences between a resource name
   * and a URI are: * Resource name is a logical identifier, independent of network protocol and API
   * version. For example, `//pubsub.googleapis.com/projects/123/topics/news-feed`. * URI often
   * includes protocol and version information, so it can be used directly by applications. For
   * example, `https://pubsub.googleapis.com/v1/projects/123/topics/news-feed`. See
   * https://cloud.google.com/apis/design/resource_names for details.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String name;

  /**
   * The name of the service that this resource belongs to, such as `pubsub.googleapis.com`. The
   * service may be different from the DNS hostname that actually serves the request.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String service;

  /**
   * The type of the resource. The syntax is platform-specific because different platforms define
   * their resources differently. For Google APIs, the type format must be "{service}/{kind}".
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String type;

  /**
   * The labels or tags on the resource, such as AWS resource tags and Kubernetes resource labels.
   * @return value or {@code null} for none
   */
  public java.util.Map<String, java.lang.String> getLabels() {
    return labels;
  }

  /**
   * The labels or tags on the resource, such as AWS resource tags and Kubernetes resource labels.
   * @param labels labels or {@code null} for none
   */
  public Resource setLabels(java.util.Map<String, java.lang.String> labels) {
    this.labels = labels;
    return this;
  }

  /**
   * The stable identifier (name) of a resource on the `service`. A resource can be logically
   * identified as "//{resource.service}/{resource.name}". The differences between a resource name
   * and a URI are: * Resource name is a logical identifier, independent of network protocol and API
   * version. For example, `//pubsub.googleapis.com/projects/123/topics/news-feed`. * URI often
   * includes protocol and version information, so it can be used directly by applications. For
   * example, `https://pubsub.googleapis.com/v1/projects/123/topics/news-feed`. See
   * https://cloud.google.com/apis/design/resource_names for details.
   * @return value or {@code null} for none
   */
  public java.lang.String getName() {
    return name;
  }

  /**
   * The stable identifier (name) of a resource on the `service`. A resource can be logically
   * identified as "//{resource.service}/{resource.name}". The differences between a resource name
   * and a URI are: * Resource name is a logical identifier, independent of network protocol and API
   * version. For example, `//pubsub.googleapis.com/projects/123/topics/news-feed`. * URI often
   * includes protocol and version information, so it can be used directly by applications. For
   * example, `https://pubsub.googleapis.com/v1/projects/123/topics/news-feed`. See
   * https://cloud.google.com/apis/design/resource_names for details.
   * @param name name or {@code null} for none
   */
  public Resource setName(java.lang.String name) {
    this.name = name;
    return this;
  }

  /**
   * The name of the service that this resource belongs to, such as `pubsub.googleapis.com`. The
   * service may be different from the DNS hostname that actually serves the request.
   * @return value or {@code null} for none
   */
  public java.lang.String getService() {
    return service;
  }

  /**
   * The name of the service that this resource belongs to, such as `pubsub.googleapis.com`. The
   * service may be different from the DNS hostname that actually serves the request.
   * @param service service or {@code null} for none
   */
  public Resource setService(java.lang.String service) {
    this.service = service;
    return this;
  }

  /**
   * The type of the resource. The syntax is platform-specific because different platforms define
   * their resources differently. For Google APIs, the type format must be "{service}/{kind}".
   * @return value or {@code null} for none
   */
  public java.lang.String getType() {
    return type;
  }

  /**
   * The type of the resource. The syntax is platform-specific because different platforms define
   * their resources differently. For Google APIs, the type format must be "{service}/{kind}".
   * @param type type or {@code null} for none
   */
  public Resource setType(java.lang.String type) {
    this.type = type;
    return this;
  }

  @Override
  public Resource set(String fieldName, Object value) {
    return (Resource) super.set(fieldName, value);
  }

  @Override
  public Resource clone() {
    return (Resource) super.clone();
  }

}
