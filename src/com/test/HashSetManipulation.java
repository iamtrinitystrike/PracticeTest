package com.test;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.*;


public class HashSetManipulation {



    public int[] intersection(int[] nums1, int[] nums2) {
        
        Set<Integer> common1=new HashSet<>();
        Set<Integer> common2=new HashSet<>();
        
        int[] res=new int[]{};
        
        for(int i=0;i<nums1.length;i++)
        {
             
                 if(!common1.contains(nums1[i]))
                 {
                      common1.add(nums1[i]);
                 }
                
          
            
        }
        for(int j=0;j<nums2.length;j++)
        {
        
                 if(!common2.contains(nums2[j]))
                 {
                     common2.add(nums2[j]);
                 }
        }
        
        common1.retainAll(common2);
       
         
         
        return res;
        
    }
          
}
