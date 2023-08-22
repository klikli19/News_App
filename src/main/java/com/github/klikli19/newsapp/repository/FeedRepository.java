package com.github.klikli19.newsapp.repository;

import com.github.klikli19.newsapp.entity.Feed;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Repository;

import java.util.Optional;
@Repository
@EnableJpaRepositories
public interface FeedRepository extends JpaRepository<Feed, Long> {
    Optional<Feed> findFeedByCategory_NameContainsIgnoreCase(String category);
    Optional<Feed> findFeedByTitleContainsIgnoreCase(String title);

    Optional<Feed> findFeedByContentContainsIgnoreCase(String content);
}
