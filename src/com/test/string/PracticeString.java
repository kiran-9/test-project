package com.test.string;

public class PracticeString {

	public static void main(String[] args) {
		int n = 0;
		
		String ans = "";
		if( n%2==1 || (n>=6 && n <= 20)){
			  ans = "Weird";
			}else{
			  ans = "Not Weird";
			}
		System.out.println(ans);
	}
		
}
