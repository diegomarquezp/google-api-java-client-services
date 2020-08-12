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

package com.google.api.services.cloudtasks.v2beta2.model;

/**
 * Rate limits. This message determines the maximum rate that tasks can be dispatched by a queue,
 * regardless of whether the dispatch is a first task attempt or a retry. Note: The debugging
 * command, RunTask, will run a task even if the queue has reached its RateLimits.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Cloud Tasks API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class RateLimits extends com.google.api.client.json.GenericJson {

  /**
   * Output only. The max burst size. Max burst size limits how fast tasks in queue are processed
   * when many tasks are in the queue and the rate is high. This field allows the queue to have a
   * high rate so processing starts shortly after a task is enqueued, but still limits resource
   * usage when many tasks are enqueued in a short period of time. The [token
   * bucket](https://wikipedia.org/wiki/Token_Bucket) algorithm is used to control the rate of task
   * dispatches. Each queue has a token bucket that holds tokens, up to the maximum specified by
   * `max_burst_size`. Each time a task is dispatched, a token is removed from the bucket. Tasks
   * will be dispatched until the queue's bucket runs out of tokens. The bucket will be continuously
   * refilled with new tokens based on max_tasks_dispatched_per_second. Cloud Tasks will pick the
   * value of `max_burst_size` based on the value of max_tasks_dispatched_per_second. For App Engine
   * queues that were created or updated using `queue.yaml/xml`, `max_burst_size` is equal to [bucke
   * t_size](https://cloud.google.com/appengine/docs/standard/python/config/queueref#bucket_size).
   * Since `max_burst_size` is output only, if UpdateQueue is called on a queue created by
   * `queue.yaml/xml`, `max_burst_size` will be reset based on the value of
   * max_tasks_dispatched_per_second, regardless of whether max_tasks_dispatched_per_second is
   * updated.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Integer maxBurstSize;

  /**
   * The maximum number of concurrent tasks that Cloud Tasks allows to be dispatched for this queue.
   * After this threshold has been reached, Cloud Tasks stops dispatching tasks until the number of
   * concurrent requests decreases. If unspecified when the queue is created, Cloud Tasks will pick
   * the default. The maximum allowed value is 5,000. This field is output only for pull queues and
   * always -1, which indicates no limit. No other queue types can have `max_concurrent_tasks` set
   * to -1. This field has the same meaning as [max_concurrent_requests in queue.yaml/xml](https://c
   * loud.google.com/appengine/docs/standard/python/config/queueref#max_concurrent_requests).
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Integer maxConcurrentTasks;

  /**
   * The maximum rate at which tasks are dispatched from this queue. If unspecified when the queue
   * is created, Cloud Tasks will pick the default. * For App Engine queues, the maximum allowed
   * value is 500. * This field is output only for pull queues. In addition to the
   * `max_tasks_dispatched_per_second` limit, a maximum of 10 QPS of LeaseTasks requests are allowed
   * per pull queue. This field has the same meaning as [rate in
   * queue.yaml/xml](https://cloud.google.com/appengine/docs/standard/python/config/queueref#rate).
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Double maxTasksDispatchedPerSecond;

  /**
   * Output only. The max burst size. Max burst size limits how fast tasks in queue are processed
   * when many tasks are in the queue and the rate is high. This field allows the queue to have a
   * high rate so processing starts shortly after a task is enqueued, but still limits resource
   * usage when many tasks are enqueued in a short period of time. The [token
   * bucket](https://wikipedia.org/wiki/Token_Bucket) algorithm is used to control the rate of task
   * dispatches. Each queue has a token bucket that holds tokens, up to the maximum specified by
   * `max_burst_size`. Each time a task is dispatched, a token is removed from the bucket. Tasks
   * will be dispatched until the queue's bucket runs out of tokens. The bucket will be continuously
   * refilled with new tokens based on max_tasks_dispatched_per_second. Cloud Tasks will pick the
   * value of `max_burst_size` based on the value of max_tasks_dispatched_per_second. For App Engine
   * queues that were created or updated using `queue.yaml/xml`, `max_burst_size` is equal to [bucke
   * t_size](https://cloud.google.com/appengine/docs/standard/python/config/queueref#bucket_size).
   * Since `max_burst_size` is output only, if UpdateQueue is called on a queue created by
   * `queue.yaml/xml`, `max_burst_size` will be reset based on the value of
   * max_tasks_dispatched_per_second, regardless of whether max_tasks_dispatched_per_second is
   * updated.
   * @return value or {@code null} for none
   */
  public java.lang.Integer getMaxBurstSize() {
    return maxBurstSize;
  }

  /**
   * Output only. The max burst size. Max burst size limits how fast tasks in queue are processed
   * when many tasks are in the queue and the rate is high. This field allows the queue to have a
   * high rate so processing starts shortly after a task is enqueued, but still limits resource
   * usage when many tasks are enqueued in a short period of time. The [token
   * bucket](https://wikipedia.org/wiki/Token_Bucket) algorithm is used to control the rate of task
   * dispatches. Each queue has a token bucket that holds tokens, up to the maximum specified by
   * `max_burst_size`. Each time a task is dispatched, a token is removed from the bucket. Tasks
   * will be dispatched until the queue's bucket runs out of tokens. The bucket will be continuously
   * refilled with new tokens based on max_tasks_dispatched_per_second. Cloud Tasks will pick the
   * value of `max_burst_size` based on the value of max_tasks_dispatched_per_second. For App Engine
   * queues that were created or updated using `queue.yaml/xml`, `max_burst_size` is equal to [bucke
   * t_size](https://cloud.google.com/appengine/docs/standard/python/config/queueref#bucket_size).
   * Since `max_burst_size` is output only, if UpdateQueue is called on a queue created by
   * `queue.yaml/xml`, `max_burst_size` will be reset based on the value of
   * max_tasks_dispatched_per_second, regardless of whether max_tasks_dispatched_per_second is
   * updated.
   * @param maxBurstSize maxBurstSize or {@code null} for none
   */
  public RateLimits setMaxBurstSize(java.lang.Integer maxBurstSize) {
    this.maxBurstSize = maxBurstSize;
    return this;
  }

  /**
   * The maximum number of concurrent tasks that Cloud Tasks allows to be dispatched for this queue.
   * After this threshold has been reached, Cloud Tasks stops dispatching tasks until the number of
   * concurrent requests decreases. If unspecified when the queue is created, Cloud Tasks will pick
   * the default. The maximum allowed value is 5,000. This field is output only for pull queues and
   * always -1, which indicates no limit. No other queue types can have `max_concurrent_tasks` set
   * to -1. This field has the same meaning as [max_concurrent_requests in queue.yaml/xml](https://c
   * loud.google.com/appengine/docs/standard/python/config/queueref#max_concurrent_requests).
   * @return value or {@code null} for none
   */
  public java.lang.Integer getMaxConcurrentTasks() {
    return maxConcurrentTasks;
  }

  /**
   * The maximum number of concurrent tasks that Cloud Tasks allows to be dispatched for this queue.
   * After this threshold has been reached, Cloud Tasks stops dispatching tasks until the number of
   * concurrent requests decreases. If unspecified when the queue is created, Cloud Tasks will pick
   * the default. The maximum allowed value is 5,000. This field is output only for pull queues and
   * always -1, which indicates no limit. No other queue types can have `max_concurrent_tasks` set
   * to -1. This field has the same meaning as [max_concurrent_requests in queue.yaml/xml](https://c
   * loud.google.com/appengine/docs/standard/python/config/queueref#max_concurrent_requests).
   * @param maxConcurrentTasks maxConcurrentTasks or {@code null} for none
   */
  public RateLimits setMaxConcurrentTasks(java.lang.Integer maxConcurrentTasks) {
    this.maxConcurrentTasks = maxConcurrentTasks;
    return this;
  }

  /**
   * The maximum rate at which tasks are dispatched from this queue. If unspecified when the queue
   * is created, Cloud Tasks will pick the default. * For App Engine queues, the maximum allowed
   * value is 500. * This field is output only for pull queues. In addition to the
   * `max_tasks_dispatched_per_second` limit, a maximum of 10 QPS of LeaseTasks requests are allowed
   * per pull queue. This field has the same meaning as [rate in
   * queue.yaml/xml](https://cloud.google.com/appengine/docs/standard/python/config/queueref#rate).
   * @return value or {@code null} for none
   */
  public java.lang.Double getMaxTasksDispatchedPerSecond() {
    return maxTasksDispatchedPerSecond;
  }

  /**
   * The maximum rate at which tasks are dispatched from this queue. If unspecified when the queue
   * is created, Cloud Tasks will pick the default. * For App Engine queues, the maximum allowed
   * value is 500. * This field is output only for pull queues. In addition to the
   * `max_tasks_dispatched_per_second` limit, a maximum of 10 QPS of LeaseTasks requests are allowed
   * per pull queue. This field has the same meaning as [rate in
   * queue.yaml/xml](https://cloud.google.com/appengine/docs/standard/python/config/queueref#rate).
   * @param maxTasksDispatchedPerSecond maxTasksDispatchedPerSecond or {@code null} for none
   */
  public RateLimits setMaxTasksDispatchedPerSecond(java.lang.Double maxTasksDispatchedPerSecond) {
    this.maxTasksDispatchedPerSecond = maxTasksDispatchedPerSecond;
    return this;
  }

  @Override
  public RateLimits set(String fieldName, Object value) {
    return (RateLimits) super.set(fieldName, value);
  }

  @Override
  public RateLimits clone() {
    return (RateLimits) super.clone();
  }

}
