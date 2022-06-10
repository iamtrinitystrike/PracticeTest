package com.test;

import java.util.HashMap;
import java.util.Map;

public class Isomorphic2HashMap {

	
	public static void main(String[] s)
	{
		Isomorphic2HashMap is=new Isomorphic2HashMap();
		System.out.println(is.isIsomorphic2("stenographics", "logarithmsxox"));
	}
	  private String transformString(String s) {
          Map<Character, Integer> indexMapping = new HashMap<>();
          StringBuilder builder = new StringBuilder();
          
          for (int i = 0; i < s.length(); ++i) {
              char c1 = s.charAt(i);
              
              if (!indexMapping.containsKey(c1)) {
                  indexMapping.put(c1, i);
              }
              
              builder.append(Integer.toString(indexMapping.get(c1)));
              builder.append(" ");
          }
          
          System.out.println(indexMapping);
          return builder.toString();
      }
      
      public boolean isIsomorphic2(String s, String t) {
          return transformString(s).equals(transformString(t));
      }
}
