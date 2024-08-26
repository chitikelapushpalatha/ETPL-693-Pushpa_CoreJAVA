package com.evergent.corejava.exceptionhandling;
/*try followed by either catchblock or finallyblock*/

public class ExceptionDemo6 {
	String name="null";
	int k=0;
	public void myData()
	{
		try
		{
			System.out.println("one");
			System.out.println(name.length());
			int t=10/k;
			System.out.println("end");
			System.out.println(t);
		}
		finally {
			System.out.println("finally block for closing db/networrk connections");
		}
	}

	public static void main(String[] args) {
		ExceptionDemo6 ed2=new ExceptionDemo6();
		ed2.myData();
		// TODO Auto-generated method stub

	}

}
