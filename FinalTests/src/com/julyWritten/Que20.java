package com.julyWritten;
/*
 * Q20. Class Voter contains method registerToVote( int age, String name) which throws
 *  InvalidAgeException if age is below 18. Voter class is further extended into GovtResource
 *   class. WAP to demonstrate throw, throws, finally, 2 times catch, custom Exception
 *   (InvalidAgeException) in GovetResource Class.
 */
public class Que20 {
	int age; 
	String name;
	
	public void registerToVote(int age, String name) throws InvalidAgeException {
		this.age=age;
		this.name=name;
		if(age<18) {
			throw new InvalidAgeException(age);
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
