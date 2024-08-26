package com.evergent.corejava.constructor;

public class Student {
	String name;
	int age;
	 Student(String name,int age) {
		this.name=name;
		this.age=age;
	}
	//copy constructor
	Student(Student s)
	{
		this.name=s.name;
		this.age=s.age;
	}
	public void displayDetails()
	{
		System.out.println("name:"+name);
		System.out.println("age:"+age);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student student1=new Student("pushpa",20);
		Student student2=new Student(student1);
		student1.displayDetails();
		student2.displayDetails();
		

	}

}
