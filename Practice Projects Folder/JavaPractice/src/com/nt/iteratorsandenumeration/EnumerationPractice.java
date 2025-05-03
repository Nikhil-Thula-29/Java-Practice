package com.nt.iteratorsandenumeration;

import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Stack;
import java.util.Vector;

public class EnumerationPractice {

	public static void main(String[] args) {
		//Enumeration-Interface
		//Introduced for iteration the legacy collection objects
		//legacy classes- before version 1.0 
		//hashtable,stack,vector,dictonary,properties
		//new classes= after version 1.2
		Vector<String> v=new Vector<>();
		v.add("banana");
		v.add("cherry");
		v.add("apple");
		Enumeration<String> e=v.elements();
		//e.hasMoreElements();
		//e.nextElement();
		while(e.hasMoreElements()) {
			System.out.println(e.nextElement());
		}
		
		
		
		
		
		
		
		Stack<String> s=new Stack<>();
		s.add("banana");
		s.add("cherry");
		s.add("apple");
		Enumeration<String> se=v.elements();
		//e.hasMoreElements();
		//e.nextElement();
		while(se.hasMoreElements()) {
			System.out.println(se.nextElement());
		}
		
		

		Hashtable<String,Integer> ages=new Hashtable<>();
		ages.put("India", 500);
		ages.put("srilanka", 600);
		ages.put("london", 50632);
		Enumeration<Integer> enu=ages.elements();
		//e.hasMoreElements();
		//e.nextElement();
		while(enu.hasMoreElements()) {
			System.out.println(enu.nextElement());
		}
	}
}
