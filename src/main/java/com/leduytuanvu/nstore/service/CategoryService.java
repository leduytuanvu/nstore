package com.leduytuanvu.nstore.service;

import com.leduytuanvu.nstore.model.Category;
import com.leduytuanvu.nstore.response.ResponseCustom;

public interface CategoryService {
    public ResponseCustom createCategory(Category category);
    public ResponseCustom updateCategory(Integer id, Category category);
    public ResponseCustom deleteCategory(Integer id);
    public ResponseCustom getCategory(Integer id);
    public ResponseCustom getAllCategory();
}