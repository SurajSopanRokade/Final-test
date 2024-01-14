package com.julyWritten;
/*
 * Q4. Generate Tribonacci series like 0,1,1,2,4,7,13,24......   up to the 
 * limit given by user. 
Also print how many even and odd numbers are there in the series.

 */
public class Que4 {
	public void tribonacciSeries(int d) {
		int a=0;
		int b=1;
		int c=1;
		System.out.print(a+","+b+","+c);
		int n;
		int even=0, odd=0;
		for (int i=0; i<(d-3); i++) {
			n=a+b+c;
			System.out.print(","+n);
			if(n%2!=0) {
				odd++;
			}
			else
				even++;
			a=b;
			b=c;
			c=n;
		}
		System.out.println("\nEven cnt : "+even+ " \nOdd cnt : "+(odd+2));
	}
	public static void main(String[] args) {
		Que4 q1 = new Que4();
		q1.tribonacciSeries(8);
	}

}
