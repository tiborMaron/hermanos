package com.codecool.hermanos.service;

import com.codecool.hermanos.model.ProductCategory;
import org.springframework.stereotype.Component;

import java.util.EnumSet;

@Component
public class CategoryBean {

    private EnumSet<ProductCategory> categories;

    public CategoryBean() {
        this.categories = EnumSet.allOf(ProductCategory.class);
    }

    public EnumSet<ProductCategory> getAllCategories() {
        return categories;
    }
}