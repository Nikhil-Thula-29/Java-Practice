package com.nt.collections.set;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class SetPractice {

	public static void main(String[] args) {
		//HashSet internally uses hashmap->array of nodes(key,value)
		//set does not allow duplicates
		//key=given 25,24,...
		//value=new object(); common for every key
		HashSet<Integer> hs=new HashSet<Integer>();
		hs.add(25);
		hs.add(24);
		hs.add(66);
		hs.add(23);
		hs.add(0);
		hs.add(6);
		hs.add(1);
		
		//System.out.println(hs.remove(1));	//1 is data not the index
		//System.out.println(hs.contains(66));
		for(Integer element:hs) {
			System.out.println(element);
		}
		System.out.println(hs);
		
		
		//LinkedHashSet->LinkedHashMap ->link of nodes(key,value);
		//stores in given order
		LinkedHashSet<Integer> lhs=new LinkedHashSet<Integer>();
		lhs.add(25);
		lhs.add(24);
		lhs.add(66);
		lhs.add(23);
		lhs.add(0);
		lhs.add(6);
		lhs.add(1);
		
		//lhs.clear();
		//lhs.isEmpty();
		//lhs.size();
		//System.out.println(hs.remove(1));	//1 is data not the index
		//System.out.println(hs.contains(66));
		for(Integer element:lhs) {
			System.out.println(element);
		}
		System.out.println(lhs);
		
		
		
		
		// TreeSet->binary tree ->link of nodes(key,value);
		// stores in storted order
		//no duplicates in set
		TreeSet<Integer> ts = new TreeSet<Integer>();
		ts.add(25);
		ts.add(24);
		ts.add(66);
		ts.add(23);
		ts.add(0);
		ts.add(6);
		ts.add(1);

		// lhs.clear();
		// lhs.isEmpty();
		// lhs.size();
		// System.out.println(hs.remove(1)); //1 is data not the index
		// System.out.println(hs.contains(66));
		for (Integer element : ts) {
			System.out.println(element);
		}
		System.out.println(ts);
		System.out.println(ts.first());
		System.out.println(ts.last());
		System.out.println(ts.pollFirst());
		System.out.println(ts.pollLast());
		System.out.println(ts);
		System.out.println(ts.descendingSet());
		System.out.println(ts.subSet(5, 24));	//range
	}

}
