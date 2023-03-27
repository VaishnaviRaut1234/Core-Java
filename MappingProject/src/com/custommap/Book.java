package com.custommap;

import java.util.Objects;

public class Book {
	private String name;
	private int bid;
	private float price;
	private Author author;
	
	public Book() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Book(String name, int bid, float price, Author author) {
		super();
		this.name = name;
		this.bid = bid;
		this.price = price;
		this.author = author;
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getBid() {
		return bid;
	}

	public void setBid(int bid) {
		this.bid = bid;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	public Author getAuthor() {
		return author;
	}
	public void setAuthor(Author author) {
		this.author = author;
	}
	@Override
	public int hashCode() {
		return Objects.hash(author, bid, name, price);
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Book other = (Book) obj;
		return Objects.equals(author, other.author) && bid == other.bid && Objects.equals(name, other.name)
				&& Float.floatToIntBits(price) == Float.floatToIntBits(other.price);
	}

	@Override
	public String toString() {
		return "Book [name=" + name + ", bid=" + bid + ", price=" + price + ", author=" + author + "]";
	}

}
