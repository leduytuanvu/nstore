package com.leduytuanvu.nstore.controller;

import com.leduytuanvu.nstore.model.Category;
import com.leduytuanvu.nstore.response.ResponseHandler;
import com.leduytuanvu.nstore.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/category")
public class CategoryController {
    @Autowired
    CategoryService categoryService;

    public CategoryController(CategoryService categoryService) {
        this.categoryService = categoryService;
    }

    // Read specific category
    @GetMapping("{id}")
    public ResponseEntity<Object> getCategory(@PathVariable("id") String id) {
        return ResponseHandler.responseBuilder(HttpStatus.OK, "Request category details are given here", categoryService.getCategory(id));
    }

    // Read all categories
    @GetMapping()
    public List<Category> getAllCategory() {
        return categoryService.getAllCategory();
    }

    // Create new category
    @PostMapping()
    public String createCategory(@RequestBody Category category) {
        return categoryService.createCategory(category);
    }

    @PutMapping()
    public String updateCategory(@RequestBody Category category) {
        return categoryService.updateCategory(category);
    }

    @DeleteMapping("{id}")
    public String deleteCategory(@PathVariable("id") String id) {
        return categoryService.deleteCategory(id);
    }
}
