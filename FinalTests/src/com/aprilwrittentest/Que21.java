package com.aprilwrittentest;

import java.util.PriorityQueue;
import java.util.Queue;

//21) There are a number of students in a school who wait to be served. 
//Two types of events, ENTER and SERVED, can take place which are described below.[2M]
//1)ENTER: A student with some priority enters the queue to be served.
//2)SERVED: The student with the highest priority is served (removed) from the queue.
//        A unique id is assigned to each student entering the queue. 
//WAP to create  queue  using  Comparator
//              students based on the following criteria (priority criteria):
//1)The student having the highest marks is served first.
//2)Any students having the same marks will be served by name in ascending 
//case-sensitive alphabetical order.

public class Que21 {
	int sid;
	String sname;
	int marks;
	public Que21() {
		// TODO Auto-generated constructor stub
	}
	public Que21(int sid, String sname, int marks) {
		super();
		this.sid = sid;
		this.sname = sname;
		this.marks = marks;
	}

	public int getSid() {
		return sid;
	}

	public void setSid(int sid) {
		this.sid = sid;
	}

	public String getSname() {
		return sname;
	}

	public void setSname(String sname) {
		this.sname = sname;
	}

	public int getMarks() {
		return marks;
	}

	public void setMarks(int marks) {
		this.marks = marks;
	}

	@Override
	public String toString() {
		return "Que21 [sid=" + sid + ", sname=" + sname + ", marks=" + marks + "]";
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Que21 q1 = new Que21(1,"Suraj",45);
		Que21 q2 = new Que21(2,"Yogesh",67);
		Que21 q3 = new Que21(3,"Sudarshan",78);
		Que21 q4 = new Que21(4,"Adersh",56);
		
		Queue <Que21> q  = new PriorityQueue<>(new Que21Comp());
		q.add(q1);
		q.add(q2);
		q.add(q3);
		q.add(q4);
		
		Que21 s;
		
		while((s=q.poll())!=null) {
			System.out.println(s+" ");
		}
		
		
	}

}
