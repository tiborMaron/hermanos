package com.codecool.hermanos.controller;

import com.codecool.hermanos.dao.DaoProduct;
import com.codecool.hermanos.model.Product;

import com.google.gson.Gson;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class ProductPageController extends HttpServlet {

    private DaoProduct daoProduct;

    public ProductPageController(DaoProduct daoProduct) {
        this.daoProduct = daoProduct;
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        String productNumber = request.getParameter("id");
        Product product = daoProduct.findProductByID(Integer.valueOf(productNumber));
        Gson gson = new Gson();
        String productsInJson = gson.toJson(product);

        response.getWriter().write(productsInJson);
    }
}