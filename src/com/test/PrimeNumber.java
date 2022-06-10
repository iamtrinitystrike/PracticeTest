package com.test;

public class PrimeNumber {
	
	public static void main(String[] s)
	
	{
		PrimeNumber pn=new PrimeNumber();
		System.out.println(pn.isPrime(17));
	}
	
	boolean isPrime(int num)
	{
		if(num<=1)
		{
			return false;
		}
		//num/2 
		for(int i=2;i<=num-1;i++)
		{
			if(num%i==0)
			{
				return false;
			}
			
		}
		return true;
	}
}
