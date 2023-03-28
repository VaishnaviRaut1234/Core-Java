package com.demo;

public class Course 
{
		private String name;
		private int id;
		private float fees;
		
		
		public Course() {
			super();
			// TODO Auto-generated constructor stub
		}
		
		
		public Course(String name, int id, float fees) {
			super();
			this.name = name;
			this.id = id;
			this.fees = fees;
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


		public float getFees() {
			return fees;
		}


		public void setFees(float fees) {
			this.fees = fees;
		}

		@Override
		public String toString() {
			return "\nCourse name = " + name + ", id = " + id + ", fees = " + fees;
		}
		
		
	}


