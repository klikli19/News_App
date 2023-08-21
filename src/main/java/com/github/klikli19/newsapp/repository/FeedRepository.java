package com.github.klikli19.newsapp.repository;

import com.github.klikli19.newsapp.entity.Feed;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface FeedRepository extends JpaRepository<Feed, Long> {
    Optional<Feed> findByCategoryContainsIgnoreCase(String category);
    Optional<Feed> findByTitleContainsIgnoreCase(String title);

    Optional<Feed> findByContentContainsIgnoreCase(String content);
}
