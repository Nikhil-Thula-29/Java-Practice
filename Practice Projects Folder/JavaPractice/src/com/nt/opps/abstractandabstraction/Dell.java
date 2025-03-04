package com.nt.opps.abstractandabstraction;

public class Dell extends SampleAC{

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
