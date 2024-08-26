package com.evergent.corejava.oops;

public class MethodsFlow {
	public void show() {
		System.out.println("No parameters with no return values");
	}
	//parameters with no return type
	public void myData(int a,int b) {
		System.out.println(a+b);
	}
	//parameters with return type
	public int mymul(int a,int b)
	{
		return a*b;
	}
	//no parameters with return type
	public int mychange()
	{
		return 100;
	}
	public static void main(String[] args) {
		MethodsFlow mf=new MethodsFlow();
		mf.show();
		mf.myData(10,20);
		int p=mf.mymul(5,5 );
		System.out.println(p);
		int k=mf.mychange();
		System.out.println(k);		
		

	}

}
