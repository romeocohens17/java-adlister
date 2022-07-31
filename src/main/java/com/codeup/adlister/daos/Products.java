package com.codeup.adlister.daos;

import com.codeup.adlister.models.Product;

import java.util.List;

public interface Products {
    List<Product> all();
    void insert(Product product);
}
