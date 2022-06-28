package com.kafka.consumer.content.analytics.models;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Analytics {
    private Long id;
    private Double glucose;
    private Double bloodPressure;
    private Boolean doingSport;
    private Integer heartRate;
    private Double temperature;
    private Double weight;
    private Double height;
    // private Double bmi; //TODO calcularlo en el server
    private String timestamp;


}
