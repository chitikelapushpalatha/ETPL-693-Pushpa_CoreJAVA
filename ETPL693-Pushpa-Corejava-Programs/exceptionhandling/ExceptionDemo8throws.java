
package com.evergent.corejava.exceptionhandling;



public class ExceptionDemo8throws {

	String name="null";

	public void myData() throws NullPointerException{

		System.out.println("one");

		System.out.println(name.length());

		System.out.println("end");

	}



	public void myInfo() throws NullPointerException {

		myData();

		System.out.println("myInfomethod");

	}

	public static void main(String[] args) {

		try {

			ExceptionDemo8throws ed2=new ExceptionDemo8throws();

			ed2.myInfo();

		}

		catch(Exception e)

		{

			System.out.println("I can handle:"+e);

		}

	

		// TODO Auto-generated method stub



	}



}