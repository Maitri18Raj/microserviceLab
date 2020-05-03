package com.cg.ecommerce.productmgt.service;

import java.util.List;

import com.cg.ecommerce.productmgt.entities.Product;

public interface IProductService {
	
List<Product>fetchAll();
	
	Product findById (String id);
	
	Product save (Product product);
	
}
