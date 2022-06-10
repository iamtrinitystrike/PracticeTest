package com.test;

public class SubstringCheck {
	
	public static void main(String[] a)
	{
	String s1="Helloapple";
	String s2="Hell";
	
	String str=s1.concat(s1);
	boolean isPresent=str.contains(s2);
	
	System.out.println(isPresent);
	}
	
	
	
	

}
