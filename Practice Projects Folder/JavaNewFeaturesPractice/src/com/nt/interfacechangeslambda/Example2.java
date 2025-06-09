package com.nt.interfacechangeslambda;

public class Example2 {

	public static void main(String[] args) {
		Thread t=new Thread(()->System.out.println("Calling run method"));
		
	}
}
