package com.aprilwrittentest;
//3) Write a java program to find the least frequent element in an array?
//without using any builtin method.[1M]
//Input Array : [4, 5, 8, 7, 4, 7, 6, 7]
//The least frequent element : 8,6,5
//Its frequency : 1
public class Que3 {
	public void find(int arr[]) {
		for(int i=0; i<arr.length; i++) {
			int count=0;
			for(int j=0; j<arr.length; j++) {
				if(arr[i]==arr[j]&&i>j) {
					break;
				}
				else if(arr[i]==arr[j]) {
					count++;
				}
			}
			if(count!=0&&count==1) {
				System.out.println("Element : "+arr[i]+" count : "+count);
			}
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Que3 q1 = new Que3();
		int arr[]= {4, 5, 8, 7, 4, 7, 6, 7};
		q1.find(arr);
	}

}
