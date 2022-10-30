package com.luv2com.ecommerce.dao;

import com.luv2com.ecommerce.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;
                                                    //<Entity, Primary key>
public interface ProductRepository extends JpaRepository<Product, Long> {



}
