package com.juan.exam.shopping.restshopping.services;

import com.juan.exam.shopping.restshopping.models.entities.Product;

import java.util.List;

public interface ProductService {

    List<Product> getAllProducts();

    Product getProductById(Long id);

    List<Product> getProductsLimited(int limit);

    List<String> getAllCategories();

    List<Product> getProductsByCategory(String category);

    Product addProduct(Product product);

    Product updateProduct(Long id, Product product);

    void deleteProduct(Long id);
}
