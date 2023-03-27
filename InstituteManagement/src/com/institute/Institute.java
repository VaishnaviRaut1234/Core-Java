package com.institute;

import java.util.Arrays;

public class Institute 
{
	private int regId;
	private String name;
	private Student std[];
	private int noOfCourse;
	public String course[];
	
	Institute()
	{
		course = new String[3];
	}

	public Institute(int regId, String name, Student[] std, int noOfCourse, String[] course) {
		super();
		this.regId = regId;
		this.name = name;
		this.std = std;
		this.noOfCourse = noOfCourse;
		course = new String[noOfCourse];
	}

	public int getRegId() {
		return regId;
	}

	public void setRegId(int regId) {
		this.regId = regId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Student[] getStd() {
		return std;
	}

	public void setStd(Student[] std) {
		this.std = std;
	}

	public int getNoOfCourse() {
		return noOfCourse;
	}

	public void setNoOfCourse(int noOfCourse) {
		this.noOfCourse = noOfCourse;
		course = new String[noOfCourse];
	}

	public String[] getCourse() {
		return course;
	}

	public void setCourse(String[] course) {
		this.course = course;
	}

	@Override
	public String toString() {
		return "Institute [regId=" + regId + ", name=" + name + ", noOfCourse="
				+ noOfCourse + ", course=" + Arrays.toString(course) + "]";
	}
	
	
}
