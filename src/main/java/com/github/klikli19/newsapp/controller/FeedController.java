package com.github.klikli19.newsapp.controller;


import com.github.klikli19.newsapp.dto.FeedDTO;
import com.github.klikli19.newsapp.dto.UpdateFeedDTO;
import com.github.klikli19.newsapp.entity.Feed;
import com.github.klikli19.newsapp.service.FeedService;
import jakarta.validation.Valid;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/feeds")
@AllArgsConstructor
public class FeedController {
    private final FeedService service;

    @PostMapping("/add")
    public FeedDTO create(@RequestBody @Valid FeedDTO dto){
        return service.create(dto);
    }

    @PatchMapping("/{id}")
    public FeedDTO patchFeed(@PathVariable("id") Long id,
                             @RequestBody @Valid UpdateFeedDTO updateFeedDto) {
        return service.patch(id, updateFeedDto);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable long id) {
        service.delete(id);
    }

    @GetMapping("/all")
    public List<Feed> getAll(@RequestParam Integer pageNum,
                             @RequestParam Integer pageSize) {
        return service.getAll(pageNum, pageSize);
    }

    @GetMapping("/category")
    public Optional<Feed> getByCategory(@RequestParam String category) {
        return service.getFeedByCategory(category);
    }

    @GetMapping("/title")
    public Optional<Feed> getByTitle(@RequestParam String title) {
        return service.getFeedByCTitle(title);
    }

    @GetMapping("/content")
    public Optional<Feed> getByContent(@RequestParam String content) {
        return service.getFeedByContent(content);
    }
}
