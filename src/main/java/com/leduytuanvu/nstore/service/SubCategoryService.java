package com.leduytuanvu.nstore.service;

import com.leduytuanvu.nstore.model.Category;
import com.leduytuanvu.nstore.model.SubCategory;
import com.leduytuanvu.nstore.response.ResponseCustom;

public interface SubCategoryService {
    public ResponseCustom createSubCategory(SubCategory subCategory);
    public ResponseCustom updateSubCategory(Integer id, SubCategory subCategory);
    public ResponseCustom deleteSubCategory(Integer id);
    public ResponseCustom getSubCategory(Integer id);
    public ResponseCustom getAllSubCategory();
}
