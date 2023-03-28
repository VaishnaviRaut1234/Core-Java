package com.example;

public class Account 
{
	private int id;
	private long accno;
	private String name;
	private int pancard;
	private int debitcard;
	private long balance;
	
	public Account(int id,long accno,String name,long balance)
	{
		this.id=id;
		this.accno=accno;
		this.name=name;
		this.pancard=pancard;
		this.debitcard=debitcard;
		this.balance=balance;
	}
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public long getAccno() {
		return accno;
	}

	public void setAccno(long accno) {
		this.accno = accno;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPancard() {
		return pancard;
	}

	public void setPancard(int pancard) {
		this.pancard = pancard;
	}

	public int getDebitcard() {
		return debitcard;
	}

	public void setDebitcard(int debitcard) {
		this.debitcard = debitcard;
	}

	public long getBalance() {
		return balance;
	}

	public void setBalance(long balance) {
		this.balance = balance;
	}

	public String toString()
	{
		return "Account details : "+id+" "+accno+" "+name+" "+balance;
	}
	
	
}
