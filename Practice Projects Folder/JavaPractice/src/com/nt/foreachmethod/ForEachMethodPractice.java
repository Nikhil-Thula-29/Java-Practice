package com.nt.foreachmethod;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.BiConsumer;
import java.util.function.Consumer;

public class ForEachMethodPractice {

	public static void main(String[] args) {
		List<Integer> list=Arrays.asList(1,5,656,523,685);
		
		//for loop
		for(int i=0;i<list.size();i++) {
			System.out.println(list.get(i));
		}
		
		//for each loop
		for (Integer inte : list) {
			 System.out.println(inte);
		}
		
		//for each method
		//anonymous method
		Consumer<Integer> con=new Consumer<Integer>() {
			
			@Override
			public void accept(Integer i) {
				System.out.println(i);
			}
		};
		
		//or
		//lambda method
		//Consumer<Integer> con=i->System.out.println(i);
		list.forEach(con);
		
		Map<Integer,String> stud=new HashMap<>();
		stud.put(101, "Nikhil");
		stud.put(102, "Ajay");
		stud.put(103, "Kiran");
		BiConsumer<Integer, String> bicon=new BiConsumer<Integer, String>() {
			
			@Override
			public void accept(Integer id, String name) {
				System.out.println(id+">>>>"+name);
				
			}
		};
		
		stud.forEach(bicon);
	}
}
