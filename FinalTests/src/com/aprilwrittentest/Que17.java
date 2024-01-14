package com.aprilwrittentest;
//17) There is a Bakery (factory)making different kinds of  confectionary(cake, cream roll
//, pastry ,bread). WAP which implements the Bakery to produce the above confectionary.
//Show main invoking this factory. [1M]
public interface Que17 {
	public void make();
	public class cake implements Que17{
		public cake() {
			// TODO Auto-generated constructor stub
		}
		public void make() {
			System.out.println("Make cake");
		}
	}
	public class creamRoll implements Que17{
		public creamRoll() {
			// TODO Auto-generated constructor stub
		}
		public void make() {
			System.out.println("creamRoll");
		}
	}
	public class pastry implements Que17{
		public pastry() {
			// TODO Auto-generated constructor stub
		}
		public void make() {
			System.out.println("pastry");
		}
	}
	public class bread implements Que17{
		public bread() {
			// TODO Auto-generated constructor stub
		}
		public void make() {
			System.out.println("bread");
		}
	}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Que17 q = new bread();
		q.make();
	}

}
