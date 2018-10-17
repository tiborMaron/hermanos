package com.codecool.hermanos.controller;

import com.codecool.hermanos.dao.DaoProduct;
import com.google.gson.Gson;

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
        List products = daoProduct.getAllProducts();
        Gson gson = new Gson();
        String productsInJson = gson.toJson(products);
        response.getWriter().write(productsInJson);
    }
}