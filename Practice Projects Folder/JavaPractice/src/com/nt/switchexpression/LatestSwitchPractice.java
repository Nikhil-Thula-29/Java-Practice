package com.nt.switchexpression;

public class LatestSwitchPractice {

	public static void main(String[] args) {
		//latest switch case
		int num=-2 ;
		switch(Integer.compare(num,0)) {
		case -1->
			System.out.println("Negative");
		case 0->
			System.out.println("Zero");
		case 1->
			System.out.println("Positive");
			
		}
			
			
			int nums=0 ;
			switch(Integer.compare(nums,0)) {
			case -1:
				System.out.println("Negative");
				break;
			case 0:
				System.out.println("Zero");
				break;
			case 1:
				System.out.println("Positive");
				break;
		}
		
	}
}
