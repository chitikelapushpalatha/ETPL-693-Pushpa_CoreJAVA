package com.evergent.corejava.constructor;

class car {
	String color;
	int maxspeed;
	car()
	{
		color="white";
		maxspeed=120;
	}
	car(String color,int maxspeed)
	{
		this.color=color;
		this.maxspeed=maxspeed;
	}
	void display()
	{
		System.out.println("color:"+color);
		System.out.println("maxspeed:"+maxspeed);
		
	}
}
	public class Mycars
	{

	public static void main(String[] args) {
		car car1=new car();
		car car2=new car("red",150);
		car1.display();
		car2.display();
	}
		// TODO Auto-generated method stub

	}

