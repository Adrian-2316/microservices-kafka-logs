package com.kafka.producer.content.analytics.service;

import com.kafka.producer.content.analytics.models.Analytics;
import com.kafka.producer.content.analytics.service.ports.in.AnalyticsPort;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.kafka.support.SendResult;
import org.springframework.stereotype.Service;
import org.springframework.util.concurrent.ListenableFuture;
import org.springframework.util.concurrent.ListenableFutureCallback;

@AllArgsConstructor
@Service
public class AnalyticsService implements AnalyticsPort {

  @Autowired private KafkaTemplate<String, String> kafkaTemplate;

  @Override
  public void sendAnalytics() {
    Analytics analytics = new Analytics();
    analytics.randomizeAnalytics();
    ListenableFuture<SendResult<String, String>> future =
        kafkaTemplate.send("analytics", analytics.toString());

    future.addCallback(
        new ListenableFutureCallback<>() {

          @Override
          public void onSuccess(SendResult<String, String> result) {
            System.out.println(
                "Sent message=["
                    + analytics
                    + "] with offset=["
                    + result.getRecordMetadata().offset()
                    + "]");
          }

          @Override
          public void onFailure(Throwable ex) {
            System.out.println(
                "Unable to send message=[" + analytics + "] due to : " + ex.getMessage());
          }
        });
  }
}
