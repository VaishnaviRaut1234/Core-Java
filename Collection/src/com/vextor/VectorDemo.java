package com.vextor;

import java.util.Iterator;
import java.util.Vector;

public class VectorDemo {

	public static void main(String[] args) {
		
		Vector<String> names = new Vector<>(4,2);
		
		System.out.println(names.size());
		System.out.println(names.capacity());
		System.out.println("***************");
		names.add("Vaishu");
		names.add("Rahul");
		names.add("Shubham");
		
		System.out.println(names.size());
		System.out.println(names.capacity());
		
		names.add("Ashu");
		
		System.out.println("After adding the element");
		System.out.println(names.size());
		System.out.println(names.capacity());
		
		names.addElement("Nikhil");
		
		System.out.println("After addining element by using add element");
		System.out.println(names.size());
		System.out.println(names.capacity());
		
		Iterator list = names.iterator();
		while(list.hasNext())
		{
			System.out.println(list);
		}
		
	}

}
