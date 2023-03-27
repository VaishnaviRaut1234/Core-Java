package com.custommap;

import java.util.Objects;

public class Author 
{
	private String aname;
	private int id;
	public Author() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Author(String aname, int id) {
		super();
		this.aname = aname;
		this.id = id;
	}
	public String getAname() {
		return aname;
	}
	public void setAname(String aname) {
		this.aname = aname;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	@Override
	public int hashCode()
	{
		return Objects.hash(aname, id);
	}
	@Override
	public boolean equals(Object obj)
	{
		if(this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Author other = (Author) obj;
		return Objects.equals(aname, other.aname) && id == other.id;
	}
	@Override
	public String toString() {
		return "Author [name=" + aname + ", id=" + id + "]";
	}
	
	
}
