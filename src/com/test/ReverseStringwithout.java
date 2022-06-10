package com.test;

public class ReverseStringwithout {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		reverseString("sunshine!");
		
	}
	
	static void reverseString(String s)
	{
		char[] ch= new char[s.length()];
		//int count=0;
		
		
		for(int i=s.length()-1;i>=0;i--)
		{
			ch[(s.length()-1)-i]=s.charAt(i);
			
		}
		
		System.out.print(ch);
	}
	

}
	



