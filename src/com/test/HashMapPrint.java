package com.test;

import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.LinkedList;

public class HashMapPrint {
	
	public static void main(String[] a)
	{
		Map<String,Integer> map=new HashMap<>();
		map.put("abc", 123);
		map.put("bnm", 566);
		map.put("opk", 768);
		
		for(Map.Entry<String, Integer> en :map.entrySet())
		{
			System.out.println(en.getKey());
		}
		
		
		
		Iterator<Entry<String, Integer>> it=map.entrySet().iterator();
		
		while(it.hasNext())
		{
			Map.Entry<String, Integer> en=it.next();
			System.out.println(en.getValue());
			
		}
		
		
		Map<String,Integer> temp=sortByKey(map);
		for(Map.Entry<String, Integer> en :temp.entrySet())
		{
			System.out.println(en.getKey()+""+en.getValue());
		}
		
	}
	
	public static Map<String,Integer> sortByKey(Map<String,Integer> mp)
	{
		List<Map.Entry<String,Integer>> ls= new LinkedList<Map.Entry<String,Integer>>(mp.entrySet());
		
		Collections.sort(ls,(i1,i2)->i1.getKey().compareTo(i2.getKey()));
		
		HashMap<String,Integer> hmap=new LinkedHashMap<String,Integer>();
		
		for(Map.Entry<String, Integer> en:ls)
		{
			hmap.put(en.getKey(), en.getValue());
			
		}
		
		return hmap;
	}

}
