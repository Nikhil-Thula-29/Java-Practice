package com.nt.oops.polymorphism;

public class Calculations {

	//compiletime poly
	//method overloading same method name with different parameters
	//printf and println and print are the examples of methodoverloading
	public void add(int a,int b) {
		System.out.println(a+b);
	}
	
	public void add(String a,String b) {
		System.out.println(a+b);
	}
	
	public void add(int a,String b) {
		System.out.println(a+b);
	}
	
	public void add(String a,int b) {
		System.out.println(a+b);
	}
	
	public static void main(String[] args) {
		Calculations cal=new Calculations();
		cal.add(1,2);
		cal.add("Nikhil", "Thula");
		cal.add(29, "Nikhil");
		cal.add("Thula", 30);
	}
}
