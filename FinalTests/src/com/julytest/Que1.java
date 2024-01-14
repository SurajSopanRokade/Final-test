package com.julytest;
//Q1. There is array of numbers less than 10. Write a program to create maximum number by combining these numbers.
//Eg.[5,2,8,9,6,8] is array. Then output number should be  
//988652 (It should be formed strictly as number type. Do not generate number from String).

public class Que1 {
	public int[] sortArr(int arr[]) {
		for (int i=0; i<arr.length; i++) {
			int temp=0;
			for (int j=i+1; j<arr.length; j++) {
				if(arr[i]<arr[j]) {
					temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		return arr;
	}
	public int creatNum(int arr[]) {
		int sum=0;
		for (int i=0; i<arr.length; i++) {
			sum=sum*10+arr[i];
		}
		return sum;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {5,2,8,9,6,8};
		Que1 q = new Que1();
		int n[]=q.sortArr(a);
		int maxnum=q.creatNum(n);
		System.out.println(maxnum);
		
	}

}
