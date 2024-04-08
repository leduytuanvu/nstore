package com.leduytuanvu.nstore.repository;

import com.leduytuanvu.nstore.model.Category;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface CategoryRepository extends JpaRepository<Category, String> {

}
