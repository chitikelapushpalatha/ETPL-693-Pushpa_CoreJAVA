package com.evergent.corejava.generalprogramming;
import java.util.*;
public class Myname {
	public static void main(String[] args)
	{
		Scanner obj=new Scanner(System.in);
		System.out.println("Enter two numbers");
		int a=obj.nextInt();
		int b=obj.nextInt();
		if(a>b)
			System.out.println("A is big");
		else
			System.out.println("B is big");
	}

}
