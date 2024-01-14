package com.julyWritten;
/*
 * Q14.Consider 3X3  Array given below. 
 * Write a java code to display sum of lower right triangle elements of array.	
 * 
 */
public class Que14 {
	public void check() {
		int arr[][]= new int[3][3];
		arr[0][0]=12;
		arr[0][1]=5;
		arr[0][2]=8;
		arr[1][0]=8;
		arr[1][1]=3;
		arr[1][2]=6;
		arr[2][0]=1;
		arr[2][1]=8;
		arr[2][2]=0;
		int sum=0;
		for (int i=0; i<arr.length; i++) {
			int arr1[] = new int[arr[i].length];
			for (int j=0; j<arr1.length; j++) {
				if(i+j>=2) {
					sum=sum+arr[i][j];
				}
			}
		}
		System.out.println(sum);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Que14 q = new Que14();
		q.check();
	}

}
