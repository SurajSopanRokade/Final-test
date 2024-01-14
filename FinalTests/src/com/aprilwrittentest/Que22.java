package com.aprilwrittentest;

import java.util.ArrayList;
import java.util.HashMap;

//22)  There is array of int of any size find the factor of each element and  
//store that element and its factor into appropriate collection.[1M]

public class Que22 {
	public void createMap(int n[]) {
		HashMap<Integer, ArrayList<Integer>> map  = new HashMap<>();
		for(int i=0; i<n.length; i++) {
			ArrayList<Integer> list = new ArrayList<>();
			for(int j=1; j<=n[i]; j++) {
				if(n[i]%j==0) {
					list.add(j);
				}
			}
			map.put(n[i], list);
		}
		System.out.println(map);
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {9,6,4};
		Que22 q = new Que22();
		q.createMap(arr);
	}

}
