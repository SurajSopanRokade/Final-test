package com.aprilwrittentest;
//25) Find out if given number is pronic or not.[1M]
//Input 72=8*9 ,20=4*5 72 is pronic number because 8 and 9 are consecutive no.

public class Que25 {
	public boolean pronic(int b) {
		boolean a = false;
		for(int i=1; i<=b; i++) {
			if(i*(i+1)==b) {
				a=true;
				break;
			}
			else
				a=false;
		}
		return a;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Que25 q = new Que25();
		boolean c=q.pronic(71);
		System.out.println(c);
	}

}
