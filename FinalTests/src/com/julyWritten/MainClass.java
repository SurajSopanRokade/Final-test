package com.julyWritten;
/*
 * Q6. Is the following program written correctly? If yes, what value “result” variable will hold if you run the program?	
 */

	public class MainClass 
	{
	    public static void main(String[] args)
	    {
	        int result = new Que6()
	        {   
	            int add(int a, int b)
	            {
	                return a+b;
	            }
	        }.add(23, 56);
	        System.out.println(result);
	    }
	}

	


