package com.example;

public class Ambiguity {
	
	 void mul(int a, long b) {
	        System.out.println("a * b =" + (a * b));
	    }

	    void mul(long a, int b) {
	        System.out.println("a * b =" + (a * b));
	    }
	  
	public static void main(String[] args) 
	{
		Ambiguity obj=new Ambiguity();  
		obj.mul(6, 10);
       
	}

}
