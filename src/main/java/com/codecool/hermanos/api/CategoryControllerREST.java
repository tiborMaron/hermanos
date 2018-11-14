package com.codecool.hermanos.api;

import com.codecool.hermanos.model.ProductCategory;
import com.codecool.hermanos.service.CategoryBean;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.EnumSet;

@RestController
@CrossOrigin
public class CategoryControllerREST {

    private CategoryBean categoryBean;

    public CategoryControllerREST(CategoryBean categoryBean) {
        this.categoryBean = categoryBean;
    }

    @RequestMapping(value = "/category", method = RequestMethod.GET)
    public EnumSet<ProductCategory> getCategories() {
        return categoryBean.getAllCategories();
    }
}