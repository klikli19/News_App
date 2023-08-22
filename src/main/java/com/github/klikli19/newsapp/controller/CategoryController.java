package com.github.klikli19.newsapp.controller;

import com.github.klikli19.newsapp.dto.CategoryDTO;
import com.github.klikli19.newsapp.service.CategoryService;
import jakarta.validation.Valid;
import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/categories")
@AllArgsConstructor
public class CategoryController {

    private final CategoryService service;

    @PostMapping("/add")
    public CategoryDTO create(@RequestBody @Valid CategoryDTO dto){
        return service.create(dto);
    }

    @PatchMapping("/{id}")
    public CategoryDTO patchFeed(@PathVariable("id") Long id,
                             @RequestBody @Valid CategoryDTO dto) {
        return service.patch(id, dto);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable long id) {
        service.delete(id);
    }

}
