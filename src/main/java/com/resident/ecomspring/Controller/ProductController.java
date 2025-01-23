package com.resident.ecomspring.Controller;

import com.resident.ecomspring.Model.Product;
import com.resident.ecomspring.Service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
public class ProductController {

    @Autowired
    ProductService service;


    @RequestMapping("/greet")
    public String greet(){
        return "Hello World";
    }

    @GetMapping("/products")
    public List<Product> display(){
        return service.getallproducts();
    }



}
