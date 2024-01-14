package com.aprilwrittentest;
//9)Java Program to Interchange  bottom two Rows & left two Columns in the given Matrix.[1M]
//Given Matrix:
//1 2 3
//4 5 6
//7 8 9
//Matrix after interchanging row 2 and 3
//1 2 3
//7 8 9
//4 5 6
//Matrix after interchanging columns 1 and 2
//2 1 3
//8 7 9
//5 4 6

public class Que9 {
	public void interchange(int n[][]) {
		
		for(int i=0; i<3; i++) {
			int a;
			for(int j=0; j<3; j++) {
				if(n[i][j]==n[1][j]) {
					a=n[i][j];
					n[i][j]=n[2][j];
					n[2][j]=a;
				}
			}
		}
		for(int i=0; i<3; i++) {
			int b;
			for(int j=0; j<3; j++) {
				if(n[i][j]==n[i][0]) {
					b=n[i][j];
					n[i][j]=n[i][1];
					n[i][1]=b;
				}
			}
		}
		for(int i=0; i<3; i++) {
			for(int j=0; j<3; j++) {
				System.out.print(n[i][j]+" ");
			}
			System.out.println();
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[][]= {{1,2,3}, {4,5,6}, {7,8,9}};
		Que9 q1 = new Que9();
		q1.interchange(arr);
	}

}
