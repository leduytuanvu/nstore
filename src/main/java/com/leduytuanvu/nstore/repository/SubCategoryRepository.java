package com.leduytuanvu.nstore.repository;

import com.leduytuanvu.nstore.model.SubCategory;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface SubCategoryRepository extends JpaRepository<SubCategory, Integer> {

}
