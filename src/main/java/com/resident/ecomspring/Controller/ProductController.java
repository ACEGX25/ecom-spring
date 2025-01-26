package com.resident.ecomspring.Controller;

import com.resident.ecomspring.Model.Product;
import com.resident.ecomspring.Service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("/api")
public class ProductController {

    @Autowired
    ProductService service;


    @GetMapping("/products")
    public List<Product> getallproducts(){
        return service.getallproducts();
    }

    @GetMapping("/product/{id}")
    public Product getproduct(@PathVariable int id){
        return service.getproduct(id);
    }


}
