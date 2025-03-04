package com.nt.input;

import java.util.Scanner;

public class Input {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("What is you name");
		String name=sc.nextLine();
		System.out.println("Hey hi! "+name);
		System.out.println("What is your age");
		int age=sc.nextInt();
		System.out.println("Thanks for participation");
	}
}
