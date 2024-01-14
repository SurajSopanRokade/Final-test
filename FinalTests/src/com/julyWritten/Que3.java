package com.julyWritten;
/*
 * Q3.  What will be the output?  								[1]
public static void main(String[] args) {
	int i=16, j= 3;
	System.out.println (++i + --j + i%++j*j++ - --j+ ++i);                                         		}

 */
public class Que3 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int i=16, j= 3;
//		int b=++i + --j + i%++j*j++ - --j+ ++i;
//		System.out.println(b);
		int c=17+2+17%3*3-3+18;
		System.out.println(c);
	}
	// i = 16 17 18
	// j = 3 2 3 4 3
	// 17+2+17%3*3-3+18
	// 
	//35
	
}
