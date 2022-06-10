package com.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GroupAnagram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] s=new String[] {"eat", "tea", "tan", "ate", "nat", "bat"};
		GroupAnagram ga=new GroupAnagram();
		
	System.out.println(	ga.groupAnagrams1(s));
		
	}

	
	  public List<List<String>> groupAnagrams1(String[] strs) {
	        List<List<String>> res = new ArrayList<>();
	        Map<String, List<String>> map = new HashMap<>();
	        for (String str : strs) {
	            char[] chars = str.toCharArray();
	            Arrays.sort(chars);
	        
	            map.computeIfAbsent(String.valueOf(chars), k -> new ArrayList<>()).add(str);
	            
	            
	        }
	        
	        System.out.println(map);
	        res.addAll(map.values());
	        return res;
	    }

}



  

