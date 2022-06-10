package com.test;

public class SwapNumbers {
	
	public static void main(String[] s)
	{
		int firstNum=2;
		int secondNum=3;
		
		 System.out.println(" first Number:" +firstNum  + "   second Number:"+secondNum);
		
		 firstNum=firstNum+secondNum;
		
		 secondNum=firstNum-secondNum;
		 
		 firstNum=firstNum-secondNum;
		 
		 System.out.println("now first Number:" +firstNum  + "  now second Number:"+secondNum);
		
		
		
	}

}
