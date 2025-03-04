package com.nt.interfaces;

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

		HP hp=new HP();
		hp.printing();
	}

}
