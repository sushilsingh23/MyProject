package com.capgemini.capstore.main.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.capgemini.capstore.main.beans.Product;
import com.capgemini.capstore.main.service.ProductService;

@RestController
public class CapStoreController {
	@Autowired
	private ProductService ser;

	@RequestMapping(value = "/createProduct", method = RequestMethod.GET)
	public ResponseEntity<Object> createProduct(@RequestBody Product product) {
		ser.createProduct(product);
		return new ResponseEntity<Object>(product, HttpStatus.OK);
	}

	@RequestMapping(value = "/showProduct/{productId}", method = RequestMethod.GET)
	public Product showProduct(@PathVariable int productId) {
		Product product = ser.showProduct(productId);
		return product;
	}

	@RequestMapping(value = "/showAllProduct", method = RequestMethod.GET)
	public List<Product> showAllProduct() {
		List<Product> product = ser.showAllProduct();
		return product;
	}

	/*
	 * @RequestMapping(value="/displayCart", method = RequestMethod.GET) public
	 * displayCart() { List<Product> product= ser.showAllProduct(); return product;
	 * }
	 */
}
