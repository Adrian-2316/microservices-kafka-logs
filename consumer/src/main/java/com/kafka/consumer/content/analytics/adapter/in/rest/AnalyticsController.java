package com.kafka.consumer.content.analytics.adapter.in.rest;

import com.kafka.consumer.content.analytics.adapter.in.rest.dtos.AnalyticsDto;
import com.kafka.consumer.content.analytics.adapter.in.rest.dtos.AnalyticsDtoMapper;
import com.kafka.consumer.content.analytics.service.ports.in.AnalyticsPort;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.AllArgsConstructor;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@AllArgsConstructor
@RestController
@Tag(name = "Analytics")
@RequestMapping("api/v0/analytics")
public class AnalyticsController {
    private AnalyticsPort analyticsPort;

    @PostMapping("/")
    @Transactional(rollbackFor = Exception.class)
    public AnalyticsDto createAnalytics(@RequestBody AnalyticsDto analyticsDto) {
        return AnalyticsDtoMapper.INSTANCE.toDto(analyticsPort.createAnalytics(AnalyticsDtoMapper.INSTANCE.toDomainModel(analyticsDto)));
    }

}
