package com.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class MinIndexSumTwoList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MinIndexSumTwoList x=new MinIndexSumTwoList();
		
		
		
		String[] s1 = new String[] {"Shogun","Tapioca Express","Burger King","KFC"};
		String[] s2 = new String[] {"Piatti","The Grill at Torrey Pines","Hungry Hunter Steakhouse","Shogun"};
	
		
		String[] s3 = new String[] {"Shogun","Tapioca Express","Burger King","KFC"};
		String[] s4 = new String[] {"KFC","Shogun","Burger King"};
		
		String[] s5 = new String[] {"Shogun","Tapioca Express","Burger King","KFC"};
		String[] s6 = new String[] {"KFC","Burger King","Tapioca Express","Shogun"};
		
		String[] s7 = new String[] {"KFC","Shogun","Indian","Tapioca Express","Burger King"};
		String[] s8 = new String[] {"Shogun","Chinese","KFC","Burger King"};
		
		
	
					
		System.out.println(Arrays.toString(x.findRestaurant(s1,s2)));
		System.out.println(Arrays.toString(x.findRestaurant(s3,s4)));
		System.out.println(Arrays.toString(x.findRestaurant(s5,s6)));
		System.out.println(Arrays.toString(x.findRestaurant(s7,s8)));

	}


	    public String[] findRestaurant(String[] list1, String[] list2) {
	        
	        HashMap<String,Integer> map1=new HashMap<String,Integer>();
	        HashMap<String,Integer> map2=new HashMap<String,Integer>();
	        
	        for(int i=0;i<list1.length;i++)
	        {
	            if(!map1.containsKey(list1[i]))
	            {
	                map1.put(list1[i],i);
	            }
	        }
	        
	        
	        for(int i=0;i<list2.length;i++)
	        {
	            if(!map2.containsKey(list2[i]))
	            {
	                map2.put(list2[i],i);
	            }
	            
	        }
	        
	        int min=Integer.MAX_VALUE;
	        
	        ArrayList<String> res=null;
	        Iterator<Map.Entry<String,Integer>> it =map1.entrySet().iterator();
	        while(it.hasNext())
	        {
	            Map.Entry<String,Integer> entry= it.next();
	            if(map2.containsKey(entry.getKey()))
	            {
	            	int sum=entry.getValue()+map2.get(entry.getKey());
	      
	            	if(min>sum)
	            	{
	            		min=sum;
	            		res=new ArrayList<String>();
	               res.add(entry.getKey());
	            	
	            	}
	            	else if(min==sum)
	            	{
	            		res.add(entry.getKey());
	            	}
	            }
	            
	            
	        }
			
	        String[] result = new String[res.size()];
            result = res.toArray(result);
       
            return result  ; 
	        
	        
	        
	        
	    }
	}

