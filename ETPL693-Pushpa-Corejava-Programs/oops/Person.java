package com.evergent.corejava.oops;

public class Person {
	String name="Pushpa";
	int age=21;
	String address="Hyderabad";
public void Display()
{
	System.out.println("name:"+name);
	System.out.println("age:"+age);
	System.out.println("address:"+address);
}

public static void main(String[] args) {
		// TODO Auto-generated method stub
	Person p=new Person();
	p.Display();
	}
}
