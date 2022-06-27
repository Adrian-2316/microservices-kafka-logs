package com.kafka.producer.content.analytics.adapter.in.rest.dtos;

import com.kafka.producer.content.analytics.models.Analytics;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface AnalyticsDtoMapper {
    AnalyticsDtoMapper INSTANCE = Mappers.getMapper(AnalyticsDtoMapper.class);

    Analytics toDomainModel(AnalyticsDto analyticsDto);
}
