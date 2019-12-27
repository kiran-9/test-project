package com.test;

import java.util.Comparator;
import java.util.Map;
import java.util.TreeMap;

public class TestComparator implements Comparator<Student> {

	@Override
	public int compare(Student o1, Student o2) {
		return 1;
	}
	 
	/*
	 * public static void main(String[] args) {
	 * 
	 * Map<Student, Integer> map = new TreeMap<Student, Integer>(new
	 * TestComparator());
	 * 
	 * map.put(new Student(101, "rajini"), 800); map.put(new Student(101, "rajini"),
	 * 600); map.put(new Student(101, "rajini"), 500); map.put(new Student(101,
	 * "rajini"), 100);
	 * 
	 * System.out.println(map.size()); System.out.println(map);
	 * 
	 * }
	 */
}
