package com.aprilwrittentest;

import java.util.Comparator;

public class Que20Comp implements Comparator<Que20> {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	@Override
	public int compare(Que20 o1, Que20 o2) {
		// TODO Auto-generated method stub
		if(o1.pageLen==o2.pageLen) {
			return (o1.pageName.compareTo(o2.pageName));
		
		}
		else if(o1.pageLen>o2.pageLen){
			return 1;
		}
		else
			return -1;
	}

}
