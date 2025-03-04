package com.nt.test;

public class Dog {

	String breed="German Shepard";
	int height=30;
	int weight=35;
	long l=9876543220L; 	//Keep l for long f for float
	
	
	
	public static void main(String[] args) {
		System.out.println("Test");
		Dog dog=new Dog();
		System.out.println(dog.breed);
		System.out.println(dog.height);
		System.out.println(dog.weight);
		
		//Size
		System.out.println("Integer Size:: "+Integer.SIZE/8);
		System.out.println("Integer Size:: "+Long.SIZE/8);
		
		//Minimum and Maximum Values
		System.out.println(Integer.MAX_VALUE);
		System.out.println(Integer.MIN_VALUE);
	
	}

}
