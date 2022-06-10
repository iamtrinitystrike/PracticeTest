package com.test;

public class RemoveDuplicatesString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s = "Raginee";

//		List<Integer> arrayList = IntStream.of(s.toCharArray())
//                .boxed()
//                .collect(Collectors.toList());

		StringBuilder sb=new StringBuilder();
		int[] ch = new int[256];

		for (int i = 0; i < s.length(); i++) {
			System.out.println(ch[s.charAt(i)]);

			if (ch[s.charAt(i)] == 0) {
				ch[s.charAt(i)] = 1;
				sb.append (s.charAt(i));

			}

		}

		System.out.print(sb.toString());

	}

}
