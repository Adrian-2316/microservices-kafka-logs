package com.kafka.consumer.content.analytics.adapter.in.kafka;


import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.kafka.consumer.content.analytics.models.Analytics;
import org.apache.kafka.common.serialization.Deserializer;

import java.io.IOException;

public class AnalyticsDeserializer  implements Deserializer {

        private ObjectMapper mapper;

        @Override
        public void close() {
        }


        @Override
        public Analytics deserialize(final String topic, final byte[] bytes) {
            try {
                return mapper.readValue(bytes, new TypeReference<Analytics>() {
                });
            } catch (final IOException e) {
                throw new IllegalArgumentException(e);
            }
        }
    }

