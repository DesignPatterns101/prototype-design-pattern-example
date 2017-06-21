package com.design.pattern.model;

public abstract class Product implements Cloneable {
	private String productId;
	private String productDescription;

	public String getProductId() {
		return productId;
	}

	public void setProductId(String productId) {
		this.productId = productId;
	}

	public String getProductDescription() {
		return productDescription;
	}

	public void setProductDescription(String productDescription) {
		this.productDescription = productDescription;
	}

	public Object clone() {
		Object clone = null;
		try {
			clone = super.clone();

		} catch (Exception e) {
			// TODO: handle exception
		}
		return clone;

	}

}
