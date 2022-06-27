package com.kafka.producer.content.analytics.service;

import com.kafka.producer.content.analytics.models.Analytics;
import com.kafka.producer.content.analytics.service.ports.in.AnalyticsPort;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@AllArgsConstructor
@Service
public class AnalyticsService implements AnalyticsPort {
    @Override
    public Analytics createAnalytics(Analytics log) {
        return new Analytics();
    }

}
