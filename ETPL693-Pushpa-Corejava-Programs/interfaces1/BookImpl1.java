package com.evergent.corejava.interfaces1;

public class BookImpl1 implements Book{
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
		BookImpl1 book1=new BookImpl1();
		book1.bookTitle();
		book1.bookAuthor();
		book1.bookPrice();
		book1.show();
		

	}

}
