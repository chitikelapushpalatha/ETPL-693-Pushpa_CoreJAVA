package com.evergent.corejava.abstract1;
//Abstract class having abstract methods and concrete methods
//If any class having one abstract method that class should be
// declared as abstract keyword otherwise that class should be showing compile time error.
//If any class Extends abstract class that class should be override all abstract methods otherwise
//that class should be showing compile time error.
//We cannot create object to abstract class but we can create reference to abstract class.
public class ProductImpl extends Product {
	public void show() {
	System.out.println("local show methods");
}
public void newProduct() {
	System.out.println("My new Product");
}


	public static void main(String[] args) {
		ProductImpl product1=new ProductImpl();
		product1.show();
		product1.newProduct();
		product1.allProducts();

	}

}
