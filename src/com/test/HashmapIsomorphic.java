package com.test;

import java.util.HashMap;
import java.util.Map;

public class HashmapIsomorphic {

	public static void main(String[] args) {
	
		HashmapIsomorphic hm=new HashmapIsomorphic();
		System.out.println(hm.isIsomorphic("a", "a"));
	}

	
	
	    public boolean isIsomorphic(String s, String t) {
	        
			
			  if(1 > s.length()|| s.length() >= 5 * 104 || t.length() !=
			  s.length()||s==null ||t==null) { return false; }
			 

	        
	        HashMap<Character, Character> map=new HashMap<Character, Character>();
	       
	        
	        for(int i=0;i<s.length();i++)
	        {
	            if(map.containsKey(s.charAt(i))&& t.charAt(i)!=map.get(s.charAt(i)))
	            {
	                return false;
	            }
	            if(!map.containsKey(s.charAt(i)))
	            {
	                if(!map.values().contains(t.charAt(i)))
	                {
	                  map.put(s.charAt(i),t.charAt(i));  
	                }
	                else
	                {
	                    return false;
	                }
	                
	            }
	            
	        }
	        
	        return true;
	        
	        
	       
	     
	    }

	    
	  
	      
	    
}
