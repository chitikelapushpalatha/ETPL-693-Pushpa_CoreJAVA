package com.evergent.corejava.javaBean;

public class ProductImpl {

	public static void main(String[] args) {
		ProductBean product = new ProductBean(100,"laptop",55000);
		System.out.println("Product no:"+product.getPno());
		System.out.println("Product name:"+product.getPname());
		System.out.println("Product no:"+product.getPrice());
		
		// TODO Auto-generated method stub

	}

}
