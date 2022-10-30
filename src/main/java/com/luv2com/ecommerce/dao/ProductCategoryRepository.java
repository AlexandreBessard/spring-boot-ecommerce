package com.luv2com.ecommerce.dao;

import com.luv2com.ecommerce.entity.ProductCategory;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
                                            //Name of JSON entry   ,    "/product-category"
@RepositoryRestResource(collectionResourceRel = "productCategory" ,path = "product-category")
public interface ProductCategoryRepository extends JpaRepository<ProductCategory, Long> {

}
