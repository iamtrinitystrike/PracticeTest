package com.test;

import java.util.ArrayList;

public class ArrayListEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String[] s=new String[]{"hello","Hi","Good"};
		String [] m=new String[]{"Rag","Ray","Morning"};
	System.out.println(merge(s,m));	
		

	}
	
	public static ArrayList<String> merge(String[] words,String[] more){
		ArrayList<String> sentence=new ArrayList<String>();
		
	for(String s:words) {sentence.add(s);}
	
	for(String s: more) {sentence.add(s);}
		return sentence;
		}

}
