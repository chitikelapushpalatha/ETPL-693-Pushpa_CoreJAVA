package com.evergent.corejava.collections.Queue;
import java.util.PriorityQueue;
import java.util.Queue;
//Addition:Offer(),add()
//Retrieval:peek()
//Remove:poll,remove()
public class Queue_Demo3 {

	public static void main(String[] args) {
		PriorityQueue<Integer>pq=new PriorityQueue<>();
		pq.add(8);
		pq.offer(2);
		pq.add(5);
		pq.add(9);
		System.out.println(pq.poll());
		System.out.println(pq);
		pq.clear();
		System.out.println(pq.remove());
		// TODO Auto-generated method stub

	}

}
