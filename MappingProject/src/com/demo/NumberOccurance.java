package com.demo;

import java.util.ArrayList;
import java.util.HashMap;

public class NumberOccurance {

	public static String convertWords(int n)
	{
		String word = null;
		switch(n)
		{
			case 1 : word="One";
						break;
			case 2 : word="Two";
					break;
			case 3 : word="Three";
					break;
			case 4 : word="Four";
					break;
			case 5 : word="Five";
					break;
			
		}
		return word;
	}
	
	public static void occuranceNumber(ArrayList<Integer> list)
	{
		HashMap<String, Integer> map = new HashMap<>();
		
		for(int num : list)
		{
			String nwords=convertWords(num);
			
			
		}
	}
	
	public static void main(String[] args) {
		
		ArrayList<Integer> al = new ArrayList<>();
		
		al.add(1);
		al.add(5);
		al.add(4);
		al.add(1);
		al.add(1);
		al.add(5);
		
		
	}

}
