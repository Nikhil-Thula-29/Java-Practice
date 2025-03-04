package com.nt.arrays;

public class TwoDimensionalArray {

	public static void main(String[] args) {
//		int[][] arr=new int[3][2];
//		arr[0][0]=24;
//		arr[0][1]=54;	
//		
//		arr[1][0]=35;
//		arr[1][1]=29;
//		
//		arr[2][0]=6532;
//		arr[2][1]=632;
		
		int[][] arr= {{1,2},{65,69},{96,64}};
		
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
		
	}
}
