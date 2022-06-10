package com.test;

import java.util.HashMap;
import java.util.Map;

public class FirstUniqeCharOccurence {
	public class IndexCount {
		int count;
		int index;

		public IndexCount(int index) {
			this.count = 1;
			this.index = index;

		}

		public void incCount() {
			this.count++;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FirstUniqeCharOccurence fc = new FirstUniqeCharOccurence();
		 System.out.println( fc.firstUniqChar("leetcode"));

		System.out.println( fc.firstUniqChar("loveleetcode"));

		System.out.println(fc.firstUniqChar("aabb"));

	}

	public int firstUniqChar(String s) {
		
		HashMap<Character, IndexCount> map = new HashMap<Character, IndexCount>();
		for (int i = 0; i < s.toCharArray().length; i++) {
			if (!map.containsKey(s.charAt(i))) {
				map.put(s.charAt(i), new IndexCount(i));
				
			} else {
				map.get(s.charAt(i)).incCount();
			}
		}

		int res = Integer.MAX_VALUE;
		for (Map.Entry<Character, IndexCount> em : map.entrySet()) {
			int c = em.getValue().count;
			int idx = em.getValue().index;

			System.out.println("count:" + c + "index:" + idx);
			if (c == 1 && idx < res) {
				res = idx;

			}

		}

		return (res==Integer.MAX_VALUE)?-1:res;

	}

}
