package com.nt.opps.abstractandabstraction;

public class User {

	public static void main(String[] args) {
		Dell dell=new Dell();
		dell.copy();
		dell.cut();
		dell.paste();
		dell.keyboard();
		dell.capture();
		dell.security();
		Laptop.audio();		//Here no need to create obj for audio because is of static but default we need to implement it class and from there only we need to use it.

		//Here we can use Laptop type for hp object creation so that we can get abstraction of copy check ctrl+copy and paste takes to unimplemented method
		//but if we implementation then abstraction will decrease more interfaces more abstraction
		Laptop hp=new HP();
		hp.copy();
		hp.paste();
		//hp.printing();
	}

}
