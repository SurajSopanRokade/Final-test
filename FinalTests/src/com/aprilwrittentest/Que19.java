package com.aprilwrittentest;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

//19) suppose  email id contains  email_alias with number then create Map which Store alias 
//as key and number as value.e.g email is xyz12@gmail.com then map will be[1M]
//m.put(xyz,12). suppose email is amit@yahoo.com then map will be
//m.put(amit,0); 
public class Que19 {
	public void createMap() {
		String s1 = "xyz12@gmail.com";
		String s2 = "abc89@gmail.com";
		String s3 = "bcd3@gmail.com";
		String s4 = "cde78@gmail.com";
		String s5 = "def56@gmail.com";
		String s6 = "efg6@gmail.com";
		String s7 = "uaf@gmail.com";
		String s="@";
		
		HashMap<String, String> map = new HashMap<>();
		ArrayList<String> list = new ArrayList<>(Arrays.asList(s1,s2,s3,s4,s5,s6,s7));
		for(int i=0; i<list.size(); i++) {
			String str=list.get(i);
			int a = str.indexOf(s);
			String ss1="";
			String ss2="";
			String str1=str.substring(0, a);
			char ch[] = str1.toCharArray();
			for(int j = 0; j<ch.length; j++) {
			if(ch[j]>='0'&& ch[j]<='9') {
				ss1=ss1+ch[j];
			}
			else if (ch[j]>='a'&&ch[j]<='z') {
				ss2=ss2+ch[j];
			}
			}
			map.put(ss1, ss2);
		}
		System.out.println(map);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Que19 q = new Que19();
		q.createMap();
	}

}
