package com.mde.catalogservice.repositories;


import com.mde.catalogservice.models.ProductCategory; 
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductCategoryRepository extends JpaRepository<ProductCategory,Long> {

}
