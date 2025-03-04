package com.nt.oops.polymorphism;

public interface Animal {

	public void sleep();
	
	default void eat() {
		System.out.println("Animal Eating");
	}
	
}
