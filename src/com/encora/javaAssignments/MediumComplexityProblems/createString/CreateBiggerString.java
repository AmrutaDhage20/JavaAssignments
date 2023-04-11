package MediumComplexityProblems.createString;

public class CreateBiggerString {

    // Java program to merge two strings
    public static String mixString(String firstString, String secondString) {
        StringBuilder result = new StringBuilder();
        int index = 0, secondIndex = 0;
        while (index < firstString.length() && secondIndex < secondString.length()) {
            result.append(firstString.charAt(index)).append(secondString.charAt(secondIndex));
            index++;
            secondIndex++;
        }
        result.append(firstString.substring(index)).append(secondString.substring(secondIndex));
        return result.toString();
    }
    public static void main(String[] args) {
        String result1 = mixString("abc", "xyz");
        String result2 = mixString("Hi", "There");
        String result3 = mixString("xxxx", "There");
        System.out.println("The new string is " + result1);
        System.out.println("The new string is " + result2);
        System.out.println("The new string is " + result3);
    }
}