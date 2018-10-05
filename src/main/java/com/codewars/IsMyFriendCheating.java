package com.codewars;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.LongStream;

/*
 * 	A friend of mine takes a sequence of numbers from 1 to n (where n > 0).
 *	Within that sequence, he chooses two numbers, a and b.
 *	He says that the product of a and b should be equal to the sum of all numbers in the sequence, excluding a and b.
 *	Given a number n, could you tell me the numbers he excluded from the sequence?
*/
		
public class IsMyFriendCheating {

	public static List<long[]> removNb(long n) {

		List<long[]> list = new ArrayList<>();
		long sum = LongStream.range(1, n + 1).sum();
		for (long i = sum / n; i < n; i++) {
			for (long j = sum / i; j > i; j--) {
				if (sum - i - j > i * j) {
					break;
				} else if (sum - i - j == i * j) {
					list.add(new long[] { i, j });
					list.add(new long[] { j, i });
					break;
				}
			}
		}

		Collections.sort(list, (long[] o1, long[] o2) -> new Long(o1[0]).compareTo(o2[0]));
		return list;
	}
}
