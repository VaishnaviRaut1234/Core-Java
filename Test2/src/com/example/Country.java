package com.example;

import java.util.Scanner;

public class Country 
{

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
        System.out.println("1.India");
		System.out.println("2.Denmark");
		System.out.println("3.Japan");
		System.out.println("4.Pakistan");
		System.out.println("5.Germany");
		System.out.println("6.Australia");
		System.out.println("7.Sweden");
		System.out.println("8.Switzerland");
		System.out.println("9.Canada");
		System.out.println("10.France");
		
		System.out.println("Enter your country ");
		int c = sc.nextInt();
		
		
		switch(c)
		{
		case 1 : 
				System.out.println("countrycode: 91 , Capital : New Delhi,Area : 3.287 million km²");
				break;
			
		case 2 : 
				System.out.println("countrycode : 45 , Capital : Copenhagen ,Area : 42,951 km²");
				break;
			
		case 3 : 
				System.out.println("countrycode : 81 ,Capital : Tokyo ,Area : 377,973 km²");
				break;
				
		case 4 : 
			System.out.println("countrycode : 92 ,Capital : Islamabad ,Area : 796,095 km²");
			break;
			
		case 5 : 
			System.out.println("countrycode : 49 ,Capital : Berlin ,Area : 357,588 km²");
			break;
			
		case 6 : 
			System.out.println("countrycode : 61 ,Capital : Canberra ,Area : 7,692,024 km²");
			break;
			
		case 7 : 
			System.out.println("countrycode : 46 ,Capital : Stockholm ,Area : 528,447 km²");
			break;
			
		case 8 : 
			System.out.println("Pincode : 41 ,Capital : Bern ,Area : 41,285 km²");
			break;
			
		case 9 : 
			System.out.println("Pincode : 1 ,Capital : Ottawa ,Area : 9.985 million km²");
			break;
			
		case 10 : 
			System.out.println("Pincode : 33 ,Capital : Paris ,Area : 551,695 km²");
			break;
			
		default :
			System.out.println("Error");
				
		}
		
	}

}
