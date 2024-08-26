package com.evergent.corejava.exceptionhandling;
/*Finally is block if exception is occurs or not finally 
 * block will be executed*/

public class ExceptionDemo5 {
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
		finally {
			System.out.println("finally block for closing db/networrk connections");
		}
	}

	public static void main(String[] args) {
		ExceptionDemo5 ed2=new ExceptionDemo5();
		ed2.myData();
		// TODO Auto-generated method stub

	}

}
