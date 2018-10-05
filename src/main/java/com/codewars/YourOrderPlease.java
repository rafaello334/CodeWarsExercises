package com.codewars;

import java.util.Map;
import java.util.TreeMap;
import java.util.stream.Collectors;

/*
 * Your task is to sort a given string. Each word in the String will contain a single number. This number is the position the word should have in the result.
 * Note: Numbers can be from 1 to 9. So 1 will be the first word (not 0).
 * If the input String is empty, return an empty String. The words in the input String will only contain valid consecutive numbers.
 * For an input: "is2 Thi1s T4est 3a" the function should return "Thi1s is2 3a T4est" 
 */

public class YourOrderPlease {

	public static String order(String words) {
		Map<Integer, String> map = new TreeMap<>();
		for (String word : words.split(" ")) {
			for (char c : word.toCharArray()) {
				int numberChar = (int) c;
				if (numberChar >= 48 && numberChar <= 57) {
					map.put(Character.getNumericValue(c), word);
				}
			}
		}
		return map.values().stream().map(Object::toString).collect(Collectors.joining(" "));
	}
}
