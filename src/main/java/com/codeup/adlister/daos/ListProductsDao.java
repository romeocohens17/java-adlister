package com.codeup.adlister.daos;
import com.codeup.adlister.models.Product;

import java.util.ArrayList;
import java.util.List;

class ListProductsDAO implements Products {
    private final List<Product> products = new ArrayList<>();

    public ListProductsDAO() {
        insert(new Product(1, "Nintendo Switch - OLED Model", 349.99));
        insert(new Product(2, "Sony PlayStation 5 - Base Model", 499.0));
        insert(new Product(3, "Microsoft Xbox Series X", 499.0));
    }

    @Override
    public List<Product> all() {
        return this.products;
    }

    @Override
    public void insert(Product product) {
        this.products.add(product);
    }
}
