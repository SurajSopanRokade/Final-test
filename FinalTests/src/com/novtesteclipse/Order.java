package com.novtesteclipse;
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
 {“Hakka Noodles”, 440}, {“Grilled Sandwitch”,860}}
 */
public class Order {
	int orderid;
	String menuname;
	int price, qnt;
	public Order() {
		// TODO Auto-generated constructor stub
	}
	public Order(int orderid, String menuname, int price, int qnt) {
		super();
		this.orderid = orderid;
		this.menuname = menuname;
		this.price = price;
		this.qnt = qnt;
	}

	public int getOrderid() {
		return orderid;
	}

	public void setOrderid(int orderid) {
		this.orderid = orderid;
	}

	public String getMenuname() {
		return menuname;
	}

	public void setMenuname(String menuname) {
		this.menuname = menuname;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public int getQnt() {
		return qnt;
	}

	public void setQnt(int qnt) {
		this.qnt = qnt;
	}

	@Override
	public String toString() {
		return "Order [orderid=" + orderid + ", menuname=" + menuname + ", price=" + price + ", qnt=" + qnt + "]";
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
