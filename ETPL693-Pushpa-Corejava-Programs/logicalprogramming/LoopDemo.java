package com.evergent.corejava.logicalprogramming;
import java.util.*;
public class LoopDemo {

	public static void main(String[] args) {
		Scanner obj=new Scanner(System.in);
		System.out.println("enter the number");
		int n=obj.nextInt();
		int fac=1;
		for(int i=1;i<=n;i++)
		{
			fac=fac*i;
		}
		System.out.println(fac);
		
		

	}

}
