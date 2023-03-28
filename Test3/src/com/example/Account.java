package com.example;


public class Account 
{
	private int id;
	private String name;
	private float bal;
	private String bname;
	private long panno;
	
	public Account(int id, String name, float bal, String bname, long panno) {
		
		this.id = id;
		this.name = name;
		this.bal = bal;
		this.bname = bname;
		this.panno = panno;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public float getBal() {
		return bal;
	}
	public void setBal(float bal) {
		this.bal = bal;
	}
	public String getBname() {
		return bname;
	}
	public void setBname(String bname) {
		this.bname = bname;
	}
	public long getPanno() {
		return panno;
	}
	public void setPanno(long panno) {
		this.panno = panno;
	}
	
	public void deposit(float amount) 
	{
		if(amount>=50000)
		{
			System.out.println("Enter a pan number");
		}
		this.bal += amount;
        System.out.format(amount +" has been deposited");
		
	}
	
	 public void withdraw(double amount) 
	 {
	       
		 if (this.bal >= 500 ) 
		 { 
	            this.bal -= amount;
	            System.out.format(amount +" has been withdrawn");
	      }
		 else { 
	            System.err.println("insufficient balance.");
	        }
	 }
	 
	 public String toString() {
			return "Student Details are id=" + id + ", name=" + name + ", Balance=" + bal + ", Bank Name=" + bname+", panno="+panno;
	 
}
	 
}
