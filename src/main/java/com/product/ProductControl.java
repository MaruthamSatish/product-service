package com.product;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.product.bean.Product;
import com.product.bean.ProductConfiguration;


@RestController
public class ProductControl {
@Autowired	
private ProductConfiguration config;

@GetMapping("/getProduct")
public Product getProduct() {
	return new Product(config.getProductName(),config.getProductId());
}
}
