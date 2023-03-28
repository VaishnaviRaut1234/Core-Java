package com.example;

public class StringIntern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 = new String("Java");
		String s2 = s1.intern();
		
		System.out.println(s1==s2);
		
		String s3 = "Java";
		String s4 = new String("Java");
		
		System.out.println(s3==s4);
		s3=s3.intern();
		System.out.println(s3==s4);
	}
	

}
