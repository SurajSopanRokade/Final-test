package com.aprileclipse;

public class Cust_master {
	int cust_id;
	String cname;
	String contact;
	int age;
	String pan_no;
	
	public Cust_master() {
		// TODO Auto-generated constructor stub
	}
	public Cust_master(int cust_id, String cname, String contact, int age, String pan_no) {
		super();
		this.cust_id = cust_id;
		this.cname = cname;
		this.contact = contact;
		this.age = age;
		this.pan_no = pan_no;
	}

	public int getCust_id() {
		return cust_id;
	}

	public void setCust_id(int cust_id) {
		this.cust_id = cust_id;
	}

	public String getCname() {
		return cname;
	}

	public void setCname(String cname) {
		this.cname = cname;
	}

	public String getContact() {
		return contact;
	}

	public void setContact(String contact) {
		this.contact = contact;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getPan_no() {
		return pan_no;
	}

	public void setPan_no(String pan_no) {
		this.pan_no = pan_no;
	}

	@Override
	public String toString() {
		return "Cust_master [cust_id=" + cust_id + ", cname=" + cname + ", contact=" + contact + ", age=" + age
				+ ", pan_no=" + pan_no + "]";
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
