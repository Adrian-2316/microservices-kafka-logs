package com.kafka.producer.content.analytics.models;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AnalyticsTest {
    /**
     * Method under test: {@link Analytics#canEqual(Object)}
     */
    @Test
    void testCanEqual() {
        assertFalse((new Analytics()).canEqual("Other"));
    }

    /**
     * Method under test: {@link Analytics#canEqual(Object)}
     */
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
     *   <li>{@link Analytics#setBloodPressure(Double)}
     *   <li>{@link Analytics#setBmi(Double)}
     *   <li>{@link Analytics#setGlucose(Double)}
     *   <li>{@link Analytics#setHeartRate(Double)}
     *   <li>{@link Analytics#setHeight(Double)}
     *   <li>{@link Analytics#setId(Long)}
     *   <li>{@link Analytics#setTemperature(Double)}
     *   <li>{@link Analytics#setTimestamp(String)}
     *   <li>{@link Analytics#setWeight(Double)}
     *   <li>{@link Analytics#toString()}
     *   <li>{@link Analytics#getBloodPressure()}
     *   <li>{@link Analytics#getBmi()}
     *   <li>{@link Analytics#getGlucose()}
     *   <li>{@link Analytics#getHeartRate()}
     *   <li>{@link Analytics#getHeight()}
     *   <li>{@link Analytics#getId()}
     *   <li>{@link Analytics#getTemperature()}
     *   <li>{@link Analytics#getTimestamp()}
     *   <li>{@link Analytics#getWeight()}
     * </ul>
     */
    @Test
    void testConstructor() {
        Analytics actualAnalytics = new Analytics();
        actualAnalytics.setBloodPressure(10.0d);
        actualAnalytics.setBmi(10.0d);
        actualAnalytics.setGlucose(10.0d);
        actualAnalytics.setHeartRate(10.0d);
        actualAnalytics.setHeight(10.0d);
        actualAnalytics.setId(123L);
        actualAnalytics.setTemperature(10.0d);
        actualAnalytics.setTimestamp("Timestamp");
        actualAnalytics.setWeight(10.0d);
        String actualToStringResult = actualAnalytics.toString();
        assertEquals(10.0d, actualAnalytics.getBloodPressure().doubleValue());
        assertEquals(10.0d, actualAnalytics.getBmi().doubleValue());
        assertEquals(10.0d, actualAnalytics.getGlucose().doubleValue());
        assertEquals(10.0d, actualAnalytics.getHeartRate().doubleValue());
        assertEquals(10.0d, actualAnalytics.getHeight().doubleValue());
        assertEquals(123L, actualAnalytics.getId().longValue());
        assertEquals(10.0d, actualAnalytics.getTemperature().doubleValue());
        assertEquals("Timestamp", actualAnalytics.getTimestamp());
        assertEquals(10.0d, actualAnalytics.getWeight().doubleValue());
        assertEquals("Analytics(id=123, glucose=10.0, bloodPressure=10.0, heartRate=10.0, temperature=10.0, weight=10.0,"
                + " height=10.0, bmi=10.0, timestamp=Timestamp)", actualToStringResult);
    }

    /**
     * Methods under test:
     *
     * <ul>
     *   <li>{@link Analytics#Analytics(Long, Double, Double, Double, Double, Double, Double, Double, String)}
     *   <li>{@link Analytics#setBloodPressure(Double)}
     *   <li>{@link Analytics#setBmi(Double)}
     *   <li>{@link Analytics#setGlucose(Double)}
     *   <li>{@link Analytics#setHeartRate(Double)}
     *   <li>{@link Analytics#setHeight(Double)}
     *   <li>{@link Analytics#setId(Long)}
     *   <li>{@link Analytics#setTemperature(Double)}
     *   <li>{@link Analytics#setTimestamp(String)}
     *   <li>{@link Analytics#setWeight(Double)}
     *   <li>{@link Analytics#toString()}
     *   <li>{@link Analytics#getBloodPressure()}
     *   <li>{@link Analytics#getBmi()}
     *   <li>{@link Analytics#getGlucose()}
     *   <li>{@link Analytics#getHeartRate()}
     *   <li>{@link Analytics#getHeight()}
     *   <li>{@link Analytics#getId()}
     *   <li>{@link Analytics#getTemperature()}
     *   <li>{@link Analytics#getTimestamp()}
     *   <li>{@link Analytics#getWeight()}
     * </ul>
     */
    @Test
    void testConstructor2() {
        Analytics actualAnalytics = new Analytics(123L, 10.0d, 10.0d, 10.0d, 10.0d, 10.0d, 10.0d, 10.0d, "Timestamp");
        actualAnalytics.setBloodPressure(10.0d);
        actualAnalytics.setBmi(10.0d);
        actualAnalytics.setGlucose(10.0d);
        actualAnalytics.setHeartRate(10.0d);
        actualAnalytics.setHeight(10.0d);
        actualAnalytics.setId(123L);
        actualAnalytics.setTemperature(10.0d);
        actualAnalytics.setTimestamp("Timestamp");
        actualAnalytics.setWeight(10.0d);
        String actualToStringResult = actualAnalytics.toString();
        assertEquals(10.0d, actualAnalytics.getBloodPressure().doubleValue());
        assertEquals(10.0d, actualAnalytics.getBmi().doubleValue());
        assertEquals(10.0d, actualAnalytics.getGlucose().doubleValue());
        assertEquals(10.0d, actualAnalytics.getHeartRate().doubleValue());
        assertEquals(10.0d, actualAnalytics.getHeight().doubleValue());
        assertEquals(123L, actualAnalytics.getId().longValue());
        assertEquals(10.0d, actualAnalytics.getTemperature().doubleValue());
        assertEquals("Timestamp", actualAnalytics.getTimestamp());
        assertEquals(10.0d, actualAnalytics.getWeight().doubleValue());
        assertEquals("Analytics(id=123, glucose=10.0, bloodPressure=10.0, heartRate=10.0, temperature=10.0, weight=10.0,"
                + " height=10.0, bmi=10.0, timestamp=Timestamp)", actualToStringResult);
    }

    /**
     * Method under test: {@link Analytics#equals(Object)}
     */
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

    /**
     * Method under test: {@link Analytics#equals(Object)}
     */
    @Test
    void testEquals4() {
        Analytics analytics = new Analytics(123L, 10.0d, 10.0d, 10.0d, 10.0d, 10.0d, 10.0d, 10.0d, "Timestamp");
        assertNotEquals(analytics, new Analytics());
    }

    /**
     * Method under test: {@link Analytics#equals(Object)}
     */
    @Test
    void testEquals5() {
        Analytics analytics = new Analytics();
        assertNotEquals(analytics, new Analytics(123L, 10.0d, 10.0d, 10.0d, 10.0d, 10.0d, 10.0d, 10.0d, "Timestamp"));
    }

    /**
     * Method under test: {@link Analytics#equals(Object)}
     */
    @Test
    void testEquals6() {
        Analytics analytics = new Analytics();
        analytics.setGlucose(10.0d);
        assertNotEquals(analytics, new Analytics());
    }

    /**
     * Method under test: {@link Analytics#equals(Object)}
     */
    @Test
    void testEquals7() {
        Analytics analytics = new Analytics();
        analytics.setBloodPressure(10.0d);
        assertNotEquals(analytics, new Analytics());
    }

    /**
     * Method under test: {@link Analytics#equals(Object)}
     */
    @Test
    void testEquals8() {
        Analytics analytics = new Analytics();
        analytics.setHeartRate(10.0d);
        assertNotEquals(analytics, new Analytics());
    }

    /**
     * Method under test: {@link Analytics#equals(Object)}
     */
    @Test
    void testEquals9() {
        Analytics analytics = new Analytics();
        analytics.setTemperature(10.0d);
        assertNotEquals(analytics, new Analytics());
    }

    /**
     * Method under test: {@link Analytics#equals(Object)}
     */
    @Test
    void testEquals10() {
        Analytics analytics = new Analytics();
        analytics.setWeight(10.0d);
        assertNotEquals(analytics, new Analytics());
    }

    /**
     * Method under test: {@link Analytics#equals(Object)}
     */
    @Test
    void testEquals11() {
        Analytics analytics = new Analytics();
        analytics.setHeight(10.0d);
        assertNotEquals(analytics, new Analytics());
    }

    /**
     * Method under test: {@link Analytics#equals(Object)}
     */
    @Test
    void testEquals12() {
        Analytics analytics = new Analytics();
        analytics.setBmi(10.0d);
        assertNotEquals(analytics, new Analytics());
    }

    /**
     * Method under test: {@link Analytics#equals(Object)}
     */
    @Test
    void testEquals13() {
        Analytics analytics = new Analytics();
        analytics.setTimestamp("Timestamp");
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
    void testEquals14() {
        Analytics analytics = new Analytics(123L, 10.0d, 10.0d, 10.0d, 10.0d, 10.0d, 10.0d, 10.0d, "Timestamp");
        Analytics analytics1 = new Analytics(123L, 10.0d, 10.0d, 10.0d, 10.0d, 10.0d, 10.0d, 10.0d, "Timestamp");

        assertEquals(analytics, analytics1);
        int expectedHashCodeResult = analytics.hashCode();
        assertEquals(expectedHashCodeResult, analytics1.hashCode());
    }

    /**
     * Method under test: {@link Analytics#equals(Object)}
     */
    @Test
    void testEquals15() {
        Analytics analytics = new Analytics();

        Analytics analytics1 = new Analytics();
        analytics1.setGlucose(10.0d);
        assertNotEquals(analytics, analytics1);
    }

    /**
     * Method under test: {@link Analytics#equals(Object)}
     */
    @Test
    void testEquals16() {
        Analytics analytics = new Analytics();

        Analytics analytics1 = new Analytics();
        analytics1.setBloodPressure(10.0d);
        assertNotEquals(analytics, analytics1);
    }

    /**
     * Method under test: {@link Analytics#equals(Object)}
     */
    @Test
    void testEquals17() {
        Analytics analytics = new Analytics();

        Analytics analytics1 = new Analytics();
        analytics1.setHeartRate(10.0d);
        assertNotEquals(analytics, analytics1);
    }

    /**
     * Method under test: {@link Analytics#equals(Object)}
     */
    @Test
    void testEquals18() {
        Analytics analytics = new Analytics();

        Analytics analytics1 = new Analytics();
        analytics1.setTemperature(10.0d);
        assertNotEquals(analytics, analytics1);
    }

    /**
     * Method under test: {@link Analytics#equals(Object)}
     */
    @Test
    void testEquals19() {
        Analytics analytics = new Analytics();

        Analytics analytics1 = new Analytics();
        analytics1.setWeight(10.0d);
        assertNotEquals(analytics, analytics1);
    }

    /**
     * Method under test: {@link Analytics#equals(Object)}
     */
    @Test
    void testEquals20() {
        Analytics analytics = new Analytics();

        Analytics analytics1 = new Analytics();
        analytics1.setHeight(10.0d);
        assertNotEquals(analytics, analytics1);
    }

    /**
     * Method under test: {@link Analytics#equals(Object)}
     */
    @Test
    void testEquals21() {
        Analytics analytics = new Analytics();

        Analytics analytics1 = new Analytics();
        analytics1.setBmi(10.0d);
        assertNotEquals(analytics, analytics1);
    }

    /**
     * Method under test: {@link Analytics#equals(Object)}
     */
    @Test
    void testEquals22() {
        Analytics analytics = new Analytics();

        Analytics analytics1 = new Analytics();
        analytics1.setTimestamp("Timestamp");
        assertNotEquals(analytics, analytics1);
    }
}

