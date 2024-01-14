package com.julyWritten;
//Que8
public class ReturnFromTryCatch {
	
	static int i=0;
	    public static void main(String[] args)
	    {
	        	System.out.println(methodReturningValue());
	        	System.out.println(i);
	    }
	    static int methodReturningValue()
	    {
	       try
	        {            i = 1;
	         	         return i;
	        }
	        catch (Exception e)
	        {
	            i = 2;
	            	return i;
	        }
	        finally
	        {            i = 3;        }
	    }}	

	


