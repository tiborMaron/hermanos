package com.codecool.hermanos.controller;

import com.codecool.hermanos.config.Initializer;
import com.codecool.hermanos.dao.DaoProduct;
import com.codecool.hermanos.model.Product;
import com.codecool.hermanos.model.ProductCategory;
import com.google.gson.Gson;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import java.util.List;
import java.util.function.Function;

public class JPAController {

    private static EntityManagerFactory emf = Persistence.createEntityManagerFactory("hermanosPU");
    private EntityManager entityManager;

    private JPAController() {
        entityManager = emf.createEntityManager();
    }

    public static <T> T use(Function<JPAController, T> function) {
        JPAController controller = new JPAController();
        EntityTransaction transaction = controller.entityManager.getTransaction();
        transaction.begin();
        try {
            return function.apply(controller);
        } catch (Exception e) {
            System.out.println(e.getMessage());
            transaction.rollback();
            throw e;
        } finally {
            transaction.commit();
            controller.entityManager.close();
        }
    }

    //=================================================================================================================

    // PRODUCT

    public Product addNewProduct(Product product) {
        this.entityManager.persist(product);
        return product;
    }

    public Product getProductByID(long id) {
        return this.entityManager.find(Product.class, id);
    }

    public List getAllProduct() {
        return this.entityManager.createQuery("SELECT p FROM Product p").getResultList();
    }

    public static void main(String[] args) {
        DaoProduct dp = DaoProduct.getInstance();
        Initializer init = new Initializer(dp);
        init.initializeProducts();

        List products = dp.getAllProducts();
        Gson gson = new Gson();
        String productsInJson = gson.toJson(products);

        System.out.println(productsInJson);
    }
}