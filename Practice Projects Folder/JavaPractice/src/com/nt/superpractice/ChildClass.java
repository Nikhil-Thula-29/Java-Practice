package com.nt.superpractice;

interface ParentInterface{
	String name="kiran";
}


class GrandParentClass{
	String name="harish";
}


class ParentClass extends GrandParentClass{
	//It will take name from GrandParentClass when name is not available in ParentClass.
	String name="Nikhil Thula";
	int age=50;
	
	public void printDetails() { 
		System.out.println("Printing from parent class");
		System.out.println(name+">>>>"+age);
	}

	public ParentClass() {
		System.out.println("default constructor from parent class");
	}
	
}

public class ChildClass extends ParentClass implements ParentInterface{
 
	String name="Raj kumar";
	public static void main(String[] args) {
		ChildClass cc=new ChildClass();
		cc.dummy();
	}
	
	//we can not use super keyword in static methods
	public void dummy() {
		System.out.println(super.name);
		super.printDetails();
		System.out.println(ParentInterface.name);	//interface
	}
	
	public ChildClass() {
		//super();	//no need internally calls
		System.out.println("from child cons");
	}
	
	@Override
	public void printDetails() {
//		System.out.println("Printing from child class");
//		System.out.println(name+">>>>"+age);
		super.printDetails();
		System.out.println("Hard working");
	}
}
