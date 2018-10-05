package com.codewars;

/*
 * Write a function tripleDouble(long num1, long num2)
 * which takes in numbers num1 and num2 and returns 1 if there is a straight triple of a number at any place in num1 and also a straight double of the same number in num2.
 */
public class TripleTrouble {
	public static int tripleDouble(long num1, long num2) {
		int counter = 1;
		boolean isTriple = false;
		boolean isDouble = false;
		char[] num1CharArray = String.valueOf(num1).toCharArray();
		char[] num2CharArray = String.valueOf(num2).toCharArray();

		for (int i = 0; i < num1CharArray.length - 1; i++) {
			if (num1CharArray[i] == num1CharArray[i + 1])
				counter++;
			else
				counter = 1;
			if (counter == 3) {
				isTriple = true;
				break;
			}

		}

		for (int i = 0; i < num2CharArray.length - 1; i++) {
			if (num2CharArray[i] == num2CharArray[i + 1])
				counter++;
			else
				counter = 1;
			if (counter == 2) {
				isDouble = true;
				break;
			}
		}

		if (isTriple && isDouble)
			return 1;
		else
			return 0;
	}
}
