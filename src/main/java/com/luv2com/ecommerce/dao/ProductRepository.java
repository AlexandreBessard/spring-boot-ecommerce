package com.luv2com.ecommerce.dao;

import com.luv2com.ecommerce.entity.Product;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.web.bind.annotation.CrossOrigin;

@CrossOrigin("http://localhost:4200")
public interface ProductRepository extends JpaRepository<Product, Long> {  //<Entity, Primary key>
    //Equivalent to : "SELECT * FROM product WHERE category_id=?"
    Page<Product> findByCategoryId(@Param("id") Long id, Pageable pageable);
    //http://localhost:8080/api/products/search/findByNameContaining?name=Python
    Page<Product> findByNameContaining(@Param("name") String name, Pageable page);
}
