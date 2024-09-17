package com.juan.exam.shopping.restshopping.models.entities;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Product {
    private Long id;
    private String title;
    private double price;
    private String description;
    private String category;
    private String image;

    public Product() {

    }
}
