package com.aprilwrittentest;
//10 )You have been tasked to create flats in a housing scheme. 
//Each flat has a bhk number, area, price and height. 
//Create three flats which are exact copies of each other in such a manner that 
//changes made to one flat should reflect across all copies.[1M]
public class Que10 implements Cloneable{
	int flatno, price, height;
	String area;
	public Que10() {
		// TODO Auto-generated constructor stub
	}
	public Que10(int flatno, int price, int height, String area) {
		super();
		this.flatno = flatno;
		this.price = price;
		this.height = height;
		this.area = area;
	}

	public int getFlatno() {
		return flatno;
	}

	public void setFlatno(int flatno) {
		this.flatno = flatno;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public String getArea() {
		return area;
	}

	public void setArea(String area) {
		this.area = area;
	}
	
	@Override
	public String toString() {
		return "Que10 [flatno=" + flatno + ", price=" + price + ", height=" + height + ", area=" + area + "]";
	}

	public static void main(String[] args) throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		
	}

}
