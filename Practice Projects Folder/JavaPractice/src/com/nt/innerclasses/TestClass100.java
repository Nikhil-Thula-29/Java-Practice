package com.nt.innerclasses;

import com.nt.innerclasses.TestClass1.Test4;

public class TestClass100 {

	public static void main(String[] args) {
		
	}
	
	public class Tests {
		TestClass1 tc1=new TestClass1();
		Test4 t4=tc1.new Test4();
	}
}
