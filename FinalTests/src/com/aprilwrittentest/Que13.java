package com.aprilwrittentest;
//13)Write a Java program to print the first 15 numbers of the series.[1M]
//The first few terms of the sequence are :
//0, 1, 2, 5, 12, 29, 70, 169, 408, 985, 2378, 5741, 13860,…

public class Que13 {
	public void series(int a) {
		int previous=0;
		System.out.print("0,");
		int current=1;
		System.out.print("1,");
		int next=0;
		for(int i=0; i<(a-2); i++) {
			next=current*2+previous;
			System.out.print(next+",");
			previous=current;
			current=next;
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Que13 q= new Que13();
		q.series(9);
	}

}
