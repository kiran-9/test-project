package com.test;

public class PracticeString {
	
	
	
	public static void main(String[] args) {

		String s1 = "java";
		String s2 = s1.concat("exam");
		String s9 = s1.concat("2mrw");
		
		String s3 = s2.concat("10 am");
		String s4 = "10 am";
		String s5 = new String("java");
		String s6 = "javaexam";
		String s7 = new String("javaexam");
		String s8 = "java2mrw";
		System.out.println(s1.equals(s5));
		System.out.println(s8 == (s6));
		
	
	}
}