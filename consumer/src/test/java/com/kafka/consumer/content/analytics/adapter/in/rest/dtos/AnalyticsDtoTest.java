package com.kafka.consumer.content.analytics.adapter.in.rest.dtos;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AnalyticsDtoTest {
  /** Method under test: {@link AnalyticsDto#canEqual(Object)} */
  @Test
  void testCanEqual() {
    assertFalse((new AnalyticsDto()).canEqual("Other"));
  }

  /** Method under test: {@link AnalyticsDto#canEqual(Object)} */
  @Test
  void testCanEqual2() {
    AnalyticsDto analyticsDto = new AnalyticsDto();
    assertTrue(analyticsDto.canEqual(new AnalyticsDto()));
  }

  /**
   * Methods under test:
   *
   * <ul>
   *   <li>{@link AnalyticsDto#AnalyticsDto()}
   *   <li>{@link AnalyticsDto#setEnvironment(String)}
   *   <li>{@link AnalyticsDto#setException(String)}
   *   <li>{@link AnalyticsDto#setId(Long)}
   *   <li>{@link AnalyticsDto#setLevel(String)}
   *   <li>{@link AnalyticsDto#setMessage(String)}
   *   <li>{@link AnalyticsDto#setStacktrace(String)}
   *   <li>{@link AnalyticsDto#setThread(String)}
   *   <li>{@link AnalyticsDto#setTimestamp(String)}
   *   <li>{@link AnalyticsDto#toString()}
   *   <li>{@link AnalyticsDto#getEnvironment()}
   *   <li>{@link AnalyticsDto#getException()}
   *   <li>{@link AnalyticsDto#getId()}
   *   <li>{@link AnalyticsDto#getLevel()}
   *   <li>{@link AnalyticsDto#getMessage()}
   *   <li>{@link AnalyticsDto#getStacktrace()}
   *   <li>{@link AnalyticsDto#getThread()}
   *   <li>{@link AnalyticsDto#getTimestamp()}
   * </ul>
   */
  @Test
  void testConstructor() {
    AnalyticsDto actualAnalyticsDto = new AnalyticsDto();
    actualAnalyticsDto.setEnvironment("Environment");
    actualAnalyticsDto.setException("Exception");
    actualAnalyticsDto.setId(123L);
    actualAnalyticsDto.setLevel("Level");
    actualAnalyticsDto.setMessage("Not all who wander are lost");
    actualAnalyticsDto.setStacktrace("Stacktrace");
    actualAnalyticsDto.setThread("Thread");
    actualAnalyticsDto.setTimestamp("Timestamp");
    String actualToStringResult = actualAnalyticsDto.toString();
    assertEquals("Environment", actualAnalyticsDto.getEnvironment());
    assertEquals("Exception", actualAnalyticsDto.getException());
    assertEquals(123L, actualAnalyticsDto.getId().longValue());
    assertEquals("Level", actualAnalyticsDto.getLevel());
    assertEquals("Not all who wander are lost", actualAnalyticsDto.getMessage());
    assertEquals("Stacktrace", actualAnalyticsDto.getStacktrace());
    assertEquals("Thread", actualAnalyticsDto.getThread());
    assertEquals("Timestamp", actualAnalyticsDto.getTimestamp());
    assertEquals(
        "AnalyticsDto(id=123, level=Level, message=Not all who wander are lost, timestamp=Timestamp, thread=Thread,"
            + " environment=Environment, exception=Exception, stacktrace=Stacktrace)",
        actualToStringResult);
  }

  /**
   * Methods under test:
   *
   * <ul>
   *   <li>{@link AnalyticsDto#AnalyticsDto(Long, String, String, String, String, String, String,
   *       String)}
   *   <li>{@link AnalyticsDto#setEnvironment(String)}
   *   <li>{@link AnalyticsDto#setException(String)}
   *   <li>{@link AnalyticsDto#setId(Long)}
   *   <li>{@link AnalyticsDto#setLevel(String)}
   *   <li>{@link AnalyticsDto#setMessage(String)}
   *   <li>{@link AnalyticsDto#setStacktrace(String)}
   *   <li>{@link AnalyticsDto#setThread(String)}
   *   <li>{@link AnalyticsDto#setTimestamp(String)}
   *   <li>{@link AnalyticsDto#toString()}
   *   <li>{@link AnalyticsDto#getEnvironment()}
   *   <li>{@link AnalyticsDto#getException()}
   *   <li>{@link AnalyticsDto#getId()}
   *   <li>{@link AnalyticsDto#getLevel()}
   *   <li>{@link AnalyticsDto#getMessage()}
   *   <li>{@link AnalyticsDto#getStacktrace()}
   *   <li>{@link AnalyticsDto#getThread()}
   *   <li>{@link AnalyticsDto#getTimestamp()}
   * </ul>
   */
  @Test
  void testConstructor2() {
    AnalyticsDto actualAnalyticsDto =
        new AnalyticsDto(
            123L,
            "Level",
            "Not all who wander are lost",
            "Timestamp",
            "Thread",
            "Environment",
            "Exception",
            "Stacktrace");
    actualAnalyticsDto.setEnvironment("Environment");
    actualAnalyticsDto.setException("Exception");
    actualAnalyticsDto.setId(123L);
    actualAnalyticsDto.setLevel("Level");
    actualAnalyticsDto.setMessage("Not all who wander are lost");
    actualAnalyticsDto.setStacktrace("Stacktrace");
    actualAnalyticsDto.setThread("Thread");
    actualAnalyticsDto.setTimestamp("Timestamp");
    String actualToStringResult = actualAnalyticsDto.toString();
    assertEquals("Environment", actualAnalyticsDto.getEnvironment());
    assertEquals("Exception", actualAnalyticsDto.getException());
    assertEquals(123L, actualAnalyticsDto.getId().longValue());
    assertEquals("Level", actualAnalyticsDto.getLevel());
    assertEquals("Not all who wander are lost", actualAnalyticsDto.getMessage());
    assertEquals("Stacktrace", actualAnalyticsDto.getStacktrace());
    assertEquals("Thread", actualAnalyticsDto.getThread());
    assertEquals("Timestamp", actualAnalyticsDto.getTimestamp());
    assertEquals(
        "AnalyticsDto(id=123, level=Level, message=Not all who wander are lost, timestamp=Timestamp, thread=Thread,"
            + " environment=Environment, exception=Exception, stacktrace=Stacktrace)",
        actualToStringResult);
  }

  /** Method under test: {@link AnalyticsDto#equals(Object)} */
  @Test
  void testEquals() {
    assertNotEquals(new AnalyticsDto(), null);
    assertNotEquals(new AnalyticsDto(), "Different type to AnalyticsDto");
  }

  /**
   * Methods under test:
   *
   * <ul>
   *   <li>{@link AnalyticsDto#equals(Object)}
   *   <li>{@link AnalyticsDto#hashCode()}
   * </ul>
   */
  @Test
  void testEquals2() {
    AnalyticsDto analyticsDto = new AnalyticsDto();
    assertEquals(analyticsDto, analyticsDto);
    int expectedHashCodeResult = analyticsDto.hashCode();
    assertEquals(expectedHashCodeResult, analyticsDto.hashCode());
  }

  /**
   * Methods under test:
   *
   * <ul>
   *   <li>{@link AnalyticsDto#equals(Object)}
   *   <li>{@link AnalyticsDto#hashCode()}
   * </ul>
   */
  @Test
  void testEquals3() {
    AnalyticsDto analyticsDto = new AnalyticsDto();
    AnalyticsDto analyticsDto1 = new AnalyticsDto();
    assertEquals(analyticsDto, analyticsDto1);
    int expectedHashCodeResult = analyticsDto.hashCode();
    assertEquals(expectedHashCodeResult, analyticsDto1.hashCode());
  }

  /** Method under test: {@link AnalyticsDto#equals(Object)} */
  @Test
  void testEquals4() {
    AnalyticsDto analyticsDto =
        new AnalyticsDto(
            123L,
            "Level",
            "Not all who wander are lost",
            "Timestamp",
            "Thread",
            "Environment",
            "Exception",
            "Stacktrace");
    assertNotEquals(analyticsDto, new AnalyticsDto());
  }

  /** Method under test: {@link AnalyticsDto#equals(Object)} */
  @Test
  void testEquals5() {
    AnalyticsDto analyticsDto = new AnalyticsDto();
    assertNotEquals(
        analyticsDto,
        new AnalyticsDto(
            123L,
            "Level",
            "Not all who wander are lost",
            "Timestamp",
            "Thread",
            "Environment",
            "Exception",
            "Stacktrace"));
  }

  /** Method under test: {@link AnalyticsDto#equals(Object)} */
  @Test
  void testEquals6() {
    AnalyticsDto analyticsDto = new AnalyticsDto();
    analyticsDto.setLevel("Level");
    assertNotEquals(analyticsDto, new AnalyticsDto());
  }

  /** Method under test: {@link AnalyticsDto#equals(Object)} */
  @Test
  void testEquals7() {
    AnalyticsDto analyticsDto = new AnalyticsDto();
    analyticsDto.setMessage("Not all who wander are lost");
    assertNotEquals(analyticsDto, new AnalyticsDto());
  }

  /** Method under test: {@link AnalyticsDto#equals(Object)} */
  @Test
  void testEquals8() {
    AnalyticsDto analyticsDto = new AnalyticsDto();
    analyticsDto.setTimestamp("Timestamp");
    assertNotEquals(analyticsDto, new AnalyticsDto());
  }

  /** Method under test: {@link AnalyticsDto#equals(Object)} */
  @Test
  void testEquals9() {
    AnalyticsDto analyticsDto = new AnalyticsDto();
    analyticsDto.setThread("Thread");
    assertNotEquals(analyticsDto, new AnalyticsDto());
  }

  /** Method under test: {@link AnalyticsDto#equals(Object)} */
  @Test
  void testEquals10() {
    AnalyticsDto analyticsDto = new AnalyticsDto();
    analyticsDto.setEnvironment("Environment");
    assertNotEquals(analyticsDto, new AnalyticsDto());
  }

  /** Method under test: {@link AnalyticsDto#equals(Object)} */
  @Test
  void testEquals11() {
    AnalyticsDto analyticsDto = new AnalyticsDto();
    analyticsDto.setException("Exception");
    assertNotEquals(analyticsDto, new AnalyticsDto());
  }

  /** Method under test: {@link AnalyticsDto#equals(Object)} */
  @Test
  void testEquals12() {
    AnalyticsDto analyticsDto = new AnalyticsDto();
    analyticsDto.setStacktrace("Stacktrace");
    assertNotEquals(analyticsDto, new AnalyticsDto());
  }

  /**
   * Methods under test:
   *
   * <ul>
   *   <li>{@link AnalyticsDto#equals(Object)}
   *   <li>{@link AnalyticsDto#hashCode()}
   * </ul>
   */
  @Test
  void testEquals13() {
    AnalyticsDto analyticsDto =
        new AnalyticsDto(
            123L,
            "Level",
            "Not all who wander are lost",
            "Timestamp",
            "Thread",
            "Environment",
            "Exception",
            "Stacktrace");
    AnalyticsDto analyticsDto1 =
        new AnalyticsDto(
            123L,
            "Level",
            "Not all who wander are lost",
            "Timestamp",
            "Thread",
            "Environment",
            "Exception",
            "Stacktrace");

    assertEquals(analyticsDto, analyticsDto1);
    int expectedHashCodeResult = analyticsDto.hashCode();
    assertEquals(expectedHashCodeResult, analyticsDto1.hashCode());
  }

  /** Method under test: {@link AnalyticsDto#equals(Object)} */
  @Test
  void testEquals14() {
    AnalyticsDto analyticsDto = new AnalyticsDto();

    AnalyticsDto analyticsDto1 = new AnalyticsDto();
    analyticsDto1.setLevel("Level");
    assertNotEquals(analyticsDto, analyticsDto1);
  }

  /** Method under test: {@link AnalyticsDto#equals(Object)} */
  @Test
  void testEquals15() {
    AnalyticsDto analyticsDto = new AnalyticsDto();

    AnalyticsDto analyticsDto1 = new AnalyticsDto();
    analyticsDto1.setMessage("Not all who wander are lost");
    assertNotEquals(analyticsDto, analyticsDto1);
  }

  /** Method under test: {@link AnalyticsDto#equals(Object)} */
  @Test
  void testEquals16() {
    AnalyticsDto analyticsDto = new AnalyticsDto();

    AnalyticsDto analyticsDto1 = new AnalyticsDto();
    analyticsDto1.setTimestamp("Timestamp");
    assertNotEquals(analyticsDto, analyticsDto1);
  }

  /** Method under test: {@link AnalyticsDto#equals(Object)} */
  @Test
  void testEquals17() {
    AnalyticsDto analyticsDto = new AnalyticsDto();

    AnalyticsDto analyticsDto1 = new AnalyticsDto();
    analyticsDto1.setThread("Thread");
    assertNotEquals(analyticsDto, analyticsDto1);
  }

  /** Method under test: {@link AnalyticsDto#equals(Object)} */
  @Test
  void testEquals18() {
    AnalyticsDto analyticsDto = new AnalyticsDto();

    AnalyticsDto analyticsDto1 = new AnalyticsDto();
    analyticsDto1.setEnvironment("Environment");
    assertNotEquals(analyticsDto, analyticsDto1);
  }

  /** Method under test: {@link AnalyticsDto#equals(Object)} */
  @Test
  void testEquals19() {
    AnalyticsDto analyticsDto = new AnalyticsDto();

    AnalyticsDto analyticsDto1 = new AnalyticsDto();
    analyticsDto1.setException("Exception");
    assertNotEquals(analyticsDto, analyticsDto1);
  }

  /** Method under test: {@link AnalyticsDto#equals(Object)} */
  @Test
  void testEquals20() {
    AnalyticsDto analyticsDto = new AnalyticsDto();

    AnalyticsDto analyticsDto1 = new AnalyticsDto();
    analyticsDto1.setStacktrace("Stacktrace");
    assertNotEquals(analyticsDto, analyticsDto1);
  }
}
