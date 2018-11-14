package com.codecool.hermanos.repository;

import com.codecool.hermanos.model.Product;
import com.codecool.hermanos.model.ProductCategory;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface DaoProduct extends JpaRepository<Product, Long> {
    List<Product> getProductsByCategory(ProductCategory productCategory);
}