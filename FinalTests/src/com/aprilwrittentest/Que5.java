package com.aprilwrittentest;
//5) You are given an interface AdvancedArithmetic which contains a method signature 
//int divisor_sum(int n). You need to write a class called MyCalculator which implements
//the interface.
//divisor_Sum function just takes an integer as input and return the sum of all its divisors.
//For example divisors of 6 are 1, 2, 3 and 6, so divisor_sum should return 12.[1M]

public class Que5 implements AdvancedArithmetic {
	@Override
	public int divisior_sum(int n) {
		// TODO Auto-generated method stub
		int sum=0;
		for(int i=1; i<=n; i++) {
			if(n%i==0) {
				sum=sum+i;
			}
		}
		return sum;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Que5 q = new Que5();
		int a=q.divisior_sum(6);
		System.out.println(a);
	}

	

}
