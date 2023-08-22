package com.github.klikli19.newsapp.mapper;

import com.github.klikli19.newsapp.dto.CategoryDTO;
import com.github.klikli19.newsapp.entity.Category;
import org.mapstruct.*;

@Mapper(componentModel = MappingConstants.ComponentModel.SPRING)
public interface CategoryMapper {

    CategoryDTO toDto(Category category);
    Category toEntity(CategoryDTO dto);

    @Mapping(source = "name", target = "name", nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
    void patch(@MappingTarget Category target, CategoryDTO source);
}
