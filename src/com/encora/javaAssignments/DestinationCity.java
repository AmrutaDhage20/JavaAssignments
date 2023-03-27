
/*Assignment2 -Find Destination City:You are given the array paths, where paths[i] = [cityAi, cityBi] means
 there exists a direct path going from cityAi to cityBi. Return the destination city, that is,
 the city without any path outgoing to another city.
It is guaranteed that the graph of paths forms a line without any loop, therefore,
there will be exactly one destination city.
Example 1:
Input: paths = [["London","New York"],["New York","Lima"],["Lima","Sao Paulo"]]
Output: "Sao Paulo"
Explanation: Starting at "London" city you will reach "Sao Paulo" city which is the destination city.
Your trip consist of: "London" -> "New York" -> "Lima" -> "Sao Paulo".
Example 2:
Input: paths = [["B","C"],["D","B"],["C","A"]]
Output: "A"
Explanation: All possible trips are:
"D" -> "B" -> "C" -> "A".
"B" -> "C" -> "A".
"C" -> "A".
"A".
Clearly the destination city is "A".
Example 3:
Input: paths = [["A","Z"]]
Output: "Z"*/
package com.encora.javaAssignments;

import java.util.*;
public class DestinationCity {
	public static String destCity(String[][] input) {
		int i;
		HashMap outdegree = new HashMap();
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