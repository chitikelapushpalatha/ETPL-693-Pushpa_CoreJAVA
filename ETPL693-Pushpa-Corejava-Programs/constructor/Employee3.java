package com.evergent.corejava.constructor;

public class Employee3 {
	int eno;
	String ename;
	double sal;
	Employee3()
	{
		System.out.println("Default Constructor");
	}
	Employee3(int eno,String ename,double sal)
	{
		this.eno=eno;
		this.ename=ename;
		this.sal=sal;
	}
	public void display()
	{
		System.out.println("Employee no:"+eno);
		System.out.println("Employee name:"+ename);
		System.out.println("Employee sal:"+sal);
	}

	public static void main(String[] args) {
		new Employee3();

			Employee3 emp3=new Employee3(123,"pushpa",25000);
			emp3.display();
			
	}

}
