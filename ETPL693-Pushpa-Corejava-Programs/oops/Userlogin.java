package com.evergent.corejava.oops;

public class Userlogin {
	public void loginDetails()
	{
		System.out.println("login Details");
	}
	public void loginDetails(String username,String password)
	{
		System.out.println("username:"+username);
		System.out.println("password:"+password);
		
	}
	public void loginDetails(String uname,String pass,String captcha)
	{
		System.out.println("username:"+uname);
		System.out.println("password:"+pass);
		System.out.println("captcha:"+captcha);
		
	}
	public int loginDetails(int mobile,String pass)
	{
		System.out.println("Mobile:"+mobile);
		System.out.println("Password:"+pass);
		return 0;
	}
	public void show()
	{
		System.out.println("methods");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Userlogin ulogin=new Userlogin();
		ulogin.loginDetails("pushpa","pushpa123");
		ulogin.loginDetails("pushpa","pushpa123","abc");
		ulogin.loginDetails(1111111,"pushpa123");
		ulogin.show();
		
		

	}

}
