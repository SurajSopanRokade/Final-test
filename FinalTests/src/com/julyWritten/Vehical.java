package com.julyWritten;
/*
 * * Q7. In Vehicle Booking App, Vehicle object is to be 
 * created to do booking based on Customer class requirement.
 For example, if demand is for Air travel, Air ticket is to be booked. 
 If demand is for train travel, train ticket to be booked etc. 
 Write a code by using appropriate design pattern which will help
  Customer class to create Vehicle object (without using new keyword) to see booking details.	

 */
public class Vehical implements Cloneable {
	
	int cust_id; 
	String cust_name; 
	String travel_type;
	public Vehical() {
		// TODO Auto-generated constructor stub
	}
	
	public Vehical( int cust_id, String cust_name, String travel_type) {
	
		this.cust_id = cust_id;
		this.cust_name = cust_name;
		this.travel_type = travel_type;
	}
	public Object clone() throws CloneNotSupportedException {
		return super.clone();
		
	}
	

	public int getCust_id() {
		return cust_id;
	}

	public void setCust_id(int cust_id) {
		this.cust_id = cust_id;
	}

	public String getCust_name() {
		return cust_name;
	}

	public void setCust_name(String cust_name) {
		this.cust_name = cust_name;
	}

	public String getTravel_type() {
		return travel_type;
	}

	public void setTravel_type(String travel_type) {
		this.travel_type = travel_type;
	}

	@Override
	public String toString() {
		return "Vehical [ cust_id=" + cust_id + ", cust_name=" + cust_name
				+ ", travel_type=" + travel_type + "]";
	}

	public static void main(String[] args)throws CloneNotSupportedException {
		// TODO Auto-generated method stub

	}

}
