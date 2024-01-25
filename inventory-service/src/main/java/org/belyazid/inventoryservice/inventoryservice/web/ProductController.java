package org.belyazid.inventoryservice.inventoryservice.web;

import org.belyazid.inventoryservice.inventoryservice.entities.Product;
import org.belyazid.inventoryservice.inventoryservice.repositories.ProductRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ProductController {
    private ProductRepository productRepository;

    public ProductController(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    @GetMapping("/products")
    public List<Product> products(){
        return productRepository.findAll();
    }
}
