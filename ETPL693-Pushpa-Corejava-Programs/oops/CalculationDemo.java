package com.evergent.corejava.oops;

public class CalculationDemo {

		// TODO Auto-generated method stub
		int a=10;
		int b=20;
		int c;
		public void addition()
		{
			c=a+b;
			System.out.println(c);
		}
		public void subtraction(){
			c=a-b;
			System.out.println(c);
		}
		public void multiplication()
		{
			c=a*b;
			System.out.println(c);
		}
		
		public static void main(String[] args)
		{
			CalculationDemo cal=new CalculationDemo();
			cal.addition();
			cal.subtraction();
			cal.multiplication();
		}
	}
