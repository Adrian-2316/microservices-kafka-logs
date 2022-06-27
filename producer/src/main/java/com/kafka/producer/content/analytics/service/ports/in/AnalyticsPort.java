package com.kafka.producer.content.analytics.service.ports.in;

import com.kafka.producer.content.analytics.models.Analytics;

public interface AnalyticsPort {
    void sendAnalytics(Analytics analytics);
}
