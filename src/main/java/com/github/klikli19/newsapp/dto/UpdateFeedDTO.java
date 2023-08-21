package com.github.klikli19.newsapp.dto;


import com.github.klikli19.newsapp.entity.Category;
import jakarta.validation.constraints.Size;
import lombok.Data;

@Data
public class UpdateFeedDTO {
    @Size(min = 3, max = 100)
    private String title;

    private String content;

    private Category category;
}
