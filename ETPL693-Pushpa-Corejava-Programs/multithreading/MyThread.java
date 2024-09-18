package com.evergent.corejava.multithreading;

class MyThread1 extends Thread{
	public void run()
	{
		for(int i=1;i<=100;i++)
		{
			System.out.println(i);
		}
	}
}
	public class MyThread{

	public static void main (String[] args) {
		MyThread1 t1=new MyThread1();
		t1.start();
		t1.setPriority(5);
		MyThread1 t2=new MyThread1();
		t2.start();
		t2.setPriority(1);
	}
	}

