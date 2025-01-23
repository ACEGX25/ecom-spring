package com.resident.ecomspring.Service;

import com.resident.ecomspring.Model.Product;
import com.resident.ecomspring.Repository.ProductRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service

public class ProductService {

    @Autowired
    private ProductRepo repo;

    public List<Product> getallproducts() {
        return repo.findAll();
    }
}
