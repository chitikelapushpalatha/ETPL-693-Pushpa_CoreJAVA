package com.evergent.corejava.exceptionhandling;
/*We should follow exceptions hierarchial*/

public class ExceptionDemo4 {
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
			System.out.println(t);
		}
		catch(NullPointerException e)
		{
			System.out.println("I can handle :"+e);
		}
		catch(Exception e)
		{
			System.out.println("I can handle :"+e);
		}
	}

	public static void main(String[] args) {
		ExceptionDemo4 ed2=new ExceptionDemo4();
		ed2.myData();
		// TODO Auto-generated method stub

	}

}
