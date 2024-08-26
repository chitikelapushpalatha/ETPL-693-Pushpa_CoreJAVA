package com.evergent.corejava.generalprogramming;
enum Color{
	RED,GREEN,BLUE;
}
enum News{
	North,East,west,South;
}
enum ABCProducts
{
	Laptops,Desktops,Tabs;
}
enum Days{
	M,TU,W,T,F,SA,SU;
}

public class Enumcolorexample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Color c=Color.RED;
		System.out.println(c);
		News s=News.North;
		System.out.println(s);
		ABCProducts p=ABCProducts.Laptops;
		System.out.println(p);
		Days day=Days.SU;
		System.out.println(day);
		}

}
