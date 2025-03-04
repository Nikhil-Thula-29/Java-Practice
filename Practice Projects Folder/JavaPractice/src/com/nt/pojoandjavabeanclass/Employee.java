package com.nt.pojoandjavabeanclass;


//This is same as Java Bean class but the difference is that implements serilaziable to travel through network
//POJO CLASS
public class Employee {

	private int id;
	private String name;
	private double salary;
	
	public Employee() {
		System.out.println("No args Employee constructor");
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}
	
	
}
