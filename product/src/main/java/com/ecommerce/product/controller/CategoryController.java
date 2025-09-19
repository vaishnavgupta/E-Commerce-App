package com.ecommerce.product.controller;

import com.ecommerce.product.model.Category;
import com.ecommerce.product.service.MyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/categories")
@CrossOrigin("http://localhost:5173/")
public class CategoryController {

    @Autowired
    private MyService myService;

    @GetMapping
    public List<Category> getCategory(){
        return myService.getCategoryList();

    }
}
