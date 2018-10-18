package com.codecool.hermanos.dao;

import com.codecool.hermanos.model.Product;
import com.codecool.hermanos.model.ProductCategory;

import java.util.List;

public interface DaoProduct {
    List getAllProducts();
    void addNewProduct(Product product);
    Product findProductByID(long id);
    List getProductsByCategory(ProductCategory productCategory);
}
