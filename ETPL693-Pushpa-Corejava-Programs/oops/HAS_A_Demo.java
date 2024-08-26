package com.evergent.corejava.oops;

public class HAS_A_Demo {
	public void myData()
	{
		System.out.println("HAS_A_myData");
	}

	public static void main(String[] args) {
		HAS_A_Demo has=new HAS_A_Demo();
		has.myData();
		Person person=new Person();
		person.Display();
		// TODO Auto-generated method stub

	}

}
