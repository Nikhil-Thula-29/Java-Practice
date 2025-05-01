package com.nt.collections;

import java.util.Stack;

public class StackPractice {

	public static void main(String[] args) {
		//LIFO-last in first out-->Stack
		//FIFO-first in first out-->Queue
		//stack is class which implements list interface and also 		extends vector and represents LIFO priniciple.
		//rotate vector(horizontal) to anticlock to get stack(vertical)
		
		
		Stack<String> books=new Stack<String>();
		books.push("red");
		books.push("black");
		books.push("white");
		
//		books.add("red");
//		books.add("black");
//		books.add("white");
		//books.add(0, "white");
		//books.remove(0);
		//books.set(0, "yellow");	//replaces white
		//books.clear();
		
		
//		System.out.println(books.get(2));
//		System.out.println(books);
//		System.out.println(books.contains("white"));
		
		System.out.println(books.peek());
		System.out.println(books);
//		System.out.println(books.pop());
//		System.out.println(books);
		System.out.println(books.search("white"));	//1
		System.out.println(books.search("red"));	//3
		System.out.println("===");
		System.out.println(books.indexOf("white"));//2
		System.out.println(books.empty());
		
	}
}
