package com.aprilwrittentest;
//6) What will be the output of this program?[
public class Que6 {
	
		static Double[] methodOne(Double[] D)
		{
		D[1] = 36.25;
		return methodTwo(D);
		}
		static Double[] methodTwo(Double[] D)
		{
		D[1] = 62.36;
		return methodThree(D);
		}

		static Double[] methodThree(Double[] D)
		{
		D[1] = 93.58;
		return D;
		}

		public static void main (String[] args)
		{
		Double[] D = {10.55, 25.36, 58.29, 74.32, 32.21};

		D = methodOne(D);

		System.out.println(D[1]);
		}

	

}
