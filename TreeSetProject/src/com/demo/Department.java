package com.demo;

import java.util.Objects;

public class Department 
{
	private int dId;
	private String dName;
	public Department(int dId, String dName) {
		super();
		this.dId = dId;
		this.dName = dName;
	}
	public Department() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getdId() {
		return dId;
	}
	public void setdId(int dId) {
		this.dId = dId;
	}
	public String getdName() {
		return dName;
	}
	public void setdName(String dName) {
		this.dName = dName;
	}
	@Override
	public int hashCode() {
		return Objects.hash(dId, dName);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Department other = (Department) obj;
		return dId == other.dId && Objects.equals(dName, other.dName);
	}
	@Override
	public String toString() {
		return "Department [dId=" + dId + ", dName=" + dName + "]";
	}
	
	
}
