package com.encora.javaAssignments;

import java.util.HashMap;     

public class GoodString {
  public static void main(String args[])
  {
      String s = "abacbdc";
      int i;
      s.length();
      HashMap<Character, Integer> charCount = new HashMap<>();
      
      // Stage 1 - get unique chars and its count
      for(i=0;i<s.length();i++) {
          if (charCount.containsKey(s.charAt(i))) {
              int count = charCount.get(s.charAt(i));
              charCount.put(s.charAt(i), ++count);
          } else {
              charCount.put(s.charAt(i), 1);
          }
          System.out.println("\nChar - " + s.charAt(i));
      }
       System.out.println("\n charCount - " + charCount);

       //Stage 2 - check if all counts doesn't match then its a not a good string
      int res = 0;
      boolean isGoodString = true;
      for (Object value : charCount.values()) {
          if (res == 0) {
              res = (int) value;
          }
          if (res != (int) value) {
              isGoodString = false;
          }
      }
      System.out.println("\n isGoodString - " + isGoodString);
  }
}
