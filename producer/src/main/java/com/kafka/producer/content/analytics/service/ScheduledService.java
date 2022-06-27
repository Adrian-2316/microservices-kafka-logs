package com.kafka.producer.content.analytics.service;

import org.springframework.scheduling.annotation.Scheduled;

public class ScheduledService {
  @Scheduled(fixedDelay = 1000)
  public void sendAnalytics() {
    System.out.println("Fixed delay task - " + System.currentTimeMillis() / 1000);
  }
}
