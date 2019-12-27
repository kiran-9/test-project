package com.hackerrank;

public class IfElsePrblem {

	public static void main(String[] args) {

		IfElsePrblem ifElsePrblem = new IfElsePrblem();
		ifElsePrblem.num(22);
	}

	public int num(int n) {

		if (n % 2 == 1 || (n >= 6 && n <= 20) && n < 100) {

			System.out.println(n + "is a weird");
		} else if (n % 2 == 0 || (n >= 2 && n <= 5) && n < 100) {

			System.out.println(n + "is  notweird");

		}

		return n;

	}

}
