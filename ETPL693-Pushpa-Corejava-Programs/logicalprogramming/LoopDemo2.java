package com.evergent.corejava.logicalprogramming;
import java.util.*;
public class LoopDemo2 {

	public static void main(String[] args) {
		Scanner obj=new Scanner(System.in);
		System.out.println("Enter the numbers");
		int a=obj.nextInt();
		int b=obj.nextInt();
		int temp=0;
		temp=a;
		a=b;
		b=temp;
		System.out.println(a);
		System.out.println(b);
				
		

	}

}
