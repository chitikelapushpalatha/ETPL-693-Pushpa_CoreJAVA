package com.evergent.corejava.javaBean;

import java.io.Serializable;

public class StudentBean implements Serializable{
	private int sno;
	private String sname;
	private String address;
	public void setSno(int sno) {
		this.sno=sno;
	}
	public void setSname(String sname)
	{
		this.sname=sname;
	}
	public void setAddress(String address)
	{
		this.address=address;
	}
	public String toString() {
		return "Student no:"+sno+"\n Studentname:"+sname+"\n  StudentAddress:"+address;
	}
}

	

	