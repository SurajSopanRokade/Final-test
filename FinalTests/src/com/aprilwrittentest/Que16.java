package com.aprilwrittentest;

public class Que16 extends Thread {
	
	Que16()
	{
	System.out.print(" MyThread");
	}
	public void run()
	{
	System.out.print(" bar");
	}
	public void run(String s)
	{
	System.out.println(" baz");
	}

	
	public class monthlytest {
	
	public static void main(String[] args) {

	Thread t = new Que16()
	{
	public void run()
	{
	System.out.println(" foo");
	}
	};
	t.start();
	}
	
	}	
}

