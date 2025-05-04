package com.nt.functionainterface;

public class User {

	public static void main(String[] args) {
		Car c=new Car() {	//anonymous class,used only for one method
			public void drive() {
				System.out.println("BMW is called");	
			}
		};
		c.drive();
	}
}
