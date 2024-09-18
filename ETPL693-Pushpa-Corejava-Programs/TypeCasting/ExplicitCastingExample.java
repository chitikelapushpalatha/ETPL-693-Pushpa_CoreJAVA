package com.evergent.corejava.TypeCasting;

public class ExplicitCastingExample {
	/*
	 Explicit Type Casting
	Explicit type casting, also known as narrowing conversion,
	 * 
	 */

	    public static void main(String[] args) {
	        double dnum = 100.99;
	        int num = (int) dnum; // Explicit casting from double to int

	        System.out.println("Double value: " + dnum);
	        System.out.println("Integer value (after explicit casting): " + num);
	    }
	}


