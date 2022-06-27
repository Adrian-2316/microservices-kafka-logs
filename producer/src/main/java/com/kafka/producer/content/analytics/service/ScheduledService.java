package com.kafka.producer.content.analytics.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

@Service
public class ScheduledService {
  @Autowired private AnalyticsService analyticsService;

  @Scheduled(fixedDelay = 1000)
  public void sendAnalytics() {
    analyticsService.sendAnalytics();
  }
}
