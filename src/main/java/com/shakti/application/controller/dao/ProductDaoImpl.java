package com.shakti.application.controller.dao;

import com.shakti.application.controller.model.Product;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
@Repository
@Transactional
public class ProductDaoImpl implements ProductDao {
    @Autowired
    private SessionFactory sessionFactory;
    public void addProduct(Product product) {
        Session session = sessionFactory.getCurrentSession();
        session.saveOrUpdate(product);
        session.flush();
    }

    public Product getProductById(String productId) {
        Session session = sessionFactory.getCurrentSession();
        Product product =(Product) session.get(Product.class, productId);
        return product;
    }

    public List<Product> getAllProducts() {
        Session session = sessionFactory.getCurrentSession();
        Query query = session.createQuery("from Product ");
        List<Product> products = query.list();
        session.flush();
        return products;
    }

    public void deleteProduct(String productId) {
      Session session = sessionFactory.getCurrentSession();
      session.delete(getProductById(productId));
      session.flush();
    }
}
