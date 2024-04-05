package com.leduytuanvu.nstore.service.impl;

import com.leduytuanvu.nstore.exception.CategoryNotFoundException;
import com.leduytuanvu.nstore.model.Category;
import com.leduytuanvu.nstore.repository.CategoryRepository;
import com.leduytuanvu.nstore.service.CategoryService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoryServiceImpl implements CategoryService {
    CategoryRepository categoryRepository;

    public CategoryServiceImpl(CategoryRepository categoryRepository) {
        this.categoryRepository = categoryRepository;
    }

    @Override
    public String createCategory(Category category) {
        // More business logic
        categoryRepository.save(category);
        return "Success";
    }

    @Override
    public String updateCategory(Category category) {
        // More business logic
        categoryRepository.save(category);
        return "Success";
    }

    @Override
    public String deleteCategory(String categoryId) {
        // More business logic
        categoryRepository.deleteById(categoryId);
        return "Success";
    }

    @Override
    public Category getCategory(String categoryId) {
        // More business logic
        if(categoryRepository.findById(categoryId).isEmpty()){
            throw new CategoryNotFoundException("Category not found");
        }
        return categoryRepository.findById(categoryId).get();
    }

    @Override
    public List<Category> getAllCategory() {
        // More business logic
        System.out.println("Go into get all category 1: " + categoryRepository.findAll().size());
        return categoryRepository.findAll();
    }
}
