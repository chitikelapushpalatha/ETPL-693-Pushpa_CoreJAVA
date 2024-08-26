package com.evergent.corejava.interfaces1;
//Java will support multiple Inheritance through interface
public class BookImpl3 implements Book,NewBook{
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
	public void myData()
	{
		System.out.println("myData info method");
	}
	public void addNewBook() {
		System.out.println("new book interface method");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BookImpl3 book1=new BookImpl3();
		book1.bookTitle();
		book1.bookAuthor();
		book1.bookPrice();
		book1.show();
		book1.myData();
		book1.addNewBook();		
	}
}
