package com.julyWritten;

import java.util.Arrays;

/*
 * Q18. Write a code to remove every 3rd occurrence of character from given String.	            [1]
Eg.  If Given String is  : “Peter piper picked a peck of pickled pepper”.
Should display output as : “Peter pir picked a peck of ld pepe”. 

 */
public class Que18 {
	
	public void remove(String str) {
		String str1=str;
		String str2 ="";
		String str3 = "";
		str=str.toLowerCase();
		str1=str1.toLowerCase();
		char ch []= str.toCharArray();
		for(int i=0; i<ch.length; i++) {
			for(int j=i+1; j<ch.length; j++) {
				if(ch[i]==ch[j]) {
					ch[j]='$';
				}	
			}
			str2=str2+ch[i];
		}
		
		char ch1[]=str2.toCharArray();
		char ch2[]=str1.toCharArray();
		for(int i=0; i<ch1.length; i++) {
			int count=0;
			for(int j=0; j<ch2.length; j++) {
				if(ch1[i]==ch2[j]) {
					count++;
				}
				
				if(count%3==0&&ch1[i]==ch2[j]) {
					ch2[j]='#';
				}
				
			}
			
		}
		String fs="";
		for (int i=0; i<ch2.length; i++) {
			if(ch2[i]!='#') {
				fs=fs+ch2[i];
			}
		}
		System.out.println(fs);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Que18 q = new Que18();
		q.remove("Peter piper picked a peck of pickled pepper");
	}

}
