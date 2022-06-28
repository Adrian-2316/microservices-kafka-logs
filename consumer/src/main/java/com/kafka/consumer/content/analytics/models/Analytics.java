package com.kafka.consumer.content.analytics.models;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Analytics {
    private Long id;
    private String level;
    private String message;
    private String timestamp;
    private String thread;
    private String environment;
    private String exception;
    private String stacktrace;

}
