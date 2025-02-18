package com.example.reactspringbootrestapi.controller.api;

import com.example.reactspringbootrestapi.model.Category;
import com.example.reactspringbootrestapi.model.Product;
import com.example.reactspringbootrestapi.service.ProductService;
import java.util.List;
import java.util.Optional;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductRestController {

  private final ProductService productService;

  public ProductRestController(ProductService productService) {
    this.productService = productService;
  }

  @GetMapping("/api/v1/products")
  public List<Product> productList(@RequestParam Optional<Category> category) {
    return category
      .map(productService::getProductsByCategory)
      .orElse(productService.getAllProducts());
  }

}
