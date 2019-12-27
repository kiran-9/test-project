package com.test;

import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class TestMaps {

	public static void main(String[] args) {

		Map<Student, Integer> map = new TreeMap(new TestComparator());

		map.put(new Student(100, "krishna"), 55);
		map.put(new Student(101, "anil"), 665);
		map.put(new Student(102, "raju"), 105);
		map.put(new Student(103, "ramulu"), 222);

		System.out.println(map.size());
		System.out.println(map);

		System.out.println("checking get method-" + map.get(new Student(102, "raju")));
		System.out.println("checking contains method-" + map.containsValue(222));
		System.out.println("checking is empty method-" + map.isEmpty());
		System.out.println("checking keyset mehod-" + map.keySet());

		Set<Student> keySet = map.keySet();
		for (Student student : keySet) {
			System.out.println(student.getName() + " " + student.getId());
		}
		
		map.remove(new Student(103, "ramulu"));
		System.out.println("remove method-"+map);
		
		System.out.println("values method it displays total values -"+map.values());
		
	}

}
