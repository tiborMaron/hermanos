package com.codecool.hermanos.controller;

import com.codecool.hermanos.model.*;

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

    ///
    /// PRODUCT ///
    ///

    public List getAllProduct() {
        return this.entityManager.createQuery("SELECT p FROM Product p").getResultList();
    }

    public Product addNewProduct(Product product) {
        this.entityManager.persist(product);
        return product;
    }

    public Product getProductByID(long id) {
        return this.entityManager.find(Product.class, id);
    }

    ///
    /// USERS ///
    ///

    public List getAllUser() {
        return this.entityManager.createQuery("SELECT u FROM Users u").getResultList();
    }

    public Users addNewUser(Users user) {
        this.entityManager.persist(user);
        return user;
    }

    public Users getUserByID(long id) {
        return this.entityManager.find(Users.class, id);
    }
}