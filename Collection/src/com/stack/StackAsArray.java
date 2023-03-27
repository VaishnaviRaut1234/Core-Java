package com.stack;

class StackOne {

	 int top;
	  int size;
	  int []stk;

	public StackOne()
	{
			super();
			// TODO Auto-generated constructor stub
		}
	  
	  public StackOne(int size)
	  {
		  top=-1;
		  this.size=size;
		  stk= new int[size];
	  }
	  
	  public void push(int data)
	  {
		  if(top<size-1)
		  {
			  top++;
			  stk[top]=data;
			  System.out.println("Element inserted");
		  }
		  
		  else
		  {
			  System.out.println("Stack is full");
		  }
		  
	  }
	  
	  public void pop()
	  {
		  int tmp;
		  if(top!=-1)
		  {
			  System.out.println("Element deleted:"+stk[top]);
			  top--;
		  }
		  else
			  System.out.println("Stack is empty");
			  
		  }
		  
	  public void show()
	  {
		  if(top!=-1)
		  {
			  for(int i=top;i<top;i++)
			  {
				  System.out.println(stk[i]);
			  }
		  }
		  else
		  {
			  System.out.println("Stack is empty");
		  }
	  }


	}

	public class StackAsArray {

		public static void main(String[] args) {

			StackOne q1= new StackOne(5);
	     q1.pop();
	     q1.push(45);
	     q1.push(67);
	     q1.push(78);
	     
	     q1.show();
	     q1.pop();
	     
	     q1.show();
	     

		}
}
