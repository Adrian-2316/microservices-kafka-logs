package com.kafka.producer.content.analytics.service;

import com.kafka.producer.content.analytics.models.Analytics;
import com.kafka.producer.content.analytics.service.ports.in.AnalyticsPort;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@AllArgsConstructor
@Service
public class AnalyticsService implements AnalyticsPort {

    @Autowired
    private KafkaTemplate<String, String> kafkaTemplate;

    @Override
    public void sendAnalytics(Analytics analytics) {
        kafkaTemplate.send("topicName", analytics.toString());
    }

}
