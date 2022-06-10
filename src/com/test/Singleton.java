package com.test;

public class Singleton {

	
	private static  Singleton single_instace=null ;
	
	private Singleton()
	{
		
	}
	
	public static Singleton getInstance()
	{
		if(single_instace==null)
		single_instace=new Singleton();
		return single_instace ;
	}

}
