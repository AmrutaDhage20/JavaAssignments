import java.util.HashMap;

public class GoodString {

    /*
      We are checking if string is good or not using below stages -
      Stage 1 - get unique characters and its count
      Stage 2 - check if all counts doesn't match then it's a not a good string
    */

    public static boolean isGoodString(String stringName) {

        int indexNumber;
        stringName.length();

        HashMap<Character, Integer> charCount = new HashMap<>();
        for (indexNumber = 0; indexNumber < stringName.length(); indexNumber++) {
            if (charCount.containsKey(stringName.charAt(indexNumber))) {
                int count = charCount.get(stringName.charAt(indexNumber));
                charCount.put(stringName.charAt(indexNumber), ++count);
            } else {
                charCount.put(stringName.charAt(indexNumber), 1);
            }
            System.out.println("Character-" + stringName.charAt(indexNumber));
        }
        System.out.println("CharacterCount-" + charCount);

        int result = 0;
        boolean isGoodString = false;
        for (int value : charCount.values()) {
            if (result == 0) {
                result = (int) value;
            }
            if (result != (int) value) {
                return false;
            }
        }
        return true;
    }

    public static void main(String args[]) {

        String stringName = "jjava";
        System.out.println("IsGoodString-" + isGoodString(stringName));
    }
}