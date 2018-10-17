package com.codecool.hermanos.config;

import com.codecool.hermanos.controller.ProductController;
import com.codecool.hermanos.controller.ProductPageController;
import com.codecool.hermanos.controller.RegistrationController;
import com.codecool.hermanos.dao.DaoAddress;
import com.codecool.hermanos.dao.DaoProduct;
import com.codecool.hermanos.dao.DaoUsers;
import com.codecool.hermanos.dao.implementation.DaoAddressJPA;
import com.codecool.hermanos.dao.implementation.DaoProductJPA;
import com.codecool.hermanos.dao.implementation.DaoUsersJPA;

import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;

@WebListener
public class ServletInitializer implements ServletContextListener {

    @Override
    public void contextInitialized(ServletContextEvent sce) {
        DaoUsers daoUsers = new DaoUsersJPA();
        DaoAddress daoAddress = new DaoAddressJPA();
        DaoProduct daoProduct = new DaoProductJPA();

        ServletContext context = sce.getServletContext();
        context.addServlet("Registration", new RegistrationController(daoUsers, daoAddress)).addMapping("/registration");
        context.addServlet("ProductPage", new ProductPageController(daoProduct)).addMapping("/product");
        context.addServlet("Product", new ProductController(daoProduct)).addMapping("/products");
    }
}