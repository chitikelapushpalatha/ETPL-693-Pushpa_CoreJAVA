package com.evergent.corejava.collections.Queue;
import java.util.LinkedList;
import java.util.ArrayDeque;
import java.util.Deque;

public class Queue_LinkedList11 {

	public static void main(String[] args) {
		Deque<String>q1=new LinkedList<>();
		q1.add("Banana");
		q1.addFirst("Pineapple");
		q1.add("watermelon");
		q1.addLast("papaya");
		q1.offerFirst("Kiwi");
		q1.offer("Apple");
		q1.offerLast("mango");
		System.out.println(q1);
		System.out.println(q1.size());
		boolean t1=q1.isEmpty();
		System.out.println(t1);
		q1.clear();
		System.out.println(q1);
		
		
		

	}

}
