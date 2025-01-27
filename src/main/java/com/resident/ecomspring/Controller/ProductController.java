package com.resident.ecomspring.Controller;

import com.resident.ecomspring.Model.Product;
import com.resident.ecomspring.Service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("/api")
public class ProductController {

    @Autowired
    ProductService service;


    @GetMapping("/products")
    public ResponseEntity <List<Product>> getallproducts(){
        return new ResponseEntity<>(service.getallproducts(), HttpStatus.OK) ;
    }

    @CrossOrigin
    @GetMapping("/product/{id}")
    public ResponseEntity <Product> getproduct(@PathVariable int id){
        Product product = service.getproduct(id);

        if(product == null){
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        else
            return new ResponseEntity<>(product, HttpStatus.OK);
    }

//    public ResponseEntity <?> addproduct(@RequestPart Product product, @RequestPart MultipartFile imagefile){
//        try {
//            Product product1 = service.addproduct(product, imagefile);
//            return new ResponseEntity<>(product1, HttpStatus.CREATED);
//        } catch (Exception e) {
//            return new ResponseEntity<>(e.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);
//        }
//
//    }


}
