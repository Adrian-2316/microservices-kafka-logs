package com.kafka.consumer.content.analytics.service;

import com.kafka.consumer.content.analytics.models.Analytics;
import com.kafka.consumer.content.analytics.service.ports.in.AnalyticsPort;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@AllArgsConstructor
@Service
public class AnalyticsService implements AnalyticsPort {

    @Override
    public Analytics createAnalytics(Analytics analytics) {
        return  new Analytics();
    }
}
