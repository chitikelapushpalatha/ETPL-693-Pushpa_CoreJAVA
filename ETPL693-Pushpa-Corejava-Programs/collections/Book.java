package com.evergent.corejava.collections;
import java.util.ArrayList;
import java.util.*;
class Book{
	String name;
	public Book(String name) {
		this.name=name;
	}
@Override
	public String  toString() {
		return name;
	}
public static class CF9_ArrayList_Bookobject{
	public static void main(String[] args) {
		Book b1=new Book("core java");
		Book b2=new Book("let us c");
		Book b3=new Book("java index book");
		Book b4=new Book("java interview book");
		ArrayList mylist=new ArrayList();
		mylist.add(b1);
		mylist.add(b2);
		mylist.add(b3);
		mylist.add(b4);
		System.out.println(mylist);
	}
	}
}