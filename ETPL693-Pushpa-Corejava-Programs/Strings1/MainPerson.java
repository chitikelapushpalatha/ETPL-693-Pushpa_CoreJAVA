package com.evergent.corejava.Strings1;
public class MainPerson{
		public static void main(String[] args)
		{
			PersonImmutable person = new PersonImmutable("raju",30);
			System.out.println(person.myName());
			System.out.println(person.myAge());
			
		}
	}
