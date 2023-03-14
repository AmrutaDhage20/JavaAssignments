package com.encora.javaAssignments;

//Assignment2 -Find Destination City

import java.util.*;

public class DestinationCity {
	public static String destCity(String[][] input) {
		int i;

		HashMap<String, Integer> outdegree = new HashMap<String, Integer>();
		if (input.length == 1) {
			return input[0][1];
		}

		for (i = 0; i < input.length; i++) {
			if (!outdegree.containsKey(input[i][0])) {
				outdegree.put(input[i][0], 1);
			}
		}

		for (i = 0; i < input.length; i++) {
			if (!outdegree.containsKey(input[i][1])) {
				return input[i][1];
			}
		}

		return input[0][1];
	}

	public static void main(String[] args) {
//		String[][] input = { { "B", "C" }, { "D", "B" }, { "C", "A" } };
		String [][] input = { {"London","New York"}, {"New York","Lima"}, {"Lima","Sao Paulo"}};
		// String [][] input = { {"A", "Z"} };
		System.out.print("Destination city is : " + destCity(input));
	}
}
