package com.codewars;

/*
 * Write simple camelCase method for strings. All words must have their first letter capitalized without spaces.
 */

public class CamelCaseMethod {

	public static String camelCase(String str) {
		StringBuilder sb = new StringBuilder();
		for (String s : str.trim().split(" ")) {
			if (s.length() > 0)
				sb.append(Character.toUpperCase(s.charAt(0)) + s.substring(1, s.length()));
		}
		return sb.toString();
	}
}
