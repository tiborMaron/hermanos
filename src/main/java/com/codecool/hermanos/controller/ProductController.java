package com.codecool.hermanos.controller;

import com.codecool.hermanos.dao.DaoProduct;
import com.codecool.hermanos.model.ProductCategory;
import com.google.gson.Gson;
import com.google.gson.JsonSyntaxException;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

public class ProductController extends HttpServlet {

    private DaoProduct daoProduct;

    public ProductController(DaoProduct daoProduct) {
        this.daoProduct = daoProduct;
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        Gson gson = new Gson();

        String category = request.getParameter("category");
        List products;

        try {
            ProductCategory productCategory = gson.fromJson(category, ProductCategory.class);
            products = daoProduct.getProductsByCategory(productCategory);
        } catch (JsonSyntaxException e) {
            products = daoProduct.getAllProducts();
        }

        String productsInJson = gson.toJson(products);
        response.getWriter().write(productsInJson);
    }
}