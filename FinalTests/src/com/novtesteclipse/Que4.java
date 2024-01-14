package com.novtesteclipse;

import java.util.ArrayList;
import java.util.HashMap;

/*
 * Q4. Hotel serves delicious Menus to its Customers. 
 * It maintains list of Orders given on daily basis. 
 * Order list is maintained as ArrayList<Order>. 
 * Each Order contains orderid, MenuName, price,  qtyOrdered. 
 * (Price of same Menu may vary according hours).
From ArrayLsit of Orders create a map <String,Float> 
where Menu Name is key and total sale in a day for theMenu as Value.
 (sale for the menu is Price*qty ordered).Eg. Order List for a day is :

[(80,”Pav Bhajee”,120.00,5),	(90,”Grilled Sandwitch”,72.00,10), 		
(92,”Hakka Noodles”,220.00,2),	(96,”Pav Bhajee”,125.00,8),      
  (101,”Grilled Sandwitch”,70.00,2)]

Then Map would be like this :
{{“Pav Bhajee”,(120*5)+(125*8) ie.1600},  
 {“Hakka Noodles”, 440}, {“Grilled Sandwitch”,860}}	      [2]	

 */
public class Que4 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Order o = new Order(80,"Pav Bhajee",120,5);
		Order o1 = new Order(90,"Grilled Sandwitch",72,10);
		Order o2 = new Order(92,"Hakka Noodles",220,2);
		Order o3 = new Order(96,"Pav Bhajee",125,8);
		Order o4 = new Order(101,"Grilled Sandwitch",70,2);
		
		ArrayList<Order> list = new ArrayList<>();
		list.add(o);
		list.add(o1);
		list.add(o2);
		list.add(o3);
		list.add(o4);
		
		HashMap<String,Integer> map = new HashMap<>();
		for (int i=0; i<list.size(); i++) {
			int total=0;
			for (int j=0; j<list.size(); j++) {
				if(list.get(i).menuname==list.get(j).menuname&&i>j) {
					break;
				}
				if(list.get(i).menuname==list.get(j).menuname) {
					total=total+(list.get(j).price*list.get(j).getQnt());
				}
			}
			if(total!=0)
			map.put(list.get(i).menuname, total);
		}
		System.out.println(map);
	}

}
