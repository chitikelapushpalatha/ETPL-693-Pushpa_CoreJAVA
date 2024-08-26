package com.evergent.corejava.interfaces1;

public class BookImpl2 implements Book{
	public void bookTitle()
	{
		System.out.println("corejava"+cname);
	}
	public void bookAuthor()
	{
		System.out.println("oracle crop");
	}
	public void bookPrice()
	{
		System.out.println("Rs 50");
	}
	public void show()
	{
		System.out.println("show is local methods");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Book b2=new BookImpl2();
		b2.bookTitle();
		b2.bookAuthor();
		b2.bookPrice();
		

	}

}
