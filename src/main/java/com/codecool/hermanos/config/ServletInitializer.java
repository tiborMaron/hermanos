package com.codecool.hermanos.config;

import com.codecool.hermanos.controller.*;
import com.codecool.hermanos.dao.*;
import com.codecool.hermanos.dao.implementation.*;
import com.codecool.hermanos.model.ProductCategory;

import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;
import java.util.EnumSet;

@WebListener
public class ServletInitializer implements ServletContextListener {

    @Override
    public void contextInitialized(ServletContextEvent sce) {
        DaoUsers daoUsers = new DaoUsersJPA();
        DaoAddress daoAddress = new DaoAddressJPA();
        DaoProduct daoProduct = new DaoProductJPA();
        EnumSet<ProductCategory> categories = EnumSet.allOf(ProductCategory.class);

        ServletContext context = sce.getServletContext();
        context.addServlet("Product", new ProductController(daoProduct, categories)).addMapping("/products");
        context.addServlet("ProductPage", new ProductPageController(daoProduct)).addMapping("/product");
        context.addServlet("Registration", new RegistrationController(daoUsers, daoAddress)).addMapping("/registration");
        context.addServlet("Login", new LoginController(daoUsers)).addMapping("/login");
        context.addServlet("Categories", new CategoryController(categories)).addMapping("/category");
    }
}