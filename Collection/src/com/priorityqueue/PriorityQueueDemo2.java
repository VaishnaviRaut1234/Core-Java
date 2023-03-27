package com.priorityqueue;

import java.util.Iterator;
import java.util.PriorityQueue;

public class PriorityQueueDemo2 {

	public static void main(String[] args) {
		
		PriorityQueue<String> pq = new PriorityQueue<>();
		
		pq.add("Vaishu");
		pq.add("Rahul");
		pq.add("Ashu");
		pq.add("Shubham");
		
		Iterator<String> its =pq.iterator();
		while(its.hasNext())
		{
			System.out.println(its.next());
		}
		
	}

}
