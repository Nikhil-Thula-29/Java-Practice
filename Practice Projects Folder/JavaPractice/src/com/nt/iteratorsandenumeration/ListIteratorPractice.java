package com.nt.iteratorsandenumeration;

import java.util.ArrayList;
import java.util.ListIterator;
import java.util.Vector;

public class ListIteratorPractice {

	public static void main(String[] args) {
		// Iterator-Interface
		// Introduced for iterating only list type of collections
		// legacy classes- v1+v1.2
		ArrayList<Integer> al=new ArrayList<>();
		al.add(5);
		al.add(26);
		al.add(36);
		ListIterator<Integer> li=al.listIterator();
		while(li.hasNext()) {
			System.out.println(li.next());
		}while(li.hasPrevious()) {
			System.out.println(li.previous());
		}
		
		Vector<Integer> v=new Vector<>();
		v.add(5);
		v.add(26);
		v.add(36);
		ListIterator<Integer> vv=v.listIterator();
		while(vv.hasNext()) {
			System.out.println(vv.next());
		}while(vv.hasPrevious()) {
			System.out.println(vv.previous());
		}
		
		//used only for list interface implementation
		
	}
}
