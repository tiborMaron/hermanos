package com.codecool.hermanos.controller;

import com.codecool.hermanos.dao.DaoProduct;
import com.codecool.hermanos.model.ProductCategory;
import com.google.gson.Gson;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.EnumSet;
import java.util.List;

public class ProductController extends HttpServlet {

    private DaoProduct daoProduct;
    private EnumSet<ProductCategory> categories;

    public ProductController(DaoProduct daoProduct, EnumSet<ProductCategory> categories) {
        this.daoProduct = daoProduct;
        this.categories = categories;
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        Gson gson = new Gson();
        List products;

        String category = request.getParameter("category");
        ProductCategory productCategory = gson.fromJson(category, ProductCategory.class);

        if (categories.contains(productCategory)) products = daoProduct.getProductsByCategory(productCategory);
        else products = daoProduct.getAllProducts();

        String productsInJson = gson.toJson(products);
        response.getWriter().write(productsInJson);
    }
}