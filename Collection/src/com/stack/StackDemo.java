package com.stack;

import java.util.Enumeration;
import java.util.Stack;

public class StackDemo {

	public static void main(String[] args) {
		
		Stack<String> stk = new Stack<>();
		
		stk.push("5Star");
		stk.push("Perk");
		stk.push("Dairy Milk");
		
		System.out.println(stk);
		
		System.out.println(stk.peek());
		
		System.out.println(stk);
		
		System.out.println(stk.pop());
		
		System.out.println(stk);
		
		System.out.println(stk.peek());
		
		System.out.println(stk.search("Perk"));
		
		Enumeration<String> en = stk.elements();
		
		while(en.hasMoreElements())
		{
			System.out.println(en.nextElement());
		}
	}

}
