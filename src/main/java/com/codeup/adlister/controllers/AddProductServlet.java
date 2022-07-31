package com.codeup.adlister.controllers;

import com.codeup.adlister.daos.DaoFactory;
import com.codeup.adlister.daos.Products;
import com.codeup.adlister.models.Product;
import com.codeup.adlister.daos.DaoFactory;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "AddProductServlet", urlPatterns = "/product/add")
public class AddProductServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        Products productsDao = DaoFactory.getProductsDao();
        productsDao.insert(new Product(4, "SNK Neo Geo Pocket Color", 69.95));
        response.sendRedirect("/Products");
    }
}
