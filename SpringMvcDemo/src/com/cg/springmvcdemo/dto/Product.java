package com.cg.springmvcdemo.dto;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.NotEmpty;

@Entity
public class Product {
	
	@Id
	@NotNull(message="cant be empty")
	private Integer prodId;
	@NotEmpty(message="Name should be btw 3,10")
	private String prodName;
	private Double prodPrice;
	private String features;
	private String typr;
	private String online;
	
	public Product() {
		
	}
	public Product(Integer prodId, String prodName, Double prodPrice, String features, String typr, String online) {
		super();
		this.prodId = prodId;
		this.prodName = prodName;
		this.prodPrice = prodPrice;
		this.features = features;
		this.typr = typr;
		this.online = online;
	}
	public Integer getProdId() {
		return prodId;
	}
	public void setProdId(Integer prodId) {
		this.prodId = prodId;
	}
	public String getProdName() {
		return prodName;
	}
	public void setProdName(String prodName) {
		this.prodName = prodName;
	}
	public Double getProdPrice() {
		return prodPrice;
	}
	public void setProdPrice(Double prodPrice) {
		this.prodPrice = prodPrice;
	}
	public String getFeatures() {
		return features;
	}
	public void setFeatures(String features) {
		this.features = features;
	}
	public String getTypr() {
		return typr;
	}
	public void setTypr(String typr) {
		this.typr = typr;
	}
	public String getOnline() {
		return online;
	}
	public void setOnline(String online) {
		this.online = online;
	}
	@Override
	public String toString() {
		return "Product [prodId=" + prodId + ", prodName=" + prodName + ", prodPrice=" + prodPrice + ", features="
				+ features + ", typr=" + typr + ", online=" + online + "]";
	}
	
	
	
	
	

}
