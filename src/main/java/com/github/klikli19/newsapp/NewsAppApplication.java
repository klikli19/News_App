package com.github.klikli19.newsapp;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
@OpenAPIDefinition
@SpringBootApplication
public class NewsAppApplication {

    public static void main(String[] args) {
        SpringApplication.run(NewsAppApplication.class, args);
    }

}
