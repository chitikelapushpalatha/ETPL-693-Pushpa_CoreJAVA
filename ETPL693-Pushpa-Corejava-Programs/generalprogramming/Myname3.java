package com.evergent.corejava.generalprogramming;

import java.util.Scanner;
public class Myname3 {
	public static void main(String[] args)
	{
		Scanner obj=new Scanner(System.in);
		System.out.println("Enter Five numbers");
		int a=obj.nextInt();
		int b=obj.nextInt();
		int c=obj.nextInt();
		int d=obj.nextInt();
		int e=obj.nextInt();
		if(a>b && a>c && a>d && a>e)
			System.out.println("A is big");
		else if(b>a && b>c && b>d && b>e)
			System.out.println("B is big");
		else if(c>a && c>b && c>d && c>e)
			System.out.println("C is big");
		else if(d>a && d>b && d>c && d>e)
			System.out.println("D is big");
		else
			System.out.println("E is big");
			
	}

}
