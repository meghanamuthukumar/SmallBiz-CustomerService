package com.example.smallbiz.service;

import com.example.smallbiz.entity.ProductModel;
import org.springframework.http.ResponseEntity;

import java.util.List;

public interface ProductService {

    ResponseEntity<ProductModel[]> getAllProducts();

}
