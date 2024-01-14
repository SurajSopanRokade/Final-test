package com.aprileclipse;

import java.util.ArrayList;
import java.util.Scanner;

/*
 * 1. There is an arraylist of song object { int song id , String songname , flaot volume } . As 
song objects are added into list, volume variable of current object is increased by 2 . 
e.g. first song added will have volume 2 , second song will have volume 4 and so on. 
But the when volume becomes divisible by 3. It gets reduced by 50% for that song
(current object). Again for next song onwards volume will increase by 2 and so on. 
Find out index of atleast one song object for which volume will be equal to or greater 
than 10 . 
You have to accept only song id and song name from user. Volume will be set as per 
above logic. 
e.g. first song added – 1 , ‘all is well’ , 2 
second song – 2 , ‘e vatan’ , 4 
third song - 3 , ‘lakshya to’ , 6 .. now this volume is divisible by 3 so. This song’s 
volume will be reduced by 50% so will become 3. 
Now next song will have volume 3+2 = 5 and so on . Again when volume becomes 9 
it will be reduced to 4.5. [2M]
 */
public class Que1 {
	int song_id;
	String song_name;
	float volume;
	public Que1() {
		// TODO Auto-generated constructor stub
	}
	public Que1(int song_id, String song_name, float volume) {
		super();
		this.song_id = song_id;
		this.song_name = song_name;
		this.volume = volume;
	}

	public int getSong_id() {
		return song_id;
	}

	public void setSong_id(int song_id) {
		this.song_id = song_id;
	}

	public String getSong_name() {
		return song_name;
	}

	public void setSong_name(String song_name) {
		this.song_name = song_name;
	}

	public float getVolume() {
		return volume;
	}

	public void setVolume(float volume) {
		this.volume = volume;
	}

	@Override
	public String toString() {
		return "Que1 [song_id=" + song_id + ", song_name=" + song_name + ", volume=" + volume + "]";
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char ch='Y';
		ArrayList<Que1> list= new ArrayList<>();;
		int a=0;
		Scanner sc = new Scanner(System.in);
		do {
		
		System.out.println("Enter song id");
		int i= sc.nextInt();
		System.out.println("Enter song name");
		String str=sc.next();
		
		a=a+2;
			
		if(a%3==0 && a!=0) {
			a=a/2;
		}
		Que1 q1 = new Que1(i,str,a);

		list.add(q1);
		System.out.println("If you want to continue press Y else press N");
		ch=sc.next().charAt(0);
		}while(ch=='Y');
		System.out.println(list);
	}

}
