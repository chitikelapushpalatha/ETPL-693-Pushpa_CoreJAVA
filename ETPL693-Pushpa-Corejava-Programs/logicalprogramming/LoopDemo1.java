package com.evergent.corejava.logicalprogramming;
import java.util.*;
public class LoopDemo1 {

	public static void main(String[] args) {
		Scanner obj=new Scanner(System.in);
		System.out.println("Enter the number");
		int a=0,b=1,c;
		int n=obj.nextInt();
		for(int i=0;i<n;i++)
		{
			System.out.println(a);
			c=a+b;
			a=b;
			b=c;
		}


	}

}
