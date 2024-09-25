package com.sb.product.restcontroller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductRestController {
    @Value("${product}")
    private String productInfo;
    @GetMapping("/product")
    public String getProductDetails(){
        return productInfo;
    }
}
