package com.cg.ecommerce.productmgt.dao;

import java.util.List;

import com.cg.ecommerce.productmgt.entities.Product;

public interface IProductDao {

	List<Product>fetchAll();
	
	Product findById (String id);
	
	Product save (Product product);
	
}
