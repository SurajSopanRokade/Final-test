package com.julyWritten;




	public class SubClass extends SuperClass implements I1 {
	    public void displayResult()
	    {
	    	show();    
	    	System.out.println("Displaying from subClass");
	     }
	    public void show()
	    {
	    	  super.displayResult();
	    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
