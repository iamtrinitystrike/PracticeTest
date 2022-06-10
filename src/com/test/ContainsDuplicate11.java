package com.test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Map.Entry;

public class ContainsDuplicate11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ContainsDuplicate11 c = new ContainsDuplicate11();
		int[] input = new int[] { 1, 0, 1, 1 };
		// int[] input1=new int[] {99,99};
		System.out.println(c.containsNearbyDuplicate(input, 3));
	}

	public boolean containsNearbyDuplicate1(int[] nums, int k) {
		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();

		for (int i = 0; i < nums.length; i++) {
			if (map.containsKey(nums[i])) {
				int pre = map.get(nums[i]);
				System.out.println(pre);

				if (i - pre <= k) {
					System.out.println(map);
					return true;
				}

			}
			map.put(nums[i], i);

		}

		return false;
	}

	public boolean containsNearbyDuplicate(int[] nums, int k) {
		Map<Integer, Integer> map = new HashMap<>();
		for (int i = 0; i < nums.length; i++) {
			if (map.containsKey(nums[i]) && (i - map.get(nums[i]) <= k))
				return true;
			map.put(nums[i], i);

		}
		return false;
	}
	
	public boolean containsNearbyDuplicate3(int[] nums, int k) {
		HashSet<Integer> set=new HashSet<Integer>();
		for(int i=0;i<nums.length;i++) {
			if(i>k)
			set.remove(i-k-1);
			
			if(!set.add(nums[i]))
			return true;
			

		}
		return false;
	}
}
