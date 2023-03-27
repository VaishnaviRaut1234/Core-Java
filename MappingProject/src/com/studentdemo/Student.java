package com.studentdemo;

import java.util.Objects;

public class Student 
{
	private String name;
	private int id;
	private int marks;
	private Course course;
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Student(String name, int id, int marks,Course course) {
		super();
		this.name = name;
		this.id = id;
		this.marks=marks;
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
	public int getMarks() {
		return marks;
	}
	public void setMarks(int marks) {
		this.marks = marks;
	}
	public Course getCourse() {
		return course;
	}
	public void setCourse(Course course) {
		this.course = course;
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(course, id, name);
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		return Objects.equals(course, other.course) && id == other.id && Objects.equals(name, other.name) && marks == other.marks;
	}
	@Override
	public String toString() {
		return "Student [name=" + name + ", id=" + id + ", marks=" + marks + ", course=" + course + "]";
	}

	
	
	
	
	
}
