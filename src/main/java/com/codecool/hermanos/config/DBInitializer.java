package com.codecool.hermanos.config;

import com.codecool.hermanos.dao.DaoProduct;
import com.codecool.hermanos.dao.implementation.DaoProductJPA;
import com.codecool.hermanos.model.Product;
import com.codecool.hermanos.model.ProductCategory;

public class DBInitializer {
    private DaoProduct daoProduct;

    private DBInitializer(DaoProduct daoProduct) {
        this.daoProduct = daoProduct;
    }

    public static void main(String[] args) {
        DaoProduct daoProduct = new DaoProductJPA();
        DBInitializer init = new DBInitializer(daoProduct);
        init.initializeProducts();
    }

    private void initializeProducts() {
        Product product1 = new Product("Crystal Meth", "From Heisenberg's kitchen", 10.0, "product01", ProductCategory.DRUG);
        daoProduct.addNewProduct(product1);

        Product product2 = new Product("Corn Soup", "A soup made from corn, with tortillas and cheese.", 4.99,"product02", ProductCategory.BEFORE);
        daoProduct.addNewProduct(product2);

        Product product3 = new Product("Cheese Soup", "Made from the three best mexican cheese with some Jalapenos.", 4.99, "product01", ProductCategory.BEFORE);
        daoProduct.addNewProduct(product3);
    }
}
