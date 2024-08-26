package com.evergent.corejava.generalprogramming;

import java.util.Scanner;
public class Myname2 {
	public static void main(String[] args)
	{
		Scanner obj=new Scanner(System.in);
		System.out.println("Enter three numbers");
		int a=obj.nextInt();
		int b=obj.nextInt();
		int c=obj.nextInt();
		if(a>b && a>c)
			System.out.println("A is big");
		else if(b>a && b>c)
			System.out.println("B is big");
		else
			System.out.println("c is big");
			
	}

}
