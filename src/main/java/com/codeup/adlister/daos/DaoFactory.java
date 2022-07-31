package com.codeup.adlister.daos;

import com.codeup.adlister.daos.ListProductsDAO;
import com.codeup.adlister.daos.Products;

public class DaoFactory {
    private static Products productsDao;

    public static Products getProductsDao() {
        if (productsDao == null) {
            productsDao = new ListProductsDAO();
        }
        return productsDao;
    }
}
