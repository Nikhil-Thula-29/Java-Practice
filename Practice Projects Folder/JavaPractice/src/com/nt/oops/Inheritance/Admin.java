package com.nt.oops.Inheritance;

public class Admin extends Developer{

	
	public void manage() {
		super.read();
		System.out.println("Manage code");
	}
	
	
	public void read() {		//in general it call if we want parent read method use super.read()
		System.out.println("Admin read method");
	}
}
