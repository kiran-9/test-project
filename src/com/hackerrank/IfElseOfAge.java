package com.hackerrank;

public class IfElseOfAge {

	private int age;

	public IfElseOfAge(int initialAge) {
		this.age = initialAge;
		if (this.age < 0) {
			System.out.println("Age is not valid, setting age to 0.");
			this.age = 0;
		}
	}

	public void amIOld() {

		if (this.age < 13) {
			System.out.println("You are young.");
		} else if (this.age >= 13 && this.age < 18) {
			System.out.println("You are a teenager.");
		} else {
			System.out.println("You are old.");
		}
	}

	public void yearPasses() {
		this.age++;
	}

}
