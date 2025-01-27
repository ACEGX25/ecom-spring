package com.resident.ecomspring.Service;

import com.resident.ecomspring.Model.Product;
import com.resident.ecomspring.Repository.ProductRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;
@Service

public class ProductService {

    @Autowired
    private ProductRepo repo;

    public List<Product> getallproducts() {

        return repo.findAll();

    }

    public Product getproduct(int id) {
        return repo.findById(id).orElse(new Product());
    }

}
