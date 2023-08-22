package com.github.klikli19.newsapp.service;

import com.github.klikli19.newsapp.dto.CategoryDTO;
import com.github.klikli19.newsapp.entity.Category;
import com.github.klikli19.newsapp.exception.CategoryNotFoundException;
import com.github.klikli19.newsapp.mapper.CategoryMapper;
import com.github.klikli19.newsapp.repository.CategoryRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Slf4j
@Service
@RequiredArgsConstructor
public class CategoryService {
    private final CategoryRepository repository;
    private final CategoryMapper mapper;

    public CategoryDTO create(CategoryDTO categoryDTO) {
        Category category = mapper.toEntity(categoryDTO);
        return mapper.toDto(repository.save(category));
    }

    public CategoryDTO patch(Long id, CategoryDTO categoryDTO) {
        Category category = repository.findById(id).orElseThrow(() -> new CategoryNotFoundException(id));
        mapper.patch(category, categoryDTO);
        return mapper.toDto(repository.save(category));
    }

    public void delete(long id) {
        Category category = repository.findById(id).orElseThrow(() -> new CategoryNotFoundException(id));
        repository.delete(category);
    }
}
