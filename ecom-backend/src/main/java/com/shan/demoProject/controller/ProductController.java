package com.shan.demoProject.controller;

import com.shan.demoProject.model.Product;
import com.shan.demoProject.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ProductController {

    @Autowired
    ProductService service;

    @RequestMapping("/products")
    public List<Product> getProducts(){
        return service.getProducts();
    }
    @RequestMapping("/products/{prodId}")
    public Product getProductById(@PathVariable int prodId){
        return service.getProductById(prodId);
    }

    @PostMapping("/product")
    public void addProduct(@RequestBody Product p){
        System.out.println(p);
        service.addProduct(p);
    }

    @PutMapping("/product")
    public void updateProduct(@RequestBody Product p){
        service.updateProduct(p);
    }
    @DeleteMapping("/products/{prodId}")
    public void deleteProduct(@PathVariable int prodId){
        service.deleteProduct(prodId);
    }

}
