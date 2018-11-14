package com.shakti.application.controller;

import com.shakti.application.controller.dao.ProductDao;
import com.shakti.application.controller.model.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.io.IOException;
import java.util.List;

@Controller
public class HomeController {
   @Autowired
    private ProductDao productDao;

    @RequestMapping("/")
    public String home(Model model){
        List<Product> productList = productDao.getAllProducts();
        model.addAttribute("products", productList);
        return "home";
    }

    @RequestMapping("/viewProduct/{productId}")
    public String viewProducts(@PathVariable String productId, Model model) throws IOException {
        Product product = productDao.getProductById(productId);
        model.addAttribute(product);
        return "viewProduct";
    }
}
