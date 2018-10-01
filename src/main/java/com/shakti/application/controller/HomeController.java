package com.shakti.application.controller;

import com.shakti.application.controller.dao.ProductDao;
import com.shakti.application.controller.model.Product;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class HomeController {
    private ProductDao productDao = new ProductDao();

    @RequestMapping("/")
    public String home(){
        return "home";
    }

    @RequestMapping("/productlist")
    public String getProduct(Model model){
        List<Product> productList = productDao.getProductList();
        model.addAttribute("products", productList);
        return "productList";
    }
}
