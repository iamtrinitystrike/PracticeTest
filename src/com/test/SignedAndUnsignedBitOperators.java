package com.test;

public class SignedAndUnsignedBitOperators {
	
	public static void main(String[] a)
	{
		int num= 40;
		int num2=-40;
		
		
		System.out.println("40 = "+Integer.toBinaryString(num));
		
		System.out.println("40 = "+Integer.toBinaryString(num2));
		
		// left shift by 2
		int b=num<<2;
		System.out.println("left 40<<2 ="+ Integer.toBinaryString(b));
		
		// left shift by 2
				int b2=num2<<2;
				System.out.println("left -40<<2 ="+ Integer.toBinaryString(b2));
				
		
		
		// right shift by 2 (if number is  positive signed right bits will be filled with 0s)

		int r=num>>2;
				
		System.out.println("right signed 40>>2 ="+ Integer.toBinaryString(r));
		
		
		//right shift by 2 (unsigned right bits will be filled with 0s)
		int r2=num>>>2;
		System.out.println("right unsigned 40>>>2 ="+ Integer.toBinaryString(r2));
		
		
		
		//right shift by 2 (if number is negative signed right bits will be filled with 1s)
				int r4=num2>>2;
				System.out.println("right signed -40>>2 ="+ Integer.toBinaryString(r4));
				
		//right shift by 2 (unsigned right bits will be filled with 0s)
		int r3=num2>>>2;
		System.out.println("right unsigned -40>>>2 ="+ Integer.toBinaryString(r3));
		
	}

}
