package com.evergent.corejava.static1;

public class StaticDemo5 {
	static String cname="India";
	static {
		System.out.println("static block");
	}
	static public void myData()
	{
		System.out.println("MyData");
	}

	public static void main(String[] args) {
		System.out.println(StaticDemo5.cname);
		StaticDemo5 sd5=new StaticDemo5();
		StaticDemo5.myData();

	}

}
