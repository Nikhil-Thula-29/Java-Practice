package com.nt.objects;


/**
 * This documentation comment which is used to know matter about that class or variables or methods
 * we will get information about class test when you use this Test class in the right side box
 * @author Nikhil Thula
 * @param used to inform about variable by param annotation
 */
public class Test {

	
	int i;
	int j;
	
	public Test() {
		i=10;
		j=20;
	}
	
	public Test(int i,int j) {
		this.i=i;
		this.j=j;
	}
	
	public static void main(String[] args) {

		Test test=new Test();	//object
		Test test2=new Test(10,50);
		Test test3=new Test(10,80);
		
		System.out.println(test.sum());
		System.out.println(test2.sum());
		System.out.println(test3.sum());
		System.out.println(test==test2);
		System.out.println(test2==test3);
		System.out.println(test2.j);
		
	}
	
	public int sum() {
		return i+j;
	}
}
