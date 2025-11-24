package com.shan.demoProject.service;

import com.shan.demoProject.model.Product;
import com.shan.demoProject.repository.ProductRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class ProductService {
//    List<Product> products = new ArrayList<>(Arrays.asList(
//            new Product(101,"laptop",50000),
//            new Product(102,"Iphone",40000),
//            new Product(103,"desktop",60000)
//    ));
    @Autowired
    ProductRepo repo;
    public List<Product> getProducts(){
        return repo.findAll();
    }

    public Product getProductById(int prodId) {
        return repo.findById(prodId).orElse(new Product());
    }
    public void addProduct(Product p){
        repo.save(p);
    }

    public void updateProduct(Product p) {
        repo.save(p);
    }

    public void deleteProduct(int prodId) {
        repo.deleteById(prodId);
    }
}
