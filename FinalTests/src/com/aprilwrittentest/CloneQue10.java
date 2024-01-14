package com.aprilwrittentest;

public class CloneQue10 implements Cloneable{
	Que10 q;
	public CloneQue10() {
		// TODO Auto-generated constructor stub
	}
	public CloneQue10(Que10 q) {
		super();
		this.q = q;
	}

	public Que10 getQ() {
		return q;
	}

	public void setQ(Que10 q) {
		this.q = q;
	}
	public Object clone() throws CloneNotSupportedException {
		return super.clone();
	}
	@Override
	public String toString() {
		return "CloneQue10 [q=" + q + "]";
	}

	public static void main(String[] args) throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		Que10 q = new Que10(1,45000,456,"Pune");
		CloneQue10 q1 = new CloneQue10(q);
		CloneQue10 q2 = (CloneQue10)q1.clone();
		CloneQue10 q3 = (CloneQue10)q2.clone();
		CloneQue10 q4 = (CloneQue10)q3.clone();
		q.price=78000;
		
		System.out.println(q2);
		System.out.println(q3);
		System.out.println(q4);
	}

}
