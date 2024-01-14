package com.aprilwrittentest;
//1) find the output[1M]
//		  int a = 34;
//        int b = 21;
//        int c = a++ + ++b;
//        int d = --a + --b + c--;
//        int e = a + ++b + ++c + d--;
//        int f = --a + b-- + --c - d++;
//        int sum = a + b + c + d + e + f;
//        System.out.println("sum = " + sum);
// 34+21+56+111+223+33+22+55-223
//a 34 35 34 33
//b 21 22 21 22 21
//c= 56 55 56 55
// d=111 110 111
//e= 223 224
//-113
//sum=331
public class Que1 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	  int a = 34;
      int b = 21;
      int c = a++ + ++b;
      int d = --a + --b + c--;
      int e = a + ++b + ++c + d--;
      int f = --a + b-- + --c - d++;
      int sum = a + b + c + d + e + f;
      System.out.println("sum = " + sum);
	}

}
