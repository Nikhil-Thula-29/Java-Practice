package com.nt.collections.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;

public class LinkedListPractice {

	public static void main(String[] args) {
		//LinkedList has implementation of Deque,Queue and List,Iterable,Collection
		//List<Integer> ll=new LinkedList<Integer>();
		//Deque<Integer> ll=new LinkedList<Integer>();
		//Queue<Integer> ll=new LinkedList<Integer>();
		//Collection<Integer> ll=new LinkedList<Integer>();
		//Iterable<Integer> ll=new LinkedList<Integer>();
		ArrayList<String> al=new ArrayList<String>();
		al.add("s1");
		al.add("s2");
		
		LinkedList<String> ll=new LinkedList<String>();
		ll.add("y1");
		ll.add("y2");
		ll.add("y3");
		ll.add(0,"yy");
		ll.addAll(1,al);
		
		//ll.remove(1);
		//ll.remove("yy");
		//ll.clear();
		//ll.removeAll(al);
		
		ll.set(2, "ss");
		System.out.println(ll);
		System.out.println(ll.get(3));
		System.out.println(ll.contains("raja"));
		Collections.synchronizedList(ll);
		for(String s:ll) {
			System.out.println(s);
		}
		
	}
}
