package com.github.klikli19.newsapp.service;

import com.github.klikli19.newsapp.dto.FeedDTO;
import com.github.klikli19.newsapp.dto.UpdateFeedDTO;
import com.github.klikli19.newsapp.entity.Feed;
import com.github.klikli19.newsapp.exception.FeedNotFoundException;
import com.github.klikli19.newsapp.mapper.FeedMapper;
import com.github.klikli19.newsapp.repository.FeedRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Slf4j
@Service
@RequiredArgsConstructor
public class FeedService {
    private final FeedRepository repository;
    private final FeedMapper mapper;

    public FeedDTO create(FeedDTO feedDTO) {
        Feed feed = mapper.toEntity(feedDTO);
        return mapper.toDto(repository.save(feed));
    }

    public FeedDTO patch(Long id, UpdateFeedDTO updateFeedDto) {
        Feed feed = repository.findById(id).orElseThrow(() -> new FeedNotFoundException(id));
        mapper.patch(feed, updateFeedDto);
        return mapper.toDto(repository.save(feed));
    }

    public void delete(long id) {
        Feed feed = repository.findById(id).orElseThrow(() -> new FeedNotFoundException(id));
        repository.delete(feed);
    }

    public List<Feed> getAll(Integer pageNum, Integer pageSize) {
            PageRequest request = PageRequest.of(pageNum - 1, pageSize);
            return repository.findAll(request).getContent();
    }

    public Optional<Feed> getFeedByCategory(String category) {
        return repository.findFeedByCategory_NameContainsIgnoreCase(category);
    }

    public Optional<Feed> getFeedByCTitle(String title) {
        return repository.findFeedByTitleContainsIgnoreCase(title);
    }

    public Optional<Feed> getFeedByContent(String content) {
        return repository.findFeedByContentContainsIgnoreCase(content);
    }
}
