package com.julytest;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;

//Q3. Customer does online shopping to leverage Diwali offers.	 Shopping list of Customers is maintained in following format:  ArrayList<Item>.Each  Item has ID,name,price and qty.
//From ArrayLsit of Items create a map <String,Integer> where Item Name is key and total quantity ordered for that Item as Value. 
//Eg. Items in shpping list are : 
//[(112,”ParleG”,20.00,10),(113,”GoodDay”,40.00,30), (112,”ParleG”,20.00,5),(113,”GoodDay”,40.00,10)]
//Then Map would be like this :{{ParleG,15},{GoodDay,40}}

public class Item {
	int id,qty;
	String name;
	float price;
	public Item() {
		// TODO Auto-generated constructor stub
	}
	public Item(int id, String name, float price, int qty) {
		super();
		this.id = id;
		this.qty = qty;
		this.name = name;
		this.price = price;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getQty() {
		return qty;
	}

	public void setQty(int qty) {
		this.qty = qty;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Item [id=" + id + ", qty=" + qty + ", name=" + name + ", price=" + price + "]";
	}
	
	public static void createMap(ArrayList<Item>list) {
		HashMap<String, Integer> map = new HashMap<>();
		
		for (int i=0; i<list.size(); i++) {
			int sum=0;
			for (int j=0; j<list.size(); j++) {
//				if (list.get(i).getName()==list.get(j).getName()&&i>j)
//					break;
				if (list.get(i).getName()==list.get(j).getName()) {
					sum=sum+list.get(j).getQty();
				}
			}
			if(sum!=0)
			map.put(list.get(i).getName(), sum);
		}
		Set<Entry<String, Integer>> set = map.entrySet();
		Iterator<Entry<String, Integer>> itr = set.iterator();
		while(itr.hasNext()) {
			Entry<String, Integer>ent = itr.next();
			System.out.println("Name : "+ent.getKey()+ " Quantity sum : "+ent.getValue());
			
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Item i1 = new Item(112,"ParleG",20.00f,10);
		Item i2 = new Item(113,"GoodDay",40.00f,30);
		Item i3 = new Item(112,"ParleG",20.00f,5);
		Item i4 = new Item(113,"GoodDay",40.00f,10);
		
		ArrayList<Item>list = new ArrayList<>();
		list.add(i1);
		list.add(i2);
		list.add(i3);
		list.add(i4);
		
		createMap(list);
		
	}

}
