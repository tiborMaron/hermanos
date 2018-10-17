package com.codecool.hermanos.config;

import com.codecool.hermanos.dao.DaoProduct;
import com.codecool.hermanos.dao.implementation.DaoProductJPA;
import com.codecool.hermanos.model.Product;
import com.codecool.hermanos.model.ProductCategory;

public class Initializer {
    private DaoProduct pd;

    private Initializer(DaoProduct pd) {
        this.pd = pd;
    }

    public static void main(String[] args) {
        DaoProduct dp = DaoProductJPA.getInstance();
        Initializer init = new Initializer(dp);
        init.initializeProducts();
    }

    private void initializeProducts() {
        Product product1 = new Product("Crystal Meth", "From Heisenberg's kitchen", 10.0, "product01", ProductCategory.DRUG);
        pd.addNewProduct(product1);

        Product product2 = new Product("Corn Soup", "A soup made from corn, with tortillas and cheese.", 4.99,"product02", ProductCategory.BEFORE);
        pd.addNewProduct(product2);

        Product product3 = new Product("Cheese Soup", "Made from the three best mexican cheese with some Jalapenos.", 4.99, "product01", ProductCategory.BEFORE);
        pd.addNewProduct(product3);
    }
}
