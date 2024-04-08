package com.leduytuanvu.nstore.service.impl;

import com.leduytuanvu.nstore.exception.CategoryNotFoundException;
import com.leduytuanvu.nstore.model.Category;
import com.leduytuanvu.nstore.repository.CategoryRepository;
import com.leduytuanvu.nstore.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.UUID;

@Service
public class CategoryServiceImpl implements CategoryService {
    @Autowired
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
    public String deleteCategory(String id) {
        // More business logic
        categoryRepository.deleteById(id);
        return "Success";
    }
    @Override
    public Category getCategory(String id) {
        // More business logic
        if(categoryRepository.findById(id).isEmpty()){
            throw new CategoryNotFoundException("Category not found");
        }
        return categoryRepository.findById(id).get();
    }
    @Override
    public List<Category> getAllCategory() {
        // More business logic
        return categoryRepository.findAll();
    }
}
