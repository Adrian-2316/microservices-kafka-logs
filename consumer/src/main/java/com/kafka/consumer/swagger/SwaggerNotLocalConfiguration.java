package com.kafka.consumer.swagger;

import org.springdoc.core.GroupedOpenApi;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Profile("!local")
@Configuration
public class SwaggerNotLocalConfiguration {

    @Bean
    public GroupedOpenApi publicApi() {
        return GroupedOpenApi.builder().group("Consumer").packagesToScan("com.kafka.consumer.content").pathsToMatch("/**").build();

    }
}
