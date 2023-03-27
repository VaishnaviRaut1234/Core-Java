package com.multilevel;

class Shape 
{
	private String name;
	private String Type;
	public Shape() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Shape(String name, String type) {
		super();
		this.name = name;
		Type = type;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getType() {
		return Type;
	}
	public void setType(String type) {
		Type = type;
	}
	
	public String toString() {
		return "Shape [name=" + name + ", Type=" + Type + "]";
	}
	
	class Rectangle extends Shape
	{
		private int length;
		private int breadth;
		public Rectangle(int length, int breadth) {
			super();
			this.length = length;
			this.breadth = breadth;
		}
		public Rectangle() {
			super();
			// TODO Auto-generated constructor stub
		}
		public Rectangle(String name, String type) {
			super(name, type);
			// TODO Auto-generated constructor stub
		}
		public int getLength() {
			return length;
		}
		public void setLength(int length) {
			this.length = length;
		}
		public int getBreadth() {
			return breadth;
		}
		public void setBreadth(int breadth) {
			this.breadth = breadth;
		}
		
		public String toString() {
			return "Rectangle [length=" + length + ", breadth=" + breadth + "]";
		}
		
class cube extends Shape
{
	int height;
	
}
		public class ShapeTest
		{
			public static void main(String args[])
			{
				
			}
		}
	}
}
