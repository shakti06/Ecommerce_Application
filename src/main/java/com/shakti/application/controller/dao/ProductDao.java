package com.shakti.application.controller.dao;

import com.shakti.application.controller.model.Product;

import java.util.ArrayList;
import java.util.List;

public class ProductDao {
    private List<Product> productList;

    public List<Product> getProductList(){
        Product product1 = new Product();
        product1.setProductName("Apple Ipad");
        product1.setProductCategory("Ipad");
        product1.setProductDescription("brand new ipad");
        product1.setProductPrice("70000");
        product1.setProductCondition("new arrival");
        product1.setProductStatus("active");
        product1.setGetProductManufacture("Apple");
        product1.setUnitInStock(10);

        Product product2 = new Product();
        product2.setProductName("Apple Iphone");
        product2.setProductCategory("Ipone");
        product2.setProductDescription("brand new iphone");
        product2.setProductPrice("75000");
        product2.setProductCondition("new arrival");
        product2.setProductStatus("active");
        product2.setGetProductManufacture("Apple");
        product2.setUnitInStock(10);

        productList = new ArrayList<Product>();
        productList.add(product1);
        productList.add(product2);
        return productList;
    }
}
