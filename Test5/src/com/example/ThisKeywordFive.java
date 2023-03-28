package com.example;


public class ThisKeywordFive 
{
	class B
	{  
		ThisKeywordFive obj;  
		  B(ThisKeywordFive obj)
		  {  
		    this.obj=obj;  
		  }  
		  void display()
		  {  
		    System.out.println(obj.data);  
		  }  
	}  
int data=10;  

ThisKeywordFive()
	{  
		  B b=new B(this);  
		  b.display();  
	}  
	public static void main(String args[])
	{  
		ThisKeywordFive a=new ThisKeywordFive();  
	}  
		  

}

