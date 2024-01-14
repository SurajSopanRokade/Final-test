package com.aprilwrittentest;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Objects;

//14) Class Car is as follows , { int carno  , String color } . 
//By mistake multiple car objects are added in a collection.  
//Find out duplicate objects in that collection and remove them. 
//Car is same only if (carno  and  color both are same)[1M]
public class Que14 {
	int carno;
	String color;
	public Que14() {
		// TODO Auto-generated constructor stub
	}
	public Que14(int carno, String color) {
		super();
		this.carno = carno;
		this.color = color;
	}

	public int getCarno() {
		return carno;
	}

	public void setCarno(int carno) {
		this.carno = carno;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	@Override
	public String toString() {
		return "Que14 [carno=" + carno + ", color=" + color + "]";
	}
	public int hashCode() {
		return  Objects.hash(carno, color);
		
	}
	public boolean equals(Object o) {
		Que14 q = (Que14) o;
		if(this.carno==q.carno)
			return true;
		else
			return false;
		
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Que14 q1 = new Que14(23,"Red");
		Que14 q2 = new Que14(24,"Red");
		Que14 q3 = new Que14(25,"Red");
		Que14 q4 = new Que14(24,"Yellow");
		Que14 q5 = new Que14(23,"Red");
		Que14 q6 = new Que14(25,"Red");
		
		ArrayList<Que14> list = new ArrayList<>();
		list.add(q1);
		list.add(q2);
		list.add(q3);
		list.add(q4);
		list.add(q5);
		list.add(q6);
		HashSet<Que14> set = new HashSet<>(list);	
		System.out.println(set);
	}


}
