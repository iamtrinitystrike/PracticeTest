package com.test;

import java.util.Arrays;
;

public class StringAnagram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	System.out.println(anagram("raginee","raginee"));
	}
	
	static boolean anagram(String s1,String s2)
	{
		
		return sort(s1).equals(sort(s2));
	}

	public static String sort(String s) {
		// TODO Auto-generated method stub
		
		char[] temp=s.toCharArray();
		Arrays.sort(temp);
		
		return new String(temp);
	}

}
