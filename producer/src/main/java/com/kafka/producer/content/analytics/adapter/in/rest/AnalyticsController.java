package com.kafka.producer.content.analytics.adapter.in.rest;

import com.kafka.producer.content.analytics.service.ports.in.AnalyticsPort;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.AllArgsConstructor;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@AllArgsConstructor
@RestController
@Tag(name = "Analytics")
@RequestMapping("api/v0/analytics")
public class AnalyticsController {
    private AnalyticsPort analyticsPort;

    @PostMapping("/send")
    @Transactional(rollbackFor = Exception.class)
    public void sendAnalytics() {
        analyticsPort.sendAnalytics();
    }

}
