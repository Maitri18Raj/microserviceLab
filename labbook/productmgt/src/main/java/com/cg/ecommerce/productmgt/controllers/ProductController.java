package com.cg.ecommerce.productmgt.controllers;

import java.util.List;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cg.ecommerce.productmgt.entities.Product;
import com.cg.ecommerce.productmgt.service.IProductService;

@RestController
@RequestMapping("/products")
public class ProductController {
	
	@Autowired
	private IProductService service;
	
	@PostConstruct
	public void createProducts() {
		Product product1=new Product();
		product1.setPrice(10000);
		product1.setProductId("p1");
		product1.setProductName("mi");
		
		service.save(product1);
		
		Product product2=new Product();
		product2.setPrice(22000);
		product2.setProductId("p2");
		product2.setProductName("samsung");
		
		service.save(product2);
	}
	
	@GetMapping
	public ResponseEntity<List<Product>>fetchAll(){
		List<Product>products=service.fetchAll();
		ResponseEntity<List<Product>>response=new ResponseEntity<>(products,HttpStatus.OK);
		return response;
	}
	
	@GetMapping("/get/{id}")
	public ResponseEntity<Product>getProduct(@PathVariable("id")String id) {
		Product product=service.findById(id);
		ResponseEntity<Product>response=new ResponseEntity<>(product,HttpStatus.OK);
		return response;
	}
	
}
