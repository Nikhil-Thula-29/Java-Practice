package com.nt.pojoandjavabeanclass;

import java.io.Serializable;


//Java Bean class
public class Student implements Serializable{

	private int id;
	private String name;
	private String school;
	
	public Student() {
		System.out.println("No args student constructor");
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

	public String getSchool() {
		return school;
	}

	public void setSchool(String school) {
		this.school = school;
	}
	
	
}
