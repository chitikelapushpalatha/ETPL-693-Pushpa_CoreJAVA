package com.evergent.corejava.collections.Queue;

import java.util.ArrayDeque;

public class Queue_ArrayDeque7 {

	public static void main(String[] args) {
		ArrayDeque<String>ad=new ArrayDeque<>();
		ad.add("Banana");
		ad.addFirst("Pineapple");
		ad.add("watermelon");
		ad.addLast("papaya");
		ad.offerFirst("Kiwi");
		ad.offer("Apple");
		ad.offer("mango");
		System.out.println(ad);
		System.out.println(ad.size());
		boolean t=ad.isEmpty();
		System.out.println(t);
		ad.clear();
		System.out.println(ad);
	

	}

}
