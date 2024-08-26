package com.evergent.corejava.abstract1;
public class ProductImpl3 extends Product3{
ProductImpl3() {
	System.out.println("ProductImpl3:constrcutor");
}
public void show()
{
	System.out.println("local show methods");
}

public void newProduct() {
	System.out.println("new product method in product3 ");
	
}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ProductImpl3 Product1=new ProductImpl3();
		Product1.show();
		Product1.newProduct();
		Product1.allProducts();

	}
	

}
