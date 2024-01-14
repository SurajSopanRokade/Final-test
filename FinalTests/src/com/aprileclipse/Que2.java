package com.aprileclipse;

import java.util.Arrays;

/*
 * 2. Class student is as follows { private int sid, private string name , private int[] marks , 
float per}. Create array of 3 students. Hardcode data. Marks array is array of 3 
integers which represent students marks of 3 subjects. Marks are out of 100. Strictly 
use getter and setters to set and read values of all fields. Calculate percentage. Sort 
array in descending order of percentage. [1M]

 */
public class Que2 {
	int sid;
	private String name;
	private int [] marks;
	float per;
	
	public Que2() {
		// TODO Auto-generated constructor stub
	}
	public Que2(int sid, String name, int[] marks) {
		super();
		this.sid = sid;
		this.name = name;
		this.marks = marks;
		per=calculatePercentage();
	}

	public int getSid() {
		return sid;
	}

	public void setSid(int sid) {
		this.sid = sid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int[] getMarks() {
		return marks;
	}

	public void setMarks(int[] marks) {
		this.marks = marks;
	}

	public float getPer() {
		return per;
	}

	public void setPer(float per) {
		this.per = per;
	}
	public float calculatePercentage() {
		int sum=0;
		for (int i=0; i<marks.length; i++) {
			sum=sum+marks[i];
		}
		return per=sum/3;
	}

	@Override
	public String toString() {
		return "Que2 [sid=" + sid + ", name=" + name + ", marks=" + Arrays.toString(marks) + ", per=" + per + "]";
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr1[]= {78,89,90};
		Que2 q1 = new Que2(1,"Suraj",arr1);
		int arr2[]= {88,99,90};
		Que2 q2 = new Que2(2,"Sunish",arr2);
		int arr3[]= {78,79,78};
		Que2 q3 = new Que2(3,"Abhishek",arr3);
		
		Que2 arr[]= {q1,q2,q3};
		
		for (int i=0; i<arr.length; i++) {
			Que2 temp=null;
			for (int j=i+1; j<arr.length; j++) {
				if(arr[i].per>arr[j].per) {
					temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		System.out.println(Arrays.toString(arr));
		
	}
	
	

}
