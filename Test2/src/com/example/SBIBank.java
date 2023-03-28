package com.example;

import java.util.Scanner;

public class SBIBank 
{
			public static void main(String[] args) 
			{
				Scanner sc = new Scanner(System.in);
				System.out.println("Enter your id");
				int id = sc.nextInt();
				
				System.out.println("Enter your AccountNumber");
				long accno = sc.nextLong();
				
				System.out.println("Enter your Name");
				String name = sc.next();
				
				System.out.println("Enter your Balance");
				long balance = sc.nextLong();
				
				if(balance>=50000)
				{
					System.out.println("Pancard is added");
					System.out.println("Debit card is added");
				}
				else if(balance>=25000)
				{
					System.out.println("Debit card is added");
				}
				else
				{
					System.out.println("You are not eligible for pancard and debit card");
				}
				
				
				Account a1 = new Account(id,accno,name,balance);
				System.out.println(a1);
				
				
			}


}
