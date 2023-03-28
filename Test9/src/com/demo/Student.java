package com.demo;

public class Student 
{
	private String name;
	private int id;
	private float marks;
	private Course course;
	
	public Student() 
	{
		super();
	}

	public Student(String name, int id, float marks, Course course) {
		super();
		this.name = name;
		this.id = id;
		this.marks = marks;
		this.course = course;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public float getMarks() {
		return marks;
	}

	public void setMarks(float marks) {
		this.marks = marks;
	}

	public Course getCourse() {
		return course;
	}

	public void setCourse(Course course) {
		this.course = course;
	}

	@Override
	public String toString() {
		return "\nStudent name = " + name + ", id = " + id + ", marks = " + marks + course;
	}
	
	
}
