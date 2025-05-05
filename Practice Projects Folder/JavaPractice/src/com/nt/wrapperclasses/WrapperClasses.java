package com.nt.wrapperclasses;

import java.util.ArrayList;

public class WrapperClasses {

	public static void main(String[] args) {
		int i=20;
		
		/*
		 * byte ->Byte
		 * short ->Short
		 * int ->Integer
		 * double ->Double
		 * float ->Float
		 * long ->Long
		 * char->Character
		 * boolean->Boolean
		 */
		WrapperClasses wc=new WrapperClasses();
		Integer i2=Integer.valueOf(i);	//boxing
		Integer i3=i; //autoboxing //with out constructor
		Integer i4=Integer.valueOf(55);
		int ii=i4.intValue();	//unboxing
		int ii2=i4; //Auto-unboxing
		System.out.println(i2);
		
		ArrayList<Integer> al=new ArrayList<>();
		al.add(Integer.valueOf(253));
		al.add(365);	//Auto boxing
		int age=al.get(0);	//auto unboxing
		
		byte b=55;
		double d=10.2;
		short s=(short)d;
		String w="25";
		int aging=Integer.valueOf(w);
		int ages=Integer.parseInt(w); 
		Long val=Long.parseLong(w);
		System.out.println(aging);
		System.out.println(val);
	}
}
