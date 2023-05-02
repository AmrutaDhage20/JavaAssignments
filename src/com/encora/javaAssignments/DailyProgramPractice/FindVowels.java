package DailyProgramPractice;

public class FindVowels {
    //Write a Java method to count all vowels in a string.
    public static int count_Vowels(String string_One) {
        int count = 0;
        for (int index = 0; index < string_One.length(); index++) {
            if (string_One.charAt(index) == 'a' || string_One.charAt(index) == 'e' || string_One.charAt(index) == 'i'
                    || string_One.charAt(index) == 'o' || string_One.charAt(index) == 'u') {
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        String string_One = "i like Java so much";
        System.out.print("Number of  Vowels in the string: " + count_Vowels(string_One) + "\n");
    }
}