package com.kafka.consumer.content.analytics.models;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AnalyticsTest {
  /** Method under test: {@link Analytics#canEqual(Object)} */
  @Test
  void testCanEqual() {
    assertFalse((new Analytics()).canEqual("Other"));
  }

  /** Method under test: {@link Analytics#canEqual(Object)} */
  @Test
  void testCanEqual2() {
    Analytics analytics = new Analytics();
    assertTrue(analytics.canEqual(new Analytics()));
  }

  /**
   * Methods under test:
   *
   * <ul>
   *   <li>{@link Analytics#Analytics()}
   *   <li>{@link Analytics#setEnvironment(String)}
   *   <li>{@link Analytics#setException(String)}
   *   <li>{@link Analytics#setId(Long)}
   *   <li>{@link Analytics#setLevel(String)}
   *   <li>{@link Analytics#setMessage(String)}
   *   <li>{@link Analytics#setStacktrace(String)}
   *   <li>{@link Analytics#setThread(String)}
   *   <li>{@link Analytics#setTimestamp(String)}
   *   <li>{@link Analytics#toString()}
   *   <li>{@link Analytics#getEnvironment()}
   *   <li>{@link Analytics#getException()}
   *   <li>{@link Analytics#getId()}
   *   <li>{@link Analytics#getLevel()}
   *   <li>{@link Analytics#getMessage()}
   *   <li>{@link Analytics#getStacktrace()}
   *   <li>{@link Analytics#getThread()}
   *   <li>{@link Analytics#getTimestamp()}
   * </ul>
   */
  @Test
  void testConstructor() {
    Analytics actualAnalytics = new Analytics();
    actualAnalytics.setEnvironment("Environment");
    actualAnalytics.setException("Exception");
    actualAnalytics.setId(123L);
    actualAnalytics.setLevel("Level");
    actualAnalytics.setMessage("Not all who wander are lost");
    actualAnalytics.setStacktrace("Stacktrace");
    actualAnalytics.setThread("Thread");
    actualAnalytics.setTimestamp("Timestamp");
    String actualToStringResult = actualAnalytics.toString();
    assertEquals("Environment", actualAnalytics.getEnvironment());
    assertEquals("Exception", actualAnalytics.getException());
    assertEquals(123L, actualAnalytics.getId().longValue());
    assertEquals("Level", actualAnalytics.getLevel());
    assertEquals("Not all who wander are lost", actualAnalytics.getMessage());
    assertEquals("Stacktrace", actualAnalytics.getStacktrace());
    assertEquals("Thread", actualAnalytics.getThread());
    assertEquals("Timestamp", actualAnalytics.getTimestamp());
    assertEquals(
        "Analytics(id=123, level=Level, message=Not all who wander are lost, timestamp=Timestamp, thread=Thread,"
            + " environment=Environment, exception=Exception, stacktrace=Stacktrace)",
        actualToStringResult);
  }

  /**
   * Methods under test:
   *
   * <ul>
   *   <li>{@link Analytics#Analytics(Long, String, String, String, String, String, String, String)}
   *   <li>{@link Analytics#setEnvironment(String)}
   *   <li>{@link Analytics#setException(String)}
   *   <li>{@link Analytics#setId(Long)}
   *   <li>{@link Analytics#setLevel(String)}
   *   <li>{@link Analytics#setMessage(String)}
   *   <li>{@link Analytics#setStacktrace(String)}
   *   <li>{@link Analytics#setThread(String)}
   *   <li>{@link Analytics#setTimestamp(String)}
   *   <li>{@link Analytics#toString()}
   *   <li>{@link Analytics#getEnvironment()}
   *   <li>{@link Analytics#getException()}
   *   <li>{@link Analytics#getId()}
   *   <li>{@link Analytics#getLevel()}
   *   <li>{@link Analytics#getMessage()}
   *   <li>{@link Analytics#getStacktrace()}
   *   <li>{@link Analytics#getThread()}
   *   <li>{@link Analytics#getTimestamp()}
   * </ul>
   */
  @Test
  void testConstructor2() {
    Analytics actualAnalytics =
        new Analytics(
            123L,
            "Level",
            "Not all who wander are lost",
            "Timestamp",
            "Thread",
            "Environment",
            "Exception",
            "Stacktrace");
    actualAnalytics.setEnvironment("Environment");
    actualAnalytics.setException("Exception");
    actualAnalytics.setId(123L);
    actualAnalytics.setLevel("Level");
    actualAnalytics.setMessage("Not all who wander are lost");
    actualAnalytics.setStacktrace("Stacktrace");
    actualAnalytics.setThread("Thread");
    actualAnalytics.setTimestamp("Timestamp");
    String actualToStringResult = actualAnalytics.toString();
    assertEquals("Environment", actualAnalytics.getEnvironment());
    assertEquals("Exception", actualAnalytics.getException());
    assertEquals(123L, actualAnalytics.getId().longValue());
    assertEquals("Level", actualAnalytics.getLevel());
    assertEquals("Not all who wander are lost", actualAnalytics.getMessage());
    assertEquals("Stacktrace", actualAnalytics.getStacktrace());
    assertEquals("Thread", actualAnalytics.getThread());
    assertEquals("Timestamp", actualAnalytics.getTimestamp());
    assertEquals(
        "Analytics(id=123, level=Level, message=Not all who wander are lost, timestamp=Timestamp, thread=Thread,"
            + " environment=Environment, exception=Exception, stacktrace=Stacktrace)",
        actualToStringResult);
  }

  /** Method under test: {@link Analytics#equals(Object)} */
  @Test
  void testEquals() {
    assertNotEquals(new Analytics(), null);
    assertNotEquals(new Analytics(), "Different type to Analytics");
  }

  /**
   * Methods under test:
   *
   * <ul>
   *   <li>{@link Analytics#equals(Object)}
   *   <li>{@link Analytics#hashCode()}
   * </ul>
   */
  @Test
  void testEquals2() {
    Analytics analytics = new Analytics();
    assertEquals(analytics, analytics);
    int expectedHashCodeResult = analytics.hashCode();
    assertEquals(expectedHashCodeResult, analytics.hashCode());
  }

  /**
   * Methods under test:
   *
   * <ul>
   *   <li>{@link Analytics#equals(Object)}
   *   <li>{@link Analytics#hashCode()}
   * </ul>
   */
  @Test
  void testEquals3() {
    Analytics analytics = new Analytics();
    Analytics analytics1 = new Analytics();
    assertEquals(analytics, analytics1);
    int expectedHashCodeResult = analytics.hashCode();
    assertEquals(expectedHashCodeResult, analytics1.hashCode());
  }

  /** Method under test: {@link Analytics#equals(Object)} */
  @Test
  void testEquals4() {
    Analytics analytics =
        new Analytics(
            123L,
            "Level",
            "Not all who wander are lost",
            "Timestamp",
            "Thread",
            "Environment",
            "Exception",
            "Stacktrace");
    assertNotEquals(analytics, new Analytics());
  }

  /** Method under test: {@link Analytics#equals(Object)} */
  @Test
  void testEquals5() {
    Analytics analytics = new Analytics();
    assertNotEquals(
        analytics,
        new Analytics(
            123L,
            "Level",
            "Not all who wander are lost",
            "Timestamp",
            "Thread",
            "Environment",
            "Exception",
            "Stacktrace"));
  }

  /** Method under test: {@link Analytics#equals(Object)} */
  @Test
  void testEquals6() {
    Analytics analytics = new Analytics();
    analytics.setLevel("Level");
    assertNotEquals(analytics, new Analytics());
  }

  /** Method under test: {@link Analytics#equals(Object)} */
  @Test
  void testEquals7() {
    Analytics analytics = new Analytics();
    analytics.setMessage("Not all who wander are lost");
    assertNotEquals(analytics, new Analytics());
  }

  /** Method under test: {@link Analytics#equals(Object)} */
  @Test
  void testEquals8() {
    Analytics analytics = new Analytics();
    analytics.setTimestamp("Timestamp");
    assertNotEquals(analytics, new Analytics());
  }

  /** Method under test: {@link Analytics#equals(Object)} */
  @Test
  void testEquals9() {
    Analytics analytics = new Analytics();
    analytics.setThread("Thread");
    assertNotEquals(analytics, new Analytics());
  }

  /** Method under test: {@link Analytics#equals(Object)} */
  @Test
  void testEquals10() {
    Analytics analytics = new Analytics();
    analytics.setEnvironment("Environment");
    assertNotEquals(analytics, new Analytics());
  }

  /** Method under test: {@link Analytics#equals(Object)} */
  @Test
  void testEquals11() {
    Analytics analytics = new Analytics();
    analytics.setException("Exception");
    assertNotEquals(analytics, new Analytics());
  }

  /** Method under test: {@link Analytics#equals(Object)} */
  @Test
  void testEquals12() {
    Analytics analytics = new Analytics();
    analytics.setStacktrace("Stacktrace");
    assertNotEquals(analytics, new Analytics());
  }

  /**
   * Methods under test:
   *
   * <ul>
   *   <li>{@link Analytics#equals(Object)}
   *   <li>{@link Analytics#hashCode()}
   * </ul>
   */
  @Test
  void testEquals13() {
    Analytics analytics =
        new Analytics(
            123L,
            "Level",
            "Not all who wander are lost",
            "Timestamp",
            "Thread",
            "Environment",
            "Exception",
            "Stacktrace");
    Analytics analytics1 =
        new Analytics(
            123L,
            "Level",
            "Not all who wander are lost",
            "Timestamp",
            "Thread",
            "Environment",
            "Exception",
            "Stacktrace");

    assertEquals(analytics, analytics1);
    int expectedHashCodeResult = analytics.hashCode();
    assertEquals(expectedHashCodeResult, analytics1.hashCode());
  }

  /** Method under test: {@link Analytics#equals(Object)} */
  @Test
  void testEquals14() {
    Analytics analytics = new Analytics();

    Analytics analytics1 = new Analytics();
    analytics1.setLevel("Level");
    assertNotEquals(analytics, analytics1);
  }

  /** Method under test: {@link Analytics#equals(Object)} */
  @Test
  void testEquals15() {
    Analytics analytics = new Analytics();

    Analytics analytics1 = new Analytics();
    analytics1.setMessage("Not all who wander are lost");
    assertNotEquals(analytics, analytics1);
  }

  /** Method under test: {@link Analytics#equals(Object)} */
  @Test
  void testEquals16() {
    Analytics analytics = new Analytics();

    Analytics analytics1 = new Analytics();
    analytics1.setTimestamp("Timestamp");
    assertNotEquals(analytics, analytics1);
  }

  /** Method under test: {@link Analytics#equals(Object)} */
  @Test
  void testEquals17() {
    Analytics analytics = new Analytics();

    Analytics analytics1 = new Analytics();
    analytics1.setThread("Thread");
    assertNotEquals(analytics, analytics1);
  }

  /** Method under test: {@link Analytics#equals(Object)} */
  @Test
  void testEquals18() {
    Analytics analytics = new Analytics();

    Analytics analytics1 = new Analytics();
    analytics1.setEnvironment("Environment");
    assertNotEquals(analytics, analytics1);
  }

  /** Method under test: {@link Analytics#equals(Object)} */
  @Test
  void testEquals19() {
    Analytics analytics = new Analytics();

    Analytics analytics1 = new Analytics();
    analytics1.setException("Exception");
    assertNotEquals(analytics, analytics1);
  }

  /** Method under test: {@link Analytics#equals(Object)} */
  @Test
  void testEquals20() {
    Analytics analytics = new Analytics();

    Analytics analytics1 = new Analytics();
    analytics1.setStacktrace("Stacktrace");
    assertNotEquals(analytics, analytics1);
  }
}
