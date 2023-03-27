package com.priorityqueue;

import java.util.Iterator;
import java.util.PriorityQueue;

public class PriorityQueueDemo {

	public static void main(String[] args) {
		
		PriorityQueue<Integer> pq = new PriorityQueue<>();
		
		/*pq.add(58);
		pq.add(12);
		pq.add(8);
		pq.add(96);*/
		/*pq.offer(56);
		pq.offer(8);
		pq.offer(3);
		pq.offer(1);
		pq.offer(84);
		pq.offer(0);*/
		pq.offer(78);
		pq.offer(61);
		pq.offer(11);
		pq.offer(56);
		pq.offer(84);
		
		System.out.println(pq);
		
		Iterator<Integer> its =pq.iterator();
		while(its.hasNext())
		{
			System.out.println(its.next());
		}
		
	}

}
