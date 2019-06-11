package org.app.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Product {

	@Id
	@GeneratedValue
	private Integer prodId;
	private String prodCod;
	private Double prodCost;
	
	public Product() {
		
	}

	public Product(String prodCod, Double prodCost) {
		
		this.prodCod = prodCod;
		this.prodCost = prodCost;
	}

	public Product(Integer prodId, String prodCod, Double prodCost) {
		super();
		this.prodId = prodId;
		this.prodCod = prodCod;
		this.prodCost = prodCost;
	}

	public Integer getProdId() {
		return prodId;
	}

	public void setProdId(Integer prodId) {
		this.prodId = prodId;
	}

	public String getProdCod() {
		return prodCod;
	}

	public void setProdCod(String prodCod) {
		this.prodCod = prodCod;
	}

	public Double getProdCost() {
		return prodCost;
	}

	public void setProdCost(Double prodCost) {
		this.prodCost = prodCost;
	}

	@Override
	public String toString() {
		return "Product [prodId=" + prodId + ", prodCod=" + prodCod + ", prodCost=" + prodCost + "]";
	}
	
	
}
