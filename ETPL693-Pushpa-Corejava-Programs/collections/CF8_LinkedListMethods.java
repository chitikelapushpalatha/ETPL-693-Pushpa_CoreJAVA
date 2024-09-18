package com.evergent.corejava.collections;

import java.util.LinkedList;

public class CF8_LinkedListMethods {

	public static void main(String[] args) {
		LinkedList fruits = new LinkedList();
		//Add elements to the linkedlist
		fruits.add("Apple");
		fruits.add("Banana");
		fruits.add("cherry");
		fruits.add("Date");
		//Display the linkedlist
		System.out.println("Intial linkedlist:"+fruits);
		//Add an element at the beginning
		fruits.addFirst("Mango");
		System.out.println("After adding first element:"+fruits);
		//Add an element at the end
		fruits.addLast("orange");
		System.out.println("After adding last element:"+fruits);
		//Access elements by index
		System.out.println("Elements at index 2:"+fruits.get(2));
		//Remove the first and last elements
		fruits.removeLast();
		System.out.println("After removing last element:"+fruits);
		//check if the linkedlist contaions specific element
		System.out.println("Contains 'banana'"+fruits.contains("Banana"));
		//Remove an element by value
		fruits.remove("Banana");
		System.out.println("After removing 'Banana':"+fruits);
		//Get the size of the linked list
		System.out.println("Size of the linkedlist:"+fruits.size());
		//clear the linkedlist
		fruits.clear();
		
		

	}

}
