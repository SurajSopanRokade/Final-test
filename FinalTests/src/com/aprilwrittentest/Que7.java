package com.aprilwrittentest;
//7)  You are given a class Solution and its main method in the editor. 
//Your task is to create the class Add and the required methods so that the
//code prints the sum of the numbers passed to the function add.[1M]
//sample input
//2,3
//output 5
//14,2,1
//output 17
//14,14,1,1
//output 30

public class Que7 {
	public static void sum(int a, int b) {
		System.out.println("Sum : "+(a+b));
	}
	public static void sum(int a, int b, int c) {
		System.out.println("Sum : "+(a+b+c));
	}
	public static void sum(int a, int b, int c, int d) {
		System.out.println("Sum : "+(a+b+c+d));
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		sum(2,3);
		sum(14,2,1);
		sum(14,14,1,1);
	}

}
