package com.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ImplementComparator {
	
	public static void main(String[] a)
	{

	List<Student> slist=new ArrayList<>();
	
	slist.add(new Student("Rahul",3));
	slist.add(new Student("Cheena",4));

	slist.add(new Student("Ramesh",2));
	slist.add(new Student("Varsha",1));
	
//	Student s1=new Student("ram",6);
//	Student s2=new Student("Shyam",7);
//	
	//System.out.println(s1.equals(s2));
	System.out.println(slist);
	Collections.sort(slist);
	//System.out.println(s1.compareTo(s2));
	
	System.out.println(slist);
	
	
	Collections.sort(slist, new Comparator<Student>() 
	
	{
		@Override
		
		public int compare(Student o1,Student o2)
		{
			return o1.name.compareTo(o2.name);
		}
		
	});
	System.out.println(slist);
	
	
	
	
	}
	
}
