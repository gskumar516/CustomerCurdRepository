package com.app.product.service.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.app.product.service.entity.Product;
import com.app.product.service.prodservice.ProductService;

@RestController
public class ProductController {

	private  Map<Integer, Product> map = new HashMap<>();

	@Autowired
	private ProductService service;

	@GetMapping("/all")
	public Map<Integer, Product> all() {

		return service.getAll();
	}

	@PostMapping("/save")
	public Product createOne(@RequestBody Product product) {

	
	
	return service.create(product);

	}

}
