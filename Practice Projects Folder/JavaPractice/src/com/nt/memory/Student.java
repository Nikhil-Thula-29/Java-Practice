package com.nt.memory;

public class Student {
	String name="Nikhil Thula";
	
	public void greet() {
		System.out.println("Hi "+name);
	}
	
	public static void main(String[] args) {
		//here s1 is reference variable
		//new Student(); it is called object
		//new Student this is called anonymous object bcz it is not pointing to any reference variable
		//no need to create reference object for single use
		//Student s1=new Student();	//It is called referenced object
		//new Student() it is called anonymous object  use only if one method is called
		new Student().greet();	//memory save
	}

}
