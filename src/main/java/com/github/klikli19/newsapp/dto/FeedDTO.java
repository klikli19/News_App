package com.github.klikli19.newsapp.dto;

import lombok.Data;

@Data
public class FeedDTO {
    private Long id;
    private String title;
    private String content;
    private Long createdAt;
    private String category;

}
