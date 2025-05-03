package com.nt.innerclasses;

//local classes
public class OuterClass {

	private int id = 100; // class varibales access can be any where inside the class

	public static void main(String[] args) {
		int sal = 4544; // used in side that block of code
		// this is called local class
		//abstract and only final are allowed
		class A{
			public void print() {
				System.out.println("sal "+sal);
			}
		}
		A a=new A();
		a.print();
		abstract class C{

		}

		final class B {

		}

	}

	public void show() {
		System.out.println("show method");
	}

	// non static class i.e inside class
	class A {

	}
}

