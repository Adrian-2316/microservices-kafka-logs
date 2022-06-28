package com.kafka.consumer.content.analytics.service.ports.in;

import com.kafka.consumer.content.analytics.models.Analytics;

public interface AnalyticsPort {
    Analytics createAnalytics(Analytics analytics);
}
