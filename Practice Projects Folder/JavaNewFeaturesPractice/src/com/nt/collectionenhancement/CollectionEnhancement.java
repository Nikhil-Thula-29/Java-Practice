package com.nt.collectionenhancement;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class CollectionEnhancement {

	public static void main(String[] args) {
		List<Integer> li=new ArrayList<Integer>();
		li.add(10);
		li.add(20);
		li.add(30);
		li.add(40);
		li.add(50);
		li.add(35);
		li.add(33);
		li.add(39);
		
		
		System.out.println("Printing data without java 8");
		for(int i=0;i<li.size();i++) {
			System.out.println(li.get(i));
		}
		
		
		System.out.println("Printing data with java 8 ");
		//forEach takes consumer as argument
		//consumer takes arg but return void
//		Consumer<Integer> c=(x)->{
//			System.out.println(x);
//		};
//		li.forEach(c);
		//or
		li.forEach((k)->System.out.println(k));
		
		
		
		List<Employee> le=new ArrayList<Employee>();
		le.add(new Employee(1,"Suresh",1000));
		le.add(new Employee(2,"Kiran",2000));
		le.add(new Employee(3,"Vamshi",3000));
		le.add(new Employee(4,"Surya",4000));
		le.add(new Employee(5,"Harshil",5000));
		
		System.out.println("By for loop");
		for(int i=0;i<le.size();i++) {
			System.out.println("Emp Id" +le.get(i).getId()+" Emp Name is: "+le.get(i).getName()+" Emp sal is: "+le.get(i).getSal());
		}
		
		
		System.out.println("By forEach");
		//le.forEach((x)->System.out.println("Employee id is: "+x.getId()+" Employee name is: "+x.getName()+" Employee sal is: "+x.getSal()));
		
//		Consumer<Employee> cn=(x)->{
//			int sala=(int) (x.getSal()*0.01);
//			System.out.println("Employee id is: "+x.getId()+" Employee name is: "+x.getName()+" Employee sal is: "+x.getSal());
//			System.out.println("Deducted sal "+sala);
//		};
//		le.forEach(cn);
		
		//or
		
		le.forEach((x)->{
			int sala=(int) (x.getSal()*0.01);
			System.out.println("Employee id is: "+x.getId()+" Employee name is: "+x.getName()+" Employee sal is: "+x.getSal());
			System.out.println("Deducted sal "+sala);
		});
		
		
		
		//remove if
		
//		li.remove(0);
//		li.remove(new Integer(20));
//		li.forEach((k)->System.out.println(k));
		
		//removeIf takes the Predicate as argument
		//predicate takes argument return true or false
		Predicate<Integer> pred=(x)->{
			return x%2==0;
		};		
		li.removeIf(pred);
		li.forEach((y)->System.out.println(y));
		
		
		le.removeIf((x)->{
			return x.getName().toLowerCase().startsWith("s");
		});
		le.forEach((k)->System.out.println(k.getName()));
	}
}
