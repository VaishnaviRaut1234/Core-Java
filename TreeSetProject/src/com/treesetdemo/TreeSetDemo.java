package com.treesetdemo;

import java.util.TreeSet;

public class TreeSetDemo {

	public static void main(String[] args) {
		
		TreeSet<Integer> ts = new TreeSet<>();

		ts.add(456);
		ts.add(54);
		ts.add(64);
		ts.add(85);
		ts.add(456);
		//ts.add(null);
		System.out.println(ts);
		
		System.out.println(ts.first());
		System.out.println(ts.last());
		System.out.println(ts.lower(64));
		System.out.println(ts.floor(65));
		System.out.println(ts.higher(45));
		System.out.println(ts.ceiling(121));
		System.out.println(ts.headSet(54));
	}

}
