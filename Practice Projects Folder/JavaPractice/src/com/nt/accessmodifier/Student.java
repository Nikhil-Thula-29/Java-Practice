package com.nt.accessmodifier;


public class Student {
//	public related code
//	public can be accessed from any where outside the class same class same package other packages from any where	

	
//	public int rollno=125;
//	
//	public Student() {
//		rollno=102;
//	}
//	
//	public void printRollNumber() {
//		System.out.println(rollno);
//	}
	
	
	//private
	//private is only for with in the same class not at any where
	
//	private int rollno=355;
//	
//	private Student() {
//		rollno=65;
//	}
//	
//	private void printRollNumber() {
//		System.out.println(rollno);
//	}
//	
//	public static void main(String[] args) {
//		Student stud=new Student();
//		System.out.println(stud.rollno);
//	}
	
	
	//default
	//Can be accessed in same class and with in same package at different class also can accessed
	//can be accessed in sub class if it is in same package if it is in diff package then throws error
	
	
//	int rollno=355;	
//	
//	Student() {
//		rollno=65;
//	}
//	
//	 void printRollNumber() {
//		System.out.println(rollno);
//	}
//	
//	public static void main(String[] args) {
//		Student stud=new Student();
//		System.out.println(stud.rollno);
//	}
//	
//	public void abc() {
//		printRollNumber();
//	}
	
	
	//protected
	//protected is also same as default but in protected we can access it in all sub classes even they are in different packages 
	
	
	protected int rollno=355;	
	
	protected Student() {
		rollno=65;
	}
	
	 protected void printRollNumber() {
		System.out.println(rollno);
	}
	
	public static void main(String[] args) {
		Student stud=new Student();
		System.out.println(stud.rollno);
	}
	
	public void abc() {
		printRollNumber();
	}
}
