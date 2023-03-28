package com.example;

public class Author 
{
	private int id;
	private String name;
	private String address;
	private Book book;
	
	
	public Author() {
		
	}
	
	public Author(int id,String name,String address,Book book) {
		this.id=id;
		this.name=name;
		this.address=address;
		this.book=book;
	} 
	
	public void setId(int id) {
		this.id=id;
	}
	
	public int getId() {
		return id;
	}
	
	public void setName(String name) {
		this.name=name;
	}
	public String getName() {
		return name;
	}
	
	public void setAddress(String address) {
		this.address=address;
	}
	public String getAddress() {
		return address;
	}
	
	public void setBook(Book book) {
		this.book=book;
	}
	public Book getBook() {
		return book;
	}
	
	public String toString() {
		
		return "Author Details : "+ id+" "+ name+" "+address+" "+book;
	}
	
	
}
