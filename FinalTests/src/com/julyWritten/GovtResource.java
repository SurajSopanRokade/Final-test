package com.julyWritten;
//Q20. Class Voter contains method registerToVote( int age, String name) which throws
//*  InvalidAgeException if age is below 18. Voter class is further extended into GovtResource
//*   class. WAP to demonstrate throw, throws, finally, 2 times catch, custom Exception
//*   (InvalidAgeException) in GovetResource Class.
public class GovtResource extends Que20{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("I am in main");
		Que20 q = new Que20();
		try {
			q.registerToVote(12, "Suraj");
		}catch(InvalidAgeException e) {
			e.printStackTrace();
		}catch(Exception e1) {
			//e1.printStackTrace();
		}finally {
			System.out.println("Finally always execute");
		}
		System.out.println("Program ends");
	}

}
