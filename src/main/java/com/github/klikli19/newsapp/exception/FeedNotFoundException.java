package com.github.klikli19.newsapp.exception;

import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.NOT_FOUND)
@RequiredArgsConstructor
public class FeedNotFoundException extends RuntimeException{
    private final long id;
    @Override
    public String getMessage() {
        return "Новость с id = " + id + " не найдена!";
    }
}
