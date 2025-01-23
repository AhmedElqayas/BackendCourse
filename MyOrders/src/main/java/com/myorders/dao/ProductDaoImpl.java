package com.myorders.dao;

import com.myorders.entities.Product;
import com.myorders.entities.ProductDetails;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Queue;

@Component
public class ProductDaoImpl implements ProductDao {
    @Autowired
    SessionFactory sessionFactory;
    @Override
    @Transactional
    public void insertProduct(ProductDetails productDetails) {
        Product product = new Product();
        product.setName(productDetails.getName());

        Session session = sessionFactory.getCurrentSession();
        session.save(productDetails);
        session.save(product);
    }
    @Override
    @Transactional
    public List<Product> retrieveAllProducts() {
        Session session = sessionFactory.getCurrentSession();
        return session.createQuery("FROM Product").list();
    }
    @Override
    @Transactional
    public ProductDetails retrieveProductDetails(int id) {
        Session session = sessionFactory.getCurrentSession();
        return (ProductDetails) session.get(ProductDetails.class, id);
    }
    @Override
    @Transactional
    public void updateProduct(ProductDetails updatedProductDetails) {
        Session session = sessionFactory.getCurrentSession();
        ProductDetails productDetails = (ProductDetails) session.get(ProductDetails.class, 1);
        productDetails.setName(updatedProductDetails.getName());
        productDetails.setManufacturer(updatedProductDetails.getManufacturer());
        productDetails.setPrice(updatedProductDetails.getPrice());
        productDetails.setAvailability(updatedProductDetails.isAvailability());
        productDetails.setExpirationDate(updatedProductDetails.getExpirationDate());
        session.update(productDetails);
    }

    @Override
    @Transactional
    public void deleteProduct(int id) {
        Session session = sessionFactory.getCurrentSession();
        ProductDetails productDetails = (ProductDetails) session.get(ProductDetails.class, id);
        session.delete(productDetails);
        Query query = session.createQuery("DELETE FROM Product WHERE product_details_id=:productDetailsId");
        query.setParameter("productDetailsId", id);
        query.executeUpdate();
    }
}
