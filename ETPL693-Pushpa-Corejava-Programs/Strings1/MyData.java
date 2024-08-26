package com.evergent.corejava.Strings1;
//Implemented a user defined method myvalue and returning  value
////Overriding toString method and returning the value in immutable string
public class MyData {

	public static void main(String[] args) {
		ImmutableString str=new ImmutableString("Hello,StringWorld!");
		System.out.println(str.toString());
		System.out.println(str.myvalue());
		// TODO Auto-generated method stub

	}

}
