package com.codecool.hermanos.dao;

import com.codecool.hermanos.model.Product;

import java.util.List;

public interface DaoProduct {
    List getAllProducts();
    void addNewProduct(Product product);
    Product findProductByID(long id);
}
