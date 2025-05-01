package com.nt.collections;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListPractice {

	public static void main(String[] args) {
		//same as vector methods
		
		Integer[] arr=new Integer[] {1,5,35,9,9,92};
		ArrayList<Integer> al1=new ArrayList<Integer>(Arrays.asList(arr));
		al1.add(5);
		al1.add(0,8);
		al1.add(null);
		System.out.println(al1);
		System.out.println(al1.get(2));
		System.out.println(al1.size());
		
		al1.remove(4);
		al1.set(0,24);
		System.out.println(al1);
		for(Integer inte:al1) {
			System.out.println(inte);
		}
	}

}
