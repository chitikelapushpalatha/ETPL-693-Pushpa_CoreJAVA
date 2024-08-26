package com.evergent.corejava.abstract1;

public class ProductImpl2  extends Product {
	public void show()
	{
		System.out.println("local show methods");
	}
	public void newProducr() {
		System.out.println("My new Product");
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Product p2=new ProductImpl2();
		p2.allProducts();
		p2.newProducr();
		//p2.show();

	}

}
