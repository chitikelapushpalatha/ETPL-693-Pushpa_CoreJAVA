package com.evergent.corejava.oops;

class Bigdata {
	public void myData()
	{
		System.out.println("MyBigdata:classmethod");
	}
}
public class MethodOverriding  extends Bigdata{

	public void myData()
	{
		System.out.println("Mydata");
	}

	
	public void show()
	{
		System.out.println("local show methods");
	}

	public static void main(String[] args) {
		MethodOverriding ovr=new  MethodOverriding();
		ovr.myData();
		ovr.show();
	

	}

}
