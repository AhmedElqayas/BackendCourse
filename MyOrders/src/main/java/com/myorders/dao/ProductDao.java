package com.myorders.dao;

import com.myorders.entities.Product;
import com.myorders.entities.ProductDetails;

import java.util.List;

public interface ProductDao {
    void insertProduct(ProductDetails productDetails);
    List<Product> retrieveAllProducts();
    ProductDetails retrieveProductDetails(int id);
    void updateProduct(ProductDetails productDetails);
    void deleteProduct(int id);
}
