package com.github.klikli19.newsapp.dto;

import lombok.Data;

@Data
public class CreateFeedDTO {
    private String title;
    private String content;
    private String category;
}
