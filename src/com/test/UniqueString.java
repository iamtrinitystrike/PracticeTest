package com.test;



public class UniqueString {

	public static void main(String[] a) {
		String str = "select";
		int Max_Char = 256;
		int[] count = new int[Max_Char];
		for (int i = 0; i < str.length(); i++) {

			count[str.charAt(i)] += 1;
		}

		for (int i = 0; i < count.length; i++) {
			if (count[i] !=0) {
				System.out.println(i+"  "+count[i]);
				
				if(count[i]==2)
				{
					System.err.println("not unique");
				}
			}
			
		}
		
	System.out.println(	isUnique("Raginee"));
	}
	
	
	static boolean isUnique(String s)
	{
		boolean [] char_set=new boolean[256];
		
		for(int i=0;i<s.length();i++)
		{
			int val=s.charAt(i);
			if(char_set[val])
				return false;
			char_set[val]= true;
		}
		
		return true;
	}
}
