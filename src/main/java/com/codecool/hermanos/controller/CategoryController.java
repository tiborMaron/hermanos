package com.codecool.hermanos.controller;

import com.codecool.hermanos.model.ProductCategory;
import com.google.gson.Gson;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.EnumSet;

public class CategoryController extends HttpServlet {

    private EnumSet<ProductCategory> categories;

    public CategoryController(EnumSet<ProductCategory> categories) {
        this.categories = categories;
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        Gson gson = new Gson();
        String categoriesInJSON = gson.toJson(categories);
        response.getWriter().write(categoriesInJSON);
    }
}