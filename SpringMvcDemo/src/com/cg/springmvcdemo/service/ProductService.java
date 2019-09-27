package com.cg.springmvcdemo.service;

import java.util.List;

import com.cg.springmvcdemo.dto.Product;

public interface ProductService {
	
	public Product addProduct(Product prod);
	public List<Product> showProducts();
	public Product searchProduct(Integer prodId);
	public void remove(int prodId);

}
