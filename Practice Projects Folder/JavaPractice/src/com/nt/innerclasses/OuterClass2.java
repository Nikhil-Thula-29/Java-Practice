package com.nt.innerclasses;

//anonymous classes
public class OuterClass2 {

	private int id = 100; // class varibales access can be any where inside the class

	public static void main(String[] args) {
		int sal = 4544; // used in side that block of code
		Class1 c1=new Class1() {	//this is anonymous class
			public void print() {
				System.out.println("inside updated print method");
			}
		};
		c1.show();
		c1.print();

	}

	public void show() {
		System.out.println("show method");
	}

	// non static class i.e inside class
	class A {

	}
}


class Class1{
	public void show() {
		System.out.println("show method ");
	}
	
	public void print() {
		System.out.println("print method");
	}
}

class Class2 extends Class1{
	public void print() {
		System.out.println("updated print");
	}
}