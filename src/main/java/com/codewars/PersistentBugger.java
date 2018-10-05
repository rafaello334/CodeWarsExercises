package com.codewars;

/*
 * Write a function, persistence, that takes in a positive parameter num and returns its multiplicative persistence,
 * which is the number of times you must multiply the digits in num until you reach a single digit.
 */

public class PersistentBugger {

	public static int persistence(long n) {
		if (String.valueOf(n).length() == 1)
			return 0;
		else {
			int[] digits = String.valueOf(n).chars().map(c -> c - '0').toArray();
			int mult = 1;
			for (int i : digits)
				mult *= i;
			return 1 + persistence(mult);
		}
	}
}
