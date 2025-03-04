package com.nt.interfaces;

public class Dell implements Laptop{

	@Override
	public void copy() {
		System.out.println("Dell copy code");
	}

	@Override
	public void paste() {
		System.out.println("Dell paste code");
	}

	@Override
	public void cut() {
		System.out.println("Dell cut code");
	}

	@Override
	public void keyboard() {
		System.out.println("Dell keyboard code");	
	}
	
	//extra method we can keeep
	
	public void capture() {
		System.out.println("Dell camera code");
	}
	
	
	@Override
	public void security() {
		System.out.println("Dell Security");
	}

}
