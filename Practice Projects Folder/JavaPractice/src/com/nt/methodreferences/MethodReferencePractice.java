package com.nt.methodreferences;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.Consumer;

public class MethodReferencePractice {

	public static void main(String[] args) {
		List<String> names=Arrays.asList("Nikhil","Akhil","Harish","Vijay");
		//names.forEach(name->greet(name));
		names.forEach(MethodReferencePractice::greet);//method reference
		MethodReferencePractice mr=new MethodReferencePractice();
		names.forEach(mr::greeting);
		Collections.sort(names,(s1,s2)->s1.compareTo(s2));
		names.forEach(System.out::println);
		String s="Nikhil";
		//names.stream().map(String::toUpperCase).forEach(System.out::println);
	}
	
	public static void greet(String name) {
		System.out.println("Hey hello my name is "+name);
	}
	
	public void greeting(String name) {
		System.out.println("Hey hello my name is "+name);
	}
}
