package com.evergent.corejava.static1;

public class StaticDemo3 {
	static String cname="India";
	String name="Ramesh";
	static public void myData()
	{
		System.out.println("MyData");
	}
	public void show()
	{
		System.out.println("show is non static method");
	}

	public static void main(String[] args) {
		myData();
		System.out.println(cname);

	}

}
