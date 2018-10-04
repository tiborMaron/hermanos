package com.codecool.hermanos.controller;

import com.codecool.hermanos.dao.DaoProduct;
import com.google.gson.Gson;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet(urlPatterns = {"/"})
public class ProductController extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        DaoProduct dp = DaoProduct.getInstance();

        List products = dp.getAllProducts();
        Gson gson = new Gson();
        String productsInJson = gson.toJson(products);

        response.getWriter().write(productsInJson);
    }
}