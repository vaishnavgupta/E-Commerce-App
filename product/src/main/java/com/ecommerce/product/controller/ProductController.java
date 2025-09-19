package com.ecommerce.product.controller;

import com.ecommerce.product.model.Product;
import com.ecommerce.product.service.MyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/products")
@CrossOrigin("http://localhost:5173/")
public class ProductController {

    @Autowired
    private MyService myService;

    @GetMapping
    public List<Product> getAllProducts(){
        return  myService.getAllProducts();
    }

    @GetMapping("/category/{catId}")
    public List<Product> getAllProductsByCatId(@PathVariable Long catId){
        System.out.println(catId);
        return myService.getProductByCategoryId(catId);

    }
}
