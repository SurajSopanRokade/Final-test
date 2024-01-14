package com.aprilwrittentest;
//4) print the pattern[1M]
//	      A
//	     CBA
//	    EDCBA
//	   GFEDCBA

public class Que4 {
	public void pattern(int a) {
		char ch='A';
		for(int i=1;i<=4;i++) {
			
			for(int j=1;j<=(4-i);j++) {
				System.out.print(" ");
			}
			for(int j=(2*i-1);j>=1;j--) {
				System.out.print((char)(ch+(j-1)));
			}
			System.out.println();
		}

	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Que4 q1 = new Que4();
		q1.pattern(4);
	}

}
