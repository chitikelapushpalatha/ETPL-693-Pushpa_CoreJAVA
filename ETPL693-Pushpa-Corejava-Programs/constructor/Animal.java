package com.evergent.corejava.constructor;
class An {
	private String name;
	private int age;
	public An(String name,int age)
	{
		this.name=name;
		this.age=age;
	}
	public void displayInfo()
	{
		System.out.println("name:"+name);
		System.out.println("age:"+age);
	}
		}
	class Dog extends An
	{
		private String breed;
		public Dog(String name,int age,String breed)
		{
			super(name,age);
			this.breed=breed;
		
	}
		public void displayInfo()
		{
			super.displayInfo();
			System.out.println("Breed:"+breed);
		}
		}
	public class Animal{
		
	public static void main(String[] args) {
		Dog dog=new Dog("Buddy",5,"golden retreiver");
		dog.displayInfo();
		// TODO Auto-generated method stub

	}

}
