package com.kafka.producer.content.analytics.adapter.in.rest.dtos;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

class AnalyticsDtoTest {
    /**
     * Method under test: {@link AnalyticsDto#canEqual(Object)}
     */
    @Test
    void testCanEqual() {
        assertFalse((new AnalyticsDto()).canEqual("Other"));
    }

    /**
     * Method under test: {@link AnalyticsDto#canEqual(Object)}
     */
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
     *   <li>{@link AnalyticsDto#setBloodPressure(Double)}
     *   <li>{@link AnalyticsDto#setBmi(Double)}
     *   <li>{@link AnalyticsDto#setGlucose(Double)}
     *   <li>{@link AnalyticsDto#setHeartRate(Double)}
     *   <li>{@link AnalyticsDto#setHeight(Double)}
     *   <li>{@link AnalyticsDto#setId(Long)}
     *   <li>{@link AnalyticsDto#setTemperature(Double)}
     *   <li>{@link AnalyticsDto#setTimestamp(String)}
     *   <li>{@link AnalyticsDto#setWeight(Double)}
     *   <li>{@link AnalyticsDto#toString()}
     *   <li>{@link AnalyticsDto#getBloodPressure()}
     *   <li>{@link AnalyticsDto#getBmi()}
     *   <li>{@link AnalyticsDto#getGlucose()}
     *   <li>{@link AnalyticsDto#getHeartRate()}
     *   <li>{@link AnalyticsDto#getHeight()}
     *   <li>{@link AnalyticsDto#getId()}
     *   <li>{@link AnalyticsDto#getTemperature()}
     *   <li>{@link AnalyticsDto#getTimestamp()}
     *   <li>{@link AnalyticsDto#getWeight()}
     * </ul>
     */
    @Test
    void testConstructor() {
        AnalyticsDto actualAnalyticsDto = new AnalyticsDto();
        actualAnalyticsDto.setBloodPressure(10.0d);
        actualAnalyticsDto.setBmi(10.0d);
        actualAnalyticsDto.setGlucose(10.0d);
        actualAnalyticsDto.setHeartRate(10.0d);
        actualAnalyticsDto.setHeight(10.0d);
        actualAnalyticsDto.setId(123L);
        actualAnalyticsDto.setTemperature(10.0d);
        actualAnalyticsDto.setTimestamp("Timestamp");
        actualAnalyticsDto.setWeight(10.0d);
        String actualToStringResult = actualAnalyticsDto.toString();
        assertEquals(10.0d, actualAnalyticsDto.getBloodPressure().doubleValue());
        assertEquals(10.0d, actualAnalyticsDto.getBmi().doubleValue());
        assertEquals(10.0d, actualAnalyticsDto.getGlucose().doubleValue());
        assertEquals(10.0d, actualAnalyticsDto.getHeartRate().doubleValue());
        assertEquals(10.0d, actualAnalyticsDto.getHeight().doubleValue());
        assertEquals(123L, actualAnalyticsDto.getId().longValue());
        assertEquals(10.0d, actualAnalyticsDto.getTemperature().doubleValue());
        assertEquals("Timestamp", actualAnalyticsDto.getTimestamp());
        assertEquals(10.0d, actualAnalyticsDto.getWeight().doubleValue());
        assertEquals("AnalyticsDto(id=123, glucose=10.0, bloodPressure=10.0, heartRate=10.0, temperature=10.0, weight=10.0,"
                + " height=10.0, bmi=10.0, timestamp=Timestamp)", actualToStringResult);
    }

    /**
     * Methods under test:
     *
     * <ul>
     *   <li>{@link AnalyticsDto#AnalyticsDto(Long, Double, Double, Double, Double, Double, Double, Double, String)}
     *   <li>{@link AnalyticsDto#setBloodPressure(Double)}
     *   <li>{@link AnalyticsDto#setBmi(Double)}
     *   <li>{@link AnalyticsDto#setGlucose(Double)}
     *   <li>{@link AnalyticsDto#setHeartRate(Double)}
     *   <li>{@link AnalyticsDto#setHeight(Double)}
     *   <li>{@link AnalyticsDto#setId(Long)}
     *   <li>{@link AnalyticsDto#setTemperature(Double)}
     *   <li>{@link AnalyticsDto#setTimestamp(String)}
     *   <li>{@link AnalyticsDto#setWeight(Double)}
     *   <li>{@link AnalyticsDto#toString()}
     *   <li>{@link AnalyticsDto#getBloodPressure()}
     *   <li>{@link AnalyticsDto#getBmi()}
     *   <li>{@link AnalyticsDto#getGlucose()}
     *   <li>{@link AnalyticsDto#getHeartRate()}
     *   <li>{@link AnalyticsDto#getHeight()}
     *   <li>{@link AnalyticsDto#getId()}
     *   <li>{@link AnalyticsDto#getTemperature()}
     *   <li>{@link AnalyticsDto#getTimestamp()}
     *   <li>{@link AnalyticsDto#getWeight()}
     * </ul>
     */
    @Test
    void testConstructor2() {
        AnalyticsDto actualAnalyticsDto = new AnalyticsDto(123L, 10.0d, 10.0d, 10.0d, 10.0d, 10.0d, 10.0d, 10.0d,
                "Timestamp");
        actualAnalyticsDto.setBloodPressure(10.0d);
        actualAnalyticsDto.setBmi(10.0d);
        actualAnalyticsDto.setGlucose(10.0d);
        actualAnalyticsDto.setHeartRate(10.0d);
        actualAnalyticsDto.setHeight(10.0d);
        actualAnalyticsDto.setId(123L);
        actualAnalyticsDto.setTemperature(10.0d);
        actualAnalyticsDto.setTimestamp("Timestamp");
        actualAnalyticsDto.setWeight(10.0d);
        String actualToStringResult = actualAnalyticsDto.toString();
        assertEquals(10.0d, actualAnalyticsDto.getBloodPressure().doubleValue());
        assertEquals(10.0d, actualAnalyticsDto.getBmi().doubleValue());
        assertEquals(10.0d, actualAnalyticsDto.getGlucose().doubleValue());
        assertEquals(10.0d, actualAnalyticsDto.getHeartRate().doubleValue());
        assertEquals(10.0d, actualAnalyticsDto.getHeight().doubleValue());
        assertEquals(123L, actualAnalyticsDto.getId().longValue());
        assertEquals(10.0d, actualAnalyticsDto.getTemperature().doubleValue());
        assertEquals("Timestamp", actualAnalyticsDto.getTimestamp());
        assertEquals(10.0d, actualAnalyticsDto.getWeight().doubleValue());
        assertEquals("AnalyticsDto(id=123, glucose=10.0, bloodPressure=10.0, heartRate=10.0, temperature=10.0, weight=10.0,"
                + " height=10.0, bmi=10.0, timestamp=Timestamp)", actualToStringResult);
    }

    /**
     * Method under test: {@link AnalyticsDto#equals(Object)}
     */
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

    /**
     * Method under test: {@link AnalyticsDto#equals(Object)}
     */
    @Test
    void testEquals4() {
        AnalyticsDto analyticsDto = new AnalyticsDto(123L, 10.0d, 10.0d, 10.0d, 10.0d, 10.0d, 10.0d, 10.0d, "Timestamp");
        assertNotEquals(analyticsDto, new AnalyticsDto());
    }

    /**
     * Method under test: {@link AnalyticsDto#equals(Object)}
     */
    @Test
    void testEquals5() {
        AnalyticsDto analyticsDto = new AnalyticsDto();
        assertNotEquals(analyticsDto, new AnalyticsDto(123L, 10.0d, 10.0d, 10.0d, 10.0d, 10.0d, 10.0d, 10.0d, "Timestamp"));
    }

    /**
     * Method under test: {@link AnalyticsDto#equals(Object)}
     */
    @Test
    void testEquals6() {
        AnalyticsDto analyticsDto = new AnalyticsDto();
        analyticsDto.setGlucose(10.0d);
        assertNotEquals(analyticsDto, new AnalyticsDto());
    }

    /**
     * Method under test: {@link AnalyticsDto#equals(Object)}
     */
    @Test
    void testEquals7() {
        AnalyticsDto analyticsDto = new AnalyticsDto();
        analyticsDto.setBloodPressure(10.0d);
        assertNotEquals(analyticsDto, new AnalyticsDto());
    }

    /**
     * Method under test: {@link AnalyticsDto#equals(Object)}
     */
    @Test
    void testEquals8() {
        AnalyticsDto analyticsDto = new AnalyticsDto();
        analyticsDto.setHeartRate(10.0d);
        assertNotEquals(analyticsDto, new AnalyticsDto());
    }

    /**
     * Method under test: {@link AnalyticsDto#equals(Object)}
     */
    @Test
    void testEquals9() {
        AnalyticsDto analyticsDto = new AnalyticsDto();
        analyticsDto.setTemperature(10.0d);
        assertNotEquals(analyticsDto, new AnalyticsDto());
    }

    /**
     * Method under test: {@link AnalyticsDto#equals(Object)}
     */
    @Test
    void testEquals10() {
        AnalyticsDto analyticsDto = new AnalyticsDto();
        analyticsDto.setWeight(10.0d);
        assertNotEquals(analyticsDto, new AnalyticsDto());
    }

    /**
     * Method under test: {@link AnalyticsDto#equals(Object)}
     */
    @Test
    void testEquals11() {
        AnalyticsDto analyticsDto = new AnalyticsDto();
        analyticsDto.setHeight(10.0d);
        assertNotEquals(analyticsDto, new AnalyticsDto());
    }

    /**
     * Method under test: {@link AnalyticsDto#equals(Object)}
     */
    @Test
    void testEquals12() {
        AnalyticsDto analyticsDto = new AnalyticsDto();
        analyticsDto.setBmi(10.0d);
        assertNotEquals(analyticsDto, new AnalyticsDto());
    }

    /**
     * Method under test: {@link AnalyticsDto#equals(Object)}
     */
    @Test
    void testEquals13() {
        AnalyticsDto analyticsDto = new AnalyticsDto();
        analyticsDto.setTimestamp("Timestamp");
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
    void testEquals14() {
        AnalyticsDto analyticsDto = new AnalyticsDto(123L, 10.0d, 10.0d, 10.0d, 10.0d, 10.0d, 10.0d, 10.0d, "Timestamp");
        AnalyticsDto analyticsDto1 = new AnalyticsDto(123L, 10.0d, 10.0d, 10.0d, 10.0d, 10.0d, 10.0d, 10.0d, "Timestamp");

        assertEquals(analyticsDto, analyticsDto1);
        int expectedHashCodeResult = analyticsDto.hashCode();
        assertEquals(expectedHashCodeResult, analyticsDto1.hashCode());
    }

    /**
     * Method under test: {@link AnalyticsDto#equals(Object)}
     */
    @Test
    void testEquals15() {
        AnalyticsDto analyticsDto = new AnalyticsDto();

        AnalyticsDto analyticsDto1 = new AnalyticsDto();
        analyticsDto1.setGlucose(10.0d);
        assertNotEquals(analyticsDto, analyticsDto1);
    }

    /**
     * Method under test: {@link AnalyticsDto#equals(Object)}
     */
    @Test
    void testEquals16() {
        AnalyticsDto analyticsDto = new AnalyticsDto();

        AnalyticsDto analyticsDto1 = new AnalyticsDto();
        analyticsDto1.setBloodPressure(10.0d);
        assertNotEquals(analyticsDto, analyticsDto1);
    }

    /**
     * Method under test: {@link AnalyticsDto#equals(Object)}
     */
    @Test
    void testEquals17() {
        AnalyticsDto analyticsDto = new AnalyticsDto();

        AnalyticsDto analyticsDto1 = new AnalyticsDto();
        analyticsDto1.setHeartRate(10.0d);
        assertNotEquals(analyticsDto, analyticsDto1);
    }

    /**
     * Method under test: {@link AnalyticsDto#equals(Object)}
     */
    @Test
    void testEquals18() {
        AnalyticsDto analyticsDto = new AnalyticsDto();

        AnalyticsDto analyticsDto1 = new AnalyticsDto();
        analyticsDto1.setTemperature(10.0d);
        assertNotEquals(analyticsDto, analyticsDto1);
    }

    /**
     * Method under test: {@link AnalyticsDto#equals(Object)}
     */
    @Test
    void testEquals19() {
        AnalyticsDto analyticsDto = new AnalyticsDto();

        AnalyticsDto analyticsDto1 = new AnalyticsDto();
        analyticsDto1.setWeight(10.0d);
        assertNotEquals(analyticsDto, analyticsDto1);
    }

    /**
     * Method under test: {@link AnalyticsDto#equals(Object)}
     */
    @Test
    void testEquals20() {
        AnalyticsDto analyticsDto = new AnalyticsDto();

        AnalyticsDto analyticsDto1 = new AnalyticsDto();
        analyticsDto1.setHeight(10.0d);
        assertNotEquals(analyticsDto, analyticsDto1);
    }

    /**
     * Method under test: {@link AnalyticsDto#equals(Object)}
     */
    @Test
    void testEquals21() {
        AnalyticsDto analyticsDto = new AnalyticsDto();

        AnalyticsDto analyticsDto1 = new AnalyticsDto();
        analyticsDto1.setBmi(10.0d);
        assertNotEquals(analyticsDto, analyticsDto1);
    }

    /**
     * Method under test: {@link AnalyticsDto#equals(Object)}
     */
    @Test
    void testEquals22() {
        AnalyticsDto analyticsDto = new AnalyticsDto();

        AnalyticsDto analyticsDto1 = new AnalyticsDto();
        analyticsDto1.setTimestamp("Timestamp");
        assertNotEquals(analyticsDto, analyticsDto1);
    }
}

