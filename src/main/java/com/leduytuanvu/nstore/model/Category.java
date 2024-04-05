package com.leduytuanvu.nstore.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "category")
public class Category {
    @Id
    private String categoryId;
    private String categoryName;
    private Boolean categoryStatus;

    public Category() {
    }

    public Category(String categoryID, String categoryName, Boolean categoryStatus) {
        this.categoryId = categoryID;
        this.categoryName = categoryName;
        this.categoryStatus = categoryStatus;
    }

    public String getCategoryID() {
        return categoryId;
    }

    public void setCategoryID(String categoryID) {
        this.categoryId = categoryID;
    }

    public String getCategoryName() {
        return categoryName;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }

    public Boolean getCategoryStatus() {
        return categoryStatus;
    }

    public void setCategoryStatus(Boolean categoryStatus) {
        this.categoryStatus = categoryStatus;
    }
}
