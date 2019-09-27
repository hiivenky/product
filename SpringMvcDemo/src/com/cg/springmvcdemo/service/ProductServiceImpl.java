package com.cg.springmvcdemo.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.springmvcdemo.dao.ProductDao;
import com.cg.springmvcdemo.dto.Product;

@Service("productservice")
@Transactional
public class ProductServiceImpl implements ProductService {
	
	@Autowired
	private ProductDao prodao;

	@Override
	public Product addProduct(Product prod) {
		// TODO Auto-generated method stub
		return prodao.save(prod);
	}

	@Override
	public List<Product> showProducts() {
		// TODO Auto-generated method stub
		return prodao.findAll();
	}

	@Override
	public Product searchProduct(Integer prodId) {
		// TODO Auto-generated method stub
		return prodao.searchProduct(prodId);
	}

	@Override
	public void remove(int prodId) {
		// TODO Auto-generated method stub
		prodao.remove(prodId);
		
	}

}
