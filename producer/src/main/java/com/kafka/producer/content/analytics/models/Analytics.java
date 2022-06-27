package com.kafka.producer.content.analytics.models;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Random;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Analytics {

    private Long id;
    private Double glucose;
    private Double bloodPressure;
    private Double heartRate;
    private Double temperature;
    private Double weight;
    private Double height;
    private Double bmi; // body mass index
    private String timestamp;

    public void randomizeAnalytics() {
        Random random = new Random();
        this.id = random.nextLong();
        this.glucose = Math.random() * 100;
        this.bloodPressure = Math.random() * 100;
        this.heartRate = Math.random() * 100;
        this.temperature = Math.random() * 100;
        this.weight = Math.random() * 100;
        this.height = Math.random() * 100;
        this.bmi = Math.random() * 100;
        this.timestamp = String.valueOf(System.currentTimeMillis());
    }
}
