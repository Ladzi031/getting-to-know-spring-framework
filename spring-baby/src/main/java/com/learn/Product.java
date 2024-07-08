package com.learn;

import java.beans.ConstructorProperties;

public class Product {
	private String productId;
	private String productName;
	private String description;
	
	// seems like this overrides the constructor name for every bean defined and so we are forced to use the names in the constructorProperty annotation
	@ConstructorProperties({"productId", "productName", "proD"}) 
	public Product(String productId, String productName, String description) {
		super();
		this.productId = productId;
		this.productName = productName;
		this.description = description;
	}
	
	public String getProductId() {
		return productId;
	}
	public void setProductId(String productId) {
		this.productId = productId;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	@Override
	public String toString() {
		return "Product [productId=" + productId + ", productName=" + productName + ", description=" + description
				+ "]";
	}
	
	
}
