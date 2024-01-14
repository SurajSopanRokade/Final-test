package com.novtesteclipse;
/*
 * Q3.Accept String from user and display it in forllong pattern.
E.g.  String Entered is  “Hello” then String in following pattern should be displayed		    [1]
        H
       eHe
      leHel
     lleHell
    olleHello

 */
public class Que3 {
	public void pattern(String str) {
		char ch []= str.toCharArray();
		for (int i=0; i<ch.length; i++) {
			for (int j=0; j<ch.length-i; j++) {
				System.out.print(" ");
			}
			for(int k=0; k<=i; k++) {
				System.out.print(ch[i-k]);
			}
			for (int l=1; l<=i; l++) {
			System.out.print(ch[l]);
			}
			System.out.println();
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Que3 q1 = new Que3();
		q1.pattern("Suraj");
	}

}
