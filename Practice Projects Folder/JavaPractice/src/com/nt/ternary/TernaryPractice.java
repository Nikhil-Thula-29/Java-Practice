package com.nt.ternary;

public class TernaryPractice {

	public static void main(String[] args) {
		int i=10;
		int j=20;
		int max;
		if(i>j) {
			max=i;
		}else {
			max=j;
		}
		System.out.println(max);
		
		System.out.println((i>j)?i:j);	//ternary
		int number=20;
		System.out.println((number%2==0)?"It is a even number":"It is a odd number");
		
		//mostly use for if and else not for if elseif and else
	}
}
