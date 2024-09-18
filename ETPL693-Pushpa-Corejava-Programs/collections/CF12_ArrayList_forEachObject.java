package com.evergent.corejava.collections;

import java.util.ArrayList;

public class CF12_ArrayList_forEachObject {

	public static void main(String[] args) {
		ArrayList<Object>myList=new ArrayList<>();
					myList.add(100);
					myList.add("ven");
					myList.add("Ramesh");
					myList.add(45.5);
					for(Object o:myList)
					{
						System.out.println(o);
					}
	}
}
			
