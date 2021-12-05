package com.example.smallbiz.entity;

import lombok.Data;

import java.util.HashMap;

@Data
public class ProductModel {

    private Integer id;
    private String title;
    private Integer price;
    private String description;
    private String category;
    private String image;
    private HashMap<String, Integer> rating;

}
