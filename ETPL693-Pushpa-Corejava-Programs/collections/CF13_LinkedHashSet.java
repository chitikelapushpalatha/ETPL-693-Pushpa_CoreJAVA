package com.evergent.corejava.collections;
import java.util.LinkedHashSet;
public class CF13_LinkedHashSet {

	public static void main(String[] args) {
		//creating a linkedHashset
		LinkedHashSet<String>LinkedHashSet=new LinkedHashSet<>();
		//Adding elements  to the linkedHashset
		LinkedHashSet.add("Apple");
		LinkedHashSet.add("Banana");
		LinkedHashSet.add("Orange");
		LinkedHashSet.add("Mango");
		LinkedHashSet.add("Grapes");
		//Display the LinkedHashSet
		System.out.println("LinkedHashSet:"+LinkedHashSet);
		//Iterating through the linkedHashset
		System.out.println("Iterating over LinkedHashSet:");
		for(String fruit:LinkedHashSet) {
			System.out.println(fruit);
		}
		//checking if the set contains an element returns true if this set contains the specific element
		System.out.println("contains 'manago':"+LinkedHashSet.contains("Mango"));
		//removing an element
		LinkedHashSet.remove("Banana");
		System.out.println("After removing 'Banana':"+LinkedHashSet);
		//checking the size of the linkedhashset
		System.out.println("size of inkedhashlist:"+LinkedHashSet.size());
		System.out.println("After clearing:"+LinkedHashSet);
		
		// TODO Auto-generated method stub

	}

}
