package com.evergent.corejava.collections;

import java.util.List;
import java.util.Set;
import java.util.ArrayList;
import java.util.HashSet;
public class CF14_ArrayList_Hashset {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String>list=new ArrayList<String>();
		list.add("corejava");
		list.add("J2EE");
		list.add("J2SE");
		list.add("Myjava");
		System.out.println(list);
		Set<String>s=new HashSet<String>();
		s.addAll(list);
		System.out.println(s);
		Set<String>s1=new HashSet<String>();
		s1.add("corejava");
		list.add("J2EE");
		list.add("J2SE");
		list.add("Myjava");
		list.add("corejava");
		list.add("hello");
		if(s.equals(s1))
		{
			System.out.println("same");
		}
		else
		{
			System.out.println("not same");
		}
		//Returns true if this set contains all of the elements of the specified collection.
		//If the specified collection is also a set this method returns true
		System.out.println(s.containsAll(s1));
	}

}
