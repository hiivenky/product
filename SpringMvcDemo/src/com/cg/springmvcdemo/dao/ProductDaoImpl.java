package com.cg.springmvcdemo.dao;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;

import com.cg.springmvcdemo.dto.Product;

@Repository("productdao")
public class ProductDaoImpl implements ProductDao {
	@PersistenceContext
	EntityManager em;
	@Override
	public Product save(Product pro) {
		// TODO Auto-generated method stub
		em.persist(pro);
		return pro;
	}

	@Override
	public List<Product> findAll() {
		// TODO Auto-generated method stub
		Query query = em.createQuery("select p from Product p");
		return query.getResultList();
	}

	@Override
	public Product searchProduct(Integer prodId) {
		// TODO Auto-generated method stub
		return em.find(Product.class, prodId);
	}

	@Override
	public void remove(int prodId) {
		// TODO Auto-generated method stub
		em.remove(searchProduct(prodId));
	}

}
