package com.novtesteclipse;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;

/*
 * Q2. Write a code for below case study:
 6 Friends went for dinner and contributed some amount to pay Hotel bill of Rs.4500. 
  Some friends contributed less or some contributed more amount than the individual’s 
  actual contribution. Accept contribution and name of each in code. 
   Store this information in a Hashmap. 
Create another map which contains details of amount for each friend that he should get
 or he should pay more to somebody from group so that they will pay exact contribution
  for dinner. If they have paid excess their amount will be negative else positive.
 */
public class Que2 {
	public void creatMap() {
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		HashMap<Integer, String> map = new HashMap<>();
//		map.put(501, "Abhishek");
//		map.put(998, "Yogesh");
//		map.put(499, "Suraj");
//		map.put(502, "Adersh");
//		map.put(2000, "Snehal");
		HashMap<String, Integer> map1 = new HashMap<>();
		map1.put( "Abhishek",501);
		map1.put( "Yogesh",998);
		map1.put( "Suraj",499);
		map1.put( "Adersh",502);
		map1.put( "Snehal",2000);
		
		int avg =4500/map1.size();
		System.out.println(map1.size());
		
		
		HashMap<String, Integer> map2 = new HashMap<>();
		Set<Entry<String, Integer>> set = map1.entrySet();
		Iterator<Entry<String, Integer>> itr = set.iterator();
		while(itr.hasNext()) {
			Entry<String, Integer> ent = itr.next();
			int a=ent.getValue();
			
			if(a>avg) {
				a=avg-a;
			}
			else if (a<avg) {
				a=avg-a;
			}
			else if (a==avg) {
				a=avg-a;
			}
			map2.put(ent.getKey(),a);
		}
		System.out.println(map2);
	}

}
