package com.app.product.service.prodservice;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Service;

import com.app.product.service.entity.Product;

@Service
public class ProductService {

	private static Map<Integer, Product> mapAll = new HashMap<>();

	/*
	 * static {
	 * 
	 * Product product = new Product(1, "Mobile", 10000); Product product2 = new
	 * Product(2, "Laptop", 50000); Product product3 = new Product(3, "T.v", 60000);
	 * 
	 * mapAll.put(product.getProdId(), product); mapAll.put(product2.getProdId(),
	 * product2); mapAll.put(product3.getProdId(), product3); }
	 */

	public Map<Integer, Product> getAll() {

		return mapAll;

	}

	public Product create(Product product) {

		

		return product;
	}

}
