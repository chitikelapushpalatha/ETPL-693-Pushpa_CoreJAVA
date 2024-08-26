package com.evergent.corejava.constructor;

class MyEmployee {
	int eno;
	public MyEmployee()
	{
		System.out.println("Default constructor");
	}
	MyEmployee(int eno)
	{
		this.eno=eno;
		System.out.println("Employee no superclass:"+eno);
	}
}
	public class Employee6  extends MyEmployee
	{
		String ename;
		double sal;
		Employee6()
		{
			System.out.println("Default constructor");
		}
		Employee6(int eno,String ename,double sal)
		{
			super(eno);
			this.ename=ename;
			this.sal=sal;
		}
		public void display() {
			System.out.println("Employee number:"+eno);
			System.out.println("Employee name:"+ename);
			System.out.println("Employee Salary:"+sal);
		}
		
public static void main(String[] args) {
new Employee6();
Employee6 me=new Employee6(345,"PUSH",123);
me.display();
}
	
}
		


