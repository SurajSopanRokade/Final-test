package com.aprilwrittentest;

import java.util.Comparator;

public class Que21Comp implements Comparator<Que21> {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	@Override
	public int compare(Que21 o1, Que21 o2) {
		// TODO Auto-generated method stub
		if(o1.marks==o2.marks)
			return 0;
		else if(o1.marks>o2.marks) {
			return -1;
		}
		else
			return 1;
	}

}
