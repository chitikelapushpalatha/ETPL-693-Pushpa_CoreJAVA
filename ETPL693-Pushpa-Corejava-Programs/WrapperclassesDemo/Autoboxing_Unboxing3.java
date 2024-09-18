package com.evergent.corejava.WrapperclassesDemo;

public class Autoboxing_Unboxing3 {

	public static void main(String[] args) {
		/*char ch1='a';
		Character myc=ch1;
		char ch=myc.charValue();
		System.out.println("value of ch:"+ch);
		System.out.println("value of gfg:"+myc);
		*/
		
		// TODO Auto-generated method stub
		char c='a';
		Character c1=new Character(c);
		System.out.println(c1);
		char c2=c1.charValue();
		System.out.println(c2);

	}

}
