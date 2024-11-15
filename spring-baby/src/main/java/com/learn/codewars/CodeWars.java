package com.learn.codewars;

import java.util.*;

import static java.util.Map.entry;

public class CodeWars {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "az";
		System.out.println(solve(s));
	}

	public static int solve(final String s) {

		// oh my word, this won't be the most beautiful code out there, but I will most def solve this one!
		
		// a kata solution to the 
		
		Map<String, Integer> lettersMap = Map.ofEntries(entry("a", 1), entry("b", 2), entry("c", 3), entry("d", 4),
				entry("e", 5), entry("f", 6), entry("g", 7), entry("h", 8), entry("i", 9), entry("j", 10),
				entry("k", 11), entry("l", 12), entry("m", 13), entry("n", 14), entry("o", 15), entry("p", 16),
				entry("q", 17), entry("r", 18), entry("s", 19), entry("t", 20), entry("u", 21), entry("v", 22),
				entry("w", 23), entry("x", 24), entry("y", 25), entry("z", 26));
		
		String k = s.replaceAll("a", "*")
				.replaceAll("e", "*")
				.replaceAll("i", "*")
				.replaceAll("o", "*")
				.replaceAll("u","*");

		Iterator<String> targetdArr = Arrays.asList(k.split("")).iterator();
		Integer currentSummation = 0; // initial
		List<Integer> finalArray = new ArrayList<>();
		List<Integer> intermediateArray = new ArrayList<>();

		while (targetdArr.hasNext()) {
			String x = targetdArr.next();
			if (x.matches("[a-z]+")) {
				currentSummation += lettersMap.get(x);
				intermediateArray.add(currentSummation);
			} else if (x.equals("*") && intermediateArray.size() > 0) {

				Collections.sort(intermediateArray);
				finalArray.add(intermediateArray.get(intermediateArray.size() - 1)); // the last index of the array is the sum of
																			// the words in question

				currentSummation = 0; // quick reset!
				intermediateArray.clear(); // quick reset
			}
		}

		if (intermediateArray.size() > 0) {
			finalArray.add(intermediateArray.get(intermediateArray.size() - 1)); // for some rare cases!
		}

		Collections.sort(finalArray);
		int lastItem = finalArray.size() - 1;
		return finalArray.size() > 0 ? finalArray.get(lastItem) : finalArray.get(lastItem);
	}

}
