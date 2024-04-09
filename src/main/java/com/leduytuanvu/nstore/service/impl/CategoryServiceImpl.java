package com.leduytuanvu.nstore.service.impl;

import com.leduytuanvu.nstore.exception.CategoryNotFoundException;
import com.leduytuanvu.nstore.model.Category;
import com.leduytuanvu.nstore.repository.CategoryRepository;
import com.leduytuanvu.nstore.response.ResponseCustom;
import com.leduytuanvu.nstore.response.ResponseHandler;
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
    public ResponseCustom createCategory(Category category) {
        // More business logic
        ResponseCustom responseCustom = new ResponseCustom();
        categoryRepository.save(category);
        responseCustom.setResponseCustom200(null);
        return responseCustom;
    }
    @Override
    public ResponseCustom updateCategory(Integer id, Category category) {
        // More business logic
        ResponseCustom responseCustom = new ResponseCustom();
        if (id != category.getId()) {
            return responseCustom.setResponseCustom400("Id and category's id do not match");
        }
        if(categoryRepository.findById(id).isEmpty()){
            return responseCustom.setResponseCustom404("Not found this category's id");
        }
        categoryRepository.save(category);
        responseCustom.setResponseCustom200(null);
        return responseCustom;
    }
    @Override
    public ResponseCustom deleteCategory(Integer id) {
        // More business logic
        ResponseCustom responseCustom = new ResponseCustom();
        categoryRepository.deleteById(id);
        responseCustom.setResponseCustom200(null);
        return responseCustom;
    }
    @Override
    public ResponseCustom getCategory(Integer id) {
        // More business logic
        ResponseCustom responseCustom = new ResponseCustom();
        if(categoryRepository.findById(id).isEmpty()){
            return responseCustom.setResponseCustom404("Not found this category's id");
        }
        return responseCustom.setResponseCustom200(categoryRepository.findById(id).get());
    }
    @Override
    public ResponseCustom getAllCategory() {
        // More business logic
        ResponseCustom responseCustom = new ResponseCustom();
        return responseCustom.setResponseCustom200(categoryRepository.findAll());
    }
}
