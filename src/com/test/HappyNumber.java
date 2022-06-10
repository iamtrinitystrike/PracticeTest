package com.test;

public class HappyNumber {

	public static void main(String[] s)
	{
		HappyNumber hn=new HappyNumber();
		
		System.out.println(hn.isHappy(19));
	}
	
	
	    public boolean isHappy(int n) {
	    	
	    	if(n>(Math.pow(2,31)-1))
	        {
	            return false;
	        }
	        if(n==1 || n==7)
	        {
	            return true;
	        }
	        
	        int sum=n;
	        int x=n;
	       
	        
	        //this loop executes till the sum of square of
	        // digits obtained is not a single digit number
	        while(sum>9)
	      {
	        	sum=0;
	        	
	        	// this loop finds the sum of square of digits
	            while(x>0)
	            {
	              int d=x%10;
	              
	            sum+=d*d;
	                x/=10;
	                
	            }
	            
	              if(sum==1)
	             return true;
	                    
	              
	             x=sum;
	           
	        }
	             if(sum == 7)
	            return true;
	        
	      return false;  
	    }
	
	}
	

