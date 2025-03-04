package com.nt.foreach;

public class Test {

	public static void main(String[] args) {
		int[] arr= {1,2,3,4,5,6,7,8,5,33,65,656,369,59,989};
//		for(int i=0;i<arr.length;i++) {
//			System.out.println(arr[i]);
//		}
		
		//not used for decrement operations
//		int sum=0;
//		int num=0;
//		for(int value:arr) {
//			System.out.println(sum=sum+value);
//			num++;
//		}
//		System.out.println(num);
//		System.out.println("Avg:: "+sum/num);
		
		

		//For 2D arrays
		int[][] arrs= {
				{12,65,95},
				{44,55,99},
				{68,35,76}	
		};
		for(int[] val:arrs) {
			for(int arrval:val) {
				System.out.print(arrval+" ");
			}
			System.out.println();
		}
	}
	
}
