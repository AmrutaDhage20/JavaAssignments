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

import java.util.HashMap;
public class GoodString{
    public static void main(String args[]){

        String stringName = "Java";
        int indexNumber;
        stringName.length();
        HashMap<Character,Integer> charCount = new HashMap<>();

        //Stage 1 - get unique characters and its count
        for(indexNumber=0; indexNumber<stringName.length(); indexNumber++){
            if(charCount.containsKey(stringName.charAt(indexNumber))){
                int count=charCount.get(stringName.charAt(indexNumber));
                charCount.put(stringName.charAt(indexNumber),++count);
            }else{
                charCount.put(stringName.charAt(indexNumber),1);
            }
            System.out.println("Character-"+stringName.charAt(indexNumber));
        }
        System.out.println("CharacterCount-"+charCount);

        //Stage 2 - check if all counts doesn't match then its a not a good string
        int result = 0;
        boolean isGoodString = true;
        for(Object value:charCount.values()){
            if(result==0){
                result=(int)value;
            }
            if(result!=(int)value)
                isGoodString=false;
        }
        System.out.println("IsGoodString-"+isGoodString);
    }
}