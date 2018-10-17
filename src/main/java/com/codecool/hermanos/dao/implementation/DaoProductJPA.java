package com.codecool.hermanos.dao.implementation;

import com.codecool.hermanos.controller.JPAController;
import com.codecool.hermanos.dao.DaoProduct;
import com.codecool.hermanos.model.Product;

import java.util.List;

public class DaoProductJPA implements DaoProduct {

    private static DaoProductJPA dpJPA;
    private DaoProductJPA() {}

    public static DaoProductJPA getInstance() {
        if (dpJPA == null) dpJPA = new DaoProductJPA();
        return dpJPA;
    }

    public List getAllProducts() {
        return JPAController.use(JPAController::getAllProduct);
    }

    public void addNewProduct(Product product) {
        JPAController.use(jpaController -> jpaController.addNewProduct(product));
    }

    public Product findProductByID(long id) {
        return JPAController.use(jpaController -> jpaController.getProductByID(id));
    }
}