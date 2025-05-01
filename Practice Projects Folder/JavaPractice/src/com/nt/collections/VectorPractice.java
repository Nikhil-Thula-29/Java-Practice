package com.nt.collections;

import java.util.Arrays;
import java.util.Vector;

public class VectorPractice {

	public static void main(String[] args) {
		Vector v1=new Vector();	//default capacity=10
		v1.add("Nikhil");
		v1.add("rajesh");
		v1.add("sumit");
		v1.add(0,"amit");
		v1.add("srini");
		v1.add("revanth");
		v1.add("srini");
		v1.add("revanth");	//duplicate
		
		
		System.out.println("Before adding v1" +v1);
		
		
		Vector v2=new Vector();
		v2.add("kiran");
		v2.add("raju");
		v2.add("harshil");
		v2.add("ramu");
		v2.add("laxman");
		v2.add(null);
		
		
		
//		for(int i=0;i<v2.size();i++) {
//			v1.add(v2.get(i));
//		}
		
		v1.addAll(v2);
		//v1.addAll(1,v2);
		
		
		Object[] arr=new Object[] {1,53,5,88,8,3,5};
		Vector v3=new Vector(Arrays.asList(arr));
		System.out.println(v3);
		
		System.out.println(v1.get(1));
		//v1.remove(0);
		//v1.removeAll(v2);
		//v1.clear();
		//v1.set(2,"Shreya");	//replaces
		System.out.println(v1.contains("harshil"));
		System.out.println("V2 "+v2);
		System.out.println("After adding v2 "+v1);
		System.out.println(v1.size());
		System.out.println(v1.capacity());
		
		
		Vector<Integer> v4=new Vector<Integer>();
		v4.add(25);
		v4.add(25);
		int sum=0;
		for(int i=0;i<v4.size();i++) {
			//System.out.println(v4.get(i));
			sum=sum+v4.get(i);
		}
		System.out.println(sum);

	}

}
