package com.julyWritten;

public class Que19 {
    int method(int i, int d)
    {
    	System.out.println("method(int,int) ");
        return i+d;
    }
     
    static int method(int i, double d)
    {
    	System.out.println("method(int,double) ");
        return (int)(i+d);
    }
     
    double method(double i, int d)
    {
    	System.out.println("method(double,int) ");
        return i+d;
    }
     
    static double method(double i, double d)
    {
    	System.out.println("method(double,double) ");
        return i+d;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	}
	public class PolyOuPut
	{
		public static void main(String a[])
		{
			Que19 o = new Que19();
			System.out.println(o.method(6, 7));
		}
	}

}
