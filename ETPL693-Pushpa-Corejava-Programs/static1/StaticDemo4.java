package com.evergent.corejava.static1;

public class StaticDemo4 {
	static String cname="India";
	String name="Ramesh";
	static public void myData()
	{
		System.out.println("MyData");
	}
	public void show()
	{
		myData();
		System.out.println("show is non static method");
	}

	public static void main(String[] args) {
		myData();
		System.out.println(cname);
		StaticDemo4 sd4=new StaticDemo4();
		sd4.show();

	}

}


