package com.kafka.producer.content.analytics.adapter.in.rest.dtos;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class AnalyticsDto {
    private Long id;
    private Double glucose;
    private Double bloodPressure;
    private Double heartRate;
    private Double temperature;
    private Double weight;
    private Double height;
    private Double bmi; // body mass index
    private String timestamp;

}
