package com.aprileclipse;

import java.util.Arrays;
import java.util.Scanner;

/*
 * 3. Covert password to string ->[1M]
password is India'sAge72@2019
convert to UllllSlUllNNSNNNN -> U= Uppercase, l= lowercase, S= 
Specialcase, N= Number
shorten above to ->U4lSlU2l2NS4N
 */
public class Que3 {
	public void passwardConverter() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter passward");
		String str = sc.next();
		char ch[]=str.toCharArray();
		
		for (int i=0; i<ch.length; i++) {
			if (ch[i]>=65 && ch[i]<=90) {
				ch[i]='U';				
			}
			else if ((ch[i]-32)>=65 && (ch[i]-32)<=90) {
				ch[i]='l';				
			}
			else if (ch[i]=='0'||ch[i]=='1'||ch[i]=='2'||ch[i]=='3'||ch[i]=='4'||ch[i]=='5'||ch[i]=='6'||ch[i]=='7'||ch[i]=='8'||ch[i]=='9') {
				ch[i]='N';				
			}
			else {
				ch[i]='S';	
			}		
		}
		String str1 = new String(ch);
		System.out.println(str1);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Que3 q1 = new Que3();
		q1.passwardConverter();
	}

}
