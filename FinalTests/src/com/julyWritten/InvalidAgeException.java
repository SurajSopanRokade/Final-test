package com.julyWritten;
//Q20. Class Voter contains method registerToVote( int age, String name) which throws
//*  InvalidAgeException if age is below 18. Voter class is further extended into GovtResource
//*   class. WAP to demonstrate throw, throws, finally, 2 times catch, custom Exception
//*   (InvalidAgeException) in GovetResource Class.
public class InvalidAgeException extends Exception {
	int age;
	public InvalidAgeException() {
		// TODO Auto-generated constructor stub
	}
	
	public InvalidAgeException(int age) {
	
		this.age = age;
	}
	public String toString() {
		return "Invalid age must be above 18";
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
