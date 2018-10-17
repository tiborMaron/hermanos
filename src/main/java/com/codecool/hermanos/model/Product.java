package com.codecool.hermanos.model;

import javax.persistence.*;

@Entity
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private String name;
    private String description;
    private double price;

    private String imageName;

    @Enumerated(EnumType.STRING)
    private ProductCategory category;

    public Product() {
    }

    public Product(String name, String description, double price, String imageName, ProductCategory category) {
        this.name = name;
        this.description = description;
        this.price = price;
        this.imageName = imageName;
        this.category = category;
    }

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public double getPrice() {
        return price;
    }

    public ProductCategory getCategory() {
        return category;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getImageName() {
        return imageName;
    }

    public void setImageName(String imageLocation) {
        this.imageName = imageLocation;
    }
}
