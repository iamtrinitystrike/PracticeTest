package com.test;

public class FbonacciSeries {
	public static void main(String[] s)
	{
	fibonacci(10);
	}

	static void fibonacci(int N)
	{
		int n1=0,n2=1;
		int count=0;
		while(count<N)
		{
			System.out.println(n1+" ");
			int n3=n1+n2;
			n1=n2;
			n2=n3;
			
			count++;
		}
	}
}
