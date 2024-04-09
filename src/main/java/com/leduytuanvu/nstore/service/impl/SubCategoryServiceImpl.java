package com.leduytuanvu.nstore.service.impl;

import com.leduytuanvu.nstore.model.SubCategory;
import com.leduytuanvu.nstore.repository.CategoryRepository;
import com.leduytuanvu.nstore.repository.SubCategoryRepository;
import com.leduytuanvu.nstore.response.ResponseCustom;
import com.leduytuanvu.nstore.service.SubCategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SubCategoryServiceImpl implements SubCategoryService {
    @Autowired
    SubCategoryRepository subCategoryRepository;
    public SubCategoryServiceImpl(SubCategoryRepository subCategoryRepository) {
        this.subCategoryRepository = subCategoryRepository;
    }

    @Override
    public ResponseCustom createSubCategory(SubCategory subCategory) {
        // More business logic
        ResponseCustom responseCustom = new ResponseCustom();
        subCategoryRepository.save(subCategory);
        responseCustom.setResponseCustom200(null);
        return responseCustom;
    }

    @Override
    public ResponseCustom updateSubCategory(Integer id, SubCategory subCategory) {
        // More business logic
        ResponseCustom responseCustom = new ResponseCustom();
        if (id != subCategory.getId()) {
            return responseCustom.setResponseCustom400("Id and sub category's id do not match");
        }
        if(subCategoryRepository.findById(id).isEmpty()){
            return responseCustom.setResponseCustom404("Not found this sub category's id");
        }
        subCategoryRepository.save(subCategory);
        responseCustom.setResponseCustom200(null);
        return responseCustom;
    }

    @Override
    public ResponseCustom deleteSubCategory(Integer id) {
        // More business logic
        ResponseCustom responseCustom = new ResponseCustom();
        subCategoryRepository.deleteById(id);
        responseCustom.setResponseCustom200(null);
        return responseCustom;
    }

    @Override
    public ResponseCustom getSubCategory(Integer id) {
        // More business logic
        ResponseCustom responseCustom = new ResponseCustom();
        if(subCategoryRepository.findById(id).isEmpty()){
            return responseCustom.setResponseCustom404("Not found this sub category's id");
        }
        return responseCustom.setResponseCustom200(subCategoryRepository.findById(id).get());
    }

    @Override
    public ResponseCustom getAllSubCategory() {
        // More business logic
        ResponseCustom responseCustom = new ResponseCustom();
        return responseCustom.setResponseCustom200(subCategoryRepository.findAll());
    }
}
