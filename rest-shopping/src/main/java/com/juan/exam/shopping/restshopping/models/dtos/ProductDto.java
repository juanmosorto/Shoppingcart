package com.juan.exam.shopping.restshopping.models.dtos;

import lombok.Data;

@Data
public class ProductDto {
    private Integer id;
    private String title;
    private double price;
    private String description;
    private String category;
    private String image;
}
