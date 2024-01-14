package com.julyWritten;
//Q1. Predict the output.
public class SuperClass {
	
	  	public void displayResult() {
	 		  System.out.println("Printing from superclass");
	    }
	public static void main(String args[]) {
	        I1 obj = new SubClass();
	        obj.displayResult();
	     }
	}


	


