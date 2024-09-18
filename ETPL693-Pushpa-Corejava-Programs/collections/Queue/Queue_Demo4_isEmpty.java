package com.evergent.corejava.collections.Queue;

import java.util.PriorityQueue;

public class Queue_Demo4_isEmpty {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PriorityQueue<Integer>pq=new PriorityQueue<>();
		pq.add(8);
		pq.offer(2);
		pq.add(5);
		pq.add(9);
		while(!pq.isEmpty()) {
		System.out.println(pq.poll());

	}


	}

}
