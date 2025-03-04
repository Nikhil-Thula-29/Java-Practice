package com.nt.oops.encapsulation;


//nothing but getters and setters, access modifiers 
//data hiding 
//wrapping it in single unit i.e is class
public class Student {
	
	private int rollno;
	private String name;
	private boolean isattended;
	
	
	public Student() {
		
	}


	public int getRollno() {
		return rollno;
	}


	public void setRollno(int rollno) {
		this.rollno = rollno;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public boolean isIsattended() {
		return isattended;
	}


	public void setIsattended(boolean isattended) {
		this.isattended = isattended;
	}
	
	

}
