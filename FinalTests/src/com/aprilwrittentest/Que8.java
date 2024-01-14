package com.aprilwrittentest;
//8)suppose there are 3 bulb continually  on and  off  set the sequence where 3rd blub on first
//,then 1st blub on and then 2nd blub[1M]
public class Que8 {
	public void bulb() {
		int a=1;
		for(int i=0; i<10; i++) {
			if(a==1) {
				System.out.println(3);
				a=0;
			}
			else if(a==0) {
				System.out.println(1);
				a=3;
			}
			else if(a==3) {
				System.out.println(2);
				a=1;
			}
			
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Que8 q = new Que8();
		q.bulb();
	}

}
