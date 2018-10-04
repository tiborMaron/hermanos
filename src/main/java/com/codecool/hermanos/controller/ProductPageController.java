package com.codecool.hermanos.controller;

import com.codecool.hermanos.dao.DaoProduct;
import com.codecool.hermanos.model.Product;
import com.google.gson.Gson;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(urlPatterns = {"/product"})
public class ProductPageController extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        DaoProduct dp = DaoProduct.getInstance();

        String productNumber = request.getParameter("id");
        Product product = dp.findProductByID(Integer.valueOf(productNumber));
        Gson gson = new Gson();
        String productsInJson = gson.toJson(product);

        response.getWriter().write(productsInJson);
    }
}