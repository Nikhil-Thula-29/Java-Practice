package com.nt.stringbuilderandbuffer;

public class Test {

	public static void main(String[] args) {
		//strings are immutable
		//StringBuffer and StringBuilder are mutable
//		String s1="Arjun";
//		String s2="Arjun";
//		System.out.println(s1==s2);	//address comparision
//		s1=s1+"Reddy";
//		System.out.println(s1==s2);	//address changes so immutable
//		String s3="ArjunReddy";
//		System.out.println(s1==s3);	//address changes so immutable
		
		
		//for multithreading check inside having synchronized in stringbuffer
//		StringBuffer sb1=new StringBuffer("Nikhil"); //creates new obj
//		StringBuffer sb2=new StringBuffer("Nikhil"); //creates new obj so false
//		System.out.println(sb1==sb2);	//but after changing also it is storing in same address 
//		sb1=sb1.append("kumar");
//		System.out.println(sb1==sb2); //address is constant storing in same addresss
//		StringBuffer sb3=new StringBuffer("Nikhilkumar");
//		System.out.println(sb1==sb3);
		
		
		//for singlethreading no synchronized so fast
		StringBuilder sb1=new StringBuilder("Ajay");
		StringBuilder sb2=new StringBuilder("Ajay");
		//sb.insert(0, "kumar");
		//sb.deleteCharAt(0);
		//sb.delete(0, 3);
		//sb.reverse();
		//System.out.println(sb.capacity());	//16 by default
		System.out.println(sb1);
		System.out.println(sb1.compareTo(sb2));	//here compareTo is used for comparing content in string
		System.out.println(sb1.equals(sb2));	//here equals used for comparing address but in string content
		
	}
}
