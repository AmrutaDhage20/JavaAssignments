/*Check if All Characters Have Equal Number of Occurrences
Given a string s, return true if s is a good string, or false otherwise.
A string s is good if all the characters that appear in s have the same number of occurrences
 (i.e., the same frequency).
Example 1:
Input: s = "abacbc"
Output: true
Explanation: The characters that appear in s are 'a', 'b', and 'c'. All characters occur 2 times in s.
Example 2:
Input: s = "aaabb"
Output: false
Explanation: The characters that appear in s are 'a' and 'b'.*/
package com.encora.javaAssignments;

import java.util.HashMap;
public class GoodString {
    public static void main(String args[]) {
        String s = "aaabb";
        int i;
        s.length();
        HashMap<Character, Integer> charCount = new HashMap<>();
        // Stage 1 - get unique chars and its count
        for (i = 0; i < s.length(); i++) {
            if (charCount.containsKey(s.charAt(i))) {
                int count = charCount.get(s.charAt(i));
                charCount.put(s.charAt(i), ++count);
            } else {
                charCount.put(s.charAt(i), 1);
            }
            System.out.println("Char-" + s.charAt(i));
        }
        System.out.println("charCount-" + charCount);

        //Stage 2 - check if all counts doesn't match then its a not a good string
        int result = 0;
        boolean isGoodString = true;
        for (Object value : charCount.values()) {
            if (result == 0) {
                result = (int) value;
            }
            if (result != (int) value)
                isGoodString = false;
        }
        System.out.println("isGoodString - "+isGoodString);
    }
}