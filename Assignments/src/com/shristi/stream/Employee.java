package com.shristi.stream;

public class Employee {
	String name, city,empId;

	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}



	public Employee(String name, String city, String empId) {
		super();
		this.name = name;
		this.city = city;
		this.empId = empId;
	}

	
	@Override
	public String toString() {
		return "[name=" + name + ", city=" + city + ", empId=" + empId + "]";
	}
	
}
