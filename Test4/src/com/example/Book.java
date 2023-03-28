package com.example;

public class Book 
{
	private int bookId;
	private String bookName;
	private float price;
	
	
	
      public Book() {
		
	  }
	
	
	public Book(int bookId, String bookName,float price) {
		this.bookId=bookId;
		this.bookName=bookName;
		this.price=price;
	}
	
	public void setBookId(int bookId) {
		this.bookId=bookId;
	}
	public int getBookId() {
		return bookId;
	}
	
	public void setBookName(String bookName) {
		this.bookName=bookName;
	}
	 public String getBookName() {
		return bookName;
	}
	
	 public void setPrice(float price) {
		this.price=price;
	}
	 public float getPrice() {
		return price;
	}
	 
	 public String toString() {
		 
		 return ", Book Details : "+bookId +" "+bookName+" "+price;
	 }
}
