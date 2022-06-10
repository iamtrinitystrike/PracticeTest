package com.test;

import java.util.HashMap;
import java.util.Map;

public class TestIsomorphic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TestIsomorphic ti = new TestIsomorphic();
		System.out.println(ti.isIsomorphic("add", "egg"));


	}

	public String transformString(String s) {
		Map<Character, Integer> map = new HashMap<Character, Integer>();
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < s.length(); i++) {
			if (!map.containsKey(s.charAt(i))) {
				map.put(s.charAt(i), i);
			}

			sb.append(Integer.toString(map.get(s.charAt(i))));
			sb.append(" ");

		}
		return sb.toString();

	}

	public boolean isIsomorphic(String s, String t) {

		return transformString(s).equals(transformString(t));
	}

}
