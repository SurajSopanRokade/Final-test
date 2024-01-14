package com.julyWritten;

import java.util.ArrayList;
import java.util.HashSet;

//Q22.   Student class is with following members : 						[2]
//		  int id , String name, int phy , int chem 
//		 People from physics department updated only physics marks and added student 
//object in arraylist1. Similarly, people from chemistry department updated only chemistry 
//mark in student object and added it in arraylist2. 
//		e. g. in arraylist1 Student object goes like { 1 , ‘steven’ ,  68 ,0 }
//		in arraylist2 Student object goes like { 1, ‘steven’ ,0, 83 } 
//		Write a program to create a HashSet which will contain one record per student
//and will have all its corresponding subject marks updated. So HashSet will contain 
//single record for ‘steven’ like 	{ 1 , ‘steven’ , 68, ,83}

public class Que22 {
	int sid, phy, chem;
	String sname;
	public Que22() {
		// TODO Auto-generated constructor stub
	}
	public Que22(int sid,String sname, int phy, int chem) {
		super();
		this.sid = sid;
		this.phy = phy;
		this.chem = chem;
		this.sname = sname;
	}

	public int getSid() {
		return sid;
	}

	public void setSid(int sid) {
		this.sid = sid;
	}

	public int getPhy() {
		return phy;
	}

	public void setPhy(int phy) {
		this.phy = phy;
	}

	public int getChem() {
		return chem;
	}

	public void setChem(int chem) {
		this.chem = chem;
	}

	public String getSname() {
		return sname;
	}

	public void setSname(String sname) {
		this.sname = sname;
	}

	@Override
	public String toString() {
		return "Que22 [sid=" + sid + ", phy=" + phy + ", chem=" + chem + ", sname=" + sname + "]";
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Que22 q1 = new Que22(1,"Suraj",89, 0);
		Que22 q2 = new Que22(2,"Yogesh",90, 0);
		Que22 q3 = new Que22(3,"Abhishek",99, 0);
		
		ArrayList<Que22> phlist = new ArrayList<>();
		phlist.add(q1);
		phlist.add(q2);
		phlist.add(q3);
		
		Que22 q4 = new Que22(1,"Suraj",0, 78);
		Que22 q5 = new Que22(2,"Yogesh",0, 90);
		Que22 q6 = new Que22(3,"Abhishek",0, 97);
		
		ArrayList<Que22> chlist = new ArrayList<>();
		chlist.add(q4);
		chlist.add(q5);
		chlist.add(q6);
		
		HashSet<Que22> set = new HashSet<>();
		for (int i=0; i<phlist.size(); i++) {
			for (int j=0; j<chlist.size(); j++) {
				if(phlist.get(i).sid==chlist.get(j).sid) {
					phlist.get(i).chem=chlist.get(j).chem;
				}
			}
			set.add(phlist.get(i));
		}
		System.out.println(set);
	}

}
