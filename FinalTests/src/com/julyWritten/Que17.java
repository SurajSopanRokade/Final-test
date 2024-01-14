package com.julyWritten;



import java.util.Iterator;
import java.util.TreeSet;

/*
 * 
 * Q17.Create class Laptop with members modelno,brand,price,RAM. Create Set of Laptop Objects.
 *  
Write a code to remove Laptop Objects with brand DELL. 
After that sort all  remaining objects in Set by RAM capacity in ascending order.

 */
public class Que17 implements Comparable<Que17>{
	int model_no, price, ram;
	String brand;
	public Que17() {
		// TODO Auto-generated constructor stub
	}
	public Que17(int model_no, int price, int ram, String brand) {
		super();
		this.model_no = model_no;
		this.price = price;
		this.ram = ram;
		this.brand = brand;
	}

	public int getModel_no() {
		return model_no;
	}

	public void setModel_no(int model_no) {
		this.model_no = model_no;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public int getRam() {
		return ram;
	}

	public void setRam(int ram) {
		this.ram = ram;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	@Override
	public String toString() {
		return "Que17 [model_no=" + model_no + ", price=" + price + ", ram=" + ram + ", brand=" + brand + "]";
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Que17 q1 = new Que17(1,23000,6,"DEll");
		Que17 q2 = new Que17(2,43000,7,"HP");
		Que17 q3 = new Que17(3,53000,8,"LENOVA");
		Que17 q4 = new Que17(4,73000,9,"HP");
		Que17 q5 = new Que17(5,13000,2,"DEll");
		Que17 q6 = new Que17(6,83000,10,"DEll");
		
		TreeSet<Que17> set =  new TreeSet<>();
		set.add(q1);
		set.add(q2);
		set.add(q3);
		set.add(q4);
		set.add(q5);
		set.add(q6);
		
		Iterator<Que17> itr = set.iterator();
		while(itr.hasNext()) {
			Que17 q = itr.next();
			if(q.brand=="DELL") {
				itr.remove();
			}
		}
		System.out.println(set);
		
	}
	@Override
	public int compareTo(Que17 o) {
		// TODO Auto-generated method stub
		if(this.ram<o.ram)
			return 1;
		else if (this.ram==o.ram)
			return 0;
		else
			return -1;
	}

}
