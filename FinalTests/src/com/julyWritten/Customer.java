package com.julyWritten;

public class Customer extends Vehical {
	int cust_id;
	String cust_name;
	String travel_type;
	
	public Customer() {
		// TODO Auto-generated constructor stub
	}
	public Customer(int cust_id, String cust_name, String travel_type) {
		super();
		this.cust_id = cust_id;
		this.cust_name = cust_name;
		this.travel_type = travel_type;
	}
	public  void transferData() {
		System.out.println(super.cust_id);
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
		return "Customer [cust_id=" + cust_id + ", cust_name=" + cust_name + ", travel_type=" + travel_type + "]";
	}


	public static void main(String[] args) throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		Vehical v1 = new Vehical(1,"suraj","Air");
		Vehical v = (Vehical) v1.clone();
		System.out.println(v);
	}

}
