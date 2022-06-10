package com.test;

import java.util.Arrays;

public class CharOccurence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str = "Rrgainee";
		int MAX_CHAR = 256;
		int count[] = new int[MAX_CHAR];
	
		for (int i = 0; i < str.length(); i++) {
			char chr = str.charAt(i);
			count[chr] += 1;
		}

		for (int i = 0; i < count.length; i++) {
			if (count[i] != 0)
				System.out.println((char)i+":"+count[i]);
		}

	}

}
