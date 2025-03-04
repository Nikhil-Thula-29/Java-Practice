package com.nt.decisionmaking;

public class ConditionalStatements {
	
	public static void main(String[] args) {
		int i=-10;
		
		String examstatus="Pass";
		
		//if else 
		if(i<0) {
			System.out.println("The given number is negative");
		}else {
			System.out.println("The given number is positive");
		}
		
		if(examstatus=="Pass") {
			System.out.println("You can please wait for further rounds");
			String round1status="Pass";
			if(round1status=="Pass") {
				System.out.println("You have pass in 1st round interview");
			}
			
		}else {
			System.out.println("You can go to home");
		}
		
		if(i>0) {
			System.out.println("The given number is Positive");
		}else if(i==-10) {
			System.out.println("Equal to -10");
		}
		else {
			System.out.println("The given number is negative");
		}
		
		
		//switch
		
		int j=2;
		switch(j) {
		case 1:
			System.out.println("This is first Statement");
			break;
		case 2:
			System.out.println("This is Second Statement");
			break;		//break is must
		default:
			System.out.println("This is Default Statement");
		
			
	}
	
	}
}
