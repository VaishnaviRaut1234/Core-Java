package com.studentdemo;

import java.util.Objects;

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
		public int hashCode()
		{
			return Objects.hash(name, id,fees);
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
			Course other = (Course) obj;
			return Objects.equals(name, other.name) && id == other.id;
		}
		@Override
		public String toString() {
			return "Course [name=" + name + ", id=" + id + ", fees=" + fees + "]";
		}
		
		
	}


