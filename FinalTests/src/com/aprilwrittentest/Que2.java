package com.aprilwrittentest;

import java.util.ArrayList;

//2) How to remove  Characters from the first String which are present
//in the second String and add deleted Characters in the ArrayList.[1M]
//e.g String1->india is great nation.
//string2-in
//output->da s great 
//ArrayList [i,n,i,i,n,i]

public class Que2 {
	public void createString(String str) {
		ArrayList<Character> list =new ArrayList<>();
		String str1 = "";
		char ch []= str.toCharArray();
		for (int i=0; i<ch.length; i++) {
			if(ch[i]=='i'|| ch[i]=='n') {
				list.add(ch[i]);
			}
		}
		System.out.println(list);
		char ch1 [] = new char[ch.length-list.size()];
		for(int i=0; i<ch1.length; i++) {
			if(ch[i]!='i'&& ch[i]!='n') {
				ch1[i]=ch[i];
			}
	//		str1=str1+ch1[i];
		}
		String s = new String(ch1);
		System.out.println(s);
	//	System.out.println(str1);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Que2 q1 = new Que2();
		q1.createString("india is great nation");
	}

}
