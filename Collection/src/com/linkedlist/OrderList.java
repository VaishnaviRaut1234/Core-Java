package com.linkedlist;

import java.util.Collections;
import java.util.LinkedList;

public class OrderList {

	public static void main(String[] args) {
		
		LinkedList<Order> llist = new LinkedList<>();	
		
		
		llist.add(new Order(101,"Vaishu",980));
		llist.add(new Order(102,"Nikhil",900));
		llist.add(new Order(103,"Shubham",700));
		llist.add(new Order(104,"Ashu",910));
		llist.add(new Order(105,"Ajinkya",7400));
		llist.add(new Order(106,"Ajinkya",742));
		
		for(Order s:llist)
		{
			System.out.println(s);
		}
		
		Collections.sort(llist);
		System.out.println("***********************");
		for(Order s:llist)
		{
			System.out.println(s);
		}
	}

}
