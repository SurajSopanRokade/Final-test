package com.julyWritten;
/*
 * Q2. Write a method to return sum of numbers from minimum range to maximum range 
 * given using recursive function. Eg.display(4,8) will display 30. 
 * That is sum of all 4,5,6,7,8.	[1]
 */
public class Que2 {
	public int createRecursive(int a, int b) {
		int sum=0;
		for (int i=a; i<=b; i++) {
			sum=sum+i;
		}
		return sum;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Que2 q = new Que2();
		int res=q.createRecursive(4, 8);
		System.out.println(res);
	}

}
