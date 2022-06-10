package com.test;

public class ReplaceSpacesStriing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str = "raginee rathore";
		String[] sa = str.split(" ");
		StringBuilder result=new StringBuilder();
		if (str == null || str.isEmpty()) {
			System.out.println("string empty");
		} else if (sa.length < 2) {
			System.out.println(str);
		} else {
			for (int i = 0; i < sa.length-1; i++) {
				
				result.append(sa[i]).append("%20");
			}
		}
		
//		String s=str.replaceAll(" ", "%20");
//		
		System.out.print(result.append(sa[sa.length-1]));

		/*
		 * char[] ch = str.toCharArray(); System.out.println(ch.length); int spacecount
		 * = 0, newlength, i = 0;
		 * 
		 * for (i = 0; i < ch.length; i++) { if (ch[i] == ' ') { spacecount++; } }
		 * 
		 * newlength = ((ch.length) + (spacecount * 2)); System.out.print(newlength); //
		 * ch[newlength]='\0'; for (i = ch.length - 1; i >= 0; i--) { if (ch[i] == ' ')
		 * { ch[newlength - 1] = '0'; ch[newlength - 2] = '2'; ch[newlength - 3] = '%';
		 * newlength = newlength - 3; } else { ch[newlength] = ch[i]; newlength =
		 * newlength - 1; } }
		 */

	}

}
