package com.kafka.consumer.content.processing.adapter.in.kafka;

import co.elastic.clients.elasticsearch.xpack.usage.Analytics;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
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
                return mapper.readValue(bytes, new TypeReference<>() {
                });
            } catch (final IOException e) {
                throw new IllegalArgumentException(e);
            }
        }
    }