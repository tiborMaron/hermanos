package com.codecool.hermanos.api;

import com.codecool.hermanos.repository.DaoProduct;
import com.codecool.hermanos.model.ProductCategory;
import com.codecool.hermanos.service.CategoryBean;

import com.google.gson.Gson;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.util.Collections;
import java.util.EnumSet;
import java.util.List;

@RestController
@CrossOrigin
public class ProductControllerREST {

    private DaoProduct daoProduct;
    private CategoryBean categoryBean;

    public ProductControllerREST(DaoProduct daoProduct, CategoryBean categories) {
        this.daoProduct = daoProduct;
        this.categoryBean = categories;
    }

    @RequestMapping(value = "/products", method = RequestMethod.GET)
    public List getAllProducts(HttpServletRequest request) {
        Gson gson = new Gson();
        EnumSet<ProductCategory> categories = categoryBean.getAllCategories();

        String category = request.getParameter("category");
        ProductCategory productCategory = gson.fromJson(category, ProductCategory.class);

        List products;
        if (categories.contains(productCategory)) products = daoProduct.getProductsByCategory(productCategory);
        else products = daoProduct.findAll();

        Collections.shuffle(products);
        return products;
    }
}