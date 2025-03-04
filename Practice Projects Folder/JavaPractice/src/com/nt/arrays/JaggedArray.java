package com.nt.arrays;

public class JaggedArray {

	public static void main(String[] args) {
//		int[][] arr=new int[3][];
//		arr[0]=new int[2];
//		arr[1]=new int[4];
//		arr[2]=new int[3];
//		
//		arr[0][0]=24;
//		arr[0][1]=54;	
//		
//		arr[1][0]=35;
//		arr[1][1]=29;
//		arr[1][2]=985;
//		arr[1][3]=65;
//		
//		arr[2][0]=6532;
//		arr[2][1]=365;
//		arr[2][2]=632;
		
		
		int[][] arr= {
				{1,2},
				{65,35,68,69},
				{98,75,85}
		};		
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
	}
}
