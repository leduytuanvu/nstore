package com.leduytuanvu.nstore.controller;

import com.leduytuanvu.nstore.exception.CategoryNotFoundException;
import com.leduytuanvu.nstore.model.Category;
import com.leduytuanvu.nstore.response.ResponseCustom;
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
    public ResponseEntity<Object> getCategory(@PathVariable("id") Integer id) {
        ResponseCustom responseCustom = categoryService.getCategory(id);
        return ResponseHandler.responseBuilder(responseCustom);
    }

    // Read all categories
    @GetMapping()
    public ResponseEntity<Object> getAllCategory() {
        ResponseCustom responseCustom = categoryService.getAllCategory();
        return ResponseHandler.responseBuilder(responseCustom);
    }

    // Create new category
    @PostMapping()
    public ResponseEntity<Object> createCategory(@RequestBody Category category) {
        ResponseCustom responseCustom = categoryService.createCategory(category);
        return ResponseHandler.responseBuilder(responseCustom);
    }

    @PutMapping("{id}")
    public ResponseEntity<Object> updateCategory(@PathVariable("id") Integer id, @RequestBody Category category) {
        ResponseCustom responseCustom = categoryService.updateCategory(id, category);
        return ResponseHandler.responseBuilder(responseCustom);
    }

    @DeleteMapping("{id}")
    public ResponseEntity<Object> deleteCategory(@PathVariable("id") Integer id) {
        ResponseCustom responseCustom = categoryService.deleteCategory(id);
        return ResponseHandler.responseBuilder(responseCustom);
    }
}
