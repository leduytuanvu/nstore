package com.leduytuanvu.nstore.service;

import com.leduytuanvu.nstore.model.Category;
import java.util.List;
import java.util.UUID;

public interface CategoryService {
    public String createCategory(Category category);
    public String updateCategory(Category category);
    public String deleteCategory(String id);
    public Category getCategory(String id);
    public List<Category> getAllCategory();
}
