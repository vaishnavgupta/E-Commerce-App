package com.ecommerce.product.service;

import com.ecommerce.product.model.Category;
import com.ecommerce.product.model.Product;
import com.ecommerce.product.repository.CategoryRepo;
import com.ecommerce.product.repository.ProductRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MyService {

    @Autowired
    private CategoryRepo categoryRepo;

    @Autowired
    private ProductRepo productRepo;

    public List<Category> getCategoryList() {
        return categoryRepo.findAll();
    }

    public List<Product> getAllProducts() {
        return productRepo.findAll();
    }

    public List<Product> getProductByCategoryId(Long categoryId){
        return productRepo.findByCategoryId(categoryId);
    }
}
