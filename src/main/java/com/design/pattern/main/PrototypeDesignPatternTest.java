package com.design.pattern.main;

import com.design.pattern.model.Mobile;

import com.design.pattern.model.ProductCache;
import com.design.pattern.model.Television;

public class PrototypeDesignPatternTest {
	public static void main(String[] args) {
		ProductCache pr = new ProductCache();
		pr.loadCache();
		Television televisionClone = (Television) pr.getProduct("P001");
		System.out.println("Product Type: "
				+ televisionClone.getTelevisionType());
		System.out.println("Product Description:"
				+ televisionClone.getProductDescription());
		System.out.println("Product Cost: "
				+ televisionClone.getTelevisionCost());
		Mobile mobileClone = (Mobile) pr.getProduct("P002");
		System.out.println("Product Type: " + mobileClone.getMobileType());
		System.out.println("Product Description:"
				+ mobileClone.getProductDescription());
		System.out.println("Product Cost: " + mobileClone.getMobilePrice());

	}

}
