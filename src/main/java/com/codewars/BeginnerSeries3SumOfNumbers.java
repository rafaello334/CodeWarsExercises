package com.codewars;

/*
 * Given two integers a and b, which can be positive or negative, find the sum of all the numbers between including them too and return it. 
 * If the two numbers are equal return a or b.
 * 
 * Note: a and b are not ordered!
*/

public class BeginnerSeries3SumOfNumbers {

	public int GetSum(int a, int b) {
		int sum = 0;
		if (a == b)
			return a;
		else if (a < b) {
			for (int i = a; i <= b; i++)
				sum += i;
		} else {
			for (int i = a; i >= b; i--)
				sum += i;
		}

		return sum;
	}
}
