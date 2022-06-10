package com.test;

import java.util.ArrayList;
import java.util.HashMap;

public class IntersectionOfTwoArrays {
	public static void main(String[] s) {
		IntersectionOfTwoArrays two = new IntersectionOfTwoArrays();
		int[] a1 = new int[] { 1, 2, 1, 4, 9, 2, 2 };
		int[] a2 = new int[] { 1, 2, 4, 2, 2 };
		two.intersect(a1, a2);

	}

	public int[] intersect(int[] nums1, int[] nums2) {

		ArrayList<Integer> res = new ArrayList<Integer>();
		HashMap<Integer, Integer> map1 = extracted(nums1);
		HashMap<Integer, Integer> map2 = extracted(nums2);

		if (nums1.length < 1 || nums2.length > 1000) {
			return new int[] {};
		}

		// System.out.println(extracted(nums1));
		// System.out.println(extracted(nums2));

		for (int e : map2.keySet()) {
			// System.out.println("MAP 1 has :"+e+" "+map1.get(e));

			// System.out.println("MAP 2 has :"+e+" "+map2.get(e));

			if (map1.containsKey(e)) {
				int count = map1.get(e) <= map2.get(e) ? map1.get(e) : map2.get(e);
				
				System.out.println(count);

				while (count >= 1) {
					res.add(e);
					System.out.println(res);
					count--;
				}
			}
		}
		
		int[] result = res.stream().mapToInt(i -> i).toArray();

		return result;
	}

	
	


	public HashMap<Integer, Integer> extracted(int[] nums1) {
		HashMap<Integer, Integer> hm1 = new HashMap<Integer, Integer>();
		for (int i = 0; i < nums1.length; i++) {

			if (!hm1.containsKey(nums1[i])) {

				hm1.put(nums1[i], 1);
			}

			else {

				hm1.put(nums1[i], hm1.get(nums1[i]) + 1);
			}

		}
		return hm1;
	}

}
