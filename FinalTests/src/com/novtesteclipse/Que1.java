package com.novtesteclipse;
/*
 * Q1.Find how many 2000, 500, 100, 50 notes will be required to make specified amount. 
 * Amount should be multiple of 50. E.g. To make amount 2,550 it required 1 note of 2000,
 *  one note of 500 and 1 of rupees 50.
 */
public class Que1 {
	public void findNoOfNotes(int n) {
		int count=0; 
		int count1=0;
		int count2=0;
		int count3=0;
		while(true) {
			if(n>2000) {
				count++;
				System.out.println(count+" note of 2000");
				n=n-2000;
			}
			else if(n>=500&&n<2000) {
				count1++;
				System.out.println(count1+" note of 500");
				n=n-500;
			}
			else if(n>=100&&n<500) {
				count2++;
				System.out.println(count2+" note of 100");
				n=n-100;
			}
			else if(n>=50&&n<100) {
				count3++;
				System.out.println(count3+" note of 50");
				n=n-50;
			}
			else if(n==0) {
				break;
			}
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Que1 q1 = new Que1();
		q1.findNoOfNotes(6550);
		
	}

}
