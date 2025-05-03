package com.nt.collections.queue;

import java.util.Comparator;
import java.util.PriorityQueue;

public class PriorityQueuePractice {

	public static void main(String[] args) {
		PriorityQueue<Integer> pq=new PriorityQueue<Integer>();	//11 default size
		//Addition-offer,add
		//retrieval-peek
		//removal-poll,remove
		//head points to highest priority
		//place inside PriorityQueue<Integer>(Comparator.reverseOrder()); to get reverse order
		 pq.add(8);
		 pq.add(45);
		 pq.offer(23);
		 pq.offer(65);
		 pq.add(1);
		 pq.offer(2);
		 System.out.println(pq);
		 System.out.println(pq.peek());
		 System.out.println(pq.peek());
		 System.out.println(pq.poll());
		 System.out.println(pq);
		 
		 System.out.println(pq.contains(50));
		 while(!pq.isEmpty()) {
			 System.out.println(pq.poll());
		 }
	}
	
}
