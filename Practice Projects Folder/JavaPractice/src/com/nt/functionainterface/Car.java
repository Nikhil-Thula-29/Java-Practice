package com.nt.functionainterface;

//only one abstract class i.e unimplemented class

@FunctionalInterface
public interface Car {
	void drive();	//abstract interface 
	
	default void light() {
		
	}
	private void honk() {
		
	}
	static void gear() {
		
	}
}

//java.util.function 
