package com.aprilwrittentest;
//15) There are two classes Person and student Student 
//inherits all the properties of Person person has firstname,lastname,id.[1M]
//A Student class constructor, which has  parameters:
//1.	A string firstname .
//2.	A string lastname .
//3.	An integer id .
//4.	An integer array (or vector) of test scores
//A char calculate() method that calculates a Student object’s average and 
//returns the grade character representative of their calculated average


import java.util.ArrayList;
import java.util.Arrays;

public class Que15 extends Que15Person{
	int id;
	String firstname, lastname;
	int marks[];
	int avg;
	String grade;
	public Que15() {
		// TODO Auto-generated constructor stub
	}
	public Que15(int id, String firstname, String lastname, int[] marks) {
		super();
		this.id = id;
		this.firstname = firstname;
		this.lastname = lastname;
		this.marks = marks;
		avg=calculateaverage();
		grade=calculategrade();
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	public int[] getMarks() {
		return marks;
	}
	public void setMarks(int[] marks) {
		this.marks = marks;
	}
	public int getAvg() {
		return avg;
	}
	public void setAvg(int avg) {
		this.avg = avg;
	}
	public String getGrade() {
		return grade;
	}
	public void setGrade(String grade) {
		this.grade = grade;
	}
	@Override
	public String toString() {
		return "Que15 [id=" + id + ", firstname=" + firstname + ", lastname=" + lastname + ", marks="
				+ Arrays.toString(marks) + ", avg=" + avg + ", grade=" + grade + "]\n";
	}
	public int calculateaverage() {
		int sum=0;
		for(int i=0; i<marks.length; i++) {
			sum=sum+marks[i];
		}
		return sum/5;
	}
	public String calculategrade() {
		if(avg>90)
			return "A";
		else if(avg>80) 
			return "B";
		else if(avg>70)
			return "C";
		else
			return "D";
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {80,89,90,78,86};
		Que15 q = new Que15(1,"Suraj", "Rokade", arr);
		int arr1[]= {81,82,94,68,76};
		Que15 q1 = new Que15(2,"Abhishek", "Rai", arr1);
		int arr2[]= {40,79,90,98,86};
		Que15 q2 = new Que15(3,"Snehal", "Nalawde", arr2);
		int arr3[]= {60,89,90,68,96};
		Que15 q3 = new Que15(4,"Adersh", "Jadhav", arr3);
		ArrayList<Que15> list = new ArrayList<>(Arrays.asList(q,q1,q2,q3));
		
		System.out.println(list);
	}

}
