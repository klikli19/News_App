package com.github.klikli19.newsapp.exception;

import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.NOT_FOUND)
@RequiredArgsConstructor
public class CategoryNameNotFoundException extends RuntimeException{
    private final String text;
    @Override
    public String getMessage() {
        return "Категория  " + text + " не найдена!";
    }
}

