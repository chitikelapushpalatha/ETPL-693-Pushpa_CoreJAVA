package com.evergent.corejava.exceptionhandling;
/*There is two exceptions in class developer should be handle 1st 
 * exception then after 2nd exception will be handle
 */

public class ExceptionDemo3 {
	String name="null";
	int k=2;
	public void myData()
	{
		try
		{
			System.out.println("one");
			System.out.println(name.length());
			int t=10/k;
			System.out.println("end");
		}
		catch(NullPointerException e)
		{
			System.out.println("I can handle :"+e);
		}
	}

	public static void main(String[] args) {
		ExceptionDemo3 ed2=new ExceptionDemo3();
		ed2.myData();
		// TODO Auto-generated method stub

	}

}
