package com.evergent.corejava.oops;

class Person1 {
	public void personInfo()
	{
		System.out.println("pushpa");
	}
}
class PersonDetails extends Person1{
	public void personData()
	{
		System.out.println("Hyderabad");
	}
}
public class Myperson extends PersonDetails
{
	public void show() {
		System.out.println("local methods");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Myperson m=new Myperson();
		m.personInfo();
		m.personData();
		m.show();

	}

}
