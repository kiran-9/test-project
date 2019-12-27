package com.hackerrank;

import java.util.Scanner;

public class ReverseNumber	{
	
	
	
	
	
	public static void main(String[] args) {
		

		Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt();	
		
		ReverseNumber number = new ReverseNumber();
		int[] a = {10,50,60};
		
		number.reverseArray(a);
		
	}
	
//	static int[] result;
	
	 static  int[] reverseArray(int[] a) {
		
		 int result [] = new int[a.length];
		 for (int i = a.length-1; i >= 0;i--) {
			 
			  result[a.length-1-i] = a[i];
			 
			 
		 }
		 
		 System.out.println(result);
		 return result;
		 
	 }

}
