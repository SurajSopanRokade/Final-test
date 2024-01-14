package com.julytest;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

//Q2. Display second most frequent character in given String.Eg. 
//Give String is ‘success’ then output should be ‘c’.
public class Que2 {
	public int calculateSecond(String str) {
		char ch[]=str.toCharArray();
		ArrayList<Integer> list = new ArrayList<>();
		for(int i=0; i<ch.length; i++) {
			int count=0;
			for (int j=0; j<ch.length; j++) {
				if(ch[i]==ch[j]&&i>j)
					break;
				else if (ch[i]==ch[j]) {
					count++;
				}
			}
			if(count!=0) {
				list.add(count);
			}
		}
		Collections.sort(list, Collections.reverseOrder());
		int a=list.get(1);
		return a;
	}
	public void secMostFreqChar(String str, int a) {
		char ch[]=str.toCharArray();
		for(int i=0; i<ch.length; i++) {
			int count=0;
			for (int j=0; j<ch.length; j++) {
				if(ch[i]==ch[j]&&i>j)
					break;
				else if (ch[i]==ch[j]) {
					count++;
				}
			}
			if(count!=0 && count==a) {
			System.out.println("Char : "+ch[i]+" Count : "+count);
			}
		}
	}
	public void calculateUsingMap(String str) {
		char ch[]=str.toCharArray();
		int cnt;
		TreeMap<Character, Integer> map = new TreeMap<>();
		for(Character c : ch) {
			if(map.containsKey(c)) {
				cnt=map.get(c);
				map.put(c, cnt+1);
			}
			else
				map.put(c, 1);
		}
		Set<Entry<Character, Integer>> set = map.entrySet();
		Iterator<Entry<Character, Integer>> itr = set.iterator();
		int count=map.size()-1;
		int ccnt=0;
		while(itr.hasNext()) {
			Entry<Character, Integer> ent = itr.next();
			if(count==ccnt) {
				System.out.println(ent.getKey()+" "+ent.getValue());
			}
			ccnt++;
		}
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Que2 q1 = new Que2();
		String s = "success";
	//	int a=q1.calculateSecond(s);
	//	q1.secMostFreqChar(s, a);
		q1.calculateUsingMap(s);
	}

}
