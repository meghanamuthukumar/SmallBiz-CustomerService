package com.example.smallbiz.service.implementation;

import com.example.smallbiz.entity.ProductModel;
import com.example.smallbiz.service.ProductService;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;


@Service
public class ProductServiceImpl implements ProductService {


    @Override
    public ResponseEntity<ProductModel[]> getAllProducts() {
        final RestTemplate restTemplate = new RestTemplate();
        final String productUri = "https://fakestoreapi.com/products";
        return restTemplate.getForEntity(productUri, ProductModel[].class);
    }

}
