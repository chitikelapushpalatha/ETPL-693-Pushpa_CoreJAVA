package com.evergent.corejava.collections;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
public class CF11_HashSet_Generics {
	public static void main(String[] args) {
		HashSet<String>myset=new HashSet<String>();
		myset.add("Hello");
		myset.add("welcome");
		System.out.println(myset);
		Iterator i=myset.iterator();
		while(i.hasNext())
			System.out.println(i.next());
		for(String s: myset)
		{
			System.out.println(s);
		}

	}

}
