package com.example.gpaas;

import java.math.BigDecimal;
import java.util.HashSet;
import java.util.Set;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 */
@RestController
public class TestController {

  @GetMapping("/products")
  public Set<Product> getProducts() {
    Set<Product> products = new HashSet<>();

    products.add(new Product(new BigDecimal("199.99"), "Laptop", "abc123"));
    products.add(new Product(new BigDecimal("299.99"), "Better Laptop", "123abc"));

    return products;
  }


}
