package com.nt.interfaces;

public interface Laptop {

	public void copy();
	
	public void paste();
	
	public void cut();
	
	public void keyboard();
	
	
	//implemented by default and static keyword after 8
	default void security() {
		System.out.println("Please Implement");
	}
	
	static void audio() {
		System.out.println("audio implementation");
	}
	
	private static void commonCode() {
		System.out.println("Common code");
	}
	
}
