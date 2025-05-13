package com.nt.comparableandcomparator;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class ComparablePractice {
	//same sorting parameter like int use comparable
	//if we want to compare with diff para use comparator like height marks etc

	public static void main(String[] args) {
		
		Comparator<Integer> comp=(Integer x, Integer y)->{
				//return ((x<y)?1:(x==y)?0:-1);
				return Integer.compare(y, x);
		};
		
		Comparator<Integer> compp=Comparator.comparing((Integer i)->i).reversed();
	
		
		Integer[] arr= {2,3,5,8,6,9,1,3};
		//Arrays.sort(arr);//Ascending order
		Arrays.sort(arr, comp);	//descending order
		System.out.println(Arrays.toString(arr));
		Arrays.sort(arr, compp);
		System.out.println(Arrays.toString(arr));
		
		//collections
		ArrayList<Integer> list=new ArrayList<Integer>(Arrays.asList(arr));
		Collections.sort(list);
		System.out.println(list);
		
		Comparator<Student> namecomp=new Comparator<Student>() {
			
			@Override
			public int compare(Student s1, Student s2) {
				return s1.name.compareTo(s2.name);
			}
		};
		
		//Comparator<Student> ncomp=Comparator.comparing(s->s.name,Comparator.nullsFirst(Comparator.naturalOrder()));
		
		Student[] st= {
				new Student(101,"Nikhil",300),
				new Student(105,"Janu",500),
				new Student(103,"Renu",400),
				new Student(102,"soni",200)
		};
		Arrays.sort(st);
		System.out.println(Arrays.toString(st));
		
//		Arrays.sort(st,ncomp);
//		System.out.println(Arrays.toString(st));
		
		Arrays.sort(st, namecomp.reversed());	//descending with comparator
		System.out.println("name comp"+Arrays.toString(st));
		
		
		
		ArrayList<Student> stli=new ArrayList<Student>(Arrays.asList(st));
		Collections.sort(stli);
		//System.out.println(stli);
		
		//we have Arrays.sort(st,ncomp.thenComparing(mathscomp).thenComparing(physicscomp)); for chain comparision in comparator.
	}
}
