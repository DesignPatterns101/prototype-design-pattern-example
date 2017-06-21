package com.design.pattern.model;

import java.util.Hashtable;

public class ProductCache {
	static Hashtable<String, Product> productMap = new Hashtable<String, Product>();

	public Product getProduct(String productId)

	{
		Product cacheProduct = (Product) productMap.get(productId);

		return (Product) cacheProduct.clone();
	}

	public void loadCache() {
		Television television = new Television();
		television.setProductId("P001");
		television.setTelevisionType("LED TV");
		television.setProductDescription("Samsung");
		television.setTelevisionCost(400000);
		productMap.put(television.getProductId(), television);
		Mobile mobile = new Mobile();
		mobile.setProductId("P002");
		mobile.setMobileType("Android Mobile");
		mobile.setProductDescription("HTC desire 120s");
		mobile.setMobilePrice(13999);
		productMap.put(mobile.getProductId(), mobile);
	}
}
