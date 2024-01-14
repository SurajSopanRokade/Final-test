package com.aprilwrittentest;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Objects;
import java.util.Set;

//12)An map contains student object as a key and list of courses he has enrolled in. [1M]
//e.g. map<student , list(course)>
//Create another map in which course id is a key and list of student objects of that 
public class Student {
	int sid;
	String sname;
	Course c;
	
	public Student() {
		// TODO Auto-generated constructor stub
	}
	public Student(int sid, String sname, Course c) {
		super();
		this.sid = sid;
		this.sname = sname;
		this.c = c;
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


	public Course getC() {
		return c;
	}


	public void setC(Course c) {
		this.c = c;
	}


	@Override
	public String toString() {
		return "Student [sid=" + sid + ", sname=" + sname + ", c=" + c + "]";
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Student s1 = new Student(1, "Yogesh", new Course(1, "phy"));
		Student s2 = new Student(1, "Yogesh", new Course(2, "Maths"));
		Student s3 = new Student(2, "Suraj", new Course(1, "phy"));
		Student s4 = new Student(3, "Kishor", new Course(1, "phy"));
		Student s5 = new Student(3, "Kishor", new Course(2, "Maths"));
		Student s6 = new Student(4, "Amol", new Course(1, "phy"));
		Student s7 = new Student(5, "Akash", new Course(1, "phy"));
		Student s8 = new Student(5, "Akash", new Course(2, "Maths"));

		Map<Student, List<Course>> studentCoursesMap = new HashMap<>();
		
		List<Course> al= new ArrayList<Course>();

		 for (Student student : Arrays.asList(s1, s2, s3, s4, s5, s6, s7, s8)) {
			if (!studentCoursesMap.containsKey(student)) {
				studentCoursesMap.put(student, new ArrayList<Course>());
			} 
				studentCoursesMap.get(student).add(student.getC());
		}

		for (Entry<Student, List<Course>> e : studentCoursesMap.entrySet()) {
			Student s = e.getKey();
			System.out.println(s);
			for (Course c : e.getValue()) {
				System.out.println("\t" + c);
			}
		}
		
		
		HashMap<Integer, ArrayList<Student>> courseStudentMap= new HashMap<>();
		
		for (Student student : Arrays.asList(s1, s2, s3, s4, s5, s6, s7, s8)) {
			Integer cid= student.getC().getCid();
			if (!courseStudentMap.containsKey(cid)) {
				courseStudentMap.put(cid, new ArrayList<Student>());
			} 
				courseStudentMap.get(cid).add(student);
		}
		
		System.out.println();
		System.out.println("courseStudentMap");
		for (Entry<Integer, ArrayList<Student>> e : courseStudentMap.entrySet()) {
			int cid = e.getKey();
			System.out.println("Course Id : " + cid);
			for (Student s : e.getValue()) {
				System.out.println("\t" + s);
			}
		}

	}


}
