package com.nt.strings;

import java.util.Arrays;

public class Test {

	public static void main(String[] args) {
		String s1="Hello";
		String s2="Nikhil Thula";		//String without bean creation, this will store in string pool
		String s3=new String("Hello"); //String bean creation, this bean creation will store in heap memory
		String s4=new String("Hello");
		String s5="HeLlo";
		String s6="hello";
		String s7="HELLO";
		String s8=" Hello World ";
		String s9="Hi Nikhil Thula where are you gng?";
		String s10="178";
		
		
		
		System.out.println(s1+" "+s2);	//concatination
		System.out.println(s3);		//That's why this String is called literal after creating object when we print we are getting value but not the address.
		System.out.println(new Test()); 	//This will print address that is the difference

		System.out.println(s1==s3);	//false(address comparision)
		System.out.println(s3==s4);	//false
		System.out.println(s1==s5);	//true
		
		System.out.println(s1.equals(s3));	//Data comparision
		System.out.println(s3.equals(s4));
		System.out.println(s1.equals(s5));
		
		System.out.println(s5.contains("He"));	//true
		System.out.println(s5.contains("HE"));	//false
		
		System.out.println(s5.startsWith("HeL"));
		System.out.println(s5.endsWith("lo"));
		
		System.out.println(s5.length());	//Including spaces
		System.out.println(s8.trim());	//Removes first and last spaces
		
		System.out.println(s7.toLowerCase());
		System.out.println(s8.trim().toUpperCase());
		char[] a=s5.toCharArray();

		System.out.println(s5.indexOf("o"));	//it gives -1 if we keep invalid input ex:8
		System.out.println(s8.lastIndexOf("o"));
		System.out.println(s5.substring(2)); //after 2 starts Llo
		System.out.println(s5.substring(2,4));	//Ll
		System.out.println(Arrays.toString(s9.split(" ")));
		System.out.println(s5.charAt(4));
		System.out.println(s9.replace("where","when"));
		int i=Integer.valueOf(s10);
		System.out.println(i);
		
		String s11;
		String s12=" ";
		String s13="";
		System.out.println(s12.length());
		System.out.println(s12.isEmpty());
		System.out.println(s12.isBlank());
		
		
		
	}

}
