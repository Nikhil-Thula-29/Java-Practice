package com.nt.variables;



public class Student {
	
	int height=100; 	//Instance Variable
	static String name="Nikhil Thula";
	
	public static void main(String[] args) {	//we cant write non static methods in static field.
	     System.out.println(sum(30));
	     name();
	}
	
	public static void name() {
		Student stud=new Student();
		System.out.println(name);	//For static no obj needed
		System.out.println(stud.height);	//For Non-Static obj is needed.
	}
	
	public static int sum(int b) {
		int a=20;	//local variable inside method
		return a+b;
	}
}
