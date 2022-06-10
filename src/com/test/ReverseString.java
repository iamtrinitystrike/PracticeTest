package com.test;

public class ReverseString {
	
	public static void main(String[] a)
	{
		String str="raginee rathore";
		
		StringBuilder strNew=new StringBuilder();
		strNew.append(str).reverse();
		System.out.println(strNew);
		
		reverseString("hello there");
	}

	
	public static String reverseString(String s)
	{
		char[] chAr=s.toCharArray();
		
		
		for(int i=chAr.length-1;i>=0;i--)
		{
			System.out.print(chAr[i]);
			
			
		}
		return s;
	}
	
	
	
}
