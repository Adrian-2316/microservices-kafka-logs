package com.kafka.producer.content.analytics.adapter.out.kafka;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.apache.kafka.common.header.Headers;
import org.apache.kafka.common.serialization.Serializer;


public class AnalyticsSerializer implements Serializer {
    private ObjectMapper mapper;

    public AnalyticsSerializer() {
        mapper = new ObjectMapper();
    }

    @Override
    public byte[] serialize(String s, Object analytics) {
        try {
            return mapper.writeValueAsBytes(analytics);
        } catch (final JsonProcessingException e) {
            throw new IllegalArgumentException(e);
        }
    }

    @Override
    public byte[] serialize(String topic, Headers headers, Object analytics) {
        try {
            return mapper.writeValueAsBytes(analytics);
        } catch (final JsonProcessingException e) {
            throw new IllegalArgumentException(e);
        }
    }

    @Override
    public void close() {
    }


}
