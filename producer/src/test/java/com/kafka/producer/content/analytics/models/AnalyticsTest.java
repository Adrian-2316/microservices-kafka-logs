package com.kafka.producer.content.analytics.models;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertNull;

class AnalyticsTest {
  /**
   * Methods under test:
   *
   * <ul>
   *   <li>{@link Analytics#Analytics()}
   *   <li>{@link Analytics#randomizeAnalytics()}
   * </ul>
   */
  @Test
  void testConstructor() {
    Analytics actualAnalytics = new Analytics();
    actualAnalytics.randomizeAnalytics();
    assertNull(actualAnalytics.getBloodPressure());
    assertNull(actualAnalytics.getWeight());
    assertNull(actualAnalytics.getTimestamp());
    assertNull(actualAnalytics.getTemperature());
    assertNull(actualAnalytics.getId());
    assertNull(actualAnalytics.getHeight());
    assertNull(actualAnalytics.getHeartRate());
    assertNull(actualAnalytics.getGlucose());
    assertNull(actualAnalytics.getBmi());
  }
}
