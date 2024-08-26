package com.evergent.corejava.javaBean;

public class EmployeeImp {

	public static void main(String[] args) {
		Employee emp=new Employee();
		emp.setEno(100);
		emp.setEname("Raju");
		emp.setSal(550000);
		System.out.println("Employee No:"+emp.getEno());
		System.out.println("Employee Name:"+emp.getEname());
		System.out.println("Employee sal:"+emp.getSal());
		
		// TODO Auto-generated method stub

	}

}
