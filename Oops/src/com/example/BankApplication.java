package com.example;

public class BankApplication {

	public static void main(String[] args) {
		BankAccount a1 = new BankAccount(1234, "Vaishu", 80000f);
		BankAccount a2 = new BankAccount(4567, "Rahul", 100000f);
		
		a1.showDetails();
		a2.showDetails();
	}

}
