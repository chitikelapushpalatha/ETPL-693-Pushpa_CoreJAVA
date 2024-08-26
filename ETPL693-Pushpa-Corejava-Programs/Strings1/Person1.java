package com.evergent.corejava.Strings1;

class Data {
	String name;
	int age;
	public Data(String name,int age) {
		this.name=name;
		this.age=age;
	}
	public String toString()
	{
		return name+age;
	}
}
public class Person1{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Data p1=new Data("Bhanu",25);
		System.out.println(p1);

	}
}
