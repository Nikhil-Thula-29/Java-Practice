package com.nt.oops.polymorphism;

public class Horse implements Animal{

	public static void main(String[] args) {
		Horse hor=new Horse();
		hor.eat();
		hor.sleep();

	}

	@Override
	public void sleep() {
		System.out.println("Horse Sleeping");	
	}
	
	//runtime poly
	//This method is overrided from the parent interface this is called overriding and @override annotation helps in finds para or any.
	@Override
	public void eat() {
		System.out.println("Horse Eating");
	}


}
