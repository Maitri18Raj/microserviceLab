package com.cg.ecommerce.productmgt.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.cg.ecommerce.productmgt.dao.IProductDao;
import com.cg.ecommerce.productmgt.entities.Product;

public class ProductServiceImpl implements IProductService{
	
	private IProductDao dao;
	
	public IProductDao getDao() {
		return dao;
	}

	@Autowired
	public void setDao(IProductDao dao) {
		this.dao = dao;
	}

	@Override
	public List<Product> fetchAll() {
		List<Product>list=dao.fetchAll();
		return list;
	}

	@Override
	public Product findById(String id) {
		Product product=dao.findById(id);
		return product;
	}

	@Override
	public Product save(Product product) {
		dao.save(product);
		return product;
	}

}
