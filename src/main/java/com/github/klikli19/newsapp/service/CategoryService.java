package com.github.klikli19.newsapp.service;

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
}
