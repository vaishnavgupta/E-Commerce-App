package com.ecommerce.product.config;

import com.ecommerce.product.model.Category;
import com.ecommerce.product.model.Product;
import com.ecommerce.product.repository.CategoryRepo;
import com.ecommerce.product.repository.ProductRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Component
public class DataSeeder implements CommandLineRunner {

    @Autowired
    private ProductRepo productRepo;

    @Autowired
    private CategoryRepo categoryRepo;

    @Override
    public void run(String... args) throws Exception {
        // Clear All Existing Data
        productRepo.deleteAll();
        categoryRepo.deleteAll();

        // Create Categories
        Category c1 = new Category();
        c1.setName("Electronics");

        Category c2 = new Category();
        c2.setName("Clothing");

        Category c3 = new Category();
        c3.setName("Grocery");

        // Save Categories
        categoryRepo.saveAll(Arrays.asList(c1, c2, c3));

        // Common placeholder image
        String placeholderImage = "https://placehold.co/600x400";

        // Create Sample Products for Each Category

        // Electronics Products
        Product p1 = new Product();
        p1.setName("Smartphone");
        p1.setDescription("Latest 5G smartphone with AMOLED display");
        p1.setImageUrl(placeholderImage);
        p1.setPrice(699.99);
        p1.setCategory(c1);

        Product p2 = new Product();
        p2.setName("Laptop");
        p2.setDescription("Powerful laptop with Intel i7 processor");
        p2.setImageUrl(placeholderImage);
        p2.setPrice(1199.99);
        p2.setCategory(c1);

        // Clothing Products
        Product p3 = new Product();
        p3.setName("Men's T-Shirt");
        p3.setDescription("100% cotton round-neck t-shirt");
        p3.setImageUrl(placeholderImage);
        p3.setPrice(19.99);
        p3.setCategory(c2);

        Product p4 = new Product();
        p4.setName("Women's Jeans");
        p4.setDescription("Skinny fit high-rise jeans");
        p4.setImageUrl(placeholderImage);
        p4.setPrice(39.99);
        p4.setCategory(c2);

        // Grocery Products
        Product p5 = new Product();
        p5.setName("Organic Apples");
        p5.setDescription("Fresh organic apples, 1kg pack");
        p5.setImageUrl(placeholderImage);
        p5.setPrice(3.49);
        p5.setCategory(c3);

        Product p6 = new Product();
        p6.setName("Milk - 1L");
        p6.setDescription("Full cream milk, 1-liter bottle");
        p6.setImageUrl(placeholderImage);
        p6.setPrice(1.29);
        p6.setCategory(c3);

        // Save All Products
        productRepo.saveAll(Arrays.asList(p1, p2, p3, p4, p5, p6));
    }
}



