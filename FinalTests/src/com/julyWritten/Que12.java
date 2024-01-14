package com.julyWritten;

import java.util.Scanner;

/*
 * Q12. Write Enum Type Ticket with constants defined like PLATINUM (250), 
 * GOLD(150),SILVER. Accept which ticket to be booked from user. 
 * Write a code with Switch case statement, to display  ticket rate 250 for
 *  PLATINUM,150 for GOLD and default rate Rs. 100 for SILVER .  
 */
public class Que12 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter your choise\n"
				+ "1.PLATINUM \n"
				+ "2.GOLD\n"
				+ "3.SILVER\n");
		
		Scanner sc = new Scanner(System.in);
		int n =sc.nextInt();
		switch(n) {
		case 1 : System.out.println("ticket rate 250 PLATINUM");
		break;
		case 2 : System.out.println("ticket rate 150 GOLD");
		break;
		case 3 : System.out.println("ticket rate 100 SILVER");
		break;
		default : System.out.println("Invalid choise");
		}
	}

}
