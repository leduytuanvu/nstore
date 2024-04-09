package com.leduytuanvu.nstore.controller;

import com.leduytuanvu.nstore.model.Category;
import com.leduytuanvu.nstore.model.SubCategory;
import com.leduytuanvu.nstore.response.ResponseCustom;
import com.leduytuanvu.nstore.response.ResponseHandler;
import com.leduytuanvu.nstore.service.CategoryService;
import com.leduytuanvu.nstore.service.SubCategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/sub-category")
public class SubCategoryController {
    @Autowired
    SubCategoryService subCategoryService;

    public SubCategoryController(SubCategoryService subCategoryService) {
        this.subCategoryService = subCategoryService;
    }

    // Read specific category
    @GetMapping("{id}")
    public ResponseEntity<Object> getSubCategory(@PathVariable("id") Integer id) {
        ResponseCustom responseCustom = subCategoryService.getSubCategory(id);
        return ResponseHandler.responseBuilder(responseCustom);
    }

    // Read all categories
    @GetMapping()
    public ResponseEntity<Object> getAllSubCategory() {
        ResponseCustom responseCustom = subCategoryService.getAllSubCategory();
        return ResponseHandler.responseBuilder(responseCustom);
    }

    // Create new category
    @PostMapping()
    public ResponseEntity<Object> createSubCategory(@RequestBody SubCategory subCategory) {
        ResponseCustom responseCustom = subCategoryService.createSubCategory(subCategory);
        return ResponseHandler.responseBuilder(responseCustom);
    }

    @PutMapping("{id}")
    public ResponseEntity<Object> updateSubCategory(@PathVariable("id") Integer id, @RequestBody SubCategory subCategory) {
        ResponseCustom responseCustom = subCategoryService.updateSubCategory(id, subCategory);
        return ResponseHandler.responseBuilder(responseCustom);
    }

    @DeleteMapping("{id}")
    public ResponseEntity<Object> deleteSubCategory(@PathVariable("id") Integer id) {
        ResponseCustom responseCustom = subCategoryService.deleteSubCategory(id);
        return ResponseHandler.responseBuilder(responseCustom);
    }
}
