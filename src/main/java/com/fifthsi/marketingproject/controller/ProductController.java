package com.fifthsi.marketingproject.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/hello")
public class ProductController {

    @GetMapping
    public String getAllProducts() {
        return "Hello";
    }
}