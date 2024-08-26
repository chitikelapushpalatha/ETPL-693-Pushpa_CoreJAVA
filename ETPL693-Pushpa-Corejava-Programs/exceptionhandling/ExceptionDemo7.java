package com.evergent.corejava.exceptionhandling;
/*Throws an exception will be executed method by method*/

public class ExceptionDemo7 {
	String name="null";
	public void myData() throws NullPointerException{
		System.out.println("one");
		System.out.println(name.length());
		System.out.println("end");
	}
		

	public static void main(String[] args) {
		try {
		ExceptionDemo7 ed2=new ExceptionDemo7();
		ed2.myData();

	}
	catch(NullPointerException e)
	{
		System.out.println("I can handle :"+e);
	}
	

}
}
