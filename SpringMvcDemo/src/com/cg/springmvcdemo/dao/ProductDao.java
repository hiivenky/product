package com.cg.springmvcdemo.dao;

import java.util.List;

import com.cg.springmvcdemo.dto.Product;

public interface ProductDao {
	
	public Product save(Product pro);
	public List<Product> findAll();
	public Product searchProduct(Integer prodId);
	public void remove(int prodId);

}
