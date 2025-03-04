package com.nt.opps.abstractandabstraction;


//abstract is not the 100% implemented interface 
public abstract class SampleAC implements Laptop{

	@Override
	public void copy() {
		System.out.println("General copy code");
	}

	@Override
	public void paste() {
		System.out.println("General paste code");
	}
	
	
	//no need to keep this 
	public abstract void cut();	//need to give abstract key word for unimplemented methods in abstract key word
	
	public abstract void keyboard();
	
}
