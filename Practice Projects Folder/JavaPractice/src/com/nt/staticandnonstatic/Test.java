package com.nt.staticandnonstatic;

import java.util.Random;


//Check Notes
public class Test {

	static int number;		//with static and without static without static it print diff values
							//but whereas with static it prints same values because it stores in method area so only ones it will genereate
							//but whereas object created that is nonstatic it will store in heap memory every time it creates new memory for obj so not same..
	
	
	
	static {	//first execution part that is static block in class
		
	}
	{	//non static block
		
	}
	
	
	
	public static void main(String[] args) {
//		Test t1=new Test();		//no need of creating of obj if we use static keyword 
//		t1.number=new Random().nextInt();
//		
//		Test t2=new Test();
//		t2.number=new Random().nextInt();
//		
//		Test t3=new Test();
//		t3.number=new Random().nextInt();
//		
//		System.out.println(t1.number);
//		System.out.println(t2.number);
//		System.out.println(t3.number);
		
		
		System.out.println(number=new Random().nextInt());	//No need of object
		
		
	}
}
