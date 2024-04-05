package com.leduytuanvu.nstore.service;

import com.leduytuanvu.nstore.model.Category;

import java.util.List;

public interface CategoryService {
    public String createCategory(Category category);
    public String updateCategory(Category category);
    public String deleteCategory(String categoryId);
    public Category getCategory(String categoryId);
    public List<Category> getAllCategory();
}
