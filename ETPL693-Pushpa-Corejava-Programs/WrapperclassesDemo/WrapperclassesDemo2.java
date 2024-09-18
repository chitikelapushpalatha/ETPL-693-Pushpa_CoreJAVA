package com.evergent.corejava.WrapperclassesDemo;

public class WrapperclassesDemo2 {
	public static void main(String[] args) {
	float f1=4.5f;
	int i1=100;
		Integer t1=new Integer(i1);
		int i2=t1.intValue();
		double d1=799.89;
		Double d2=new Double(d1);
		double t2=d2.doubleValue();
		byte b1=10;
		Byte b2=new Byte(b1);
		byte bb3=b2.byteValue();
		System.out.println("Int value is:"+i1);
		System.out.println("Int Object value is:"+t1);
		System.out.println("Convert Integer object value to primitive:"+i2);
		System.out.println("Double value is:"+d1);
		System.out.println("Object  value is:"+d2);
		System.out.println("Convert Double object value to primitive:"+t2);
		System.out.println("Byte value is:"+b1);
		System.out.println("Byte Object value is:"+b2);
		System.out.println("Convert Byte object value to primitive:"+bb3);
}
}
		
		
		
		

	