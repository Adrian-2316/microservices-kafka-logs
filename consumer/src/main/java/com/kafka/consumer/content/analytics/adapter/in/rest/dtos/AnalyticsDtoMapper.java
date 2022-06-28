package com.kafka.consumer.content.analytics.adapter.in.rest.dtos;

import com.kafka.consumer.content.analytics.models.Analytics;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface AnalyticsDtoMapper {
    AnalyticsDtoMapper INSTANCE = Mappers.getMapper(AnalyticsDtoMapper.class);

    AnalyticsDto toDto(Analytics analytics);

    Analytics toDomainModel(AnalyticsDto analyticsDto);
}
