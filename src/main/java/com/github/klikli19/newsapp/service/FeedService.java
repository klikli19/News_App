package com.github.klikli19.newsapp.service;

import com.github.klikli19.newsapp.mapper.FeedMapper;
import com.github.klikli19.newsapp.repository.FeedRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Slf4j
@Service
@RequiredArgsConstructor
public class FeedService {
    private final FeedRepository repository;
    private final FeedMapper mapper;


}
