package com.github.klikli19.newsapp.mapper;

import com.github.klikli19.newsapp.dto.FeedDTO;
import com.github.klikli19.newsapp.dto.UpdateFeedDTO;
import com.github.klikli19.newsapp.entity.Category;
import com.github.klikli19.newsapp.entity.Feed;
import org.mapstruct.*;

import java.time.LocalDateTime;
import java.time.ZoneOffset;

@Mapper(componentModel = MappingConstants.ComponentModel.SPRING)
public interface FeedMapper {

    Feed toEntity(FeedDTO dto);

    Category map(String value);

    FeedDTO toDto(Feed feed);
    String map(Category value);

    default Long createdDate(LocalDateTime value) {
        if (value == null) {
            return 0L;
        }
        return value.toInstant(ZoneOffset.ofHours(3)).toEpochMilli();
    }

    @Mapping(source = "title", target = "title", nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
    void patch(@MappingTarget Feed target, UpdateFeedDTO source);


}
