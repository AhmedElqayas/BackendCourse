package com.myorders.services;

import com.myorders.dao.ProductDao;
import com.myorders.entities.Product;
import com.myorders.entities.ProductDetails;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {
    @Autowired
    ProductDao productDao;
    public void addProduct(ProductDetails productDetails) {
        productDao.insertProduct(productDetails);
    }
    public List<Product> getProductsList() {
        return productDao.retrieveAllProducts();
    }
    public ProductDetails getProductDetails(int id) {
        return productDao.retrieveProductDetails(id);
    }
    public void updateProduct(ProductDetails productDetails) {
        productDao.updateProduct(productDetails);
    }
    public void deleteProduct(int id) {
        productDao.deleteProduct(id);
    }
}

