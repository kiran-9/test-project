package com.test.string;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;

public class FindingDuplicateInString {

	public static void main(String[] args) {

		String s = "aaaaa bb ccc dd ee dd ee dd";

		Map<Character, Integer> map = new HashMap();

		for (int i = 0; i < s.length(); i++) {

			char key = s.charAt(i);

			Integer value = map.get(key);

			if (value == null) {
				map.put(key, 1);
			} else {
				map.put(key, value + 1);
			}
		}

		Set<Entry<Character, Integer>> set = map.entrySet();
		System.out.println("Duplicates in-" + s);
		for (Entry<Character, Integer> entry : set) {
			if (entry.getValue() > 1) {
				System.out.println(entry);
			}
		}
	}
}
