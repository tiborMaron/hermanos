package com.codecool.hermanos.dao;

import com.codecool.hermanos.controller.JPAController;
import com.codecool.hermanos.model.Product;

import java.util.List;

public class DaoProduct {
    private static DaoProduct dp;

    private DaoProduct() {
    }

    public static DaoProduct getInstance() {
        if (dp == null) dp = new DaoProduct();
        return dp;
    }

    public void addNewProduct(Product product) {
        JPAController.use(jpaController -> jpaController.addNewProduct(product));
    }

    public Product findProductByID(long id) {
        return JPAController.use(jpaController -> jpaController.getProductByID(id));
    }

    public List getAllProducts() {
        return JPAController.use(JPAController::getAllProduct);
    }

}
