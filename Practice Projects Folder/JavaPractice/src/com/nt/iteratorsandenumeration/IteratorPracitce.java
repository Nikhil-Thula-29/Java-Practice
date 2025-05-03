package com.nt.iteratorsandenumeration;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Vector;

public class IteratorPracitce {

	public static void main(String[] args) {
		// Iterator-Interface
		// Introduced for all collection objects
		// legacy classes- v1+v1.2
		ArrayList<Integer> al=new ArrayList<>();
		al.add(5);
		al.add(26);
		al.add(36);
		Iterator<Integer> i=al.iterator();
		//i.hasNext();
		//i.next();
		while(i.hasNext()) {
			System.out.println(i.next());
		}
		
		
		Vector<Integer> v=new Vector<>();
		al.add(5);
		al.add(26);
		al.add(36);
		Iterator<Integer> is=al.iterator();
		//i.hasNext();
		//i.next();
		while(is.hasNext()) {
			System.out.println(is.next());
		}
		
		
		HashMap<String,Integer> ages=new HashMap<>();
		ages.put("India", 500);
		ages.put("srilanka", 600);
		ages.put("london", 50632);
		ages.keySet().iterator();
		ages.values().iterator();
	}
}
