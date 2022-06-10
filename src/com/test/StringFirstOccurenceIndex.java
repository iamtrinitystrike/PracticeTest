package com.test;

public class StringFirstOccurenceIndex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringFirstOccurenceIndex sf = new StringFirstOccurenceIndex();
		System.out.println(sf.firstUniqChar("aabbc"));

	}

	public int firstUniqChar(String s) {
		String str = s;
		while (!str.isEmpty()) {
			String c = str.charAt(0) + "";

			// if(s.indexOf(c)==s.lastIndexOf(c))
			str = str.substring(1);
			System.err.println("pos: " + c);
			System.err.println("str: " + str);
			if (str.contains(c)) {
				str = str.replace(c, "");
			} else
				return s.indexOf(c);

		}
		return -1;

	}

	public int firstUniqChar1(String s) {
		for (int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);

			if (s.indexOf(c) == s.lastIndexOf(c)) {
				return s.indexOf(c);
			}

		}
		return -1;

	}
}
