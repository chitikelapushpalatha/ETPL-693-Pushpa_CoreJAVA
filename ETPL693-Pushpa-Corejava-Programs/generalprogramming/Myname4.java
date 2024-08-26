package com.evergent.corejava.generalprogramming;

import java.util.Scanner;
public class Myname4 {
	public static void main(String[] args)
	{
		Scanner obj=new Scanner(System.in);
		System.out.println("Enter two numbers");
		int a=obj.nextInt();
		int b=obj.nextInt();
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println(a);
		System.out.println(b);
	}
}