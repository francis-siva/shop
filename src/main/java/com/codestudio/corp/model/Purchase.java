package com.codestudio.corp.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "purchase")
public class Purchase {
	
	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	private Integer id;
	
	@Column(name= "product", length = 230, nullable = false)
	private String product;
	
	private Float price;
	
	@Column(columnDefinition = "integer default 1")
	private Integer quantity;
	
	@Column(columnDefinition = "boolean default false")
	private Boolean purchased = false;

	public Purchase() {}

	public Purchase(String product, Float price, Integer quantity, Boolean purchased) {
		this.product = product;
		this.price = price;
		this.quantity = quantity;
		this.purchased = purchased;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getProduct() {
		return product;
	}

	public void setProduct(String product) {
		this.product = product;
	}

	public Float getPrice() {
		return price;
	}

	public void setPrice(Float price) {
		this.price = price;
	}

	public Integer getQuantity() {
		return quantity;
	}

	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}

	public boolean isPurchased() {
		return purchased;
	}

	public void setPurchased(Boolean purchased) {
		this.purchased = purchased;
	}

	@Override
	public String toString() {
		return "Purchase [id=" + id + ", product=" + product + ", price=" + price + " €, quantity=" + quantity
				+ ", purchased=" + purchased + "]";
	}
	
	
}
