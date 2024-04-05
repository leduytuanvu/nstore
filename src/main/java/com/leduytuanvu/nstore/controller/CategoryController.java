package com.leduytuanvu.nstore.controller;

import com.leduytuanvu.nstore.model.Category;
import com.leduytuanvu.nstore.response.ResponseHandler;
import com.leduytuanvu.nstore.service.CategoryService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.io.Console;
import java.util.List;

@RestController
@RequestMapping("/category")
public class CategoryController {
    CategoryService categoryService;

    public CategoryController(CategoryService categoryService) {
        this.categoryService = categoryService;
    }

    // Read specific category
    @GetMapping("{categoryId}")
    public ResponseEntity<Object> getCategory(@PathVariable("categoryId") String categoryId) {
        return ResponseHandler.responseBuilder(HttpStatus.OK, "Request category details are given here", categoryService.getCategory(categoryId));
    }

    // Read all categories
    @GetMapping()
    public List<Category> getAllCategory() {
        System.out.println("Go into get all category: " + categoryService.getAllCategory().size());
        return categoryService.getAllCategory();
    }

    // Create new category
    @PostMapping()
    public String createCategory(@RequestBody Category category) {
        categoryService.createCategory(category);
        return "Create category successfully";
    }

    @PutMapping()
    public String updateCategory(@RequestBody Category category) {
        categoryService.updateCategory(category);
        return "Update category successfully!";
    }

    @DeleteMapping("{categoryId}")
    public String deleteCategory(@PathVariable("categoryId") String categoryId) {
        categoryService.deleteCategory(categoryId);
        return "Delete category successfully!";
    }
}
